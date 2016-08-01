package com.ancun.boss.persistence.model;

import com.ancun.boss.pojo.BossBasePojo;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("roleinfo")
public class SystemRoleInfo extends BossBasePojo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_ROLE_INFO.ROLENO
     *
     * @mbggenerated
     */
    private String roleno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_ROLE_INFO.ROLENAME
     *
     * @mbggenerated
     */
    private String rolename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_ROLE_INFO.SUPERMAN
     *
     * @mbggenerated
     */
    private String superman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_ROLE_INFO.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_ROLE_INFO.DELETED
     *
     * @mbggenerated
     */
    private String deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_ROLE_INFO.SPELL
     *
     * @mbggenerated
     */
    private String spell;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_ROLE_INFO.ROLENO
     *
     * @return the value of SYSTEM_ROLE_INFO.ROLENO
     *
     * @mbggenerated
     */
    public String getRoleno() {
        return roleno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_ROLE_INFO.ROLENO
     *
     * @param roleno the value for SYSTEM_ROLE_INFO.ROLENO
     *
     * @mbggenerated
     */
    public void setRoleno(String roleno) {
        this.roleno = roleno == null ? null : roleno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_ROLE_INFO.ROLENAME
     *
     * @return the value of SYSTEM_ROLE_INFO.ROLENAME
     *
     * @mbggenerated
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_ROLE_INFO.ROLENAME
     *
     * @param rolename the value for SYSTEM_ROLE_INFO.ROLENAME
     *
     * @mbggenerated
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_ROLE_INFO.SUPERMAN
     *
     * @return the value of SYSTEM_ROLE_INFO.SUPERMAN
     *
     * @mbggenerated
     */
    public String getSuperman() {
        return superman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_ROLE_INFO.SUPERMAN
     *
     * @param superman the value for SYSTEM_ROLE_INFO.SUPERMAN
     *
     * @mbggenerated
     */
    public void setSuperman(String superman) {
        this.superman = superman == null ? null : superman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_ROLE_INFO.REMARK
     *
     * @return the value of SYSTEM_ROLE_INFO.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_ROLE_INFO.REMARK
     *
     * @param remark the value for SYSTEM_ROLE_INFO.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_ROLE_INFO.DELETED
     *
     * @return the value of SYSTEM_ROLE_INFO.DELETED
     *
     * @mbggenerated
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_ROLE_INFO.DELETED
     *
     * @param deleted the value for SYSTEM_ROLE_INFO.DELETED
     *
     * @mbggenerated
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_ROLE_INFO.SPELL
     *
     * @return the value of SYSTEM_ROLE_INFO.SPELL
     *
     * @mbggenerated
     */
    public String getSpell() {
        return spell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_ROLE_INFO.SPELL
     *
     * @param spell the value for SYSTEM_ROLE_INFO.SPELL
     *
     * @mbggenerated
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }


//    --------------------------------------add by mif -------------------------------
    /**
     * 格式菜单权限_功能权限 多个 ','隔开
     */
    private String menunos;

    public String getMenunos() {
        return menunos;
    }

    public void setMenunos(String menunos) {
        this.menunos = menunos;
    }

    /**
     * 是否已选中
     */
    public boolean ischecked;

    public boolean ischecked() {
        return ischecked;
    }

    public void setIschecked(boolean ischecked) {
        this.ischecked = ischecked;
    }
}