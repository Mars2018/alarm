package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/14.
 */
public enum ServerAlarmTargets {
    CPUUTILIZATION(1,"CPUUTILIZATION","cpu使用率"),
    INTERNETAVAILABLE(2,"INTERNETAVAILABLE","网络通断"),
    RAMUTILIZATIONFACTOR(3,"RAMUTILIZATIONFACTOR","内存使用率"),
    RAMUTIILIZATION(4,"RAMUTIILIZATION","内存占用大小"),
    IOSPEED(5,"IOSPEED","IO读写速率"),
    ROMUTILIZATIONFACTOR(6,"ROMUTILIZATIONFACTOR","磁盘使用率"),
    ROMUTIILIZATION(7,"ROMUTIILIZATION","磁盘占用大小"),
    PROCESSESNUMBERS(8, "PROCESSESNUMBERS", "进程数量");

    private int id;
    private String  name;
    private String  desc;
    private int value;

    ServerAlarmTargets(int id, String name, String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
