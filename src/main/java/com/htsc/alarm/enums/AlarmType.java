package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum AlarmType {
    SERVERALARM(1,"SERVERALARM","服务器"),
    DATABASEALARM(2,"DATABASEALARM","数据库"),
    VPNALARM(3,"VPNALARM","VPN通道");

    private int id;
    private String name;
    private String desc;

    AlarmType(int id,String name,String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public static AlarmType idOf (int id){
        switch (id){
            case 1: return SERVERALARM;
            case 2: return DATABASEALARM;
            case 3: return VPNALARM;
            default: return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
