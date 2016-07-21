package com.htsc.alarm.service;


import com.htsc.alarm.vo.ConfigAlarmItemsReq;

/**
 * Created by mars_wang on 2016/7/13.
 */
public interface AlarmConfigService {

    Integer insertItems(ConfigAlarmItemsReq configAlarmItemsReq);
}
