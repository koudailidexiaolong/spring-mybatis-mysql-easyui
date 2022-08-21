package com.julongtech.system.action.vo;

import java.io.Serializable;

/**
 * 角色菜单映射关系界面交互类
 * @author julong 
 * @date Mon Oct 16 15:08:21 CST 2017
 */
public class SystemRoleMenuMappedVO  implements Serializable{
    /**
	 * @author julong
	 * @date 2017-10-16 下午3:54:57
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 角色菜单关系编号
     */
    private Integer mappedId;

    /** 
     * 角色编号
     */
    private Integer roleId;

    /** 
     * 菜单编号
     */
    private String menuId;

    /** 
     * 组织机构编码
     */
    private String orgId;

    /** 
     * 菜单按钮数组以，区分
     */
    private String mappedMenuArray;

    /** 
     * 角色菜单关系状态:0正常1禁用
     */
    private String mappedStatus;

    /**
     * 菜单数组
     */
    private String menuArray;

    /**
     * 角色菜单关系编号
     * @return  the value of SYSTEM_ROLE_MENU_MAPPED.MAPPED_ID
     */
    public Integer getMappedId() {
        return mappedId;
    }

    /**
     * 角色菜单关系编号
     * @param mappedId the value for SYSTEM_ROLE_MENU_MAPPED.MAPPED_ID
     */
    public void setMappedId(Integer mappedId) {
        this.mappedId = mappedId;
    }

    /**
     * 角色编号
     * @return  the value of SYSTEM_ROLE_MENU_MAPPED.ROLE_ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色编号
     * @param roleId the value for SYSTEM_ROLE_MENU_MAPPED.ROLE_ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 菜单编号
     * @return  the value of SYSTEM_ROLE_MENU_MAPPED.MENU_ID
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 菜单编号
     * @param menuId the value for SYSTEM_ROLE_MENU_MAPPED.MENU_ID
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * 组织机构编码
     * @return  the value of SYSTEM_ROLE_MENU_MAPPED.ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 组织机构编码
     * @param orgId the value for SYSTEM_ROLE_MENU_MAPPED.ORG_ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 菜单按钮数组以，区分
     * @return  the value of SYSTEM_ROLE_MENU_MAPPED.MAPPED_MENU_ARRAY
     */
    public String getMappedMenuArray() {
        return mappedMenuArray;
    }

    /**
     * 菜单按钮数组以，区分
     * @param mappedMenuArray the value for SYSTEM_ROLE_MENU_MAPPED.MAPPED_MENU_ARRAY
     */
    public void setMappedMenuArray(String mappedMenuArray) {
        this.mappedMenuArray = mappedMenuArray == null ? null : mappedMenuArray.trim();
    }


    /**
     * 角色菜单关系状态:0正常1禁用
     * @return  the value of SYSTEM_ROLE_MENU_MAPPED.MAPPED_STATUS
     */
    public String getMappedStatus() {
        return mappedStatus;
    }

    /**
     * 角色菜单关系状态:0正常1禁用
     * @param mappedStatus the value for SYSTEM_ROLE_MENU_MAPPED.MAPPED_STATUS
     */
    public void setMappedStatus(String mappedStatus) {
        this.mappedStatus = mappedStatus == null ? null : mappedStatus.trim();
    }

    
	public String getMenuArray() {
		return menuArray;
	}

	public void setMenuArray(String menuArray) {
		this.menuArray = menuArray == null ? null : menuArray.trim();
	}

	@Override
	public String toString() {
		return "SystemRoleMenuMappedDTO [mappedId=" + mappedId + ", roleId="
				+ roleId + ", menuId=" + menuId + ", orgId=" + orgId
				+ ", mappedMenuArray=" + mappedMenuArray + ", mappedStatus="
				+ mappedStatus + "]";
	}

}