package com.ancun.boss.persistence.model;

public class ImportFailedRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMPORT_FAILED_RECORD.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMPORT_FAILED_RECORD.MENUNO
     *
     * @mbggenerated
     */
    private String menuno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMPORT_FAILED_RECORD.MENUNAME
     *
     * @mbggenerated
     */
    private String menuname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMPORT_FAILED_RECORD.FUNCNAME
     *
     * @mbggenerated
     */
    private String funcname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMPORT_FAILED_RECORD.IMPORT_TIME
     *
     * @mbggenerated
     */
    private String importTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMPORT_FAILED_RECORD.FAILED_REMARK
     *
     * @mbggenerated
     */
    private String failedRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IMPORT_FAILED_RECORD.USERNO
     *
     * @mbggenerated
     */
    private String userno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMPORT_FAILED_RECORD.ID
     *
     * @return the value of IMPORT_FAILED_RECORD.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMPORT_FAILED_RECORD.ID
     *
     * @param id the value for IMPORT_FAILED_RECORD.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMPORT_FAILED_RECORD.MENUNO
     *
     * @return the value of IMPORT_FAILED_RECORD.MENUNO
     *
     * @mbggenerated
     */
    public String getMenuno() {
        return menuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMPORT_FAILED_RECORD.MENUNO
     *
     * @param menuno the value for IMPORT_FAILED_RECORD.MENUNO
     *
     * @mbggenerated
     */
    public void setMenuno(String menuno) {
        this.menuno = menuno == null ? null : menuno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMPORT_FAILED_RECORD.MENUNAME
     *
     * @return the value of IMPORT_FAILED_RECORD.MENUNAME
     *
     * @mbggenerated
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMPORT_FAILED_RECORD.MENUNAME
     *
     * @param menuname the value for IMPORT_FAILED_RECORD.MENUNAME
     *
     * @mbggenerated
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMPORT_FAILED_RECORD.FUNCNAME
     *
     * @return the value of IMPORT_FAILED_RECORD.FUNCNAME
     *
     * @mbggenerated
     */
    public String getFuncname() {
        return funcname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMPORT_FAILED_RECORD.FUNCNAME
     *
     * @param funcname the value for IMPORT_FAILED_RECORD.FUNCNAME
     *
     * @mbggenerated
     */
    public void setFuncname(String funcname) {
        this.funcname = funcname == null ? null : funcname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMPORT_FAILED_RECORD.IMPORT_TIME
     *
     * @return the value of IMPORT_FAILED_RECORD.IMPORT_TIME
     *
     * @mbggenerated
     */
    public String getImportTime() {
        return importTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMPORT_FAILED_RECORD.IMPORT_TIME
     *
     * @param importTime the value for IMPORT_FAILED_RECORD.IMPORT_TIME
     *
     * @mbggenerated
     */
    public void setImportTime(String importTime) {
        this.importTime = importTime == null ? null : importTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMPORT_FAILED_RECORD.FAILED_REMARK
     *
     * @return the value of IMPORT_FAILED_RECORD.FAILED_REMARK
     *
     * @mbggenerated
     */
    public String getFailedRemark() {
        return failedRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMPORT_FAILED_RECORD.FAILED_REMARK
     *
     * @param failedRemark the value for IMPORT_FAILED_RECORD.FAILED_REMARK
     *
     * @mbggenerated
     */
    public void setFailedRemark(String failedRemark) {
        this.failedRemark = failedRemark == null ? null : failedRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IMPORT_FAILED_RECORD.USERNO
     *
     * @return the value of IMPORT_FAILED_RECORD.USERNO
     *
     * @mbggenerated
     */
    public String getUserno() {
        return userno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IMPORT_FAILED_RECORD.USERNO
     *
     * @param userno the value for IMPORT_FAILED_RECORD.USERNO
     *
     * @mbggenerated
     */
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }
}