package com.htsc.alarm.controller;

import com.htsc.alarm.domain.AlarmInfo;
import com.htsc.alarm.service.ServerAlarmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by mars_wang on 2016/8/2.
 */
@Controller
@RequestMapping("/alarm")
public class alarmController {
    private static final Logger LOG = LoggerFactory.getLogger(alarmController.class);

    @Autowired
    private ServerAlarmService serverAlarmService;

    @RequestMapping(value = "/server", method = RequestMethod.POST)
    public String severAlarm(HttpServletRequest request, Model model){
        String alarmInfo = request.getParameter("alarmInfo");
        List<AlarmInfo> alarm = serverAlarmService.severAlarmJudge(alarmInfo, request);
        model.addAttribute("alarms",alarm);
        return "alarm";
    }


}
