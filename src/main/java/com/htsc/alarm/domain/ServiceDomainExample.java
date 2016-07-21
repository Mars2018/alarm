package com.htsc.alarm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceDomainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceDomainExample() {
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

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
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

        public Criteria andServiceStartIsNull() {
            addCriterion("service_start is null");
            return (Criteria) this;
        }

        public Criteria andServiceStartIsNotNull() {
            addCriterion("service_start is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStartEqualTo(Date value) {
            addCriterion("service_start =", value, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartNotEqualTo(Date value) {
            addCriterion("service_start <>", value, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartGreaterThan(Date value) {
            addCriterion("service_start >", value, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartGreaterThanOrEqualTo(Date value) {
            addCriterion("service_start >=", value, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartLessThan(Date value) {
            addCriterion("service_start <", value, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartLessThanOrEqualTo(Date value) {
            addCriterion("service_start <=", value, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartIn(List<Date> values) {
            addCriterion("service_start in", values, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartNotIn(List<Date> values) {
            addCriterion("service_start not in", values, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartBetween(Date value1, Date value2) {
            addCriterion("service_start between", value1, value2, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceStartNotBetween(Date value1, Date value2) {
            addCriterion("service_start not between", value1, value2, "serviceStart");
            return (Criteria) this;
        }

        public Criteria andServiceEndIsNull() {
            addCriterion("service_end is null");
            return (Criteria) this;
        }

        public Criteria andServiceEndIsNotNull() {
            addCriterion("service_end is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEndEqualTo(Date value) {
            addCriterion("service_end =", value, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndNotEqualTo(Date value) {
            addCriterion("service_end <>", value, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndGreaterThan(Date value) {
            addCriterion("service_end >", value, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndGreaterThanOrEqualTo(Date value) {
            addCriterion("service_end >=", value, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndLessThan(Date value) {
            addCriterion("service_end <", value, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndLessThanOrEqualTo(Date value) {
            addCriterion("service_end <=", value, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndIn(List<Date> values) {
            addCriterion("service_end in", values, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndNotIn(List<Date> values) {
            addCriterion("service_end not in", values, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndBetween(Date value1, Date value2) {
            addCriterion("service_end between", value1, value2, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andServiceEndNotBetween(Date value1, Date value2) {
            addCriterion("service_end not between", value1, value2, "serviceEnd");
            return (Criteria) this;
        }

        public Criteria andDependenciesIsNull() {
            addCriterion("dependencies is null");
            return (Criteria) this;
        }

        public Criteria andDependenciesIsNotNull() {
            addCriterion("dependencies is not null");
            return (Criteria) this;
        }

        public Criteria andDependenciesEqualTo(String value) {
            addCriterion("dependencies =", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesNotEqualTo(String value) {
            addCriterion("dependencies <>", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesGreaterThan(String value) {
            addCriterion("dependencies >", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesGreaterThanOrEqualTo(String value) {
            addCriterion("dependencies >=", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesLessThan(String value) {
            addCriterion("dependencies <", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesLessThanOrEqualTo(String value) {
            addCriterion("dependencies <=", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesLike(String value) {
            addCriterion("dependencies like", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesNotLike(String value) {
            addCriterion("dependencies not like", value, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesIn(List<String> values) {
            addCriterion("dependencies in", values, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesNotIn(List<String> values) {
            addCriterion("dependencies not in", values, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesBetween(String value1, String value2) {
            addCriterion("dependencies between", value1, value2, "dependencies");
            return (Criteria) this;
        }

        public Criteria andDependenciesNotBetween(String value1, String value2) {
            addCriterion("dependencies not between", value1, value2, "dependencies");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIsNull() {
            addCriterion("service_active is null");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIsNotNull() {
            addCriterion("service_active is not null");
            return (Criteria) this;
        }

        public Criteria andServiceActiveEqualTo(String value) {
            addCriterion("service_active =", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveNotEqualTo(String value) {
            addCriterion("service_active <>", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveGreaterThan(String value) {
            addCriterion("service_active >", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveGreaterThanOrEqualTo(String value) {
            addCriterion("service_active >=", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveLessThan(String value) {
            addCriterion("service_active <", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveLessThanOrEqualTo(String value) {
            addCriterion("service_active <=", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveLike(String value) {
            addCriterion("service_active like", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveNotLike(String value) {
            addCriterion("service_active not like", value, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIn(List<String> values) {
            addCriterion("service_active in", values, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveNotIn(List<String> values) {
            addCriterion("service_active not in", values, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveBetween(String value1, String value2) {
            addCriterion("service_active between", value1, value2, "serviceActive");
            return (Criteria) this;
        }

        public Criteria andServiceActiveNotBetween(String value1, String value2) {
            addCriterion("service_active not between", value1, value2, "serviceActive");
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