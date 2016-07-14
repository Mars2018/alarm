package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/14.
 */
public enum DatabeseAlarmTargets {
    DISKSPACE(1,"DISKSPACE","磁盘空间"),
    DISKSPCEUSAGE(2,"DISKSPCEUSAGE","磁盘使用空间"),
    DISKUSAGERATE(3,"DISKUSAGERATE","磁盘使用率"),
    FULLSCANSPEED(4,"FULLSCANSPEED","全表扫描频率"),
    SLOWQUERYSPEED(5,"SLOWQUERYSPEED","慢查询频率"),
    CONNECTIONS(6,"CONNECTIONS","当前连接数"),
    RECEIVEBYTES(7,"RECEIVEBYTES","接受数速率"),
    SENDBYTES(8,"SENDBYTES","发送数据速率"),
    VISITS(9,"VISITS","总访问量");


    private Integer id;
    private String name;
    private String desc;
    private Integer value;

    DatabeseAlarmTargets(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
