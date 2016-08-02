package com.htsc.alarm.controller;

import com.htsc.alarm.domain.HostDomain;
import com.htsc.alarm.domain.MonitorTarget;
import com.htsc.alarm.domain.MonitorType;
import com.htsc.alarm.service.MonitorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by mars_wang on 2016/8/1.
 */
@Controller
@RequestMapping("/monitor")
public class MonitorConfigSvcController {
    private static final Logger LOG  = LoggerFactory.getLogger(MonitorConfigSvcController.class);

    @Autowired
    MonitorService monitorService;

    @RequestMapping(value = "/query/monitorType", method = RequestMethod.GET)
    @ResponseBody
    public List<MonitorType> selectAllMonitorType(){
        return monitorService.selectAllMonitorType();
    }

    @RequestMapping(value = "/query/monitorTarget", method = RequestMethod.GET)
    @ResponseBody
    public List<MonitorTarget> selectAllMonitorTarget(){
        return monitorService.selectAllMonitorTarget();
    }

    @RequestMapping(value = "query/monitorHost", method = RequestMethod.GET)
    @ResponseBody
    public List<HostDomain> selectAllHosts(){
        return monitorService.selectAllMonitorHost();
    }

}
