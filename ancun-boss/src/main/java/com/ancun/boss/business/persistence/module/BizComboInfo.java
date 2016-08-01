package com.ancun.boss.business.persistence.module;

import java.math.BigDecimal;
import java.util.Date;

public class BizComboInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.TCID
     *
     * @mbggenerated
     */
    private Long tcid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.PRICE
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.FINISH_TIME
     *
     * @mbggenerated
     */
    private Date finishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.SPACE
     *
     * @mbggenerated
     */
    private Long space;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.BIZ_NO
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.DURATION
     *
     * @mbggenerated
     */
    private String duration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.CATEGORY
     *
     * @mbggenerated
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.DEFAULT_TAOCAN
     *
     * @mbggenerated
     */
    private String defaultTaocan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIZ_COMBO_INFO.RPCODE
     *
     * @mbggenerated
     */
    private String rpcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.ID
     *
     * @return the value of BIZ_COMBO_INFO.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.ID
     *
     * @param id the value for BIZ_COMBO_INFO.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.TCID
     *
     * @return the value of BIZ_COMBO_INFO.TCID
     *
     * @mbggenerated
     */
    public Long getTcid() {
        return tcid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.TCID
     *
     * @param tcid the value for BIZ_COMBO_INFO.TCID
     *
     * @mbggenerated
     */
    public void setTcid(Long tcid) {
        this.tcid = tcid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.NAME
     *
     * @return the value of BIZ_COMBO_INFO.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.NAME
     *
     * @param name the value for BIZ_COMBO_INFO.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.PRICE
     *
     * @return the value of BIZ_COMBO_INFO.PRICE
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.PRICE
     *
     * @param price the value for BIZ_COMBO_INFO.PRICE
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.TYPE
     *
     * @return the value of BIZ_COMBO_INFO.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.TYPE
     *
     * @param type the value for BIZ_COMBO_INFO.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.CREATE_TIME
     *
     * @return the value of BIZ_COMBO_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.CREATE_TIME
     *
     * @param createTime the value for BIZ_COMBO_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.FINISH_TIME
     *
     * @return the value of BIZ_COMBO_INFO.FINISH_TIME
     *
     * @mbggenerated
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.FINISH_TIME
     *
     * @param finishTime the value for BIZ_COMBO_INFO.FINISH_TIME
     *
     * @mbggenerated
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.SPACE
     *
     * @return the value of BIZ_COMBO_INFO.SPACE
     *
     * @mbggenerated
     */
    public Long getSpace() {
        return space;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.SPACE
     *
     * @param space the value for BIZ_COMBO_INFO.SPACE
     *
     * @mbggenerated
     */
    public void setSpace(Long space) {
        this.space = space;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.BIZ_NO
     *
     * @return the value of BIZ_COMBO_INFO.BIZ_NO
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.BIZ_NO
     *
     * @param bizNo the value for BIZ_COMBO_INFO.BIZ_NO
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.STATUS
     *
     * @return the value of BIZ_COMBO_INFO.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.STATUS
     *
     * @param status the value for BIZ_COMBO_INFO.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.REMARK
     *
     * @return the value of BIZ_COMBO_INFO.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.REMARK
     *
     * @param remark the value for BIZ_COMBO_INFO.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.DURATION
     *
     * @return the value of BIZ_COMBO_INFO.DURATION
     *
     * @mbggenerated
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.DURATION
     *
     * @param duration the value for BIZ_COMBO_INFO.DURATION
     *
     * @mbggenerated
     */
    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.CATEGORY
     *
     * @return the value of BIZ_COMBO_INFO.CATEGORY
     *
     * @mbggenerated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.CATEGORY
     *
     * @param category the value for BIZ_COMBO_INFO.CATEGORY
     *
     * @mbggenerated
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.DEFAULT_TAOCAN
     *
     * @return the value of BIZ_COMBO_INFO.DEFAULT_TAOCAN
     *
     * @mbggenerated
     */
    public String getDefaultTaocan() {
        return defaultTaocan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.DEFAULT_TAOCAN
     *
     * @param defaultTaocan the value for BIZ_COMBO_INFO.DEFAULT_TAOCAN
     *
     * @mbggenerated
     */
    public void setDefaultTaocan(String defaultTaocan) {
        this.defaultTaocan = defaultTaocan == null ? null : defaultTaocan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIZ_COMBO_INFO.RPCODE
     *
     * @return the value of BIZ_COMBO_INFO.RPCODE
     *
     * @mbggenerated
     */
    public String getRpcode() {
        return rpcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIZ_COMBO_INFO.RPCODE
     *
     * @param rpcode the value for BIZ_COMBO_INFO.RPCODE
     *
     * @mbggenerated
     */
    public void setRpcode(String rpcode) {
        this.rpcode = rpcode == null ? null : rpcode.trim();
    }
}