package com.htsc.alarm.dao;

import com.htsc.alarm.domain.AlarmConfig;
import com.htsc.alarm.domain.AlarmConfigExample;
import com.htsc.alarm.domain.AlarmConfigWithBLOBs;
import java.util.List;

public interface AlarmConfigMapper {
    int countByExample(AlarmConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlarmConfigWithBLOBs record);

    int insertSelective(AlarmConfigWithBLOBs record);

    List<AlarmConfigWithBLOBs> selectByExampleWithBLOBs(AlarmConfigExample example);

    List<AlarmConfig> selectByExample(AlarmConfigExample example);

    AlarmConfigWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlarmConfigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AlarmConfigWithBLOBs record);

    int updateByPrimaryKey(AlarmConfig record);
}