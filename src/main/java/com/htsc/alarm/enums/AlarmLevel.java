package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum AlarmLevel {
    CRITICAL("500","严重警告","RED"),
    MAJOR("400", "重大警告", "ORANGE"),
    MINOR("300", "次要警告","YELLOW"),
    WARNING("200", "提示警告","CYAN"),
    INDETERMINATER("100","待定警告","PURPLE"),
    CLEARED("0", "清除警告", "GREEN");

    private String value;
    private String desc;
    private String color;

    AlarmLevel(String value, String desc, String color){
        this.value = value;
        this.desc = desc;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
