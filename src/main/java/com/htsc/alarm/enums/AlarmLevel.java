package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum AlarmLevel {
    CRITICAL(1,"CRITICAL","严重警告","RED"),
    MAJOR(2,"MAJOR", "重大警告", "ORANGE"),
    MINOR(3," MINOR", "次要警告","YELLOW"),
    WARNING(4,"WARNING", "提示警告","CYAN"),
    INDETERMINATER(5,"INDETERMINATER","待定警告","PURPLE"),
    CLEARED(6,"CLEARED", "清除警告", "GREEN");

    private int id;
    private String name;
    private String desc;
    private String color;
    private int value;


    AlarmLevel(int id,String name, String desc, String color){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.color = color;
    }

    public static AlarmLevel idOf(int id){
        switch (id){
            case 1: return CRITICAL;
            case 2: return MAJOR;
            case 3: return MINOR;
            case 4: return WARNING;
            case 5: return INDETERMINATER;
            case 6: return CLEARED;
            default: return null;
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
