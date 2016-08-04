package com.htsc.alarm.service.impl;

import com.htsc.alarm.dao.*;
import com.htsc.alarm.domain.*;
import com.htsc.alarm.service.MonitorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mars_wang on 2016/8/1.
 */
@Service
public class MonitorServiceImpl implements MonitorService {
    private static final Logger LOG  = LoggerFactory.getLogger(MonitorServiceImpl.class);

    @Autowired
    private MonitorTypeMapper monitorTypeMapper;

    @Autowired
    private MonitorTargetMapper monitorTargetMapper;

    @Autowired
    private HostDoaminMapper hostDoaminMapper;

    @Autowired
    private ItemDomainMapper itemDomainMapper;

    @Autowired
    private TriggerDomainMapper triggerDomainMapper;

    @Autowired
    private ServiceDomainMapper serviceDomainMapper;

    @Override
    public List<MonitorType> selectAllMonitorType() {

        return monitorTypeMapper.selectAllRecords();
    }

    @Override
    public List<MonitorTarget> selectAllMonitorTarget() {
        return monitorTargetMapper.selectAllRecords();
    }

    @Override
    public List<HostDomain> selectAllMonitorHost() {
        List<HostDomain> hostDomains = hostDoaminMapper.queryAllHosts();
        return hostDomains;
    }

    @Override
    public List<ItemDomain> selectAllItem() {
        return itemDomainMapper.selectAllRecords();
    }

    @Override
    public List<TriggerDomain> selectAllTrigger() {
        return triggerDomainMapper.selectAllRecords();
    }

    @Override
    public List<ServiceDomain> selectAllService() {
        return serviceDomainMapper.selectAllRecords();
    }
}
