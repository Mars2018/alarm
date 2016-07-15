package com.htsc.alarm.domain;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andStatisticalMethodIsNull() {
            addCriterion("statistical_method is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodIsNotNull() {
            addCriterion("statistical_method is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodEqualTo(String value) {
            addCriterion("statistical_method =", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodNotEqualTo(String value) {
            addCriterion("statistical_method <>", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodGreaterThan(String value) {
            addCriterion("statistical_method >", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodGreaterThanOrEqualTo(String value) {
            addCriterion("statistical_method >=", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodLessThan(String value) {
            addCriterion("statistical_method <", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodLessThanOrEqualTo(String value) {
            addCriterion("statistical_method <=", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodLike(String value) {
            addCriterion("statistical_method like", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodNotLike(String value) {
            addCriterion("statistical_method not like", value, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodIn(List<String> values) {
            addCriterion("statistical_method in", values, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodNotIn(List<String> values) {
            addCriterion("statistical_method not in", values, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodBetween(String value1, String value2) {
            addCriterion("statistical_method between", value1, value2, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticalMethodNotBetween(String value1, String value2) {
            addCriterion("statistical_method not between", value1, value2, "statisticalMethod");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionIsNull() {
            addCriterion("judgment_condition is null");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionIsNotNull() {
            addCriterion("judgment_condition is not null");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionEqualTo(String value) {
            addCriterion("judgment_condition =", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionNotEqualTo(String value) {
            addCriterion("judgment_condition <>", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionGreaterThan(String value) {
            addCriterion("judgment_condition >", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionGreaterThanOrEqualTo(String value) {
            addCriterion("judgment_condition >=", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionLessThan(String value) {
            addCriterion("judgment_condition <", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionLessThanOrEqualTo(String value) {
            addCriterion("judgment_condition <=", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionLike(String value) {
            addCriterion("judgment_condition like", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionNotLike(String value) {
            addCriterion("judgment_condition not like", value, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionIn(List<String> values) {
            addCriterion("judgment_condition in", values, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionNotIn(List<String> values) {
            addCriterion("judgment_condition not in", values, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionBetween(String value1, String value2) {
            addCriterion("judgment_condition between", value1, value2, "judgmentCondition");
            return (Criteria) this;
        }

        public Criteria andJudgmentConditionNotBetween(String value1, String value2) {
            addCriterion("judgment_condition not between", value1, value2, "judgmentCondition");
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

        public Criteria andAvailableDayIsNull() {
            addCriterion("available_day is null");
            return (Criteria) this;
        }

        public Criteria andAvailableDayIsNotNull() {
            addCriterion("available_day is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableDayEqualTo(String value) {
            addCriterion("available_day =", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayNotEqualTo(String value) {
            addCriterion("available_day <>", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayGreaterThan(String value) {
            addCriterion("available_day >", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayGreaterThanOrEqualTo(String value) {
            addCriterion("available_day >=", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayLessThan(String value) {
            addCriterion("available_day <", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayLessThanOrEqualTo(String value) {
            addCriterion("available_day <=", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayLike(String value) {
            addCriterion("available_day like", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayNotLike(String value) {
            addCriterion("available_day not like", value, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayIn(List<String> values) {
            addCriterion("available_day in", values, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayNotIn(List<String> values) {
            addCriterion("available_day not in", values, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayBetween(String value1, String value2) {
            addCriterion("available_day between", value1, value2, "availableDay");
            return (Criteria) this;
        }

        public Criteria andAvailableDayNotBetween(String value1, String value2) {
            addCriterion("available_day not between", value1, value2, "availableDay");
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

        public Criteria andEndDatatimeIsNull() {
            addCriterion("end_datatime is null");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeIsNotNull() {
            addCriterion("end_datatime is not null");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeEqualTo(Date value) {
            addCriterion("end_datatime =", value, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeNotEqualTo(Date value) {
            addCriterion("end_datatime <>", value, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeGreaterThan(Date value) {
            addCriterion("end_datatime >", value, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_datatime >=", value, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeLessThan(Date value) {
            addCriterion("end_datatime <", value, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("end_datatime <=", value, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeIn(List<Date> values) {
            addCriterion("end_datatime in", values, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeNotIn(List<Date> values) {
            addCriterion("end_datatime not in", values, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeBetween(Date value1, Date value2) {
            addCriterion("end_datatime between", value1, value2, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andEndDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("end_datatime not between", value1, value2, "endDatatime");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesIsNull() {
            addCriterion("alarm_dependencies is null");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesIsNotNull() {
            addCriterion("alarm_dependencies is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesEqualTo(String value) {
            addCriterion("alarm_dependencies =", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesNotEqualTo(String value) {
            addCriterion("alarm_dependencies <>", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesGreaterThan(String value) {
            addCriterion("alarm_dependencies >", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_dependencies >=", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesLessThan(String value) {
            addCriterion("alarm_dependencies <", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesLessThanOrEqualTo(String value) {
            addCriterion("alarm_dependencies <=", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesLike(String value) {
            addCriterion("alarm_dependencies like", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesNotLike(String value) {
            addCriterion("alarm_dependencies not like", value, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesIn(List<String> values) {
            addCriterion("alarm_dependencies in", values, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesNotIn(List<String> values) {
            addCriterion("alarm_dependencies not in", values, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesBetween(String value1, String value2) {
            addCriterion("alarm_dependencies between", value1, value2, "alarmDependencies");
            return (Criteria) this;
        }

        public Criteria andAlarmDependenciesNotBetween(String value1, String value2) {
            addCriterion("alarm_dependencies not between", value1, value2, "alarmDependencies");
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