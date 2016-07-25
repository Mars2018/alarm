package com.htsc.alarm.service.impl;

import com.alibaba.fastjson.JSON;
import com.htsc.alarm.cfg.MonitorSvcConfig;
import com.htsc.alarm.common.bean.Result;
import com.htsc.alarm.dao.HostDoaminMapper;
import com.htsc.alarm.dao.ItemDomainMapper;
import com.htsc.alarm.dao.ServiceDomainMapper;
import com.htsc.alarm.dao.TriggerDomainMapper;
import com.htsc.alarm.domain.*;
import com.htsc.alarm.service.AlarmConfigService;
import com.htsc.alarm.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mars_wang on 2016/7/13.
 */
@Service(value = "alarmConfigService")
public class AlarmConfigServiceImpl implements AlarmConfigService {

    private static final Logger LOG = LoggerFactory.getLogger(AlarmConfigServiceImpl.class);

    @Autowired
    private ItemDomainMapper itemDomainMapper;

    @Autowired
    private HostDoaminMapper hostDomainMapper;

    @Autowired
    private ServiceDomainMapper serviceDomainMapper;

    @Autowired
    private TriggerDomainMapper triggerDomainMapper;



    @Override
    public String insertHosts(List<ConfigAlarmHostsReq> configAlarmHostsReqs) {
        List<HostDomain> hosts = this.initHostDomain(configAlarmHostsReqs);
        LOG.debug("初始化 hostDomain 结束");
        Integer records = 0;
        Result<String> result = new Result<>();
        for(int i = 0; i < hosts.size(); ++i) {
            records += hostDomainMapper.insertSelective(hosts.get(i));
        }
        LOG.debug("插入hosts结果：[]", records);
        result.setMark("1");
        result.setMessage("Insert " + records + " hosts successfully!");
        result.setTotalCount(records);
        return JSON.toJSONString(result);
    }


    @Override
    public String deleteHost(List<ConfigAlarmHostsReq> configAlarmHostsReqs) {
        List<HostDomain> hosts = this.initHostDomain(configAlarmHostsReqs);
        LOG.debug("初始化 hostDomain 结束");
        Integer records = hostDomainMapper.deleteHostByIP(hosts.get(0));
        Result<Integer> result = new Result<>();
        result.setData(records);
        result.setMark("1");
        result.setMessage("delete host successfully!");
        result.setTotalCount(records);
        return JSON.toJSONString(result);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public String updateHost(List<ConfigAlarmHostsReq> configAlarmHostsReqs) {
        List<HostDomain> hosts = this.initHostDomain(configAlarmHostsReqs);
        Result<Integer> result = new Result<>();
        if(hosts.size() != 2){
            result.setMark("-1");
            result.setMessage("参数错误！");
            return JSON.toJSONString(result);
        }
        LOG.debug("初始化 hosts 结束");
        Integer hostId = hostDomainMapper.getPrimaryKeyByHost(hosts.get(0));
        hosts.get(1).setHostId(hostId);
        Integer records = 0;
        records = hostDomainMapper.updateByPrimaryKey(hosts.get(1));
        LOG.debug("更新host结果：[]", records);
        result.setData(records);
        result.setMark("1");
        result.setMessage("update hosts successfully!");
        return JSON.toJSONString(result);
    }

    @Override
    public String insertItems(List<ConfigAlarmItemsReq> itemsReq){
        List<ItemDomain> items = this.initItemDomain(itemsReq);
        LOG.debug("初始化 itemDomain 结束");
        Integer records = 0;
        Result<String> result = new Result<>();
        for(int i = 0; i < items.size(); ++i ){
            records += itemDomainMapper.insertSelective(items.get(i));
        }
        LOG.debug("插入items结果：[]", records);
        result.setMark("1");
        result.setMessage("Insert " + records + "items successfully!");
        result.setTotalCount(records);
        return JSON.toJSONString(result);
    }

    @Override
    public String deleteItem(List<ConfigAlarmItemsReq> itemsReqs) {
        List<ItemDomain> items = this.initItemDomain(itemsReqs);
        LOG.debug("初始化 items 结束！");
        Integer records = itemDomainMapper.deleteByItem(items.get(0));
        Result<Integer> result = new Result<>();
        result.setData(records);
        result.setMark("1");
        result.setMessage("delete item successfully!");
        result.setTotalCount(records);
        return JSON.toJSONString(result);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public String updateItem(List<ConfigAlarmItemsReq> itemsReqs) {
        List<ItemDomain> items = this.initItemDomain(itemsReqs);
        Result<Integer> result = new Result<>();
        if(items.size() != 2){
            result.setMark("-1");
            result.setMessage("参数错误！");
            return JSON.toJSONString(result);
        }
        Integer itemId = itemDomainMapper.getPrimaryKeyByItem(items.get(0));
        items.get(1).setItemId(itemId);
        Integer record  = itemDomainMapper.updateByPrimaryKey(items.get(1));
        result.setData(record);
        result.setMark("1");
        result.setMessage("update items successfully!");
        return JSON.toJSONString(result);
    }

    @Override
    public String insertServices(ConfigAlarmServicesReq servicesReqs) {
        ServiceDomain service = this.initServiceDomain(servicesReqs);
        Integer records = serviceDomainMapper.insertSelective(service);
        Result<Integer> result = new Result<>();
        result.setData(records);
        result.setMark("1");
        result.setMessage("Insert services Successfully!");
        return JSON.toJSONString(result);
    }

    @Override
    public String deleteService(ConfigAlarmServicesReq servicesReq) {
        ServiceDomain service = this.initServiceDomain(servicesReq);
        Integer record = serviceDomainMapper.deleteByService(service);
        Result<Integer> result = new Result<>();
        result.setData(record);
        result.setMark("1");
        result.setMessage("Delete services Successfully!");
        return JSON.toJSONString(result);
    }

    @Override
    public String updateService(List<ConfigAlarmServicesReq> servicesReqs) {
        List<ServiceDomain> services = new ArrayList<>();
        for(int i = 0; i < servicesReqs.size(); ++i){
            services.add(this.initServiceDomain(servicesReqs.get(i)));
        }
        Integer serviceId = serviceDomainMapper.getPrimeryKey(services.get(0));
        services.get(1).setServiceId(serviceId);
        Integer record = serviceDomainMapper.updateByPrimaryKeySelective(services.get(1));
        Result<Integer> result = new Result<>();
        result.setData(record);
        result.setMark("1");
        result.setMessage("Update service successfully!");
        return JSON.toJSONString(result);
    }


    @Override
    public String insertTriggers(List<ConfigAlarmTriggersReq> configAlarmTriggersReqs) {
        List<TriggerDomain> triggers = initTriggers(configAlarmTriggersReqs);
        Integer records = 0;
        for(int i = 0; i < triggers.size(); ++i){
            records += triggerDomainMapper.insertSelective(triggers.get(i));
        }
        Result<Integer> result = new Result<>();
        result.setData(records);
        result.setMark("1");
        result.setMessage("Insert service successfully!");
        return JSON.toJSONString(result);
    }

    @Override
    public String deleteTrigger(ConfigAlarmTriggersReq configAlarmTriggersReq) {
        TriggerDomain trigger = initTrigger(configAlarmTriggersReq);
        Integer triggerId = triggerDomainMapper.getPrimaryKey(trigger);
        LOG.debug("get trigger id: []", triggerId);
        Integer record = triggerDomainMapper.deleteByPrimaryKey(triggerId);
        Result<Integer> result = new Result<>();
        result.setData(record);
        result.setMark("1");
        result.setMessage("delete service successfully!");
        return JSON.toJSONString(result);
    }


    @Override
    public String updateTrigger(List<ConfigAlarmTriggersReq> configAlarmTriggersReqs) {
        List<TriggerDomain> triggers = initTriggers(configAlarmTriggersReqs);
        Integer triggerId = triggerDomainMapper.getPrimaryKey(triggers.get(0));
        LOG.debug("get trigger id: []", triggerId);
        triggers.get(1).setTriggerId(triggerId);
        Integer record = triggerDomainMapper.updateByPrimaryKeySelective(triggers.get(1));
        Result<Integer> result = new Result<>();
        result.setData(record);
        result.setMark("1");
        result.setMessage("Update service successfully!");
        return JSON.toJSONString(result);
    }




    private List<TriggerDomain> initTriggers(List<ConfigAlarmTriggersReq> configAlarmTriggersReqs) {
        List<TriggerDomain> triggers = new ArrayList<>();
        for(int i = 0; i < configAlarmTriggersReqs.size(); ++i){
            triggers.add(initTrigger(configAlarmTriggersReqs.get(i)));
        }
        return triggers;
    }

    private TriggerDomain initTrigger(ConfigAlarmTriggersReq configAlarmTriggersReq){
        TriggerDomain trigger = new TriggerDomain();
        trigger.setItemId(configAlarmTriggersReq.getItemId());
        trigger.setName(configAlarmTriggersReq.getName());
        trigger.setLastvalue(configAlarmTriggersReq.getLastvalue());
        trigger.setLastvalueTime((configAlarmTriggersReq.getLastvalueTime()));
        trigger.setStatisticalMethod(configAlarmTriggersReq.getStatisticalMethod());
        trigger.setJudgmentCondition(configAlarmTriggersReq.getJudgmentCondition());
        trigger.setParameters(JSON.toJSONString(configAlarmTriggersReq.getParameters()));
        return trigger;
    }

    private ServiceDomain initServiceDomain(ConfigAlarmServicesReq servicesReq) {
        ServiceDomain sd = new ServiceDomain();
        sd.setHostId(servicesReq.getHostId());
        sd.setStatus(servicesReq.getStatus());
        sd.setTriggerId(servicesReq.getTriggerId());
        sd.setServiceStart(servicesReq.getServiceStart());
        sd.setServiceEnd((servicesReq.getServiceEnd()));
        sd.setServiceActive(servicesReq.getServiceActive());
        sd.setDependencies(JSON.toJSONString(servicesReq.getDependencies()));
        return sd;
    }


    private List<HostDomain> initHostDomain(List<ConfigAlarmHostsReq> configAlarmHostsReq) {
        List<HostDomain> hosts = new ArrayList<>();
        for(int i = 0; i < configAlarmHostsReq.size(); ++i){
            HostDomain hostDomain = new HostDomain();
            hostDomain.setHostName(configAlarmHostsReq.get(i).getName());
            hostDomain.setHostIp(configAlarmHostsReq.get(i).getIp());
            hostDomain.setHostProxyId(configAlarmHostsReq.get(i).getProxy_id());
            hostDomain.setHostPort(configAlarmHostsReq.get(i).getPort());
            hostDomain.setEnable(configAlarmHostsReq.get(i).getEnable());
            hosts.add(hostDomain);
        }
        return hosts;
    }

    private List<ItemDomain> initItemDomain(List<ConfigAlarmItemsReq> itemsReqs) {
        List<ItemDomain> items = new ArrayList<>();
        for(int i = 0; i < itemsReqs.size(); ++i) {
            ItemDomain itemDomain = new ItemDomain();
            itemDomain.setItemName(itemsReqs.get(i).getName());
            itemDomain.setMonitorType(MonitorSvcConfig.MonitorTypes[itemsReqs.get(i).getMonitorTypeNo()-1]);
            itemDomain.setMonitorTarget(MonitorSvcConfig.MonitorTargets[itemsReqs.get(i).getMonitorTypeNo()-1][itemsReqs.get(i).getMonitorTypeNo()-1]);
            itemDomain.setHostId(itemsReqs.get(i).getHostId());
            itemDomain.setUpdateInterval(itemsReqs.get(i).getUpdateInterval());
            itemDomain.setHistoryKeep(itemsReqs.get(i).getHistoryKeep());
            items.add(itemDomain);
        }
        return items;
    }


    private List<AlarmConfig> getAlarmConfigRecords(List<ConfigAlarmReq> configAlarmReqList, HttpRequest request) {
        List<AlarmConfig> alarmConfigRecords = new ArrayList<>();
        ConfigAlarmReq configAlarmReq;
        for (int i = 0; i < configAlarmReqList.size(); ++i){
            configAlarmReq = configAlarmReqList.get(i);
            alarmConfigRecords.add(getAlarmConfigRecord(configAlarmReq));
        }

        return alarmConfigRecords;
    }

    private AlarmConfig getAlarmConfigRecord(ConfigAlarmReq configAlarmReq) {
        AlarmConfig alarmConfig = new AlarmConfig();

        return alarmConfig;
    }
}
