package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum AlarmType {
    SERVERALARM("1","服务器"),
    DATABASEALARM("2","数据库"),
    VPNALARM("3","VPN通道");

    private String value;
    private String desc;

    AlarmType(String value,String desc){
        this.value = value;
        this.desc = desc;
    }
}
