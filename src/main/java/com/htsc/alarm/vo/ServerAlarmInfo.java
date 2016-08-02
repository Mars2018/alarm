package com.htsc.alarm.vo;

/**
 * Created by mars_wang on 2016/8/2.
 */
public class ServerAlarmInfo {

    public static final String TYPE = "server";

    private String target;

    private Integer value;


    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
