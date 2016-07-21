package com.htsc.alarm.vo;

/**
 * Created by mars_wang on 2016/7/21.
 */
public class ConfigAlarmHostsReq {

    private String name;

    private String ip;

    private Long proxy_id;

    private String port;

    private Integer enable;


    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getProxy_id() {
        return proxy_id;
    }

    public void setProxy_id(Long proxy_id) {
        this.proxy_id = proxy_id;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
