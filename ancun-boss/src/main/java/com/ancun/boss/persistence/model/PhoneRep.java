package com.ancun.boss.persistence.model;

import java.util.Date;

public class PhoneRep {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHONE_REP.PHONE
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHONE_REP.GET_TIME
     *
     * @mbggenerated
     */
    private Date getTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHONE_REP.PHONE_SOURCE
     *
     * @mbggenerated
     */
    private String phoneSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHONE_REP.FILTER_LEVEL
     *
     * @mbggenerated
     */
    private Long filterLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHONE_REP.FILTER_OVER
     *
     * @mbggenerated
     */
    private String filterOver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHONE_REP.PHONE_STATUS
     *
     * @mbggenerated
     */
    private String phoneStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHONE_REP.PHONE
     *
     * @return the value of PHONE_REP.PHONE
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHONE_REP.PHONE
     *
     * @param phone the value for PHONE_REP.PHONE
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHONE_REP.GET_TIME
     *
     * @return the value of PHONE_REP.GET_TIME
     *
     * @mbggenerated
     */
    public Date getGetTime() {
        return getTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHONE_REP.GET_TIME
     *
     * @param getTime the value for PHONE_REP.GET_TIME
     *
     * @mbggenerated
     */
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHONE_REP.PHONE_SOURCE
     *
     * @return the value of PHONE_REP.PHONE_SOURCE
     *
     * @mbggenerated
     */
    public String getPhoneSource() {
        return phoneSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHONE_REP.PHONE_SOURCE
     *
     * @param phoneSource the value for PHONE_REP.PHONE_SOURCE
     *
     * @mbggenerated
     */
    public void setPhoneSource(String phoneSource) {
        this.phoneSource = phoneSource == null ? null : phoneSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHONE_REP.FILTER_LEVEL
     *
     * @return the value of PHONE_REP.FILTER_LEVEL
     *
     * @mbggenerated
     */
    public Long getFilterLevel() {
        return filterLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHONE_REP.FILTER_LEVEL
     *
     * @param filterLevel the value for PHONE_REP.FILTER_LEVEL
     *
     * @mbggenerated
     */
    public void setFilterLevel(Long filterLevel) {
        this.filterLevel = filterLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHONE_REP.FILTER_OVER
     *
     * @return the value of PHONE_REP.FILTER_OVER
     *
     * @mbggenerated
     */
    public String getFilterOver() {
        return filterOver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHONE_REP.FILTER_OVER
     *
     * @param filterOver the value for PHONE_REP.FILTER_OVER
     *
     * @mbggenerated
     */
    public void setFilterOver(String filterOver) {
        this.filterOver = filterOver == null ? null : filterOver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHONE_REP.PHONE_STATUS
     *
     * @return the value of PHONE_REP.PHONE_STATUS
     *
     * @mbggenerated
     */
    public String getPhoneStatus() {
        return phoneStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHONE_REP.PHONE_STATUS
     *
     * @param phoneStatus the value for PHONE_REP.PHONE_STATUS
     *
     * @mbggenerated
     */
    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus == null ? null : phoneStatus.trim();
    }
}