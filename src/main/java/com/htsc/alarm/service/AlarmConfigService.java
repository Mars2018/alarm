package com.htsc.alarm.service;


import com.htsc.alarm.vo.ConfigAlarmHostsReq;
import com.htsc.alarm.vo.ConfigAlarmItemsReq;
import com.htsc.alarm.vo.ConfigAlarmServicesReq;
import com.htsc.alarm.vo.ConfigAlarmTriggersReq;

import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */
public interface AlarmConfigService {


    String insertHosts(List<ConfigAlarmHostsReq> configAlarmHostsReq);

    String deleteHost(List<ConfigAlarmHostsReq> configAlarmHostsReqs);

    String updateHost(List<ConfigAlarmHostsReq> configAlarmHostsReq);

    String insertItems(List<ConfigAlarmItemsReq> configAlarmItemsReq);

    String deleteItem(List<ConfigAlarmItemsReq> itemsReqs);

    String updateItem(List<ConfigAlarmItemsReq> itemsReqs);

    String insertServices(ConfigAlarmServicesReq servicesReqs);

    String deleteService(ConfigAlarmServicesReq servicesReq);

    String updateService(List<ConfigAlarmServicesReq> servicesReqs);

    String insertTriggers(List<ConfigAlarmTriggersReq> configAlarmTriggersReqs);

    String deleteTrigger(ConfigAlarmTriggersReq configAlarmTriggersReq);

    String updateTrigger(List<ConfigAlarmTriggersReq> configAlarmTriggersReqs);
}
