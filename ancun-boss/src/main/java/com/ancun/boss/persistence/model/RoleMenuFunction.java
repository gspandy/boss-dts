package com.ancun.boss.persistence.model;

public class RoleMenuFunction {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE_MENU_FUNCTION.ROLENO
     *
     * @mbggenerated
     */
    private String roleno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE_MENU_FUNCTION.MENUNO
     *
     * @mbggenerated
     */
    private String menuno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ROLE_MENU_FUNCTION.FUCNO
     *
     * @mbggenerated
     */
    private String fucno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE_MENU_FUNCTION.ROLENO
     *
     * @return the value of ROLE_MENU_FUNCTION.ROLENO
     *
     * @mbggenerated
     */
    public String getRoleno() {
        return roleno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE_MENU_FUNCTION.ROLENO
     *
     * @param roleno the value for ROLE_MENU_FUNCTION.ROLENO
     *
     * @mbggenerated
     */
    public void setRoleno(String roleno) {
        this.roleno = roleno == null ? null : roleno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE_MENU_FUNCTION.MENUNO
     *
     * @return the value of ROLE_MENU_FUNCTION.MENUNO
     *
     * @mbggenerated
     */
    public String getMenuno() {
        return menuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE_MENU_FUNCTION.MENUNO
     *
     * @param menuno the value for ROLE_MENU_FUNCTION.MENUNO
     *
     * @mbggenerated
     */
    public void setMenuno(String menuno) {
        this.menuno = menuno == null ? null : menuno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ROLE_MENU_FUNCTION.FUCNO
     *
     * @return the value of ROLE_MENU_FUNCTION.FUCNO
     *
     * @mbggenerated
     */
    public String getFucno() {
        return fucno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ROLE_MENU_FUNCTION.FUCNO
     *
     * @param fucno the value for ROLE_MENU_FUNCTION.FUCNO
     *
     * @mbggenerated
     */
    public void setFucno(String fucno) {
        this.fucno = fucno == null ? null : fucno.trim();
    }
}