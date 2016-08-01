package com.htsc.alarm.dao;

import com.htsc.alarm.domain.MonitorType;
import com.htsc.alarm.domain.MonitorTypeExample;
import java.util.List;

public interface MonitorTypeMapper {
    int countByExample(MonitorTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MonitorType record);

    int insertSelective(MonitorType record);

    List<MonitorType> selectByExample(MonitorTypeExample example);

    MonitorType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MonitorType record);

    int updateByPrimaryKey(MonitorType record);

    List<MonitorType> selectAllRecords();
}