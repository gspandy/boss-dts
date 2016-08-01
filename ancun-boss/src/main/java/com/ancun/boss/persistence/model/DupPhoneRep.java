package com.ancun.boss.persistence.model;

import java.util.Date;

public class DupPhoneRep {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DUP_PHONE_REP.PHONE
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DUP_PHONE_REP.GET_TIME
     *
     * @mbggenerated
     */
    private Date getTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DUP_PHONE_REP.MATCH_TIME
     *
     * @mbggenerated
     */
    private Date matchTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DUP_PHONE_REP.PHONE_SOURCE
     *
     * @mbggenerated
     */
    private String phoneSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DUP_PHONE_REP.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DUP_PHONE_REP.PHONE
     *
     * @return the value of DUP_PHONE_REP.PHONE
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DUP_PHONE_REP.PHONE
     *
     * @param phone the value for DUP_PHONE_REP.PHONE
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DUP_PHONE_REP.GET_TIME
     *
     * @return the value of DUP_PHONE_REP.GET_TIME
     *
     * @mbggenerated
     */
    public Date getGetTime() {
        return getTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DUP_PHONE_REP.GET_TIME
     *
     * @param getTime the value for DUP_PHONE_REP.GET_TIME
     *
     * @mbggenerated
     */
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DUP_PHONE_REP.MATCH_TIME
     *
     * @return the value of DUP_PHONE_REP.MATCH_TIME
     *
     * @mbggenerated
     */
    public Date getMatchTime() {
        return matchTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DUP_PHONE_REP.MATCH_TIME
     *
     * @param matchTime the value for DUP_PHONE_REP.MATCH_TIME
     *
     * @mbggenerated
     */
    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DUP_PHONE_REP.PHONE_SOURCE
     *
     * @return the value of DUP_PHONE_REP.PHONE_SOURCE
     *
     * @mbggenerated
     */
    public String getPhoneSource() {
        return phoneSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DUP_PHONE_REP.PHONE_SOURCE
     *
     * @param phoneSource the value for DUP_PHONE_REP.PHONE_SOURCE
     *
     * @mbggenerated
     */
    public void setPhoneSource(String phoneSource) {
        this.phoneSource = phoneSource == null ? null : phoneSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DUP_PHONE_REP.REMARK
     *
     * @return the value of DUP_PHONE_REP.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DUP_PHONE_REP.REMARK
     *
     * @param remark the value for DUP_PHONE_REP.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}