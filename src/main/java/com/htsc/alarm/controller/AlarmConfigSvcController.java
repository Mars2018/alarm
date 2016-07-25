package com.htsc.alarm.controller;

import com.alibaba.fastjson.JSON;
import com.htsc.alarm.common.controller.BeanController;
import com.htsc.alarm.service.AlarmConfigService;
import com.htsc.alarm.vo.ConfigAlarmHostsReq;
import com.htsc.alarm.vo.ConfigAlarmItemsReq;
import com.htsc.alarm.vo.ConfigAlarmServicesReq;
import com.htsc.alarm.vo.ConfigAlarmTriggersReq;
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
        return alarmConfigService.insertHosts(configAlarmHostsReqs);
    }

    @RequestMapping(value = "/deleteHost", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String deleteHost(@RequestParam("hosts") String hostString, HttpServletRequest request){
        List<ConfigAlarmHostsReq> configAlarmHostsReqs = JSON.parseArray(hostString, ConfigAlarmHostsReq.class);
        return alarmConfigService.deleteHost(configAlarmHostsReqs);
    }

    /**
     * hostString 同时传入旧的host和新的host的JSON串
     * @param hostString 旧的和新的hostde JSON串
     * @param request
     * @return 操作结果
     */
    @RequestMapping(value = "/updateHost", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String updateHost(@RequestParam("hosts") String hostString, HttpServletRequest request ){
        List<ConfigAlarmHostsReq> configAlarmHostsReqs = JSON.parseArray(hostString, ConfigAlarmHostsReq.class);
        return alarmConfigService.updateHost(configAlarmHostsReqs);
    }

    @RequestMapping(value = "/insertItems", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertItems(@RequestParam("items") String itemsString, HttpServletRequest request){
        List<ConfigAlarmItemsReq> itemsReqs = JSON.parseArray(itemsString, ConfigAlarmItemsReq.class);
        LOG.debug("Get items:[]" + itemsReqs.toString());
        return alarmConfigService.insertItems(itemsReqs);
    }

    @RequestMapping(value = "/deleteItem", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String deleteItem(@RequestParam("item") String itemString, HttpServletRequest request){
        List<ConfigAlarmItemsReq> itemsReqs = JSON.parseArray(itemString, ConfigAlarmItemsReq.class);
        LOG.debug("Get items:[] ", itemsReqs.toString());
        return alarmConfigService.deleteItem(itemsReqs);
    }

    @RequestMapping(value = "/updateItem", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String updateItem(@RequestParam("items") String itemsString, HttpServletRequest request){
        List<ConfigAlarmItemsReq> itemsReqs = JSON.parseArray(itemsString, ConfigAlarmItemsReq.class);
        LOG.debug("Get old and new items:[]", itemsReqs.toString());
        return alarmConfigService.updateItem(itemsReqs);
    }

    @RequestMapping(value = "/insertService", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertService(@RequestParam("service") String serviceString, HttpServletRequest request){
        ConfigAlarmServicesReq servicesReq = JSON.parseObject(serviceString, ConfigAlarmServicesReq.class);
        LOG.debug("Get services:[]", servicesReq.toString());
        String result = alarmConfigService.insertServices(servicesReq);
        return result;
    }

    @RequestMapping(value = "/deleteService", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String deleteService(@RequestParam("service") String serviceString, HttpServletRequest request){
        ConfigAlarmServicesReq servicesReq = JSON.parseObject(serviceString, ConfigAlarmServicesReq.class);
        LOG.debug("Get services:[]", servicesReq.toString());
        String result = alarmConfigService.deleteService(servicesReq);
        return result;
    }

    @RequestMapping(value = "/updateService", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String updateService(@RequestParam("services") String servicesString, HttpServletRequest request){
        List<ConfigAlarmServicesReq> servicesReqs = JSON.parseArray(servicesString, ConfigAlarmServicesReq.class);
        LOG.debug("Get old and new services[]", servicesReqs.toString());
        String result = alarmConfigService.updateService(servicesReqs);
        return result;
    }

    @RequestMapping(value = "/insertTriggers", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String insertTrigger(@RequestParam("triggers") String triggersString, HttpServletRequest request){
        List<ConfigAlarmTriggersReq> configAlarmTriggersReqs = JSON.parseArray(triggersString, ConfigAlarmTriggersReq.class);
        LOG.debug("Get triggers:[]", configAlarmTriggersReqs.toString());
        String result = alarmConfigService.insertTriggers(configAlarmTriggersReqs);
        return result;
    }

    @RequestMapping(value = "/deleteTrigger", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String deleteTrigger(@RequestParam("trigger") String trigger, HttpServletRequest request){
        ConfigAlarmTriggersReq configAlarmTriggersReq = JSON.parseObject(trigger, ConfigAlarmTriggersReq.class);
        LOG.debug("get trigger:[]", configAlarmTriggersReq.toString());
        String result = alarmConfigService.deleteTrigger(configAlarmTriggersReq);
        return result;
    }

    @RequestMapping(value = "/updateTrigger", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String updateTrigger(@RequestParam("triggers") String triggers, HttpServletRequest request){
        List<ConfigAlarmTriggersReq> configAlarmTriggersReqs = JSON.parseArray(triggers, ConfigAlarmTriggersReq.class);
        LOG.debug("Get old and new triggers:[]", configAlarmTriggersReqs.toString());
        String result = alarmConfigService.updateTrigger(configAlarmTriggersReqs);
        return result;
    }


}
