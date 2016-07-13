package com.htsc.alarm.domain;

import java.util.ArrayList;
import java.util.List;

public class AlarmConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmConfigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAlamrNameIsNull() {
            addCriterion("alamr_name is null");
            return (Criteria) this;
        }

        public Criteria andAlamrNameIsNotNull() {
            addCriterion("alamr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlamrNameEqualTo(String value) {
            addCriterion("alamr_name =", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameNotEqualTo(String value) {
            addCriterion("alamr_name <>", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameGreaterThan(String value) {
            addCriterion("alamr_name >", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameGreaterThanOrEqualTo(String value) {
            addCriterion("alamr_name >=", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameLessThan(String value) {
            addCriterion("alamr_name <", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameLessThanOrEqualTo(String value) {
            addCriterion("alamr_name <=", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameLike(String value) {
            addCriterion("alamr_name like", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameNotLike(String value) {
            addCriterion("alamr_name not like", value, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameIn(List<String> values) {
            addCriterion("alamr_name in", values, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameNotIn(List<String> values) {
            addCriterion("alamr_name not in", values, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameBetween(String value1, String value2) {
            addCriterion("alamr_name between", value1, value2, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlamrNameNotBetween(String value1, String value2) {
            addCriterion("alamr_name not between", value1, value2, "alamrName");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(String value) {
            addCriterion("alarm_type =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(String value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(String value) {
            addCriterion("alarm_type >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(String value) {
            addCriterion("alarm_type <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(String value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLike(String value) {
            addCriterion("alarm_type like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotLike(String value) {
            addCriterion("alarm_type not like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<String> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<String> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(String value1, String value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(String value1, String value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNull() {
            addCriterion("alarm_level is null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNotNull() {
            addCriterion("alarm_level is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelEqualTo(String value) {
            addCriterion("alarm_level =", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotEqualTo(String value) {
            addCriterion("alarm_level <>", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThan(String value) {
            addCriterion("alarm_level >", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_level >=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThan(String value) {
            addCriterion("alarm_level <", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThanOrEqualTo(String value) {
            addCriterion("alarm_level <=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLike(String value) {
            addCriterion("alarm_level like", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotLike(String value) {
            addCriterion("alarm_level not like", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIn(List<String> values) {
            addCriterion("alarm_level in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotIn(List<String> values) {
            addCriterion("alarm_level not in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelBetween(String value1, String value2) {
            addCriterion("alarm_level between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotBetween(String value1, String value2) {
            addCriterion("alarm_level not between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeIsNull() {
            addCriterion("value_aggregate_type is null");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeIsNotNull() {
            addCriterion("value_aggregate_type is not null");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeEqualTo(String value) {
            addCriterion("value_aggregate_type =", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeNotEqualTo(String value) {
            addCriterion("value_aggregate_type <>", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeGreaterThan(String value) {
            addCriterion("value_aggregate_type >", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("value_aggregate_type >=", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeLessThan(String value) {
            addCriterion("value_aggregate_type <", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeLessThanOrEqualTo(String value) {
            addCriterion("value_aggregate_type <=", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeLike(String value) {
            addCriterion("value_aggregate_type like", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeNotLike(String value) {
            addCriterion("value_aggregate_type not like", value, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeIn(List<String> values) {
            addCriterion("value_aggregate_type in", values, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeNotIn(List<String> values) {
            addCriterion("value_aggregate_type not in", values, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeBetween(String value1, String value2) {
            addCriterion("value_aggregate_type between", value1, value2, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andValueAggregateTypeNotBetween(String value1, String value2) {
            addCriterion("value_aggregate_type not between", value1, value2, "valueAggregateType");
            return (Criteria) this;
        }

        public Criteria andStifleTimeIsNull() {
            addCriterion("stifle_time is null");
            return (Criteria) this;
        }

        public Criteria andStifleTimeIsNotNull() {
            addCriterion("stifle_time is not null");
            return (Criteria) this;
        }

        public Criteria andStifleTimeEqualTo(Integer value) {
            addCriterion("stifle_time =", value, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeNotEqualTo(Integer value) {
            addCriterion("stifle_time <>", value, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeGreaterThan(Integer value) {
            addCriterion("stifle_time >", value, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stifle_time >=", value, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeLessThan(Integer value) {
            addCriterion("stifle_time <", value, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("stifle_time <=", value, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeIn(List<Integer> values) {
            addCriterion("stifle_time in", values, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeNotIn(List<Integer> values) {
            addCriterion("stifle_time not in", values, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeBetween(Integer value1, Integer value2) {
            addCriterion("stifle_time between", value1, value2, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andStifleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stifle_time not between", value1, value2, "stifleTime");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andAlarmDescIsNull() {
            addCriterion("alarm_desc is null");
            return (Criteria) this;
        }

        public Criteria andAlarmDescIsNotNull() {
            addCriterion("alarm_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmDescEqualTo(String value) {
            addCriterion("alarm_desc =", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescNotEqualTo(String value) {
            addCriterion("alarm_desc <>", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescGreaterThan(String value) {
            addCriterion("alarm_desc >", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_desc >=", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescLessThan(String value) {
            addCriterion("alarm_desc <", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescLessThanOrEqualTo(String value) {
            addCriterion("alarm_desc <=", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescLike(String value) {
            addCriterion("alarm_desc like", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescNotLike(String value) {
            addCriterion("alarm_desc not like", value, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescIn(List<String> values) {
            addCriterion("alarm_desc in", values, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescNotIn(List<String> values) {
            addCriterion("alarm_desc not in", values, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescBetween(String value1, String value2) {
            addCriterion("alarm_desc between", value1, value2, "alarmDesc");
            return (Criteria) this;
        }

        public Criteria andAlarmDescNotBetween(String value1, String value2) {
            addCriterion("alarm_desc not between", value1, value2, "alarmDesc");
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