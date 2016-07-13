package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum StatisticalMethods {
    MINIMUM("1","最小值"),
    MAXIMUM("2","最大值"),
    AVERAGE("3","平均值"),
    VARIANCE("4","方差");

    private String value;
    private String desc;

    StatisticalMethods(String value, String desc){
        this.value = value;
        this.desc = desc;
    }

}
