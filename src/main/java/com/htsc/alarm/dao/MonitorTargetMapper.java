package com.htsc.alarm.dao;

import com.htsc.alarm.domain.MonitorTarget;
import com.htsc.alarm.domain.MonitorTargetExample;
import java.util.List;

public interface MonitorTargetMapper {
    int countByExample(MonitorTargetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MonitorTarget record);

    int insertSelective(MonitorTarget record);

    List<MonitorTarget> selectByExample(MonitorTargetExample example);

    MonitorTarget selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MonitorTarget record);

    int updateByPrimaryKey(MonitorTarget record);

    List<MonitorTarget> selectAllRecords();

}