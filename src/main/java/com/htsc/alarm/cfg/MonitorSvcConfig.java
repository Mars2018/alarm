package com.htsc.alarm.cfg;

/**
 * Created by mars_wang on 2016/7/21.
 */
public interface MonitorSvcConfig {
    String[] MonitorTypes = {"SERVER", "DATABASE", "VPN"};

    String[][] MonitorTargets = {
            {"CPU Occupation", "Memory Occupation", "Threads Number"},
            {"Disk Size", "Disk Occupation", "Full Scan Times"},
            {"Network Bandwidth", "Max Connections" ,"Connections Used"}
    };
}
