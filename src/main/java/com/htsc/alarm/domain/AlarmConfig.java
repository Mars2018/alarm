package com.htsc.alarm.domain;

import java.util.Date;

public class AlarmConfig {
    private Integer id;

    private String alarmType;

    private String alarmName;

    private String statisticalMethod;

    private String judgmentCondition;

    private String alarmValue;

    private Integer stifleTime;

    private String alarmLevel;

    private String availableDay;

    private Date startDatetime;

    private Date endDatatime;

    private String alarmDependencies;

    private String alarmDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType == null ? null : alarmType.trim();
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName == null ? null : alarmName.trim();
    }

    public String getStatisticalMethod() {
        return statisticalMethod;
    }

    public void setStatisticalMethod(String statisticalMethod) {
        this.statisticalMethod = statisticalMethod == null ? null : statisticalMethod.trim();
    }

    public String getJudgmentCondition() {
        return judgmentCondition;
    }

    public void setJudgmentCondition(String judgmentCondition) {
        this.judgmentCondition = judgmentCondition == null ? null : judgmentCondition.trim();
    }

    public String getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(String alarmValue) {
        this.alarmValue = alarmValue == null ? null : alarmValue.trim();
    }

    public Integer getStifleTime() {
        return stifleTime;
    }

    public void setStifleTime(Integer stifleTime) {
        this.stifleTime = stifleTime;
    }

    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel == null ? null : alarmLevel.trim();
    }

    public String getAvailableDay() {
        return availableDay;
    }

    public void setAvailableDay(String availableDay) {
        this.availableDay = availableDay == null ? null : availableDay.trim();
    }

    public Date getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Date getEndDatatime() {
        return endDatatime;
    }

    public void setEndDatatime(Date endDatatime) {
        this.endDatatime = endDatatime;
    }

    public String getAlarmDependencies() {
        return alarmDependencies;
    }

    public void setAlarmDependencies(String alarmDependencies) {
        this.alarmDependencies = alarmDependencies == null ? null : alarmDependencies.trim();
    }

    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc == null ? null : alarmDesc.trim();
    }
}