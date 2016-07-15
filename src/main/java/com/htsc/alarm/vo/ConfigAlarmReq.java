package com.htsc.alarm.vo;

import com.htsc.alarm.common.bean.AlarmDependency;

import java.util.List;

/**
 * Created by mars_wang on 2016/7/14.
 */
public class ConfigAlarmReq {

    private String alarmName;

    private String alarmType;

    private String alarmLevel;

    private List<Integer> alarmValue;

    private String statisticalMethod;

    private Integer stifleTime;

    private String availableDay;

    private String startDatetime;

    private String endDatatime;

    private String alarmDependencies;

    private String alarmDesc;

    private String judgmentCondition;

    private List<AlarmDependency> dependencies;

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public String getStatisticalMethod() {
        return statisticalMethod;
    }

    public void setStatisticalMethod(String statisticalMethod) {
        this.statisticalMethod = statisticalMethod;
    }

    public Integer getStifleTime() {
        return stifleTime;
    }

    public void setStifleTime(Integer stifleTime) {
        this.stifleTime = stifleTime;
    }

    public String getAvailableDay() {
        return availableDay;
    }

    public void setAvailableDay(String availableDay) {
        this.availableDay = availableDay;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getEndDatatime() {
        return endDatatime;
    }

    public void setEndDatatime(String endDatatime) {
        this.endDatatime = endDatatime;
    }

    public String getAlarmDependencies() {
        return alarmDependencies;
    }

    public void setAlarmDependencies(String alarmDependencies) {
        this.alarmDependencies = alarmDependencies;
    }

    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc;
    }

    public String getJudgmentCondition() {
        return judgmentCondition;
    }

    public void setJudgmentCondition(String judgmentCondition) {
        this.judgmentCondition = judgmentCondition;
    }

    public List<AlarmDependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<AlarmDependency> dependencies) {
        this.dependencies = dependencies;
    }

    public List<Integer> getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(List<Integer> alarmValue) {
        this.alarmValue = alarmValue;
    }
}
