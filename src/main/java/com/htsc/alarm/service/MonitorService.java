package com.htsc.alarm.service;

import com.htsc.alarm.domain.*;

import java.util.List;

/**
 * Created by mars_wang on 2016/8/1.
 */
public interface MonitorService {

    List<MonitorType> selectAllMonitorType();

    List<MonitorTarget> selectAllMonitorTarget();

    List<HostDomain> selectAllMonitorHost();

    List<ItemDomain> selectAllItem();

    List<TriggerDomain> selectAllTrigger();

    List<ServiceDomain> selectAllService();
}
