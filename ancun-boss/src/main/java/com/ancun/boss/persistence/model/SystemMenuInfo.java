package com.ancun.boss.persistence.model;

import com.ancun.boss.pojo.BossBasePojo;
import com.ancun.core.domain.request.PageModel;

import java.util.List;

public class SystemMenuInfo extends BossBasePojo {
	/**表示定制树。服务程序计算专用字段，数据库没有*/
	private boolean  isCustomization;
	
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.MENUNO
     *
     * @mbggenerated
     */
    private String menuno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.MENUNAME
     *
     * @mbggenerated
     */
    private String menuname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.PMENUINFO
     *
     * @mbggenerated
     */
    private String pmenuinfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.MENUURL
     *
     * @mbggenerated
     */
    private String menuurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.MODULE
     *
     * @mbggenerated
     */
    private String module;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.DELETED
     *
     * @mbggenerated
     */
    private String deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.SPELL
     *
     * @mbggenerated
     */
    private String spell;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.ORDERED
     *
     * @mbggenerated
     */
    private Long ordered;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.MAXLEAF
     *
     * @mbggenerated
     */
    private Long maxleaf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_MENU_INFO.LEVELED
     *
     * @mbggenerated
     */
    private Long leveled;
    
    private String isRoot;
    
    private String isLeaf;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.MENUNO
     *
     * @return the value of SYSTEM_MENU_INFO.MENUNO
     *
     * @mbggenerated
     */
    public String getMenuno() {
        return menuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.MENUNO
     *
     * @param menuno the value for SYSTEM_MENU_INFO.MENUNO
     *
     * @mbggenerated
     */
    public void setMenuno(String menuno) {
        this.menuno = menuno == null ? null : menuno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.MENUNAME
     *
     * @return the value of SYSTEM_MENU_INFO.MENUNAME
     *
     * @mbggenerated
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.MENUNAME
     *
     * @param menuname the value for SYSTEM_MENU_INFO.MENUNAME
     *
     * @mbggenerated
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.PMENUINFO
     *
     * @return the value of SYSTEM_MENU_INFO.PMENUINFO
     *
     * @mbggenerated
     */
    public String getPmenuinfo() {
        return pmenuinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.PMENUINFO
     *
     * @param pmenuinfo the value for SYSTEM_MENU_INFO.PMENUINFO
     *
     * @mbggenerated
     */
    public void setPmenuinfo(String pmenuinfo) {
        this.pmenuinfo = pmenuinfo == null ? null : pmenuinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.MENUURL
     *
     * @return the value of SYSTEM_MENU_INFO.MENUURL
     *
     * @mbggenerated
     */
    public String getMenuurl() {
        return menuurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.MENUURL
     *
     * @param menuurl the value for SYSTEM_MENU_INFO.MENUURL
     *
     * @mbggenerated
     */
    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.MODULE
     *
     * @return the value of SYSTEM_MENU_INFO.MODULE
     *
     * @mbggenerated
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.MODULE
     *
     * @param module the value for SYSTEM_MENU_INFO.MODULE
     *
     * @mbggenerated
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.REMARK
     *
     * @return the value of SYSTEM_MENU_INFO.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.REMARK
     *
     * @param remark the value for SYSTEM_MENU_INFO.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.DELETED
     *
     * @return the value of SYSTEM_MENU_INFO.DELETED
     *
     * @mbggenerated
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.DELETED
     *
     * @param deleted the value for SYSTEM_MENU_INFO.DELETED
     *
     * @mbggenerated
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.SPELL
     *
     * @return the value of SYSTEM_MENU_INFO.SPELL
     *
     * @mbggenerated
     */
    public String getSpell() {
        return spell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.SPELL
     *
     * @param spell the value for SYSTEM_MENU_INFO.SPELL
     *
     * @mbggenerated
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.ORDERED
     *
     * @return the value of SYSTEM_MENU_INFO.ORDERED
     *
     * @mbggenerated
     */
    public Long getOrdered() {
        return ordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.ORDERED
     *
     * @param ordered the value for SYSTEM_MENU_INFO.ORDERED
     *
     * @mbggenerated
     */
    public void setOrdered(Long ordered) {
        this.ordered = ordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.MAXLEAF
     *
     * @return the value of SYSTEM_MENU_INFO.MAXLEAF
     *
     * @mbggenerated
     */
    public Long getMaxleaf() {
        return maxleaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.MAXLEAF
     *
     * @param maxleaf the value for SYSTEM_MENU_INFO.MAXLEAF
     *
     * @mbggenerated
     */
    public void setMaxleaf(Long maxleaf) {
        this.maxleaf = maxleaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_MENU_INFO.LEVELED
     *
     * @return the value of SYSTEM_MENU_INFO.LEVELED
     *
     * @mbggenerated
     */
    public Long getLeveled() {
        return leveled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_MENU_INFO.LEVELED
     *
     * @param leveled the value for SYSTEM_MENU_INFO.LEVELED
     *
     * @mbggenerated
     */
    public void setLeveled(Long leveled) {
        this.leveled = leveled;
    }

	public String getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(String isRoot) {
		this.isRoot = isRoot;
	}

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	public boolean getCustomization() {
		return isCustomization;
	}

	public void setCustomization(boolean isCustomization) {
		this.isCustomization = isCustomization;
	}

//    -------------------- add by mif ------------------
    /**
     * 子权限
     */
    private List<SystemMenuInfo> submenulist;

    /**
     * 功能权限
     */
    private List<FunctionInfo> functioninfolist;

    public List<SystemMenuInfo> getSubmenulist() {
        return submenulist;
    }

    public void setSubmenulist(List<SystemMenuInfo> submenulist) {
        this.submenulist = submenulist;
    }

    public List<FunctionInfo> getFunctioninfolist() {
        return functioninfolist;
    }

    public void setFunctioninfolist(List<FunctionInfo> functioninfolist) {
        this.functioninfolist = functioninfolist;
    }

    /**
     * 是否已选中
     */
    private boolean ischecked;

    public boolean ischecked() {
        return ischecked;
    }

    public void setIschecked(boolean ischecked) {
        this.ischecked = ischecked;
    }
}