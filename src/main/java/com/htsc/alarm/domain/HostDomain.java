package com.htsc.alarm.domain;

public class HostDomain {
    private Integer hostId;

    private String hostName;

    private String hostIp;

    private Integer hostProxyId;

    private String hostPort;

    private Integer hostStatus;

    private Integer enable;

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp == null ? null : hostIp.trim();
    }

    public Integer getHostProxyId() {
        return hostProxyId;
    }

    public void setHostProxyId(Integer hostProxyId) {
        this.hostProxyId = hostProxyId;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort == null ? null : hostPort.trim();
    }

    public Integer getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(Integer hostStatus) {
        this.hostStatus = hostStatus;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}