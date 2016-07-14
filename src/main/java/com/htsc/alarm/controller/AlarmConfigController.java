package com.htsc.alarm.controller;

import com.alibaba.fastjson.JSON;
import com.htsc.alarm.common.bean.Result;
import com.htsc.alarm.service.AlarmConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
    public String insertConfig(@RequestParam("configString") String configString, HttpRequest request){
        Result result = new Result();
        if(null == configString || "".equals(configString)){
            LOG.error("configString为空！");
            result.setMark("-1");
            result.setMessage("parameter is null");
        }
        Integer insertRecords = alarmConfigService.insert(configString, request);
        result.setMark("0");
        result.setMessage("insert successfully!");
        result.setData(""+insertRecords);
        return JSON.toJSONString(result);
    }


}
