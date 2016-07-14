package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/14.
 */
public enum AlarmAvailableDay {
    EVERYDAY(1,"EVERYDAY","每天"),
    WORKINGDAY(2,"WORKINGDAY","工作日"),
    SPECIALDAY(3,"SPECIALDAY","特殊日");

    private Integer id;
    private String name;
    private String desc;


    AlarmAvailableDay(Integer id, String name, String desc) {
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
}
