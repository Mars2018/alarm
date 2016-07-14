package com.htsc.alarm.enums;

/**
 * Created by mars_wang on 2016/7/14.
 */
public enum VPNAlarmTargets {
    CHANNELDELAY(1,"CHANNELDELAY","通道延时"),
    PACKETLOSSRATE(2,"PACKETLOSSRATE","丢包率"),
    INBOUNDBANDWIDTH(3,"INDOUNDBANDWDTH","入带宽"),
    OUTBOUNDBANDWIDTH(4,"OUTBOUNDBANDWIDTH","入站带宽"),
    CHANNELCLEAR(5,"CHANNELCLEAR","通道是否通畅");

    private Integer id;
    private String name;
    private String desc;
    private Integer value;


    VPNAlarmTargets(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
