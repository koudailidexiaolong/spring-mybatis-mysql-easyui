package com.julongtech.system.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 菜单信息类
 * @author julong 
 * @date Mon Oct 16 16:12:03 CST 2017
 */
public class SystemMenuDTO implements Serializable{
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
     * 菜单创建时间
     */
    private Timestamp menuCreateTime;

    /** 
     * 菜单创建人
     */
    private String userId;
    
    /** 
     * 菜单创建人
     */
    private String menuCreateUserName;
    
    /** 
     * 菜单修改时间
     */
    private Timestamp menuUpdateTime;

    /** 
     * 备用字段1
     */
    private String menuReserveA;

    /** 
     * 备用字段2
     */
    private String menuReserveB;

    /** 
     * 备用字段3
     */
    private String menuReserveC;

    /**
     * 设置默认是否选中
     * @author julong
     * @date 2017-11-3 下午8:30:29
     */
    private String menuChecked = "false";
    
    /**
     * 子菜单
     * @author julong
     * @date 2018-6-13 下午4:34:36
     */
    private List<SystemMenuDTO> children = new ArrayList<SystemMenuDTO>();
    
    /**
     * 按钮
     * @author julong
     * @date 2018-6-13 下午4:34:36
     */
    private List<SystemButtonDTO> button = new ArrayList<SystemButtonDTO>();
    
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

    /**
     * 菜单创建时间
     * @return  the value of SYSTEM_MENU.MENU_CREATE_TIME
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
    public Timestamp getMenuCreateTime() {
        return menuCreateTime;
    }

    /**
     * 菜单创建时间
     * @param menuCreateTime the value for SYSTEM_MENU.MENU_CREATE_TIME
     */
    public void setMenuCreateTime(Timestamp menuCreateTime) {
        this.menuCreateTime = menuCreateTime;
    }

    /**
     * 菜单创建人
     * @return  the value of SYSTEM_MENU.USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 菜单创建人
     * @param userId the value for SYSTEM_MENU.USER_ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 菜单修改时间
     * @return  the value of SYSTEM_MENU.MENU_UPDATE_TIME
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
    public Timestamp getMenuUpdateTime() {
        return menuUpdateTime;
    }

    /**
     * 菜单修改时间
     * @param menuUpdateTime the value for SYSTEM_MENU.MENU_UPDATE_TIME
     */
    public void setMenuUpdateTime(Timestamp menuUpdateTime) {
        this.menuUpdateTime = menuUpdateTime;
    }
    /**
     * 备用字段1
     * @return  the value of SYSTEM_MENU.MENU_RESERVE_A
     */
    public String getMenuReserveA() {
        return menuReserveA;
    }

    /**
     * 备用字段1
     * @param menuReserveA the value for SYSTEM_MENU.MENU_RESERVE_A
     */
    public void setMenuReserveA(String menuReserveA) {
        this.menuReserveA = menuReserveA == null ? null : menuReserveA.trim();
    }

    /**
     * 备用字段2
     * @return  the value of SYSTEM_MENU.MENU_RESERVE_B
     */
    public String getMenuReserveB() {
        return menuReserveB;
    }

    /**
     * 备用字段2
     * @param menuReserveB the value for SYSTEM_MENU.MENU_RESERVE_B
     */
    public void setMenuReserveB(String menuReserveB) {
        this.menuReserveB = menuReserveB == null ? null : menuReserveB.trim();
    }

    /**
     * 备用字段3
     * @return  the value of SYSTEM_MENU.MENU_RESERVE_C
     */
    public String getMenuReserveC() {
        return menuReserveC;
    }

    /**
     * 备用字段3
     * @param menuReserveC the value for SYSTEM_MENU.MENU_RESERVE_C
     */
    public void setMenuReserveC(String menuReserveC) {
        this.menuReserveC = menuReserveC == null ? null : menuReserveC.trim();
    }
	public List<SystemMenuDTO> getChildren() {
		return children;
	}

	public void setChildren(List<SystemMenuDTO> children) {
		this.children = children;
	}
	
	public List<SystemButtonDTO> getButton() {
		return button;
	}

	public void setButton(List<SystemButtonDTO> button) {
		this.button = button;
	}


	public String getMenuCreateUserName() {
		return menuCreateUserName;
	}

	public void setMenuCreateUserName(String menuCreateUserName) {
		this.menuCreateUserName = menuCreateUserName;
	}

	public String getMenuChecked() {
		return menuChecked;
	}

	public void setMenuChecked(String menuChecked) {
		this.menuChecked = menuChecked;
	}

	@Override
	public String toString() {
		return "SystemMenuDTO [menuId=" + menuId + ", menuName=" + menuName + ", menuCode=" + menuCode
				+ ", menuFatherId=" + menuFatherId + ", menuOrder=" + menuOrder + ", menuStatus=" + menuStatus
				+ ", menuUrl=" + menuUrl + ", menuIco=" + menuIco + ", menuLevel=" + menuLevel + ", menuCreateTime="
				+ menuCreateTime + ", userId=" + userId + ", menuCreateUserName=" + menuCreateUserName
				+ ", menuUpdateTime=" + menuUpdateTime + ", menuReserveA=" + menuReserveA + ", menuReserveB="
				+ menuReserveB + ", menuReserveC=" + menuReserveC + "]";
	}

	
}