package com.htsc.alarm.service;

import org.springframework.http.HttpRequest;

/**
 * Created by mars_wang on 2016/7/13.
 */
public interface AlarmConfigService {

    Integer insert(String configString, HttpRequest request);

}
