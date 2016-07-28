package com.htsc.alarm.controller;

import com.alibaba.fastjson.JSON;
import com.htsc.alarm.common.bean.Result;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */

@Controller
@RequestMapping(value = "/config")
public class AlarmConfigSvcController extends BeanController {
    private static final Logger LOG = LoggerFactory.getLogger(AlarmConfigSvcController.class);

    @Autowired
    private AlarmConfigService alarmConfigService;

    @RequestMapping(value = "/host/insert", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public Result insertHosts(@RequestParam("hosts")String hosts, HttpServletRequest request){
        List<ConfigAlarmHostsReq> configAlarmHostsReqs = JSON.parseArray(hosts, ConfigAlarmHostsReq.class);
        LOG.debug("Get Hosts:[]", configAlarmHostsReqs);
        return alarmConfigService.insertHosts(configAlarmHostsReqs);
    }

    @RequestMapping(value = "/host/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteHost(@RequestParam("hosts")String host,HttpServletRequest request){
        List<ConfigAlarmHostsReq> configAlarmHostsReqs = JSON.parseArray(host, ConfigAlarmHostsReq.class);
        return alarmConfigService.deleteHost(configAlarmHostsReqs);
    }

    /**
     * hostString 同时传入旧的host和新的host的JSON串
     * @param request
     * @return 操作结果
     */
    @RequestMapping(value = "/host/update", produces = "application/json; charset=UTF-8", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateHost(@RequestParam("hosts")String hosts,HttpServletRequest request ){
        List<ConfigAlarmHostsReq> configAlarmHostsReqs = JSON.parseArray(hosts, ConfigAlarmHostsReq.class);
        return alarmConfigService.updateHost(configAlarmHostsReqs);
    }

    @RequestMapping(value = "/item/insert", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public Result insertItems(@RequestParam("items") String items, HttpServletRequest request){
        List<ConfigAlarmItemsReq> itemsReqs = JSON.parseArray(items, ConfigAlarmItemsReq.class);
        LOG.debug("Get items:[]" + itemsReqs.toString());
        return alarmConfigService.insertItems(itemsReqs);
    }

    @RequestMapping(value = "/item/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteItem(@RequestParam("items") String itemString, HttpServletRequest request){
        List<ConfigAlarmItemsReq> itemsReqs = JSON.parseArray(itemString, ConfigAlarmItemsReq.class);
        LOG.debug("Get items:[] ", itemsReqs.toString());
        return alarmConfigService.deleteItem(itemsReqs);
    }

    @RequestMapping(value = "/item/update", produces = "application/json; charset=UTF-8", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateItem(@RequestParam("items") String itemsString, HttpServletRequest request){
        List<ConfigAlarmItemsReq> itemsReqs = JSON.parseArray(itemsString, ConfigAlarmItemsReq.class);
        LOG.debug("Get old and new items:[]", itemsReqs.toString());
        return alarmConfigService.updateItem(itemsReqs);
    }

    @RequestMapping(value = "/service/insert", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public Result insertService(@RequestParam("service") String serviceString, HttpServletRequest request){
        ConfigAlarmServicesReq servicesReq = JSON.parseObject(serviceString, ConfigAlarmServicesReq.class);
        LOG.debug("Get services:[]", servicesReq.toString());
        Result result = alarmConfigService.insertServices(servicesReq);
        return result;
    }

    @RequestMapping(value = "service/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteService(@RequestParam("service") String serviceString, HttpServletRequest request){
        ConfigAlarmServicesReq servicesReq = JSON.parseObject(serviceString, ConfigAlarmServicesReq.class);
        LOG.debug("Get services:[]", servicesReq.toString());
        Result result = alarmConfigService.deleteService(servicesReq);
        return result;
    }

    @RequestMapping(value = "service/update", produces = "application/json; charset=UTF-8", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateService(@RequestParam("services") String servicesString, HttpServletRequest request){
        List<ConfigAlarmServicesReq> servicesReqs = JSON.parseArray(servicesString, ConfigAlarmServicesReq.class);
        LOG.debug("Get old and new services[]", servicesReqs.toString());
        Result result = alarmConfigService.updateService(servicesReqs);
        return result;
    }

    @RequestMapping(value = "trigger/insert", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public Result insertTrigger(@RequestParam("triggers") String triggersString, HttpServletRequest request){
        List<ConfigAlarmTriggersReq> configAlarmTriggersReqs = JSON.parseArray(triggersString, ConfigAlarmTriggersReq.class);
        LOG.debug("Get triggers:[]", configAlarmTriggersReqs.toString());
        Result result = alarmConfigService.insertTriggers(configAlarmTriggersReqs);
        return result;
    }

    @RequestMapping(value = "trigger/delete", produces = "application/json; charset=UTF-8", method = RequestMethod.DELETE )
    @ResponseBody
    public Result deleteTrigger(@RequestParam("trigger") String trigger, HttpServletRequest request){
        ConfigAlarmTriggersReq configAlarmTriggersReq = JSON.parseObject(trigger, ConfigAlarmTriggersReq.class);
        LOG.debug("get trigger:[]", configAlarmTriggersReq.toString());
        Result result = alarmConfigService.deleteTrigger(configAlarmTriggersReq);
        return result;
    }

    @RequestMapping(value = "trigger/update", produces = "application/json; charset=UTF-8", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateTrigger(@RequestParam("triggers") String triggers, HttpServletRequest request){
        List<ConfigAlarmTriggersReq> configAlarmTriggersReqs = JSON.parseArray(triggers, ConfigAlarmTriggersReq.class);
        LOG.debug("Get old and new triggers:[]", configAlarmTriggersReqs.toString());
        Result result = alarmConfigService.updateTrigger(configAlarmTriggersReqs);
        return result;
    }


}
