package com.htsc.alarm.domain;

import java.util.Date;

public class AlarmInfo {
    private Integer id;

    private String ipSource;

    private String alarmName;

    private String alarmType;

    private String alarmValue;

    private String alarmLevel;

    private String alarmDesc;

    private Date startDatetime;

    private Date endDatetime;

    private Integer alarmClear;

    private String clearRecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource == null ? null : ipSource.trim();
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName == null ? null : alarmName.trim();
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType == null ? null : alarmType.trim();
    }

    public String getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(String alarmValue) {
        this.alarmValue = alarmValue == null ? null : alarmValue.trim();
    }

    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel == null ? null : alarmLevel.trim();
    }

    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc == null ? null : alarmDesc.trim();
    }

    public Date getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Date getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
    }

    public Integer getAlarmClear() {
        return alarmClear;
    }

    public void setAlarmClear(Integer alarmClear) {
        this.alarmClear = alarmClear;
    }

    public String getClearRecord() {
        return clearRecord;
    }

    public void setClearRecord(String clearRecord) {
        this.clearRecord = clearRecord == null ? null : clearRecord.trim();
    }
}