package com.htsc.alarm.controller;

import com.htsc.alarm.domain.AlarmInfo;
import com.htsc.alarm.service.ServerAlarmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by mars_wang on 2016/8/2.
 */
@Controller
@RequestMapping("/alarmInfo")
public class alarmController {
    private static final Logger LOG = LoggerFactory.getLogger(alarmController.class);

    @Autowired
    private ServerAlarmService serverAlarmService;

    @RequestMapping(value = "/server")
    @ResponseBody
    public String severAlarm(HttpServletRequest request){
        String alarmInfo = request.getParameter("alarmInfo");
        List<AlarmInfo> alarm = serverAlarmService.severAlarmJudge(alarmInfo, request);
        return "ACCEPTED";
    }

    @RequestMapping(value = "/solve/{id}")
    @ResponseBody
    public String solveAlarm(@PathVariable("id") Integer alarmInfoId, HttpServletRequest request){
        String desc = request.getParameter("desc");
        Integer result = serverAlarmService.solveAlarm(alarmInfoId, desc);
        if(result > 0)
            return "success";
        else
            return "error";
    }


}
