package com.xinqushi.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CourseandproExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseandproExample() {
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

        public Criteria andMeidIsNull() {
            addCriterion("meid is null");
            return (Criteria) this;
        }

        public Criteria andMeidIsNotNull() {
            addCriterion("meid is not null");
            return (Criteria) this;
        }

        public Criteria andMeidEqualTo(Integer value) {
            addCriterion("meid =", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotEqualTo(Integer value) {
            addCriterion("meid <>", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidGreaterThan(Integer value) {
            addCriterion("meid >", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("meid >=", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidLessThan(Integer value) {
            addCriterion("meid <", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidLessThanOrEqualTo(Integer value) {
            addCriterion("meid <=", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidIn(List<Integer> values) {
            addCriterion("meid in", values, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotIn(List<Integer> values) {
            addCriterion("meid not in", values, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidBetween(Integer value1, Integer value2) {
            addCriterion("meid between", value1, value2, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotBetween(Integer value1, Integer value2) {
            addCriterion("meid not between", value1, value2, "meid");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIsNull() {
            addCriterion("identityType is null");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIsNotNull() {
            addCriterion("identityType is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeEqualTo(Integer value) {
            addCriterion("identityType =", value, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeNotEqualTo(Integer value) {
            addCriterion("identityType <>", value, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeGreaterThan(Integer value) {
            addCriterion("identityType >", value, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("identityType >=", value, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeLessThan(Integer value) {
            addCriterion("identityType <", value, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeLessThanOrEqualTo(Integer value) {
            addCriterion("identityType <=", value, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIn(List<Integer> values) {
            addCriterion("identityType in", values, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeNotIn(List<Integer> values) {
            addCriterion("identityType not in", values, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeBetween(Integer value1, Integer value2) {
            addCriterion("identityType between", value1, value2, "identitytype");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("identityType not between", value1, value2, "identitytype");
            return (Criteria) this;
        }

        public Criteria andCaidIsNull() {
            addCriterion("caid is null");
            return (Criteria) this;
        }

        public Criteria andCaidIsNotNull() {
            addCriterion("caid is not null");
            return (Criteria) this;
        }

        public Criteria andCaidEqualTo(Integer value) {
            addCriterion("caid =", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotEqualTo(Integer value) {
            addCriterion("caid <>", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidGreaterThan(Integer value) {
            addCriterion("caid >", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caid >=", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidLessThan(Integer value) {
            addCriterion("caid <", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidLessThanOrEqualTo(Integer value) {
            addCriterion("caid <=", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidIn(List<Integer> values) {
            addCriterion("caid in", values, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotIn(List<Integer> values) {
            addCriterion("caid not in", values, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidBetween(Integer value1, Integer value2) {
            addCriterion("caid between", value1, value2, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotBetween(Integer value1, Integer value2) {
            addCriterion("caid not between", value1, value2, "caid");
            return (Criteria) this;
        }

        public Criteria andChorderIsNull() {
            addCriterion("chorder is null");
            return (Criteria) this;
        }

        public Criteria andChorderIsNotNull() {
            addCriterion("chorder is not null");
            return (Criteria) this;
        }

        public Criteria andChorderEqualTo(Integer value) {
            addCriterion("chorder =", value, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderNotEqualTo(Integer value) {
            addCriterion("chorder <>", value, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderGreaterThan(Integer value) {
            addCriterion("chorder >", value, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("chorder >=", value, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderLessThan(Integer value) {
            addCriterion("chorder <", value, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderLessThanOrEqualTo(Integer value) {
            addCriterion("chorder <=", value, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderIn(List<Integer> values) {
            addCriterion("chorder in", values, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderNotIn(List<Integer> values) {
            addCriterion("chorder not in", values, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderBetween(Integer value1, Integer value2) {
            addCriterion("chorder between", value1, value2, "chorder");
            return (Criteria) this;
        }

        public Criteria andChorderNotBetween(Integer value1, Integer value2) {
            addCriterion("chorder not between", value1, value2, "chorder");
            return (Criteria) this;
        }

        public Criteria andCorderIsNull() {
            addCriterion("corder is null");
            return (Criteria) this;
        }

        public Criteria andCorderIsNotNull() {
            addCriterion("corder is not null");
            return (Criteria) this;
        }

        public Criteria andCorderEqualTo(Integer value) {
            addCriterion("corder =", value, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderNotEqualTo(Integer value) {
            addCriterion("corder <>", value, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderGreaterThan(Integer value) {
            addCriterion("corder >", value, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("corder >=", value, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderLessThan(Integer value) {
            addCriterion("corder <", value, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderLessThanOrEqualTo(Integer value) {
            addCriterion("corder <=", value, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderIn(List<Integer> values) {
            addCriterion("corder in", values, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderNotIn(List<Integer> values) {
            addCriterion("corder not in", values, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderBetween(Integer value1, Integer value2) {
            addCriterion("corder between", value1, value2, "corder");
            return (Criteria) this;
        }

        public Criteria andCorderNotBetween(Integer value1, Integer value2) {
            addCriterion("corder not between", value1, value2, "corder");
            return (Criteria) this;
        }

        public Criteria andProportionIsNull() {
            addCriterion("proportion is null");
            return (Criteria) this;
        }

        public Criteria andProportionIsNotNull() {
            addCriterion("proportion is not null");
            return (Criteria) this;
        }

        public Criteria andProportionEqualTo(BigDecimal value) {
            addCriterion("proportion =", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotEqualTo(BigDecimal value) {
            addCriterion("proportion <>", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThan(BigDecimal value) {
            addCriterion("proportion >", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion >=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThan(BigDecimal value) {
            addCriterion("proportion <", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion <=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionIn(List<BigDecimal> values) {
            addCriterion("proportion in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotIn(List<BigDecimal> values) {
            addCriterion("proportion not in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion not between", value1, value2, "proportion");
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