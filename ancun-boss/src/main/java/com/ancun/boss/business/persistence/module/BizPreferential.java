package com.ancun.boss.business.persistence.module;

import java.math.BigDecimal;
import java.util.Date;

public class BizPreferential {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.ACT_NO
     *
     * @mbggenerated
     */
    private String actNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.BIZ_NO
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.ACT_NAME
     *
     * @mbggenerated
     */
    private String actName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.BEGIN_TIME
     *
     * @mbggenerated
     */
    private Date beginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.END_TIME
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.DISCOUNT
     *
     * @mbggenerated
     */
    private String discount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.DISPRICE
     *
     * @mbggenerated
     */
    private BigDecimal disprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_PREFERENTIAL.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.ID
     *
     * @return the value of BIZ_PREFERENTIAL.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.ID
     *
     * @param id the value for BIZ_PREFERENTIAL.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.ACT_NO
     *
     * @return the value of BIZ_PREFERENTIAL.ACT_NO
     *
     * @mbggenerated
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.ACT_NO
     *
     * @param actNo the value for BIZ_PREFERENTIAL.ACT_NO
     *
     * @mbggenerated
     */
    public void setActNo(String actNo) {
        this.actNo = actNo == null ? null : actNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.BIZ_NO
     *
     * @return the value of BIZ_PREFERENTIAL.BIZ_NO
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.BIZ_NO
     *
     * @param bizNo the value for BIZ_PREFERENTIAL.BIZ_NO
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.ACT_NAME
     *
     * @return the value of BIZ_PREFERENTIAL.ACT_NAME
     *
     * @mbggenerated
     */
    public String getActName() {
        return actName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.ACT_NAME
     *
     * @param actName the value for BIZ_PREFERENTIAL.ACT_NAME
     *
     * @mbggenerated
     */
    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.REMARK
     *
     * @return the value of BIZ_PREFERENTIAL.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.REMARK
     *
     * @param remark the value for BIZ_PREFERENTIAL.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.BEGIN_TIME
     *
     * @return the value of BIZ_PREFERENTIAL.BEGIN_TIME
     *
     * @mbggenerated
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.BEGIN_TIME
     *
     * @param beginTime the value for BIZ_PREFERENTIAL.BEGIN_TIME
     *
     * @mbggenerated
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.END_TIME
     *
     * @return the value of BIZ_PREFERENTIAL.END_TIME
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.END_TIME
     *
     * @param endTime the value for BIZ_PREFERENTIAL.END_TIME
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.STATUS
     *
     * @return the value of BIZ_PREFERENTIAL.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.STATUS
     *
     * @param status the value for BIZ_PREFERENTIAL.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.TYPE
     *
     * @return the value of BIZ_PREFERENTIAL.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.TYPE
     *
     * @param type the value for BIZ_PREFERENTIAL.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.DISCOUNT
     *
     * @return the value of BIZ_PREFERENTIAL.DISCOUNT
     *
     * @mbggenerated
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.DISCOUNT
     *
     * @param discount the value for BIZ_PREFERENTIAL.DISCOUNT
     *
     * @mbggenerated
     */
    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.DISPRICE
     *
     * @return the value of BIZ_PREFERENTIAL.DISPRICE
     *
     * @mbggenerated
     */
    public BigDecimal getDisprice() {
        return disprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.DISPRICE
     *
     * @param disprice the value for BIZ_PREFERENTIAL.DISPRICE
     *
     * @mbggenerated
     */
    public void setDisprice(BigDecimal disprice) {
        this.disprice = disprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_PREFERENTIAL.CREATE_TIME
     *
     * @return the value of BIZ_PREFERENTIAL.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_PREFERENTIAL.CREATE_TIME
     *
     * @param createTime the value for BIZ_PREFERENTIAL.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}