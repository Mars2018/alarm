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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */

@Controller
@RequestMapping(value = "config")
public class AlarmConfigSvcController extends BeanController {
    private static final Logger LOG = LoggerFactory.getLogger(AlarmConfigSvcController.class);

    @Autowired
    private AlarmConfigService alarmConfigService;

    @RequestMapping(value = "/insertHosts", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertHosts(@RequestParam("hosts") String hostsString, HttpServletRequest request){
        List<ConfigAlarmHostsReq> configAlarmHostsReqs = JSON.parseArray(hostsString, ConfigAlarmHostsReq.class);
        LOG.debug("Get Hosts:[]", configAlarmHostsReqs);
        Integer insertRecords = alarmConfigService.insertHosts(configAlarmHostsReqs);
        Result<String> result = new Result<>();
        result.setMark("1");
        result.setMessage("Insert Hosts Successfully");
        result.setTotalCount(insertRecords);
        return JSON.toJSONString(result);
    }

    @RequestMapping(value = "/updateHost", produces = "application/json; charset=UTF_8")
    @ResponseBody
    public String  update(@RequestParam("hosts") String hostsString, HttpServletRequest request){
        List<ConfigAlarmHostsReq> configAlarmHostsReqs = JSON.parseArray(hostsString, ConfigAlarmHostsReq.class);
        Integer records = alarmConfigService.updateHost(configAlarmHostsReqs);
        Result<String> result = new Result<>();
        result.setMark("1");
        result.setMessage("Insert Hosts Successfully");
        result.setTotalCount(records);
        return JSON.toJSONString(result);
    }

    @RequestMapping(value = "/insertItems", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertItems(@RequestParam("items") String itemsString, HttpServletRequest request){
        List<ConfigAlarmItemsReq> itemsReqs = JSON.parseArray(itemsString, ConfigAlarmItemsReq.class);
        LOG.debug("Get items:[]" + itemsReqs.toString());
        Integer insertRecords = alarmConfigService.insertItems(itemsReqs);
        Result<String> result = new Result<>();
        result.setMark("1");
        result.setMessage("Insert Items successfully!");
        result.setTotalCount(insertRecords);
        return JSON.toJSONString(result);
    }






}
