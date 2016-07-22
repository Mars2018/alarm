package com.htsc.alarm.cfg;

/**
 * Created by mars_wang on 2016/7/21.
 */
public interface MonitorSvcConfig {
    String[] MonitorTypes = {"SERVER", "DATABASE", "VPN"};

    String[][] MonitorTargets = {
            {"CPU占用", "内存占用", "线程数"},
            {"磁盘容量", "磁盘占用量", "全表扫描数"},
            {"网络带宽", "最大连接数" ,"已使用连接数"}
    };
}
