package com.ancun.boss.persistence.model;

public class BlackUserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLACK_USER_INFO.PHONE
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLACK_USER_INFO.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLACK_USER_INFO.PHONE
     *
     * @return the value of BLACK_USER_INFO.PHONE
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLACK_USER_INFO.PHONE
     *
     * @param phone the value for BLACK_USER_INFO.PHONE
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLACK_USER_INFO.TYPE
     *
     * @return the value of BLACK_USER_INFO.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLACK_USER_INFO.TYPE
     *
     * @param type the value for BLACK_USER_INFO.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}