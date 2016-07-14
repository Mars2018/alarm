package com.htsc.alarm.service.impl;

import com.alibaba.fastjson.JSON;
import com.htsc.alarm.domain.AlarmConfig;
import com.htsc.alarm.service.AlarmConfigService;
import com.htsc.alarm.vo.ConfigAlarmReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */
@Service(value = "alarmConfigService")
public class AlarmConfigServiceImpl implements AlarmConfigService {
    private static final Logger LOG = LoggerFactory.getLogger(AlarmConfigServiceImpl.class);
    @Override
    public Integer insert(String configString, HttpRequest request) {
        List<ConfigAlarmReq> configAlarmReqList = JSON.parseArray(configString, ConfigAlarmReq.class);
        if (null == configAlarmReqList || 0 == configAlarmReqList.size()){
            LOG.error("解析configString出错！");
            return 0;
        }
        List<AlarmConfig> alarmConfigs = getAlarmConfigRecords(configAlarmReqList, request);
        Integer insertRecords = 0;
        return insertRecords;
    }

    private List<AlarmConfig> getAlarmConfigRecords(List<ConfigAlarmReq> configAlarmReqList, HttpRequest request) {
        List<AlarmConfig> alarmConfigRecords = new ArrayList<>();
        ConfigAlarmReq configAlarmReq;
        for (int i = 0; i < configAlarmReqList.size(); ++i){
            configAlarmReq = configAlarmReqList.get(i);
            alarmConfigRecords.add(getAlarmConfigRecord(configAlarmReq));
        }

        return alarmConfigRecords;
    }

    private AlarmConfig getAlarmConfigRecord(ConfigAlarmReq configAlarmReq) {
        AlarmConfig alarmConfig = new AlarmConfig();
        alarmConfig.setAlarmType(configAlarmReq.getAlarmType());
        alarmConfig.setAlarmName(configAlarmReq.getAlarmName());
        alarmConfig.setStatisticalMethod(configAlarmReq.getStatisticalMethod());
        alarmConfig.setJudgmentCondition(configAlarmReq.getJudgmentCondition());
        alarmConfig.setAlarmValue(configAlarmReq.getAlarmValue());
        alarmConfig.setAlarmLevel(configAlarmReq.getAlarmLevel());
        alarmConfig.setStifleTime(configAlarmReq.getStifleTime());
        alarmConfig.setStartDatetime(JSON.parseObject(configAlarmReq.getStartDatetime(), Date.class));
        alarmConfig.setEndDatatime(JSON.parseObject(configAlarmReq.getEndDatatime(), Date.class));
        alarmConfig.setAvailableDay(configAlarmReq.getAvailableDay());
        alarmConfig.setAlarmDependencies(JSON.toJSONString(configAlarmReq.getDependencies()));
        alarmConfig.setAlarmDesc(configAlarmReq.getAlarmDesc());

        return alarmConfig;
    }
}
