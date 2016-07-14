package com.htsc.alarm.dao;

import com.htsc.alarm.domain.AlarmConfig;
import com.htsc.alarm.domain.AlarmConfigExample;
import java.util.List;

public interface AlarmConfigMapper {
    int countByExample(AlarmConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlarmConfig record);

    int insertSelective(AlarmConfig record);

    List<AlarmConfig> selectByExample(AlarmConfigExample example);

    AlarmConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlarmConfig record);

    int updateByPrimaryKey(AlarmConfig record);
}