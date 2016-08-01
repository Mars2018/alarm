package com.htsc.alarm.service;

import com.htsc.alarm.domain.MonitorTarget;
import com.htsc.alarm.domain.MonitorType;

import java.util.List;

/**
 * Created by mars_wang on 2016/8/1.
 */
public interface MonitorService {

    List<MonitorType> selectAllMonitorType();

    List<MonitorTarget> selectAllMonitorTarget();
}
