package com.htsc.alarm.domain;

import java.util.ArrayList;
import java.util.List;

public class HostDoaminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HostDoaminExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHostIdIsNull() {
            addCriterion("host_id is null");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("host_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostIdEqualTo(Integer value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(Integer value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(Integer value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(Integer value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(Integer value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<Integer> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<Integer> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(Integer value1, Integer value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNull() {
            addCriterion("host_name is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("host_name is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("host_name =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("host_name <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("host_name >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("host_name >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("host_name <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("host_name <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("host_name like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("host_name not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("host_name in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("host_name not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("host_name between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("host_name not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("host_ip is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("host_ip is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("host_ip =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("host_ip <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("host_ip >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("host_ip >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("host_ip <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("host_ip <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("host_ip like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("host_ip not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("host_ip in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("host_ip not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("host_ip between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("host_ip not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdIsNull() {
            addCriterion("host_proxy_id is null");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdIsNotNull() {
            addCriterion("host_proxy_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdEqualTo(Integer value) {
            addCriterion("host_proxy_id =", value, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdNotEqualTo(Integer value) {
            addCriterion("host_proxy_id <>", value, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdGreaterThan(Integer value) {
            addCriterion("host_proxy_id >", value, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_proxy_id >=", value, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdLessThan(Integer value) {
            addCriterion("host_proxy_id <", value, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdLessThanOrEqualTo(Integer value) {
            addCriterion("host_proxy_id <=", value, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdIn(List<Integer> values) {
            addCriterion("host_proxy_id in", values, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdNotIn(List<Integer> values) {
            addCriterion("host_proxy_id not in", values, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdBetween(Integer value1, Integer value2) {
            addCriterion("host_proxy_id between", value1, value2, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostProxyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("host_proxy_id not between", value1, value2, "hostProxyId");
            return (Criteria) this;
        }

        public Criteria andHostPortIsNull() {
            addCriterion("host_port is null");
            return (Criteria) this;
        }

        public Criteria andHostPortIsNotNull() {
            addCriterion("host_port is not null");
            return (Criteria) this;
        }

        public Criteria andHostPortEqualTo(String value) {
            addCriterion("host_port =", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortNotEqualTo(String value) {
            addCriterion("host_port <>", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortGreaterThan(String value) {
            addCriterion("host_port >", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortGreaterThanOrEqualTo(String value) {
            addCriterion("host_port >=", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortLessThan(String value) {
            addCriterion("host_port <", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortLessThanOrEqualTo(String value) {
            addCriterion("host_port <=", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortLike(String value) {
            addCriterion("host_port like", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortNotLike(String value) {
            addCriterion("host_port not like", value, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortIn(List<String> values) {
            addCriterion("host_port in", values, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortNotIn(List<String> values) {
            addCriterion("host_port not in", values, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortBetween(String value1, String value2) {
            addCriterion("host_port between", value1, value2, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostPortNotBetween(String value1, String value2) {
            addCriterion("host_port not between", value1, value2, "hostPort");
            return (Criteria) this;
        }

        public Criteria andHostStatusIsNull() {
            addCriterion("host_status is null");
            return (Criteria) this;
        }

        public Criteria andHostStatusIsNotNull() {
            addCriterion("host_status is not null");
            return (Criteria) this;
        }

        public Criteria andHostStatusEqualTo(Integer value) {
            addCriterion("host_status =", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotEqualTo(Integer value) {
            addCriterion("host_status <>", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusGreaterThan(Integer value) {
            addCriterion("host_status >", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_status >=", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLessThan(Integer value) {
            addCriterion("host_status <", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLessThanOrEqualTo(Integer value) {
            addCriterion("host_status <=", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusIn(List<Integer> values) {
            addCriterion("host_status in", values, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotIn(List<Integer> values) {
            addCriterion("host_status not in", values, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusBetween(Integer value1, Integer value2) {
            addCriterion("host_status between", value1, value2, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("host_status not between", value1, value2, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Integer value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Integer value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Integer value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Integer value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Integer value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Integer> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Integer> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Integer value1, Integer value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}