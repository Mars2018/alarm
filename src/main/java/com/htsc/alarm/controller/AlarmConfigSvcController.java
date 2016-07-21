package com.htsc.alarm.controller;

import com.alibaba.fastjson.JSON;
import com.htsc.alarm.common.bean.Result;
import com.htsc.alarm.common.controller.BeanController;
import com.htsc.alarm.service.AlarmConfigService;
import com.htsc.alarm.vo.ConfigAlarmHostsReq;
import com.htsc.alarm.vo.ConfigAlarmItemsReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mars_wang on 2016/7/13.
 */

@Controller(value = "config")
public class AlarmConfigSvcController extends BeanController {
    private static final Logger LOG = LoggerFactory.getLogger(AlarmConfigSvcController.class);

    @Autowired
    private AlarmConfigService alarmConfigService;

    @RequestMapping(value = "/insertItems", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertItems(ConfigAlarmItemsReq configAlarmItemsReq, HttpServletRequest request){
        this.copyPayReqValues(configAlarmItemsReq, request);
        LOG.debug("Get configAlarmReq:[]" + configAlarmItemsReq.toString());
        Integer insertRecords = alarmConfigService.insertItems(configAlarmItemsReq);
        Result<String> result = new Result<>();
        result.setMark("1");
        result.setMessage("InsertItems successfully!");
        result.setData(""+insertRecords);
        return JSON.toJSONString(result);
    }

    @RequestMapping(value = "/insertHosts", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertHosts(ConfigAlarmHostsReq configAlarmHostsReq, HttpServletRequest request){
        this.copyPayReqValues(configAlarmHostsReq, request);

        return null;
    }


}
