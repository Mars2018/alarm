package com.htsc.alarm.domain;

import java.util.Date;

public class AlarmDoamin {
    private Integer alarmId;

    private Integer serviceId;

    private Date alarmTime;

    private Integer alarmLevel;

    private Integer isSolved;

    private String solveRecord;

    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public Integer getIsSolved() {
        return isSolved;
    }

    public void setIsSolved(Integer isSolved) {
        this.isSolved = isSolved;
    }

    public String getSolveRecord() {
        return solveRecord;
    }

    public void setSolveRecord(String solveRecord) {
        this.solveRecord = solveRecord == null ? null : solveRecord.trim();
    }
}