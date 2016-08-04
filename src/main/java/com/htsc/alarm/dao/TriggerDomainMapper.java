package com.htsc.alarm.dao;

import com.htsc.alarm.domain.TriggerDomain;
import com.htsc.alarm.domain.TriggerDomainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TriggerDomainMapper {
    int countByExample(TriggerDomainExample example);

    int deleteByExample(TriggerDomainExample example);

    int deleteByPrimaryKey(Integer triggerId);

    int insert(TriggerDomain record);

    int insertSelective(TriggerDomain record);

    List<TriggerDomain> selectByExample(TriggerDomainExample example);

    TriggerDomain selectByPrimaryKey(Integer triggerId);

    int updateByExampleSelective(@Param("record") TriggerDomain record, @Param("example") TriggerDomainExample example);

    int updateByExample(@Param("record") TriggerDomain record, @Param("example") TriggerDomainExample example);

    int updateByPrimaryKeySelective(TriggerDomain record);

    int updateByPrimaryKey(TriggerDomain record);

    int getPrimaryKey(TriggerDomain trigger);

    List<TriggerDomain> selectAllRecords();
}