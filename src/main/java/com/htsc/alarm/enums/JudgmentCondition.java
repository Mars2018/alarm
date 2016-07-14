package com.htsc.alarm.enums;

import java.util.ArrayList;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum JudgmentCondition {
    MORETHAN(1, "MORETHAN","大于"),
    LESSTHAN(2,"LESSTHAN","小于"),
    NOTMORETHAN(3,"NOTMORETHAN","小于等于"),
    NOTLESSTHAN(4,"NOTLESSTHAN","大于等于"),
    BETWEEN(5,"BETWEEN","介于二者之间");

    private int id;
    private String name;
    private String desc;
    private ArrayList<Integer> values = new ArrayList<>();

    JudgmentCondition(int id, String name, String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public static JudgmentCondition idOf(int id){
        switch (id){
            case 1: return MORETHAN;
            case 2: return LESSTHAN;
            case 3: return NOTMORETHAN;
            case 4: return NOTLESSTHAN;
            case 5: return BETWEEN;
            default: return null;
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public void setValues(ArrayList<Integer> values) {
        this.values = values;
    }
}
