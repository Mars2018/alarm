package com.htsc.alarm.dao;

import com.htsc.alarm.domain.AlarmInfo;
import com.htsc.alarm.domain.AlarmInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlarmInfoMapper {
    int countByExample(AlarmInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlarmInfo record);

    int insertSelective(AlarmInfo record);

    List<AlarmInfo> selectByExample(AlarmInfoExample example);

    AlarmInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlarmInfo record);

    int updateByPrimaryKey(AlarmInfo record);

    List<AlarmInfo> selectByPage(@Param("pageNo") Integer pageNo, @Param("pageRecord") Integer pageRecord);

    Integer countAlarmInfos();
}