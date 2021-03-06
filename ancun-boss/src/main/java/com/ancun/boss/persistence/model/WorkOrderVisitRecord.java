package com.ancun.boss.persistence.model;

import java.util.Date;

public class WorkOrderVisitRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WORK_ORDER_VISIT_RECORD.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WORK_ORDER_VISIT_RECORD.ORDERNO
     *
     * @mbggenerated
     */
    private String orderno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WORK_ORDER_VISIT_RECORD.VISITOR_NAME
     *
     * @mbggenerated
     */
    private String visitorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WORK_ORDER_VISIT_RECORD.VISIT_TIME
     *
     * @mbggenerated
     */
    private Date visitTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WORK_ORDER_VISIT_RECORD.VISIT_CONTENT
     *
     * @mbggenerated
     */
    private String visitContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WORK_ORDER_VISIT_RECORD.ID
     *
     * @return the value of WORK_ORDER_VISIT_RECORD.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WORK_ORDER_VISIT_RECORD.ID
     *
     * @param id the value for WORK_ORDER_VISIT_RECORD.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WORK_ORDER_VISIT_RECORD.ORDERNO
     *
     * @return the value of WORK_ORDER_VISIT_RECORD.ORDERNO
     *
     * @mbggenerated
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WORK_ORDER_VISIT_RECORD.ORDERNO
     *
     * @param orderno the value for WORK_ORDER_VISIT_RECORD.ORDERNO
     *
     * @mbggenerated
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WORK_ORDER_VISIT_RECORD.VISITOR_NAME
     *
     * @return the value of WORK_ORDER_VISIT_RECORD.VISITOR_NAME
     *
     * @mbggenerated
     */
    public String getVisitorName() {
        return visitorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WORK_ORDER_VISIT_RECORD.VISITOR_NAME
     *
     * @param visitorName the value for WORK_ORDER_VISIT_RECORD.VISITOR_NAME
     *
     * @mbggenerated
     */
    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName == null ? null : visitorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WORK_ORDER_VISIT_RECORD.VISIT_TIME
     *
     * @return the value of WORK_ORDER_VISIT_RECORD.VISIT_TIME
     *
     * @mbggenerated
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WORK_ORDER_VISIT_RECORD.VISIT_TIME
     *
     * @param visitTime the value for WORK_ORDER_VISIT_RECORD.VISIT_TIME
     *
     * @mbggenerated
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WORK_ORDER_VISIT_RECORD.VISIT_CONTENT
     *
     * @return the value of WORK_ORDER_VISIT_RECORD.VISIT_CONTENT
     *
     * @mbggenerated
     */
    public String getVisitContent() {
        return visitContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WORK_ORDER_VISIT_RECORD.VISIT_CONTENT
     *
     * @param visitContent the value for WORK_ORDER_VISIT_RECORD.VISIT_CONTENT
     *
     * @mbggenerated
     */
    public void setVisitContent(String visitContent) {
        this.visitContent = visitContent == null ? null : visitContent.trim();
    }
}