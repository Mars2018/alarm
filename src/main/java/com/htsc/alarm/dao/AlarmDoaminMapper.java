package com.htsc.alarm.dao;

import com.htsc.alarm.domain.AlarmDoamin;
import com.htsc.alarm.domain.AlarmDoaminExample;
import java.util.List;

public interface AlarmDoaminMapper {
    int countByExample(AlarmDoaminExample example);

    int deleteByPrimaryKey(Integer alarmId);

    int insert(AlarmDoamin record);

    int insertSelective(AlarmDoamin record);

    List<AlarmDoamin> selectByExample(AlarmDoaminExample example);

    AlarmDoamin selectByPrimaryKey(Integer alarmId);

    int updateByPrimaryKeySelective(AlarmDoamin record);

    int updateByPrimaryKey(AlarmDoamin record);
}