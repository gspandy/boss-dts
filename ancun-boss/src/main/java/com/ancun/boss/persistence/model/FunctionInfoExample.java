package com.ancun.boss.persistence.model;

import java.util.ArrayList;
import java.util.List;

public class FunctionInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public FunctionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
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

        public Criteria andFucnoIsNull() {
            addCriterion("FUCNO is null");
            return (Criteria) this;
        }

        public Criteria andFucnoIsNotNull() {
            addCriterion("FUCNO is not null");
            return (Criteria) this;
        }

        public Criteria andFucnoEqualTo(String value) {
            addCriterion("FUCNO =", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoNotEqualTo(String value) {
            addCriterion("FUCNO <>", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoGreaterThan(String value) {
            addCriterion("FUCNO >", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoGreaterThanOrEqualTo(String value) {
            addCriterion("FUCNO >=", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoLessThan(String value) {
            addCriterion("FUCNO <", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoLessThanOrEqualTo(String value) {
            addCriterion("FUCNO <=", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoLike(String value) {
            addCriterion("FUCNO like", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoNotLike(String value) {
            addCriterion("FUCNO not like", value, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoIn(List<String> values) {
            addCriterion("FUCNO in", values, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoNotIn(List<String> values) {
            addCriterion("FUCNO not in", values, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoBetween(String value1, String value2) {
            addCriterion("FUCNO between", value1, value2, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnoNotBetween(String value1, String value2) {
            addCriterion("FUCNO not between", value1, value2, "fucno");
            return (Criteria) this;
        }

        public Criteria andFucnameIsNull() {
            addCriterion("FUCNAME is null");
            return (Criteria) this;
        }

        public Criteria andFucnameIsNotNull() {
            addCriterion("FUCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFucnameEqualTo(String value) {
            addCriterion("FUCNAME =", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameNotEqualTo(String value) {
            addCriterion("FUCNAME <>", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameGreaterThan(String value) {
            addCriterion("FUCNAME >", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameGreaterThanOrEqualTo(String value) {
            addCriterion("FUCNAME >=", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameLessThan(String value) {
            addCriterion("FUCNAME <", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameLessThanOrEqualTo(String value) {
            addCriterion("FUCNAME <=", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameLike(String value) {
            addCriterion("FUCNAME like", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameNotLike(String value) {
            addCriterion("FUCNAME not like", value, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameIn(List<String> values) {
            addCriterion("FUCNAME in", values, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameNotIn(List<String> values) {
            addCriterion("FUCNAME not in", values, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameBetween(String value1, String value2) {
            addCriterion("FUCNAME between", value1, value2, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucnameNotBetween(String value1, String value2) {
            addCriterion("FUCNAME not between", value1, value2, "fucname");
            return (Criteria) this;
        }

        public Criteria andFucstyleIsNull() {
            addCriterion("FUCSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andFucstyleIsNotNull() {
            addCriterion("FUCSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andFucstyleEqualTo(String value) {
            addCriterion("FUCSTYLE =", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleNotEqualTo(String value) {
            addCriterion("FUCSTYLE <>", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleGreaterThan(String value) {
            addCriterion("FUCSTYLE >", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleGreaterThanOrEqualTo(String value) {
            addCriterion("FUCSTYLE >=", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleLessThan(String value) {
            addCriterion("FUCSTYLE <", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleLessThanOrEqualTo(String value) {
            addCriterion("FUCSTYLE <=", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleLike(String value) {
            addCriterion("FUCSTYLE like", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleNotLike(String value) {
            addCriterion("FUCSTYLE not like", value, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleIn(List<String> values) {
            addCriterion("FUCSTYLE in", values, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleNotIn(List<String> values) {
            addCriterion("FUCSTYLE not in", values, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleBetween(String value1, String value2) {
            addCriterion("FUCSTYLE between", value1, value2, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andFucstyleNotBetween(String value1, String value2) {
            addCriterion("FUCSTYLE not between", value1, value2, "fucstyle");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("DELETED like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("DELETED not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FUNCTION_INFO
     *
     * @mbggenerated
     */
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