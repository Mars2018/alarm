package com.htsc.alarm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TriggerDomainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TriggerDomainExample() {
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

        public Criteria andTriggerIdIsNull() {
            addCriterion("trigger_id is null");
            return (Criteria) this;
        }

        public Criteria andTriggerIdIsNotNull() {
            addCriterion("trigger_id is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerIdEqualTo(Integer value) {
            addCriterion("trigger_id =", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdNotEqualTo(Integer value) {
            addCriterion("trigger_id <>", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdGreaterThan(Integer value) {
            addCriterion("trigger_id >", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trigger_id >=", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdLessThan(Integer value) {
            addCriterion("trigger_id <", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdLessThanOrEqualTo(Integer value) {
            addCriterion("trigger_id <=", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdIn(List<Integer> values) {
            addCriterion("trigger_id in", values, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdNotIn(List<Integer> values) {
            addCriterion("trigger_id not in", values, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdBetween(Integer value1, Integer value2) {
            addCriterion("trigger_id between", value1, value2, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trigger_id not between", value1, value2, "triggerId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLastvalueIsNull() {
            addCriterion("lastvalue is null");
            return (Criteria) this;
        }

        public Criteria andLastvalueIsNotNull() {
            addCriterion("lastvalue is not null");
            return (Criteria) this;
        }

        public Criteria andLastvalueEqualTo(Integer value) {
            addCriterion("lastvalue =", value, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueNotEqualTo(Integer value) {
            addCriterion("lastvalue <>", value, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueGreaterThan(Integer value) {
            addCriterion("lastvalue >", value, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastvalue >=", value, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueLessThan(Integer value) {
            addCriterion("lastvalue <", value, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueLessThanOrEqualTo(Integer value) {
            addCriterion("lastvalue <=", value, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueIn(List<Integer> values) {
            addCriterion("lastvalue in", values, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueNotIn(List<Integer> values) {
            addCriterion("lastvalue not in", values, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueBetween(Integer value1, Integer value2) {
            addCriterion("lastvalue between", value1, value2, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("lastvalue not between", value1, value2, "lastvalue");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeIsNull() {
            addCriterion("lastvalue_time is null");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeIsNotNull() {
            addCriterion("lastvalue_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeEqualTo(Date value) {
            addCriterion("lastvalue_time =", value, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeNotEqualTo(Date value) {
            addCriterion("lastvalue_time <>", value, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeGreaterThan(Date value) {
            addCriterion("lastvalue_time >", value, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastvalue_time >=", value, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeLessThan(Date value) {
            addCriterion("lastvalue_time <", value, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastvalue_time <=", value, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeIn(List<Date> values) {
            addCriterion("lastvalue_time in", values, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeNotIn(List<Date> values) {
            addCriterion("lastvalue_time not in", values, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeBetween(Date value1, Date value2) {
            addCriterion("lastvalue_time between", value1, value2, "lastvalueTime");
            return (Criteria) this;
        }

        public Criteria andLastvalueTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastvalue_time not between", value1, value2, "lastvalueTime");
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

        public Criteria andParametersIsNull() {
            addCriterion("parameters is null");
            return (Criteria) this;
        }

        public Criteria andParametersIsNotNull() {
            addCriterion("parameters is not null");
            return (Criteria) this;
        }

        public Criteria andParametersEqualTo(String value) {
            addCriterion("parameters =", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotEqualTo(String value) {
            addCriterion("parameters <>", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersGreaterThan(String value) {
            addCriterion("parameters >", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersGreaterThanOrEqualTo(String value) {
            addCriterion("parameters >=", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLessThan(String value) {
            addCriterion("parameters <", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLessThanOrEqualTo(String value) {
            addCriterion("parameters <=", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersLike(String value) {
            addCriterion("parameters like", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotLike(String value) {
            addCriterion("parameters not like", value, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersIn(List<String> values) {
            addCriterion("parameters in", values, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotIn(List<String> values) {
            addCriterion("parameters not in", values, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersBetween(String value1, String value2) {
            addCriterion("parameters between", value1, value2, "parameters");
            return (Criteria) this;
        }

        public Criteria andParametersNotBetween(String value1, String value2) {
            addCriterion("parameters not between", value1, value2, "parameters");
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