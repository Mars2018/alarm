package com.htsc.alarm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlarmInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmInfoExample() {
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

        public Criteria andIpSourceIsNull() {
            addCriterion("ip_source is null");
            return (Criteria) this;
        }

        public Criteria andIpSourceIsNotNull() {
            addCriterion("ip_source is not null");
            return (Criteria) this;
        }

        public Criteria andIpSourceEqualTo(String value) {
            addCriterion("ip_source =", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceNotEqualTo(String value) {
            addCriterion("ip_source <>", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceGreaterThan(String value) {
            addCriterion("ip_source >", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ip_source >=", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceLessThan(String value) {
            addCriterion("ip_source <", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceLessThanOrEqualTo(String value) {
            addCriterion("ip_source <=", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceLike(String value) {
            addCriterion("ip_source like", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceNotLike(String value) {
            addCriterion("ip_source not like", value, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceIn(List<String> values) {
            addCriterion("ip_source in", values, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceNotIn(List<String> values) {
            addCriterion("ip_source not in", values, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceBetween(String value1, String value2) {
            addCriterion("ip_source between", value1, value2, "ipSource");
            return (Criteria) this;
        }

        public Criteria andIpSourceNotBetween(String value1, String value2) {
            addCriterion("ip_source not between", value1, value2, "ipSource");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNull() {
            addCriterion("alarm_name is null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNotNull() {
            addCriterion("alarm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameEqualTo(String value) {
            addCriterion("alarm_name =", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotEqualTo(String value) {
            addCriterion("alarm_name <>", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThan(String value) {
            addCriterion("alarm_name >", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_name >=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThan(String value) {
            addCriterion("alarm_name <", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThanOrEqualTo(String value) {
            addCriterion("alarm_name <=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLike(String value) {
            addCriterion("alarm_name like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotLike(String value) {
            addCriterion("alarm_name not like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIn(List<String> values) {
            addCriterion("alarm_name in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotIn(List<String> values) {
            addCriterion("alarm_name not in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameBetween(String value1, String value2) {
            addCriterion("alarm_name between", value1, value2, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotBetween(String value1, String value2) {
            addCriterion("alarm_name not between", value1, value2, "alarmName");
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

        public Criteria andAlarmValueIsNull() {
            addCriterion("alarm_value is null");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIsNotNull() {
            addCriterion("alarm_value is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmValueEqualTo(String value) {
            addCriterion("alarm_value =", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotEqualTo(String value) {
            addCriterion("alarm_value <>", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueGreaterThan(String value) {
            addCriterion("alarm_value >", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_value >=", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueLessThan(String value) {
            addCriterion("alarm_value <", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueLessThanOrEqualTo(String value) {
            addCriterion("alarm_value <=", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueLike(String value) {
            addCriterion("alarm_value like", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotLike(String value) {
            addCriterion("alarm_value not like", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIn(List<String> values) {
            addCriterion("alarm_value in", values, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotIn(List<String> values) {
            addCriterion("alarm_value not in", values, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueBetween(String value1, String value2) {
            addCriterion("alarm_value between", value1, value2, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotBetween(String value1, String value2) {
            addCriterion("alarm_value not between", value1, value2, "alarmValue");
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

        public Criteria andStartDatetimeIsNull() {
            addCriterion("start_datetime is null");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeIsNotNull() {
            addCriterion("start_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeEqualTo(Date value) {
            addCriterion("start_datetime =", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeNotEqualTo(Date value) {
            addCriterion("start_datetime <>", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeGreaterThan(Date value) {
            addCriterion("start_datetime >", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_datetime >=", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeLessThan(Date value) {
            addCriterion("start_datetime <", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("start_datetime <=", value, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeIn(List<Date> values) {
            addCriterion("start_datetime in", values, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeNotIn(List<Date> values) {
            addCriterion("start_datetime not in", values, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeBetween(Date value1, Date value2) {
            addCriterion("start_datetime between", value1, value2, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andStartDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("start_datetime not between", value1, value2, "startDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIsNull() {
            addCriterion("end_datetime is null");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIsNotNull() {
            addCriterion("end_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeEqualTo(Date value) {
            addCriterion("end_datetime =", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotEqualTo(Date value) {
            addCriterion("end_datetime <>", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeGreaterThan(Date value) {
            addCriterion("end_datetime >", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_datetime >=", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeLessThan(Date value) {
            addCriterion("end_datetime <", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("end_datetime <=", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIn(List<Date> values) {
            addCriterion("end_datetime in", values, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotIn(List<Date> values) {
            addCriterion("end_datetime not in", values, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeBetween(Date value1, Date value2) {
            addCriterion("end_datetime between", value1, value2, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("end_datetime not between", value1, value2, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmClearIsNull() {
            addCriterion("alarm_clear is null");
            return (Criteria) this;
        }

        public Criteria andAlarmClearIsNotNull() {
            addCriterion("alarm_clear is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmClearEqualTo(Integer value) {
            addCriterion("alarm_clear =", value, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearNotEqualTo(Integer value) {
            addCriterion("alarm_clear <>", value, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearGreaterThan(Integer value) {
            addCriterion("alarm_clear >", value, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_clear >=", value, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearLessThan(Integer value) {
            addCriterion("alarm_clear <", value, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_clear <=", value, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearIn(List<Integer> values) {
            addCriterion("alarm_clear in", values, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearNotIn(List<Integer> values) {
            addCriterion("alarm_clear not in", values, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearBetween(Integer value1, Integer value2) {
            addCriterion("alarm_clear between", value1, value2, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andAlarmClearNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_clear not between", value1, value2, "alarmClear");
            return (Criteria) this;
        }

        public Criteria andClearRecordIsNull() {
            addCriterion("clear_record is null");
            return (Criteria) this;
        }

        public Criteria andClearRecordIsNotNull() {
            addCriterion("clear_record is not null");
            return (Criteria) this;
        }

        public Criteria andClearRecordEqualTo(String value) {
            addCriterion("clear_record =", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordNotEqualTo(String value) {
            addCriterion("clear_record <>", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordGreaterThan(String value) {
            addCriterion("clear_record >", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordGreaterThanOrEqualTo(String value) {
            addCriterion("clear_record >=", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordLessThan(String value) {
            addCriterion("clear_record <", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordLessThanOrEqualTo(String value) {
            addCriterion("clear_record <=", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordLike(String value) {
            addCriterion("clear_record like", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordNotLike(String value) {
            addCriterion("clear_record not like", value, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordIn(List<String> values) {
            addCriterion("clear_record in", values, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordNotIn(List<String> values) {
            addCriterion("clear_record not in", values, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordBetween(String value1, String value2) {
            addCriterion("clear_record between", value1, value2, "clearRecord");
            return (Criteria) this;
        }

        public Criteria andClearRecordNotBetween(String value1, String value2) {
            addCriterion("clear_record not between", value1, value2, "clearRecord");
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