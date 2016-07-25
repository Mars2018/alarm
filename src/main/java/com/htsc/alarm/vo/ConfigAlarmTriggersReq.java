package com.htsc.alarm.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * Created by mars_wang on 2016/7/25.
 */
public class ConfigAlarmTriggersReq {

    private Integer itemId;

    private String name;

    private Integer lastvalue;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastvalueTime;

    private String statisticalMethod;

    private String judgmentCondition;

    private List<Integer> parameters;


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLastvalue() {
        return lastvalue;
    }

    public void setLastvalue(Integer lastvalue) {
        this.lastvalue = lastvalue;
    }

    public Date getLastvalueTime() {
        return lastvalueTime;
    }

    public void setLastvalueTime(Date lastvalueTime) {
        this.lastvalueTime = lastvalueTime;
    }

    public String getStatisticalMethod() {
        return statisticalMethod;
    }

    public void setStatisticalMethod(String statisticalMethod) {
        this.statisticalMethod = statisticalMethod;
    }

    public String getJudgmentCondition() {
        return judgmentCondition;
    }

    public void setJudgmentCondition(String judgmentCondition) {
        this.judgmentCondition = judgmentCondition;
    }

    public List<Integer> getParameters() {
        return parameters;
    }

    public void setParameters(List<Integer> parameters) {
        this.parameters = parameters;
    }
}
