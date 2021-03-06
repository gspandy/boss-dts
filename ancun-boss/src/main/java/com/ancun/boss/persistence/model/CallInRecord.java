package com.ancun.boss.persistence.model;

import java.util.Date;

public class CallInRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.USER_NO
     *
     * @mbggenerated
     */
    private String userNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.USER_NAME
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.CALLTIME
     *
     * @mbggenerated
     */
    private String calltime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.CALLPHONE
     *
     * @mbggenerated
     */
    private String callphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.SEX
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.DURATION
     *
     * @mbggenerated
     */
    private String duration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.BUSINESS
     *
     * @mbggenerated
     */
    private String business;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.QUESTION
     *
     * @mbggenerated
     */
    private String question;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.CALL_BACK
     *
     * @mbggenerated
     */
    private String callBack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.VISIT_SITUATION
     *
     * @mbggenerated
     */
    private String visitSituation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.CALL_TYPE
     *
     * @mbggenerated
     */
    private String callType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.CHECK_ID
     *
     * @mbggenerated
     */
    private Long checkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CALL_IN_RECORD.CANCEL_ID
     *
     * @mbggenerated
     */
    private Long cancelId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.ID
     *
     * @return the value of CALL_IN_RECORD.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.ID
     *
     * @param id the value for CALL_IN_RECORD.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.USER_NO
     *
     * @return the value of CALL_IN_RECORD.USER_NO
     *
     * @mbggenerated
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.USER_NO
     *
     * @param userNo the value for CALL_IN_RECORD.USER_NO
     *
     * @mbggenerated
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.USER_NAME
     *
     * @return the value of CALL_IN_RECORD.USER_NAME
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.USER_NAME
     *
     * @param userName the value for CALL_IN_RECORD.USER_NAME
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.CALLTIME
     *
     * @return the value of CALL_IN_RECORD.CALLTIME
     *
     * @mbggenerated
     */
    public String getCalltime() {
        return calltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.CALLTIME
     *
     * @param calltime the value for CALL_IN_RECORD.CALLTIME
     *
     * @mbggenerated
     */
    public void setCalltime(String calltime) {
        this.calltime = calltime == null ? null : calltime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.CALLPHONE
     *
     * @return the value of CALL_IN_RECORD.CALLPHONE
     *
     * @mbggenerated
     */
    public String getCallphone() {
        return callphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.CALLPHONE
     *
     * @param callphone the value for CALL_IN_RECORD.CALLPHONE
     *
     * @mbggenerated
     */
    public void setCallphone(String callphone) {
        this.callphone = callphone == null ? null : callphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.SEX
     *
     * @return the value of CALL_IN_RECORD.SEX
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.SEX
     *
     * @param sex the value for CALL_IN_RECORD.SEX
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.NAME
     *
     * @return the value of CALL_IN_RECORD.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.NAME
     *
     * @param name the value for CALL_IN_RECORD.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.DURATION
     *
     * @return the value of CALL_IN_RECORD.DURATION
     *
     * @mbggenerated
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.DURATION
     *
     * @param duration the value for CALL_IN_RECORD.DURATION
     *
     * @mbggenerated
     */
    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.BUSINESS
     *
     * @return the value of CALL_IN_RECORD.BUSINESS
     *
     * @mbggenerated
     */
    public String getBusiness() {
        return business;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.BUSINESS
     *
     * @param business the value for CALL_IN_RECORD.BUSINESS
     *
     * @mbggenerated
     */
    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.QUESTION
     *
     * @return the value of CALL_IN_RECORD.QUESTION
     *
     * @mbggenerated
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.QUESTION
     *
     * @param question the value for CALL_IN_RECORD.QUESTION
     *
     * @mbggenerated
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.REMARK
     *
     * @return the value of CALL_IN_RECORD.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.REMARK
     *
     * @param remark the value for CALL_IN_RECORD.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.CALL_BACK
     *
     * @return the value of CALL_IN_RECORD.CALL_BACK
     *
     * @mbggenerated
     */
    public String getCallBack() {
        return callBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.CALL_BACK
     *
     * @param callBack the value for CALL_IN_RECORD.CALL_BACK
     *
     * @mbggenerated
     */
    public void setCallBack(String callBack) {
        this.callBack = callBack == null ? null : callBack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.VISIT_SITUATION
     *
     * @return the value of CALL_IN_RECORD.VISIT_SITUATION
     *
     * @mbggenerated
     */
    public String getVisitSituation() {
        return visitSituation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.VISIT_SITUATION
     *
     * @param visitSituation the value for CALL_IN_RECORD.VISIT_SITUATION
     *
     * @mbggenerated
     */
    public void setVisitSituation(String visitSituation) {
        this.visitSituation = visitSituation == null ? null : visitSituation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.CREATE_TIME
     *
     * @return the value of CALL_IN_RECORD.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.CREATE_TIME
     *
     * @param createTime the value for CALL_IN_RECORD.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.CALL_TYPE
     *
     * @return the value of CALL_IN_RECORD.CALL_TYPE
     *
     * @mbggenerated
     */
    public String getCallType() {
        return callType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.CALL_TYPE
     *
     * @param callType the value for CALL_IN_RECORD.CALL_TYPE
     *
     * @mbggenerated
     */
    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.CHECK_ID
     *
     * @return the value of CALL_IN_RECORD.CHECK_ID
     *
     * @mbggenerated
     */
    public Long getCheckId() {
        return checkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.CHECK_ID
     *
     * @param checkId the value for CALL_IN_RECORD.CHECK_ID
     *
     * @mbggenerated
     */
    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CALL_IN_RECORD.CANCEL_ID
     *
     * @return the value of CALL_IN_RECORD.CANCEL_ID
     *
     * @mbggenerated
     */
    public Long getCancelId() {
        return cancelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CALL_IN_RECORD.CANCEL_ID
     *
     * @param cancelId the value for CALL_IN_RECORD.CANCEL_ID
     *
     * @mbggenerated
     */
    public void setCancelId(Long cancelId) {
        this.cancelId = cancelId;
    }
}