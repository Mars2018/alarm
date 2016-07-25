package com.htsc.alarm.dao;

import com.htsc.alarm.domain.HostDoaminExample;
import com.htsc.alarm.domain.HostDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HostDoaminMapper {
    int countByExample(HostDoaminExample example);

    int deleteByExample(HostDoaminExample example);

    int deleteByPrimaryKey(Integer hostId);

    int insert(HostDomain record);

    int insertSelective(HostDomain record);

    List<HostDomain> selectByExample(HostDoaminExample example);

    HostDomain selectByPrimaryKey(Integer hostId);

    int updateByExampleSelective(@Param("record") HostDomain record, @Param("example") HostDoaminExample example);

    int updateByExample(@Param("record") HostDomain record, @Param("example") HostDoaminExample example);

    int updateByPrimaryKeySelective(HostDomain record);

    int updateByPrimaryKey(HostDomain record);

    int getPrimaryKeyByHost(HostDomain record);

    int deleteHostByIP(HostDomain record);
}