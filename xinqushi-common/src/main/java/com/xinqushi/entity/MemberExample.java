package com.xinqushi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andStudentIsNull() {
            addCriterion("student is null");
            return (Criteria) this;
        }

        public Criteria andStudentIsNotNull() {
            addCriterion("student is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEqualTo(Boolean value) {
            addCriterion("student =", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotEqualTo(Boolean value) {
            addCriterion("student <>", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentGreaterThan(Boolean value) {
            addCriterion("student >", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("student >=", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLessThan(Boolean value) {
            addCriterion("student <", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLessThanOrEqualTo(Boolean value) {
            addCriterion("student <=", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentIn(List<Boolean> values) {
            addCriterion("student in", values, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotIn(List<Boolean> values) {
            addCriterion("student not in", values, "student");
            return (Criteria) this;
        }

        public Criteria andStudentBetween(Boolean value1, Boolean value2) {
            addCriterion("student between", value1, value2, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("student not between", value1, value2, "student");
            return (Criteria) this;
        }

        public Criteria andGraduatedateIsNull() {
            addCriterion("graduateDate is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedateIsNotNull() {
            addCriterion("graduateDate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedateEqualTo(Date value) {
            addCriterionForJDBCDate("graduateDate =", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("graduateDate <>", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("graduateDate >", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduateDate >=", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateLessThan(Date value) {
            addCriterionForJDBCDate("graduateDate <", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduateDate <=", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateIn(List<Date> values) {
            addCriterionForJDBCDate("graduateDate in", values, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("graduateDate not in", values, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduateDate between", value1, value2, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduateDate not between", value1, value2, "graduatedate");
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

        public Criteria andAbnormalIsNull() {
            addCriterion("abnormal is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalIsNotNull() {
            addCriterion("abnormal is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalEqualTo(Boolean value) {
            addCriterion("abnormal =", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalNotEqualTo(Boolean value) {
            addCriterion("abnormal <>", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalGreaterThan(Boolean value) {
            addCriterion("abnormal >", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("abnormal >=", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalLessThan(Boolean value) {
            addCriterion("abnormal <", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalLessThanOrEqualTo(Boolean value) {
            addCriterion("abnormal <=", value, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalIn(List<Boolean> values) {
            addCriterion("abnormal in", values, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalNotIn(List<Boolean> values) {
            addCriterion("abnormal not in", values, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalBetween(Boolean value1, Boolean value2) {
            addCriterion("abnormal between", value1, value2, "abnormal");
            return (Criteria) this;
        }

        public Criteria andAbnormalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("abnormal not between", value1, value2, "abnormal");
            return (Criteria) this;
        }

        public Criteria andProvidIsNull() {
            addCriterion("provid is null");
            return (Criteria) this;
        }

        public Criteria andProvidIsNotNull() {
            addCriterion("provid is not null");
            return (Criteria) this;
        }

        public Criteria andProvidEqualTo(Integer value) {
            addCriterion("provid =", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotEqualTo(Integer value) {
            addCriterion("provid <>", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidGreaterThan(Integer value) {
            addCriterion("provid >", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("provid >=", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidLessThan(Integer value) {
            addCriterion("provid <", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidLessThanOrEqualTo(Integer value) {
            addCriterion("provid <=", value, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidIn(List<Integer> values) {
            addCriterion("provid in", values, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotIn(List<Integer> values) {
            addCriterion("provid not in", values, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidBetween(Integer value1, Integer value2) {
            addCriterion("provid between", value1, value2, "provid");
            return (Criteria) this;
        }

        public Criteria andProvidNotBetween(Integer value1, Integer value2) {
            addCriterion("provid not between", value1, value2, "provid");
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

        public Criteria andAlogIsNull() {
            addCriterion("alog is null");
            return (Criteria) this;
        }

        public Criteria andAlogIsNotNull() {
            addCriterion("alog is not null");
            return (Criteria) this;
        }

        public Criteria andAlogEqualTo(Integer value) {
            addCriterion("alog =", value, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogNotEqualTo(Integer value) {
            addCriterion("alog <>", value, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogGreaterThan(Integer value) {
            addCriterion("alog >", value, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogGreaterThanOrEqualTo(Integer value) {
            addCriterion("alog >=", value, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogLessThan(Integer value) {
            addCriterion("alog <", value, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogLessThanOrEqualTo(Integer value) {
            addCriterion("alog <=", value, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogIn(List<Integer> values) {
            addCriterion("alog in", values, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogNotIn(List<Integer> values) {
            addCriterion("alog not in", values, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogBetween(Integer value1, Integer value2) {
            addCriterion("alog between", value1, value2, "alog");
            return (Criteria) this;
        }

        public Criteria andAlogNotBetween(Integer value1, Integer value2) {
            addCriterion("alog not between", value1, value2, "alog");
            return (Criteria) this;
        }

        public Criteria andRestamountIsNull() {
            addCriterion("restAmount is null");
            return (Criteria) this;
        }

        public Criteria andRestamountIsNotNull() {
            addCriterion("restAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRestamountEqualTo(Float value) {
            addCriterion("restAmount =", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountNotEqualTo(Float value) {
            addCriterion("restAmount <>", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountGreaterThan(Float value) {
            addCriterion("restAmount >", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountGreaterThanOrEqualTo(Float value) {
            addCriterion("restAmount >=", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountLessThan(Float value) {
            addCriterion("restAmount <", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountLessThanOrEqualTo(Float value) {
            addCriterion("restAmount <=", value, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountIn(List<Float> values) {
            addCriterion("restAmount in", values, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountNotIn(List<Float> values) {
            addCriterion("restAmount not in", values, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountBetween(Float value1, Float value2) {
            addCriterion("restAmount between", value1, value2, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestamountNotBetween(Float value1, Float value2) {
            addCriterion("restAmount not between", value1, value2, "restamount");
            return (Criteria) this;
        }

        public Criteria andRestinterestIsNull() {
            addCriterion("restInterest is null");
            return (Criteria) this;
        }

        public Criteria andRestinterestIsNotNull() {
            addCriterion("restInterest is not null");
            return (Criteria) this;
        }

        public Criteria andRestinterestEqualTo(Float value) {
            addCriterion("restInterest =", value, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestNotEqualTo(Float value) {
            addCriterion("restInterest <>", value, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestGreaterThan(Float value) {
            addCriterion("restInterest >", value, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestGreaterThanOrEqualTo(Float value) {
            addCriterion("restInterest >=", value, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestLessThan(Float value) {
            addCriterion("restInterest <", value, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestLessThanOrEqualTo(Float value) {
            addCriterion("restInterest <=", value, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestIn(List<Float> values) {
            addCriterion("restInterest in", values, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestNotIn(List<Float> values) {
            addCriterion("restInterest not in", values, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestBetween(Float value1, Float value2) {
            addCriterion("restInterest between", value1, value2, "restinterest");
            return (Criteria) this;
        }

        public Criteria andRestinterestNotBetween(Float value1, Float value2) {
            addCriterion("restInterest not between", value1, value2, "restinterest");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Boolean value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Boolean value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Boolean value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Boolean value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Boolean value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Boolean> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Boolean> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Boolean value1, Boolean value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andSummaryflagIsNull() {
            addCriterion("summaryflag is null");
            return (Criteria) this;
        }

        public Criteria andSummaryflagIsNotNull() {
            addCriterion("summaryflag is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryflagEqualTo(Boolean value) {
            addCriterion("summaryflag =", value, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagNotEqualTo(Boolean value) {
            addCriterion("summaryflag <>", value, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagGreaterThan(Boolean value) {
            addCriterion("summaryflag >", value, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("summaryflag >=", value, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagLessThan(Boolean value) {
            addCriterion("summaryflag <", value, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagLessThanOrEqualTo(Boolean value) {
            addCriterion("summaryflag <=", value, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagIn(List<Boolean> values) {
            addCriterion("summaryflag in", values, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagNotIn(List<Boolean> values) {
            addCriterion("summaryflag not in", values, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagBetween(Boolean value1, Boolean value2) {
            addCriterion("summaryflag between", value1, value2, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSummaryflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("summaryflag not between", value1, value2, "summaryflag");
            return (Criteria) this;
        }

        public Criteria andSeatProvidIsNull() {
            addCriterion("seat_provid is null");
            return (Criteria) this;
        }

        public Criteria andSeatProvidIsNotNull() {
            addCriterion("seat_provid is not null");
            return (Criteria) this;
        }

        public Criteria andSeatProvidEqualTo(Integer value) {
            addCriterion("seat_provid =", value, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidNotEqualTo(Integer value) {
            addCriterion("seat_provid <>", value, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidGreaterThan(Integer value) {
            addCriterion("seat_provid >", value, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_provid >=", value, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidLessThan(Integer value) {
            addCriterion("seat_provid <", value, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidLessThanOrEqualTo(Integer value) {
            addCriterion("seat_provid <=", value, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidIn(List<Integer> values) {
            addCriterion("seat_provid in", values, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidNotIn(List<Integer> values) {
            addCriterion("seat_provid not in", values, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidBetween(Integer value1, Integer value2) {
            addCriterion("seat_provid between", value1, value2, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andSeatProvidNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_provid not between", value1, value2, "seatProvid");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusIsNull() {
            addCriterion("periodStatus is null");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusIsNotNull() {
            addCriterion("periodStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusEqualTo(Integer value) {
            addCriterion("periodStatus =", value, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusNotEqualTo(Integer value) {
            addCriterion("periodStatus <>", value, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusGreaterThan(Integer value) {
            addCriterion("periodStatus >", value, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("periodStatus >=", value, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusLessThan(Integer value) {
            addCriterion("periodStatus <", value, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusLessThanOrEqualTo(Integer value) {
            addCriterion("periodStatus <=", value, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusIn(List<Integer> values) {
            addCriterion("periodStatus in", values, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusNotIn(List<Integer> values) {
            addCriterion("periodStatus not in", values, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusBetween(Integer value1, Integer value2) {
            addCriterion("periodStatus between", value1, value2, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andPeriodstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("periodStatus not between", value1, value2, "periodstatus");
            return (Criteria) this;
        }

        public Criteria andSchproidIsNull() {
            addCriterion("schProId is null");
            return (Criteria) this;
        }

        public Criteria andSchproidIsNotNull() {
            addCriterion("schProId is not null");
            return (Criteria) this;
        }

        public Criteria andSchproidEqualTo(Integer value) {
            addCriterion("schProId =", value, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidNotEqualTo(Integer value) {
            addCriterion("schProId <>", value, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidGreaterThan(Integer value) {
            addCriterion("schProId >", value, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schProId >=", value, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidLessThan(Integer value) {
            addCriterion("schProId <", value, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidLessThanOrEqualTo(Integer value) {
            addCriterion("schProId <=", value, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidIn(List<Integer> values) {
            addCriterion("schProId in", values, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidNotIn(List<Integer> values) {
            addCriterion("schProId not in", values, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidBetween(Integer value1, Integer value2) {
            addCriterion("schProId between", value1, value2, "schproid");
            return (Criteria) this;
        }

        public Criteria andSchproidNotBetween(Integer value1, Integer value2) {
            addCriterion("schProId not between", value1, value2, "schproid");
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