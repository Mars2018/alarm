package com.htsc.alarm.vo;

/**
 * Created by mars_wang on 2016/7/21.
 */
public class ConfigAlarmItemsReq {

    private String name;

    private Integer monitorTypeNo;

    private Integer monitorTargetNo;

    private Integer hostId;

    private Integer updateInterval;

    private Integer status;

    private Long historyKeep;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMonitorTypeNo() {
        return monitorTypeNo;
    }

    public void setMonitorTypeNo(Integer monitorTypeNo) {
        this.monitorTypeNo = monitorTypeNo;
    }

    public Integer getMonitorTargetNo() {
        return monitorTargetNo;
    }

    public void setMonitorTargetNo(Integer monitorTargetNo) {
        this.monitorTargetNo = monitorTargetNo;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getHistoryKeep() {
        return historyKeep;
    }

    public void setHistoryKeep(Long historyKeep) {
        this.historyKeep = historyKeep;
    }
}
