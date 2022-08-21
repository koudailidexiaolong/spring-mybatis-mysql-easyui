package com.julongtech.system.action.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 菜单界面交互类
 * @author julong 
 * @date Mon Oct 16 16:12:03 CST 2017
 */
public class SystemMenuVO implements Serializable{
    /**
	 * @author julong
	 * @date 2017-10-16 下午4:12:31
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 菜单编号
     */
    private String menuId;

    /** 
     * 菜单名称
     */
    private String menuName;

    /** 
     * 菜单代码
     */
    private String menuCode;

    /** 
     * 菜单父节点
     */
    private String menuFatherId;

    /** 
     * 菜单顺序
     */
    private BigDecimal menuOrder;

    /** 
     * 菜单状态：0正常1禁用
     */
    private String menuStatus;

    /** 
     * 菜单地址URL
     */
    private String menuUrl;

    /** 
     * 菜单图标
     */
    private String menuIco;

    /** 
     * 是否有子节点
     */
    private String menuLevel;

    /**
     * 菜单编号
     * @return  the value of SYSTEM_MENU.MENU_ID
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 菜单编号
     * @param menuId the value for SYSTEM_MENU.MENU_ID
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * 菜单名称
     * @return  the value of SYSTEM_MENU.MENU_NAME
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     * @param menuName the value for SYSTEM_MENU.MENU_NAME
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 菜单代码
     * @return  the value of SYSTEM_MENU.MENU_CODE
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 菜单代码
     * @param menuCode the value for SYSTEM_MENU.MENU_CODE
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * 菜单父节点
     * @return  the value of SYSTEM_MENU.MENU_FATHER_ID
     */
    public String getMenuFatherId() {
        return menuFatherId;
    }

    /**
     * 菜单父节点
     * @param menuFatherId the value for SYSTEM_MENU.MENU_FATHER_ID
     */
    public void setMenuFatherId(String menuFatherId) {
        this.menuFatherId = menuFatherId == null ? null : menuFatherId.trim();
    }

    /**
     * 菜单顺序
     * @return  the value of SYSTEM_MENU.MENU_ORDER
     */
    public BigDecimal getMenuOrder() {
        return menuOrder;
    }

    /**
     * 菜单顺序
     * @param menuOrder the value for SYSTEM_MENU.MENU_ORDER
     */
    public void setMenuOrder(BigDecimal menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 菜单状态：0正常1禁用
     * @return  the value of SYSTEM_MENU.MENU_STATUS
     */
    public String getMenuStatus() {
        return menuStatus;
    }

    /**
     * 菜单状态：0正常1禁用
     * @param menuStatus the value for SYSTEM_MENU.MENU_STATUS
     */
    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus == null ? null : menuStatus.trim();
    }


    /**
     * 菜单地址URL
     * @return  the value of SYSTEM_MENU.MENU_URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 菜单地址URL
     * @param menuUrl the value for SYSTEM_MENU.MENU_URL
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * 菜单图标
     * @return  the value of SYSTEM_MENU.MENU_ICO
     */
    public String getMenuIco() {
        return menuIco;
    }

    /**
     * 菜单图标
     * @param menuIco the value for SYSTEM_MENU.MENU_ICO
     */
    public void setMenuIco(String menuIco) {
        this.menuIco = menuIco == null ? null : menuIco.trim();
    }

    /**
     * 是否有子节点
     * @return  the value of SYSTEM_MENU.MENU_LEVEL
     */
    public String getMenuLevel() {
        return menuLevel;
    }

    /**
     * 是否有子节点
     * @param menuLevel the value for SYSTEM_MENU.MENU_LEVEL
     */
    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel == null ? null : menuLevel.trim();
    }
    
    
	public SystemMenuVO() {
		super();
	}

	public SystemMenuVO(String menuId, String menuFatherId) {
		super();
		this.menuId = menuId;
		this.menuFatherId = menuFatherId;
	}

	@Override
	public String toString() {
		return "SystemMenuDTO [menuId=" + menuId + ", menuName=" + menuName
				+ ", menuCode=" + menuCode + ", menuFatherId=" + menuFatherId
				+ ", menuOrder=" + menuOrder + ", menuStatus=" + menuStatus
				+ ", menuUrl=" + menuUrl + ", menuIco=" + menuIco
				+ ", menuLevel=" + menuLevel + "]";
	}

    
}