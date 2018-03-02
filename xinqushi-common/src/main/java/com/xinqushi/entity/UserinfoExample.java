package com.xinqushi.entity;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("idNo is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("idNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("idNo =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("idNo <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("idNo >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("idNo >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("idNo <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("idNo <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("idNo like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("idNo not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("idNo in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("idNo not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("idNo between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("idNo not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andQqnoIsNull() {
            addCriterion("qqNo is null");
            return (Criteria) this;
        }

        public Criteria andQqnoIsNotNull() {
            addCriterion("qqNo is not null");
            return (Criteria) this;
        }

        public Criteria andQqnoEqualTo(String value) {
            addCriterion("qqNo =", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotEqualTo(String value) {
            addCriterion("qqNo <>", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoGreaterThan(String value) {
            addCriterion("qqNo >", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoGreaterThanOrEqualTo(String value) {
            addCriterion("qqNo >=", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoLessThan(String value) {
            addCriterion("qqNo <", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoLessThanOrEqualTo(String value) {
            addCriterion("qqNo <=", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoLike(String value) {
            addCriterion("qqNo like", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotLike(String value) {
            addCriterion("qqNo not like", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoIn(List<String> values) {
            addCriterion("qqNo in", values, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotIn(List<String> values) {
            addCriterion("qqNo not in", values, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoBetween(String value1, String value2) {
            addCriterion("qqNo between", value1, value2, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotBetween(String value1, String value2) {
            addCriterion("qqNo not between", value1, value2, "qqno");
            return (Criteria) this;
        }

        public Criteria andPayaccountIsNull() {
            addCriterion("payAccount is null");
            return (Criteria) this;
        }

        public Criteria andPayaccountIsNotNull() {
            addCriterion("payAccount is not null");
            return (Criteria) this;
        }

        public Criteria andPayaccountEqualTo(String value) {
            addCriterion("payAccount =", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotEqualTo(String value) {
            addCriterion("payAccount <>", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThan(String value) {
            addCriterion("payAccount >", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThanOrEqualTo(String value) {
            addCriterion("payAccount >=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThan(String value) {
            addCriterion("payAccount <", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThanOrEqualTo(String value) {
            addCriterion("payAccount <=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLike(String value) {
            addCriterion("payAccount like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotLike(String value) {
            addCriterion("payAccount not like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountIn(List<String> values) {
            addCriterion("payAccount in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotIn(List<String> values) {
            addCriterion("payAccount not in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountBetween(String value1, String value2) {
            addCriterion("payAccount between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotBetween(String value1, String value2) {
            addCriterion("payAccount not between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNull() {
            addCriterion("contactName is null");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNotNull() {
            addCriterion("contactName is not null");
            return (Criteria) this;
        }

        public Criteria andContactnameEqualTo(String value) {
            addCriterion("contactName =", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotEqualTo(String value) {
            addCriterion("contactName <>", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThan(String value) {
            addCriterion("contactName >", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThanOrEqualTo(String value) {
            addCriterion("contactName >=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThan(String value) {
            addCriterion("contactName <", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThanOrEqualTo(String value) {
            addCriterion("contactName <=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLike(String value) {
            addCriterion("contactName like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotLike(String value) {
            addCriterion("contactName not like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameIn(List<String> values) {
            addCriterion("contactName in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotIn(List<String> values) {
            addCriterion("contactName not in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameBetween(String value1, String value2) {
            addCriterion("contactName between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotBetween(String value1, String value2) {
            addCriterion("contactName not between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactmobileIsNull() {
            addCriterion("contactMobile is null");
            return (Criteria) this;
        }

        public Criteria andContactmobileIsNotNull() {
            addCriterion("contactMobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactmobileEqualTo(String value) {
            addCriterion("contactMobile =", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileNotEqualTo(String value) {
            addCriterion("contactMobile <>", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileGreaterThan(String value) {
            addCriterion("contactMobile >", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileGreaterThanOrEqualTo(String value) {
            addCriterion("contactMobile >=", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileLessThan(String value) {
            addCriterion("contactMobile <", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileLessThanOrEqualTo(String value) {
            addCriterion("contactMobile <=", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileLike(String value) {
            addCriterion("contactMobile like", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileNotLike(String value) {
            addCriterion("contactMobile not like", value, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileIn(List<String> values) {
            addCriterion("contactMobile in", values, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileNotIn(List<String> values) {
            addCriterion("contactMobile not in", values, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileBetween(String value1, String value2) {
            addCriterion("contactMobile between", value1, value2, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andContactmobileNotBetween(String value1, String value2) {
            addCriterion("contactMobile not between", value1, value2, "contactmobile");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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