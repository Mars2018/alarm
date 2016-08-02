package com.htsc.alarm.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.htsc.alarm.common.util.IPUtils;
import com.htsc.alarm.dao.ServerAlarmMapper;
import com.htsc.alarm.dao.TriggerDomainMapper;
import com.htsc.alarm.domain.*;
import com.htsc.alarm.service.ServerAlarmService;
import com.htsc.alarm.vo.ServerAlarmInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by mars_wang on 2016/7/13.
 */
@Service(value = "serverAlarmService")
public class ServerAlarmServiceImpl implements ServerAlarmService {

    private static final Logger LOG = LoggerFactory.getLogger(ServerAlarmServiceImpl.class);

    @Autowired
    ServerAlarmMapper serverAlarmMapper;

    @Autowired
    TriggerDomainMapper triggerDomainMapper;

    @Override
    public List<AlarmInfo> severAlarmJudge(String alarmInfo, HttpServletRequest request) {
        String ip = "";
        try {
            ip = IPUtils.getIPAddress(request);
        } catch (IOException e) {
            LOG.error("getting ip error:[]", e);
        }
        if(ip.equals(""))
            return null;
        HostDomain hostDomain = serverAlarmMapper.queryHost(ip);
        if(hostDomain == null)
            return null;
        List<ServerAlarmInfo> serverAlarmInfos = JSON.parseArray(alarmInfo, ServerAlarmInfo.class);
        List<ServiceDomain> services = new ArrayList<>();
        List<AlarmInfo> alarmInfos = new ArrayList<>();
        for(int i = 0; i < serverAlarmInfos.size(); ++i){
            ItemDomain itemDomain = serverAlarmMapper.queryItem(hostDomain.getHostId(),serverAlarmInfos.get(i).TYPE, serverAlarmInfos.get(i).getTarget());
            if(itemDomain == null)
                continue;
            ServiceDomain service = serverAlarmMapper.queryService(hostDomain.getHostId(),itemDomain.getItemId());
            if(service == null)
                continue;
            TriggerDomain trigger = triggerDomainMapper.selectByPrimaryKey(service.getTriggerId());
            String judgmentCondition = trigger.getJudgmentCondition();
            Boolean result = false;
            if(judgmentCondition.equals("gt")){
                Integer param = Integer.parseInt(trigger.getParameters());
                if(serverAlarmInfos.get(i).getValue() > param ){
                    result = true;
                }
            }else if (judgmentCondition.equals("lt")){
                Integer param = Integer.parseInt(trigger.getParameters());
                if(serverAlarmInfos.get(i).getValue() < param ){
                    result = true;
                }
            }else if (judgmentCondition.equals("notbetween")){
                List<Integer> params = JSON.parseArray(trigger.getParameters(), Integer.class);
                if(serverAlarmInfos.get(i).getValue() < params.get(0) || serverAlarmInfos.get(i).getValue() > params.get(1))
                    result = true;
            }
             if(result == true){
                 AlarmInfo alarm = new AlarmInfo();
                 alarm.setIpSource(hostDomain.getHostIp());
                 alarm.setAlarmName(itemDomain.getItemName());
                 alarm.setAlarmType(itemDomain.getMonitorType()+":"+itemDomain.getMonitorTarget());
                 alarm.setAlarmLevel("C");
                 alarm.setAlarmValue(serverAlarmInfos.get(i).getValue().toString());
                 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 alarm.setStartDatetime(new Date());
                 alarmInfos.add(alarm);
             }
        }
        return alarmInfos;
    }
}
