package com.htsc.alarm.domain;

import java.util.Date;

public class TriggerDomain {
    private Integer triggerId;

    private Integer itemId;

    private String name;

    private Integer lastvalue;

    private Date lastvalueTime;

    private String statisticalMethod;

    private String judgmentCondition;

    private String parameters;

    public Integer getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

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
        this.name = name == null ? null : name.trim();
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
        this.statisticalMethod = statisticalMethod == null ? null : statisticalMethod.trim();
    }

    public String getJudgmentCondition() {
        return judgmentCondition;
    }

    public void setJudgmentCondition(String judgmentCondition) {
        this.judgmentCondition = judgmentCondition == null ? null : judgmentCondition.trim();
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters == null ? null : parameters.trim();
    }
}