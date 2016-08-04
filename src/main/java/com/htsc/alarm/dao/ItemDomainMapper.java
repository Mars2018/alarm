package com.htsc.alarm.dao;

import com.htsc.alarm.domain.ItemDomain;
import com.htsc.alarm.domain.ItemDomainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDomainMapper {
    int countByExample(ItemDomainExample example);

    int deleteByExample(ItemDomainExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ItemDomain record);

    int insertSelective(ItemDomain record);

    List<ItemDomain> selectByExample(ItemDomainExample example);

    ItemDomain selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(ItemDomain record);

    int updateByPrimaryKey(ItemDomain record);

    int deleteByItem(ItemDomain itemDomain);

    int getPrimaryKeyByItem(ItemDomain record);

    ItemDomain queryItemByHost(@Param("id") Integer hostId, @Param("target") String monitorTarget);

    List<ItemDomain> selectAllRecords();
}