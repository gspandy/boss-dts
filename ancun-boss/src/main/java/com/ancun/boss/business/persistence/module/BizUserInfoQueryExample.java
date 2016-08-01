package com.ancun.boss.business.persistence.module;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizUserInfoQueryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    public BizUserInfoQueryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
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
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
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
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_INFO_QUERY
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
     * This class corresponds to the database table BIZ_USER_INFO_QUERY
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNull() {
            addCriterion("BIZ_NO is null");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNotNull() {
            addCriterion("BIZ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBizNoEqualTo(String value) {
            addCriterion("BIZ_NO =", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotEqualTo(String value) {
            addCriterion("BIZ_NO <>", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThan(String value) {
            addCriterion("BIZ_NO >", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_NO >=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThan(String value) {
            addCriterion("BIZ_NO <", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThanOrEqualTo(String value) {
            addCriterion("BIZ_NO <=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLike(String value) {
            addCriterion("BIZ_NO like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotLike(String value) {
            addCriterion("BIZ_NO not like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoIn(List<String> values) {
            addCriterion("BIZ_NO in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotIn(List<String> values) {
            addCriterion("BIZ_NO not in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoBetween(String value1, String value2) {
            addCriterion("BIZ_NO between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotBetween(String value1, String value2) {
            addCriterion("BIZ_NO not between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceIsNull() {
            addCriterion("CALLER_VOICE is null");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceIsNotNull() {
            addCriterion("CALLER_VOICE is not null");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceEqualTo(String value) {
            addCriterion("CALLER_VOICE =", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceNotEqualTo(String value) {
            addCriterion("CALLER_VOICE <>", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceGreaterThan(String value) {
            addCriterion("CALLER_VOICE >", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("CALLER_VOICE >=", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceLessThan(String value) {
            addCriterion("CALLER_VOICE <", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceLessThanOrEqualTo(String value) {
            addCriterion("CALLER_VOICE <=", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceLike(String value) {
            addCriterion("CALLER_VOICE like", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceNotLike(String value) {
            addCriterion("CALLER_VOICE not like", value, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceIn(List<String> values) {
            addCriterion("CALLER_VOICE in", values, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceNotIn(List<String> values) {
            addCriterion("CALLER_VOICE not in", values, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceBetween(String value1, String value2) {
            addCriterion("CALLER_VOICE between", value1, value2, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCallerVoiceNotBetween(String value1, String value2) {
            addCriterion("CALLER_VOICE not between", value1, value2, "callerVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceIsNull() {
            addCriterion("CALLED_VOICE is null");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceIsNotNull() {
            addCriterion("CALLED_VOICE is not null");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceEqualTo(String value) {
            addCriterion("CALLED_VOICE =", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceNotEqualTo(String value) {
            addCriterion("CALLED_VOICE <>", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceGreaterThan(String value) {
            addCriterion("CALLED_VOICE >", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("CALLED_VOICE >=", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceLessThan(String value) {
            addCriterion("CALLED_VOICE <", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceLessThanOrEqualTo(String value) {
            addCriterion("CALLED_VOICE <=", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceLike(String value) {
            addCriterion("CALLED_VOICE like", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceNotLike(String value) {
            addCriterion("CALLED_VOICE not like", value, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceIn(List<String> values) {
            addCriterion("CALLED_VOICE in", values, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceNotIn(List<String> values) {
            addCriterion("CALLED_VOICE not in", values, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceBetween(String value1, String value2) {
            addCriterion("CALLED_VOICE between", value1, value2, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCalledVoiceNotBetween(String value1, String value2) {
            addCriterion("CALLED_VOICE not between", value1, value2, "calledVoice");
            return (Criteria) this;
        }

        public Criteria andCallerRecordIsNull() {
            addCriterion("CALLER_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andCallerRecordIsNotNull() {
            addCriterion("CALLER_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andCallerRecordEqualTo(String value) {
            addCriterion("CALLER_RECORD =", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordNotEqualTo(String value) {
            addCriterion("CALLER_RECORD <>", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordGreaterThan(String value) {
            addCriterion("CALLER_RECORD >", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordGreaterThanOrEqualTo(String value) {
            addCriterion("CALLER_RECORD >=", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordLessThan(String value) {
            addCriterion("CALLER_RECORD <", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordLessThanOrEqualTo(String value) {
            addCriterion("CALLER_RECORD <=", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordLike(String value) {
            addCriterion("CALLER_RECORD like", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordNotLike(String value) {
            addCriterion("CALLER_RECORD not like", value, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordIn(List<String> values) {
            addCriterion("CALLER_RECORD in", values, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordNotIn(List<String> values) {
            addCriterion("CALLER_RECORD not in", values, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordBetween(String value1, String value2) {
            addCriterion("CALLER_RECORD between", value1, value2, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCallerRecordNotBetween(String value1, String value2) {
            addCriterion("CALLER_RECORD not between", value1, value2, "callerRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordIsNull() {
            addCriterion("CALLED_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andCalledRecordIsNotNull() {
            addCriterion("CALLED_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andCalledRecordEqualTo(String value) {
            addCriterion("CALLED_RECORD =", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordNotEqualTo(String value) {
            addCriterion("CALLED_RECORD <>", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordGreaterThan(String value) {
            addCriterion("CALLED_RECORD >", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordGreaterThanOrEqualTo(String value) {
            addCriterion("CALLED_RECORD >=", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordLessThan(String value) {
            addCriterion("CALLED_RECORD <", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordLessThanOrEqualTo(String value) {
            addCriterion("CALLED_RECORD <=", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordLike(String value) {
            addCriterion("CALLED_RECORD like", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordNotLike(String value) {
            addCriterion("CALLED_RECORD not like", value, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordIn(List<String> values) {
            addCriterion("CALLED_RECORD in", values, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordNotIn(List<String> values) {
            addCriterion("CALLED_RECORD not in", values, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordBetween(String value1, String value2) {
            addCriterion("CALLED_RECORD between", value1, value2, "calledRecord");
            return (Criteria) this;
        }

        public Criteria andCalledRecordNotBetween(String value1, String value2) {
            addCriterion("CALLED_RECORD not between", value1, value2, "calledRecord");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BIZ_USER_INFO_QUERY
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
     * This class corresponds to the database table BIZ_USER_INFO_QUERY
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