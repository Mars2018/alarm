package com.htsc.alarm.service;

import com.htsc.alarm.domain.AlarmInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */
public interface ServerAlarmService {

    List<AlarmInfo> severAlarmJudge(String alarmInfo, HttpServletRequest request);

    Integer solveAlarm(Integer alarmInfoId, String desc);
}
