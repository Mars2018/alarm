package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/13.
 */
public enum JudgmentCondition {
    MORETHAN("1", ">"),//大于
    LESSTHAN("2","<"),//小雨
    NOTMORETHAN("3","<="),//小于或者等于
    NOTLESSTHAN("4",">="),//大于或者等于
    BETWEEN("5","< >");//介于二者之间

    private String value;
    private String desc;

    JudgmentCondition(String value, String desc){
        this.value = value;
        this.desc = desc;
    }

}
