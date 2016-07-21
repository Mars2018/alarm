package com.htsc.alarm.domain;

public class ItemDomain {
    private Integer itemId;

    private String itemName;

    private String monitorType;

    private String monitorTarget;

    private Integer hostId;

    private Integer updateInterval;

    private Integer itemStatus;

    private Long historyKeep;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType == null ? null : monitorType.trim();
    }

    public String getMonitorTarget() {
        return monitorTarget;
    }

    public void setMonitorTarget(String monitorTarget) {
        this.monitorTarget = monitorTarget == null ? null : monitorTarget.trim();
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public Integer getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(Integer updateInterval) {
        this.updateInterval = updateInterval;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Long getHistoryKeep() {
        return historyKeep;
    }

    public void setHistoryKeep(Long historyKeep) {
        this.historyKeep = historyKeep;
    }
}