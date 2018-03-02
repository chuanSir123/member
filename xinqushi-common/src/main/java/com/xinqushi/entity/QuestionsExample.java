package com.xinqushi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionsExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cId is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cId is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cId =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cId <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cId >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cId >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cId <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cId <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cId in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cId not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cId between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cId not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andQpersonIsNull() {
            addCriterion("qperson is null");
            return (Criteria) this;
        }

        public Criteria andQpersonIsNotNull() {
            addCriterion("qperson is not null");
            return (Criteria) this;
        }

        public Criteria andQpersonEqualTo(String value) {
            addCriterion("qperson =", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonNotEqualTo(String value) {
            addCriterion("qperson <>", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonGreaterThan(String value) {
            addCriterion("qperson >", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonGreaterThanOrEqualTo(String value) {
            addCriterion("qperson >=", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonLessThan(String value) {
            addCriterion("qperson <", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonLessThanOrEqualTo(String value) {
            addCriterion("qperson <=", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonLike(String value) {
            addCriterion("qperson like", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonNotLike(String value) {
            addCriterion("qperson not like", value, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonIn(List<String> values) {
            addCriterion("qperson in", values, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonNotIn(List<String> values) {
            addCriterion("qperson not in", values, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonBetween(String value1, String value2) {
            addCriterion("qperson between", value1, value2, "qperson");
            return (Criteria) this;
        }

        public Criteria andQpersonNotBetween(String value1, String value2) {
            addCriterion("qperson not between", value1, value2, "qperson");
            return (Criteria) this;
        }

        public Criteria andSpersonIsNull() {
            addCriterion("sperson is null");
            return (Criteria) this;
        }

        public Criteria andSpersonIsNotNull() {
            addCriterion("sperson is not null");
            return (Criteria) this;
        }

        public Criteria andSpersonEqualTo(String value) {
            addCriterion("sperson =", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonNotEqualTo(String value) {
            addCriterion("sperson <>", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonGreaterThan(String value) {
            addCriterion("sperson >", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonGreaterThanOrEqualTo(String value) {
            addCriterion("sperson >=", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonLessThan(String value) {
            addCriterion("sperson <", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonLessThanOrEqualTo(String value) {
            addCriterion("sperson <=", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonLike(String value) {
            addCriterion("sperson like", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonNotLike(String value) {
            addCriterion("sperson not like", value, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonIn(List<String> values) {
            addCriterion("sperson in", values, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonNotIn(List<String> values) {
            addCriterion("sperson not in", values, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonBetween(String value1, String value2) {
            addCriterion("sperson between", value1, value2, "sperson");
            return (Criteria) this;
        }

        public Criteria andSpersonNotBetween(String value1, String value2) {
            addCriterion("sperson not between", value1, value2, "sperson");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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