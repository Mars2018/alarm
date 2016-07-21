package com.htsc.alarm.service.impl;

import com.htsc.alarm.cfg.MonitorSvcConfig;
import com.htsc.alarm.dao.ItemDomainMapper;
import com.htsc.alarm.domain.AlarmConfig;
import com.htsc.alarm.domain.ItemDomain;
import com.htsc.alarm.enums.MonitorType;
import com.htsc.alarm.service.AlarmConfigService;
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
    ItemDomainMapper itemDomainMapper;

    @Override
    public Integer insertItems(ConfigAlarmItemsReq configAlarmItemsReq) {
        ItemDomain itemDomain = this.initItemDomain(configAlarmItemsReq);
        return itemDomainMapper.insertSelective(itemDomain);
    }

    private ItemDomain initItemDomain(ConfigAlarmItemsReq configAlarmItemsReq) {
        ItemDomain itemDomain = new ItemDomain();
        itemDomain.setItemName(configAlarmItemsReq.getName());
        itemDomain.setMonitorType(MonitorSvcConfig.MonitorTypes[configAlarmItemsReq.getMonitorTypeNo()]);
        itemDomain.setMonitorTarget(MonitorSvcConfig.MonitorTargets[configAlarmItemsReq.getMonitorTypeNo()]);
        itemDomain.setHostId(configAlarmItemsReq.getHostId());
        itemDomain.setUpdateInterval(configAlarmItemsReq.getUpdateInterval());
        itemDomain.setHistoryKeep(configAlarmItemsReq.getHistoryKeep());
        return itemDomain;
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
