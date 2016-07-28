package com.htsc.alarm.controller;

import com.htsc.alarm.common.util.Page;
import com.htsc.alarm.domain.AlarmInfo;
import com.htsc.alarm.service.DisplayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by mars_wang on 2016/7/28.
 */

@Controller
@RequestMapping(value = "/display")
public class DisplaySvcController {

    private static final Logger LOG = LoggerFactory.getLogger(DisplaySvcController.class);

    @Autowired
    DisplayService displayService;

    @RequestMapping(value = "/status/{pageNo}", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    @ResponseBody
    public List<AlarmInfo> queryAlarmInfosByPage(@PathVariable("pageNo") Integer pageNo){
        Page page = new Page();
        page.setPageNo(pageNo);
        return displayService.QueryMonitorInfos(page);
    }

}
