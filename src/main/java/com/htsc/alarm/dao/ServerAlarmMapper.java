package com.htsc.alarm.dao;

import com.htsc.alarm.domain.HostDomain;
import com.htsc.alarm.domain.ItemDomain;
import com.htsc.alarm.domain.ServiceDomain;
import com.htsc.alarm.domain.TriggerDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by mars_wang on 2016/8/2.
 */
public interface ServerAlarmMapper {

    public HostDomain queryHost(String ip);

    public ItemDomain queryItem(@Param("hostId") Integer hostId, @Param("monitorType") String monitorType, @Param("monitorTarget") String monitorTarget);

    public List<TriggerDomain> queryTrigger(Integer itemId);

    public ServiceDomain queryService(@Param("hostId") int hostId, @Param("itemId") int itemId);
}
