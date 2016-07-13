package com.htsc.alarm.domain;

public class AlarmConfigWithBLOBs extends AlarmConfig {
    private String alarmValue;

    private String operationDate;

    private String inoperationData;

    private String alarmDependencies;

    public String getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(String alarmValue) {
        this.alarmValue = alarmValue == null ? null : alarmValue.trim();
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    public String getInoperationData() {
        return inoperationData;
    }

    public void setInoperationData(String inoperationData) {
        this.inoperationData = inoperationData == null ? null : inoperationData.trim();
    }

    public String getAlarmDependencies() {
        return alarmDependencies;
    }

    public void setAlarmDependencies(String alarmDependencies) {
        this.alarmDependencies = alarmDependencies == null ? null : alarmDependencies.trim();
    }
}