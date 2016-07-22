package com.htsc.alarm.service.impl;

import com.htsc.alarm.cfg.MonitorSvcConfig;
import com.htsc.alarm.dao.HostDoaminMapper;
import com.htsc.alarm.dao.ItemDomainMapper;
import com.htsc.alarm.domain.AlarmConfig;
import com.htsc.alarm.domain.HostDomain;
import com.htsc.alarm.domain.ItemDomain;
import com.htsc.alarm.service.AlarmConfigService;
import com.htsc.alarm.vo.ConfigAlarmHostsReq;
import com.htsc.alarm.vo.ConfigAlarmItemsReq;
import com.htsc.alarm.vo.ConfigAlarmReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */
@Service(value = "alarmConfigService")
public class AlarmConfigServiceImpl implements AlarmConfigService {

    private static final Logger LOG = LoggerFactory.getLogger(AlarmConfigServiceImpl.class);

    @Autowired
    private ItemDomainMapper itemDomainMapper;

    @Autowired
    private HostDoaminMapper hostDomainMapper;

    @Override
    public Integer insertItems(List<ConfigAlarmItemsReq> itemsReq) {
        List<ItemDomain> items = this.initItemDomain(itemsReq);
        LOG.debug("初始化 itemDomain 结束");
        Integer records = 0;
        for(int i = 0; i < items.size(); ++i ){
            records += itemDomainMapper.insertSelective(items.get(i));
        }
        LOG.debug("插入items结果：[]", records);
        return records;
    }

    @Override
    public Integer insertHosts(List<ConfigAlarmHostsReq> configAlarmHostsReqs) {
        List<HostDomain> hosts = this.initHostDomain(configAlarmHostsReqs);
        LOG.debug("初始化 hostDomain 结束");
        Integer records = 0;
        for(int i = 0; i < hosts.size(); ++i) {
            records += hostDomainMapper.insertSelective(hosts.get(i));
        }
        LOG.debug("插入hosts结果：[]", records);
        return records;
    }

    @Override
    public Integer updateHost(List<ConfigAlarmHostsReq> configAlarmHostsReqs) {
        List<HostDomain> hosts = this.initHostDomain(configAlarmHostsReqs);
        LOG.debug("初始化 hostDomain 结束");
        Integer records = 0;
        for(int i = 0; i < hosts.size(); ++i) {
            records += hostDomainMapper.insertSelective(hosts.get(i));
        }
        LOG.debug("插入hosts结果：[]", records);
        return records;
    }


    private List<HostDomain> initHostDomain(List<ConfigAlarmHostsReq> configAlarmHostsReq) {
        List<HostDomain> hosts = new ArrayList<>();
        for(int i = 0; i < configAlarmHostsReq.size(); ++i){
            HostDomain hostDomain = new HostDomain();
            hostDomain.setHostName(configAlarmHostsReq.get(i).getName());
            hostDomain.setHostIp(configAlarmHostsReq.get(i).getIp());
            hostDomain.setHostProxyId(configAlarmHostsReq.get(i).getProxy_id());
            hostDomain.setHostPort(configAlarmHostsReq.get(i).getPort());
            hostDomain.setEnable(configAlarmHostsReq.get(i).getEnable());
            hosts.add(hostDomain);
        }
        return hosts;
    }

    private List<ItemDomain> initItemDomain(List<ConfigAlarmItemsReq> itemsReqs) {
        List<ItemDomain> items = new ArrayList<>();
        for(int i = 0; i < itemsReqs.size(); ++i) {
            ItemDomain itemDomain = new ItemDomain();
            itemDomain.setItemName(itemsReqs.get(i).getName());
            itemDomain.setMonitorType(MonitorSvcConfig.MonitorTypes[itemsReqs.get(i).getMonitorTypeNo()-1]);
            itemDomain.setMonitorTarget(MonitorSvcConfig.MonitorTargets[itemsReqs.get(i).getMonitorTypeNo()-1][itemsReqs.get(i).getMonitorTypeNo()-1]);
            itemDomain.setHostId(itemsReqs.get(i).getHostId());
            itemDomain.setUpdateInterval(itemsReqs.get(i).getUpdateInterval());
            itemDomain.setHistoryKeep(itemsReqs.get(i).getHistoryKeep());
            items.add(itemDomain);
        }
        return items;
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

        return alarmConfig;
    }
}
