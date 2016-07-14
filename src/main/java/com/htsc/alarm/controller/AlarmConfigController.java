package com.htsc.alarm.controller;

import com.htsc.alarm.service.AlarmConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mars_wang on 2016/7/13.
 */

@Controller(value = "config")
public class AlarmConfigController {
    private static final Logger LOG = LoggerFactory.getLogger(AlarmConfigController.class);

    @Autowired
    private AlarmConfigService alarmConfigService;

    @RequestMapping(value = "/insert", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertConfig(@RequestParam("configString") String configString){

        return null;
    }


}
