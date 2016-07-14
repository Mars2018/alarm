package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum StatisticalMethods {
    MINIMUM(1,"MINIMUM","最小值"),
    MAXIMUM(2,"MAXIMUM","最大值"),
    AVERAGE(3,"AVERAGE","平均值"),
    VARIANCE(4,"VARIANCE","方差");

    private int id;
    private String name;
    private String desc;

    StatisticalMethods(int id, String name, String desc){
        this.name = name;
        this.id = id;
        this.desc = desc;
    }

    public static StatisticalMethods idOf(int id){
        switch (id){
            case 1: return MINIMUM;
            case 2: return MAXIMUM;
            case 3: return AVERAGE;
            case 4: return VARIANCE;
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
