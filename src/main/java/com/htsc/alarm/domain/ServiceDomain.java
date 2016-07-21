package com.htsc.alarm.domain;

import java.util.Date;

public class ServiceDomain {
    private Integer serviceId;

    private Integer hostId;

    private Integer status;

    private Integer triggerId;

    private Date serviceStart;

    private Date serviceEnd;

    private String dependencies;

    private String serviceActive;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    public Date getServiceStart() {
        return serviceStart;
    }

    public void setServiceStart(Date serviceStart) {
        this.serviceStart = serviceStart;
    }

    public Date getServiceEnd() {
        return serviceEnd;
    }

    public void setServiceEnd(Date serviceEnd) {
        this.serviceEnd = serviceEnd;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies == null ? null : dependencies.trim();
    }

    public String getServiceActive() {
        return serviceActive;
    }

    public void setServiceActive(String serviceActive) {
        this.serviceActive = serviceActive == null ? null : serviceActive.trim();
    }
}