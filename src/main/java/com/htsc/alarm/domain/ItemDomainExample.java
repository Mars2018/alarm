package com.htsc.alarm.domain;

import java.util.ArrayList;
import java.util.List;

public class ItemDomainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemDomainExample() {
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

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNull() {
            addCriterion("monitor_type is null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNotNull() {
            addCriterion("monitor_type is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeEqualTo(String value) {
            addCriterion("monitor_type =", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotEqualTo(String value) {
            addCriterion("monitor_type <>", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThan(String value) {
            addCriterion("monitor_type >", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_type >=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThan(String value) {
            addCriterion("monitor_type <", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThanOrEqualTo(String value) {
            addCriterion("monitor_type <=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLike(String value) {
            addCriterion("monitor_type like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotLike(String value) {
            addCriterion("monitor_type not like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIn(List<String> values) {
            addCriterion("monitor_type in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotIn(List<String> values) {
            addCriterion("monitor_type not in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeBetween(String value1, String value2) {
            addCriterion("monitor_type between", value1, value2, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotBetween(String value1, String value2) {
            addCriterion("monitor_type not between", value1, value2, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetIsNull() {
            addCriterion("monitor_target is null");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetIsNotNull() {
            addCriterion("monitor_target is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetEqualTo(String value) {
            addCriterion("monitor_target =", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetNotEqualTo(String value) {
            addCriterion("monitor_target <>", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetGreaterThan(String value) {
            addCriterion("monitor_target >", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_target >=", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetLessThan(String value) {
            addCriterion("monitor_target <", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetLessThanOrEqualTo(String value) {
            addCriterion("monitor_target <=", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetLike(String value) {
            addCriterion("monitor_target like", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetNotLike(String value) {
            addCriterion("monitor_target not like", value, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetIn(List<String> values) {
            addCriterion("monitor_target in", values, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetNotIn(List<String> values) {
            addCriterion("monitor_target not in", values, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetBetween(String value1, String value2) {
            addCriterion("monitor_target between", value1, value2, "monitorTarget");
            return (Criteria) this;
        }

        public Criteria andMonitorTargetNotBetween(String value1, String value2) {
            addCriterion("monitor_target not between", value1, value2, "monitorTarget");
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

        public Criteria andUpdateIntervalIsNull() {
            addCriterion("update_interval is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalIsNotNull() {
            addCriterion("update_interval is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalEqualTo(Integer value) {
            addCriterion("update_interval =", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalNotEqualTo(Integer value) {
            addCriterion("update_interval <>", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalGreaterThan(Integer value) {
            addCriterion("update_interval >", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_interval >=", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalLessThan(Integer value) {
            addCriterion("update_interval <", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("update_interval <=", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalIn(List<Integer> values) {
            addCriterion("update_interval in", values, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalNotIn(List<Integer> values) {
            addCriterion("update_interval not in", values, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalBetween(Integer value1, Integer value2) {
            addCriterion("update_interval between", value1, value2, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("update_interval not between", value1, value2, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepIsNull() {
            addCriterion("history_keep is null");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepIsNotNull() {
            addCriterion("history_keep is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepEqualTo(Long value) {
            addCriterion("history_keep =", value, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepNotEqualTo(Long value) {
            addCriterion("history_keep <>", value, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepGreaterThan(Long value) {
            addCriterion("history_keep >", value, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepGreaterThanOrEqualTo(Long value) {
            addCriterion("history_keep >=", value, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepLessThan(Long value) {
            addCriterion("history_keep <", value, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepLessThanOrEqualTo(Long value) {
            addCriterion("history_keep <=", value, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepIn(List<Long> values) {
            addCriterion("history_keep in", values, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepNotIn(List<Long> values) {
            addCriterion("history_keep not in", values, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepBetween(Long value1, Long value2) {
            addCriterion("history_keep between", value1, value2, "historyKeep");
            return (Criteria) this;
        }

        public Criteria andHistoryKeepNotBetween(Long value1, Long value2) {
            addCriterion("history_keep not between", value1, value2, "historyKeep");
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