package com.htsc.alarm.domain;

public class AlarmConfig {
    private Integer id;

    private String alamrName;

    private String alarmType;

    private String alarmLevel;

    private String valueAggregateType;

    private Integer stifleTime;

    private String operationType;

    private String alarmDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlamrName() {
        return alamrName;
    }

    public void setAlamrName(String alamrName) {
        this.alamrName = alamrName == null ? null : alamrName.trim();
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType == null ? null : alarmType.trim();
    }

    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel == null ? null : alarmLevel.trim();
    }

    public String getValueAggregateType() {
        return valueAggregateType;
    }

    public void setValueAggregateType(String valueAggregateType) {
        this.valueAggregateType = valueAggregateType == null ? null : valueAggregateType.trim();
    }

    public Integer getStifleTime() {
        return stifleTime;
    }

    public void setStifleTime(Integer stifleTime) {
        this.stifleTime = stifleTime;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc == null ? null : alarmDesc.trim();
    }
}