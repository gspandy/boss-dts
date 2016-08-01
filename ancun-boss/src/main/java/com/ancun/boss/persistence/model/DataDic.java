package com.ancun.boss.persistence.model;

public class DataDic {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_DIC.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_DIC.MODULE
     *
     * @mbggenerated
     */
    private String module;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_DIC.CONF_NAME
     *
     * @mbggenerated
     */
    private String confName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_DIC.CONF_VALUE
     *
     * @mbggenerated
     */
    private String confValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATA_DIC.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_DIC.ID
     *
     * @return the value of DATA_DIC.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_DIC.ID
     *
     * @param id the value for DATA_DIC.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_DIC.MODULE
     *
     * @return the value of DATA_DIC.MODULE
     *
     * @mbggenerated
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_DIC.MODULE
     *
     * @param module the value for DATA_DIC.MODULE
     *
     * @mbggenerated
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_DIC.CONF_NAME
     *
     * @return the value of DATA_DIC.CONF_NAME
     *
     * @mbggenerated
     */
    public String getConfName() {
        return confName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_DIC.CONF_NAME
     *
     * @param confName the value for DATA_DIC.CONF_NAME
     *
     * @mbggenerated
     */
    public void setConfName(String confName) {
        this.confName = confName == null ? null : confName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_DIC.CONF_VALUE
     *
     * @return the value of DATA_DIC.CONF_VALUE
     *
     * @mbggenerated
     */
    public String getConfValue() {
        return confValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_DIC.CONF_VALUE
     *
     * @param confValue the value for DATA_DIC.CONF_VALUE
     *
     * @mbggenerated
     */
    public void setConfValue(String confValue) {
        this.confValue = confValue == null ? null : confValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATA_DIC.REMARK
     *
     * @return the value of DATA_DIC.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATA_DIC.REMARK
     *
     * @param remark the value for DATA_DIC.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}