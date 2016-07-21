package com.htsc.alarm.dao;

import com.htsc.alarm.domain.HostDoamin;
import com.htsc.alarm.domain.HostDoaminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostDoaminMapper {
    int countByExample(HostDoaminExample example);

    int deleteByExample(HostDoaminExample example);

    int deleteByPrimaryKey(Integer hostId);

    int insert(HostDoamin record);

    int insertSelective(HostDoamin record);

    List<HostDoamin> selectByExample(HostDoaminExample example);

    HostDoamin selectByPrimaryKey(Integer hostId);

    int updateByExampleSelective(@Param("record") HostDoamin record, @Param("example") HostDoaminExample example);

    int updateByExample(@Param("record") HostDoamin record, @Param("example") HostDoaminExample example);

    int updateByPrimaryKeySelective(HostDoamin record);

    int updateByPrimaryKey(HostDoamin record);
}