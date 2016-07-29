package com.htsc.alarm.service.impl;

import com.htsc.alarm.dao.AlarmInfoMapper;
import com.htsc.alarm.domain.AlarmInfo;
import com.htsc.alarm.service.DisplayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mars_wang on 2016/7/28.
 */
@Service
public class DispalyServiceImpl implements DisplayService {
    private static final Logger LOG = LoggerFactory.getLogger(DispalyServiceImpl.class);

    @Autowired
    AlarmInfoMapper alarmInfoMapper;

    @Override
    public List<AlarmInfo> QueryMonitorInfos(Integer pageNo, Integer pageRecord) {
        List<AlarmInfo> alarmInfos = alarmInfoMapper.selectByPage(pageNo, pageRecord);
        return  alarmInfos;
    }

    @Override
    public Integer countAlarmInfos() {
        return alarmInfoMapper.countAlarmInfos();
    }
}
