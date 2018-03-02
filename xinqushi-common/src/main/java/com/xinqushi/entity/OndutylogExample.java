package com.xinqushi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OndutylogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OndutylogExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andBehelpednameIsNull() {
            addCriterion("beHelpedName is null");
            return (Criteria) this;
        }

        public Criteria andBehelpednameIsNotNull() {
            addCriterion("beHelpedName is not null");
            return (Criteria) this;
        }

        public Criteria andBehelpednameEqualTo(String value) {
            addCriterion("beHelpedName =", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameNotEqualTo(String value) {
            addCriterion("beHelpedName <>", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameGreaterThan(String value) {
            addCriterion("beHelpedName >", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameGreaterThanOrEqualTo(String value) {
            addCriterion("beHelpedName >=", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameLessThan(String value) {
            addCriterion("beHelpedName <", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameLessThanOrEqualTo(String value) {
            addCriterion("beHelpedName <=", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameLike(String value) {
            addCriterion("beHelpedName like", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameNotLike(String value) {
            addCriterion("beHelpedName not like", value, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameIn(List<String> values) {
            addCriterion("beHelpedName in", values, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameNotIn(List<String> values) {
            addCriterion("beHelpedName not in", values, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameBetween(String value1, String value2) {
            addCriterion("beHelpedName between", value1, value2, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpednameNotBetween(String value1, String value2) {
            addCriterion("beHelpedName not between", value1, value2, "behelpedname");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqIsNull() {
            addCriterion("beHelpedQQ is null");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqIsNotNull() {
            addCriterion("beHelpedQQ is not null");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqEqualTo(String value) {
            addCriterion("beHelpedQQ =", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqNotEqualTo(String value) {
            addCriterion("beHelpedQQ <>", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqGreaterThan(String value) {
            addCriterion("beHelpedQQ >", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqGreaterThanOrEqualTo(String value) {
            addCriterion("beHelpedQQ >=", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqLessThan(String value) {
            addCriterion("beHelpedQQ <", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqLessThanOrEqualTo(String value) {
            addCriterion("beHelpedQQ <=", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqLike(String value) {
            addCriterion("beHelpedQQ like", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqNotLike(String value) {
            addCriterion("beHelpedQQ not like", value, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqIn(List<String> values) {
            addCriterion("beHelpedQQ in", values, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqNotIn(List<String> values) {
            addCriterion("beHelpedQQ not in", values, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqBetween(String value1, String value2) {
            addCriterion("beHelpedQQ between", value1, value2, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedqqNotBetween(String value1, String value2) {
            addCriterion("beHelpedQQ not between", value1, value2, "behelpedqq");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoIsNull() {
            addCriterion("beHelpedInfo is null");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoIsNotNull() {
            addCriterion("beHelpedInfo is not null");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoEqualTo(String value) {
            addCriterion("beHelpedInfo =", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoNotEqualTo(String value) {
            addCriterion("beHelpedInfo <>", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoGreaterThan(String value) {
            addCriterion("beHelpedInfo >", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoGreaterThanOrEqualTo(String value) {
            addCriterion("beHelpedInfo >=", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoLessThan(String value) {
            addCriterion("beHelpedInfo <", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoLessThanOrEqualTo(String value) {
            addCriterion("beHelpedInfo <=", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoLike(String value) {
            addCriterion("beHelpedInfo like", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoNotLike(String value) {
            addCriterion("beHelpedInfo not like", value, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoIn(List<String> values) {
            addCriterion("beHelpedInfo in", values, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoNotIn(List<String> values) {
            addCriterion("beHelpedInfo not in", values, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoBetween(String value1, String value2) {
            addCriterion("beHelpedInfo between", value1, value2, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andBehelpedinfoNotBetween(String value1, String value2) {
            addCriterion("beHelpedInfo not between", value1, value2, "behelpedinfo");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionIsNull() {
            addCriterion("qustionDescription is null");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionIsNotNull() {
            addCriterion("qustionDescription is not null");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionEqualTo(String value) {
            addCriterion("qustionDescription =", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionNotEqualTo(String value) {
            addCriterion("qustionDescription <>", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionGreaterThan(String value) {
            addCriterion("qustionDescription >", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("qustionDescription >=", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionLessThan(String value) {
            addCriterion("qustionDescription <", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionLessThanOrEqualTo(String value) {
            addCriterion("qustionDescription <=", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionLike(String value) {
            addCriterion("qustionDescription like", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionNotLike(String value) {
            addCriterion("qustionDescription not like", value, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionIn(List<String> values) {
            addCriterion("qustionDescription in", values, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionNotIn(List<String> values) {
            addCriterion("qustionDescription not in", values, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionBetween(String value1, String value2) {
            addCriterion("qustionDescription between", value1, value2, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andQustiondescriptionNotBetween(String value1, String value2) {
            addCriterion("qustionDescription not between", value1, value2, "qustiondescription");
            return (Criteria) this;
        }

        public Criteria andSolutionreportIsNull() {
            addCriterion("solutionReport is null");
            return (Criteria) this;
        }

        public Criteria andSolutionreportIsNotNull() {
            addCriterion("solutionReport is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionreportEqualTo(String value) {
            addCriterion("solutionReport =", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportNotEqualTo(String value) {
            addCriterion("solutionReport <>", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportGreaterThan(String value) {
            addCriterion("solutionReport >", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportGreaterThanOrEqualTo(String value) {
            addCriterion("solutionReport >=", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportLessThan(String value) {
            addCriterion("solutionReport <", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportLessThanOrEqualTo(String value) {
            addCriterion("solutionReport <=", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportLike(String value) {
            addCriterion("solutionReport like", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportNotLike(String value) {
            addCriterion("solutionReport not like", value, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportIn(List<String> values) {
            addCriterion("solutionReport in", values, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportNotIn(List<String> values) {
            addCriterion("solutionReport not in", values, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportBetween(String value1, String value2) {
            addCriterion("solutionReport between", value1, value2, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andSolutionreportNotBetween(String value1, String value2) {
            addCriterion("solutionReport not between", value1, value2, "solutionreport");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNull() {
            addCriterion("submitTime is null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNotNull() {
            addCriterion("submitTime is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeEqualTo(Date value) {
            addCriterion("submitTime =", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotEqualTo(Date value) {
            addCriterion("submitTime <>", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThan(Date value) {
            addCriterion("submitTime >", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submitTime >=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThan(Date value) {
            addCriterion("submitTime <", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThanOrEqualTo(Date value) {
            addCriterion("submitTime <=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIn(List<Date> values) {
            addCriterion("submitTime in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotIn(List<Date> values) {
            addCriterion("submitTime not in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeBetween(Date value1, Date value2) {
            addCriterion("submitTime between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotBetween(Date value1, Date value2) {
            addCriterion("submitTime not between", value1, value2, "submittime");
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