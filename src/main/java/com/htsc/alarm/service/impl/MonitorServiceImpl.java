package com.htsc.alarm.service.impl;

import com.htsc.alarm.dao.HostDoaminMapper;
import com.htsc.alarm.dao.MonitorTargetMapper;
import com.htsc.alarm.dao.MonitorTypeMapper;
import com.htsc.alarm.domain.HostDomain;
import com.htsc.alarm.domain.MonitorTarget;
import com.htsc.alarm.domain.MonitorType;
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
        return hostDoaminMapper.queryAllHosts();
    }
}
