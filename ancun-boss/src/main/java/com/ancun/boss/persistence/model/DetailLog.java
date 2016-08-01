package com.ancun.boss.persistence.model;

import java.util.Date;

public class DetailLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETAIL_LOG.USERNO
     *
     * @mbggenerated
     */
    private String userno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETAIL_LOG.USERNAME
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETAIL_LOG.DEALTIME
     *
     * @mbggenerated
     */
    private Date dealtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETAIL_LOG.CONTENT
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETAIL_LOG.RESULTCODE
     *
     * @mbggenerated
     */
    private String resultcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETAIL_LOG.RESULTREMARK
     *
     * @mbggenerated
     */
    private String resultremark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETAIL_LOG.USERNO
     *
     * @return the value of DETAIL_LOG.USERNO
     *
     * @mbggenerated
     */
    public String getUserno() {
        return userno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETAIL_LOG.USERNO
     *
     * @param userno the value for DETAIL_LOG.USERNO
     *
     * @mbggenerated
     */
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETAIL_LOG.USERNAME
     *
     * @return the value of DETAIL_LOG.USERNAME
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETAIL_LOG.USERNAME
     *
     * @param username the value for DETAIL_LOG.USERNAME
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETAIL_LOG.DEALTIME
     *
     * @return the value of DETAIL_LOG.DEALTIME
     *
     * @mbggenerated
     */
    public Date getDealtime() {
        return dealtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETAIL_LOG.DEALTIME
     *
     * @param dealtime the value for DETAIL_LOG.DEALTIME
     *
     * @mbggenerated
     */
    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETAIL_LOG.CONTENT
     *
     * @return the value of DETAIL_LOG.CONTENT
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETAIL_LOG.CONTENT
     *
     * @param content the value for DETAIL_LOG.CONTENT
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETAIL_LOG.RESULTCODE
     *
     * @return the value of DETAIL_LOG.RESULTCODE
     *
     * @mbggenerated
     */
    public String getResultcode() {
        return resultcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETAIL_LOG.RESULTCODE
     *
     * @param resultcode the value for DETAIL_LOG.RESULTCODE
     *
     * @mbggenerated
     */
    public void setResultcode(String resultcode) {
        this.resultcode = resultcode == null ? null : resultcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETAIL_LOG.RESULTREMARK
     *
     * @return the value of DETAIL_LOG.RESULTREMARK
     *
     * @mbggenerated
     */
    public String getResultremark() {
        return resultremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETAIL_LOG.RESULTREMARK
     *
     * @param resultremark the value for DETAIL_LOG.RESULTREMARK
     *
     * @mbggenerated
     */
    public void setResultremark(String resultremark) {
        this.resultremark = resultremark == null ? null : resultremark.trim();
    }
}