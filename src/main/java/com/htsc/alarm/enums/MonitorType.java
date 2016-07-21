package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/21.
 */
public enum MonitorType {

    SERVERALARM(1,"SERVERALARM","服务器"),
    DATABASEALARM(2,"DATABASEALARM","数据库"),
    VPNALARM(3,"VPNALARM","VPN通道");

    private int id;
    private String name;
    private String desc;

    MonitorType(int id,String name,String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }


}
