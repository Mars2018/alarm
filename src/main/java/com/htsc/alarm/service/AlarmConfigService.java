package com.htsc.alarm.service;


import com.htsc.alarm.common.bean.Result;
import com.htsc.alarm.vo.ConfigAlarmHostsReq;
import com.htsc.alarm.vo.ConfigAlarmItemsReq;
import com.htsc.alarm.vo.ConfigAlarmServicesReq;
import com.htsc.alarm.vo.ConfigAlarmTriggersReq;

import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */
public interface AlarmConfigService {


    Result insertHosts(List<ConfigAlarmHostsReq> configAlarmHostsReq);

    Result deleteHost(List<ConfigAlarmHostsReq> configAlarmHostsReqs);

    Result updateHost(List<ConfigAlarmHostsReq> configAlarmHostsReq);

    Result insertItems(List<ConfigAlarmItemsReq> configAlarmItemsReq);

    Result deleteItem(List<ConfigAlarmItemsReq> itemsReqs);

    Result updateItem(List<ConfigAlarmItemsReq> itemsReqs);

    Result insertServices(ConfigAlarmServicesReq servicesReqs);

    Result deleteService(ConfigAlarmServicesReq servicesReq);

    Result updateService(List<ConfigAlarmServicesReq> servicesReqs);

    Result insertTriggers(List<ConfigAlarmTriggersReq> configAlarmTriggersReqs);

    Result deleteTrigger(ConfigAlarmTriggersReq configAlarmTriggersReq);

    Result updateTrigger(List<ConfigAlarmTriggersReq> configAlarmTriggersReqs);
}
