package com.xinqushi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeriodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeriodExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNull() {
            addCriterion("duetime is null");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNotNull() {
            addCriterion("duetime is not null");
            return (Criteria) this;
        }

        public Criteria andDuetimeEqualTo(Date value) {
            addCriterion("duetime =", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotEqualTo(Date value) {
            addCriterion("duetime <>", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThan(Date value) {
            addCriterion("duetime >", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("duetime >=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThan(Date value) {
            addCriterion("duetime <", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThanOrEqualTo(Date value) {
            addCriterion("duetime <=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeIn(List<Date> values) {
            addCriterion("duetime in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotIn(List<Date> values) {
            addCriterion("duetime not in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeBetween(Date value1, Date value2) {
            addCriterion("duetime between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotBetween(Date value1, Date value2) {
            addCriterion("duetime not between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRestamountIsNull() {
            addCriterion("restamount is null");
            return (Criteria) this;
        }

        public Criteria andRestamountIsNotNull() {
            addCriterion("restamount is not null");
            return (Criteria) this;
        }

        public Criteria andRestamountEqualTo(Double value) {
            addCriterion("restamount =", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountNotEqualTo(Double value) {
            addCriterion("restamount <>", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountGreaterThan(Double value) {
            addCriterion("restamount >", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountGreaterThanOrEqualTo(Double value) {
            addCriterion("restamount >=", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountLessThan(Double value) {
            addCriterion("restamount <", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountLessThanOrEqualTo(Double value) {
            addCriterion("restamount <=", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountIn(List<Double> values) {
            addCriterion("restamount in", values, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountNotIn(List<Double> values) {
            addCriterion("restamount not in", values, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountBetween(Double value1, Double value2) {
            addCriterion("restamount between", value1, value2, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountNotBetween(Double value1, Double value2) {
            addCriterion("restamount not between", value1, value2, "restamount");
            return (Criteria) this;
        }

        public Criteria andMinterestIsNull() {
            addCriterion("minterest is null");
            return (Criteria) this;
        }

        public Criteria andMinterestIsNotNull() {
            addCriterion("minterest is not null");
            return (Criteria) this;
        }

        public Criteria andMinterestEqualTo(Double value) {
            addCriterion("minterest =", value, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestNotEqualTo(Double value) {
            addCriterion("minterest <>", value, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestGreaterThan(Double value) {
            addCriterion("minterest >", value, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestGreaterThanOrEqualTo(Double value) {
            addCriterion("minterest >=", value, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestLessThan(Double value) {
            addCriterion("minterest <", value, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestLessThanOrEqualTo(Double value) {
            addCriterion("minterest <=", value, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestIn(List<Double> values) {
            addCriterion("minterest in", values, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestNotIn(List<Double> values) {
            addCriterion("minterest not in", values, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestBetween(Double value1, Double value2) {
            addCriterion("minterest between", value1, value2, "minterest");
            return (Criteria) this;
        }

        public Criteria andMinterestNotBetween(Double value1, Double value2) {
            addCriterion("minterest not between", value1, value2, "minterest");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
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