package com.htsc.alarm.service;


import com.htsc.alarm.vo.ConfigAlarmHostsReq;
import com.htsc.alarm.vo.ConfigAlarmItemsReq;

import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */
public interface AlarmConfigService {

    Integer insertItems(List<ConfigAlarmItemsReq> configAlarmItemsReq);

    Integer insertHosts(List<ConfigAlarmHostsReq> configAlarmHostsReq);

    Integer updateHost(List<ConfigAlarmHostsReq> configAlarmHostsReq);
}
