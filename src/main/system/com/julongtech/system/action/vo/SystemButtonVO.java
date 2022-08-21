package com.julongtech.system.action.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 按钮界面交互
 * @author julong 
 * @date Mon Oct 16 15:08:21 CST 2017
 */
public class SystemButtonVO implements Serializable{
    /**
	 * @author julong
	 * @date 2017-10-16 下午3:16:22
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 按钮编号
     */
    private String buttonId;

    /** 
     * 按钮名称
     */
    private String buttonName;

    /** 
     * 按钮代码
     */
    private String buttonCode;

    /** 
     * 按钮地址URL
     */
    private String buttonUrl;

    /** 
     * 按钮状态
     */
    private String buttonStatus;

    /** 
     * 按钮创建人
     */
    private String userId;

    /** 
     * 按钮图标
     */
    private String buttonIco;

    /** 
     * 菜单编号
     */
    private String menuId;

    /** 
     * 按钮顺序
     */
    private BigDecimal buttonOrder;

    /** 
     * 按钮节点
     */
    private String buttonFather;


    /**
     * 按钮编号
     * @return  the value of SYSTEM_BUTTON.BUTTON_ID
     */
    public String getButtonId() {
        return buttonId;
    }

    /**
     * 按钮编号
     * @param buttonId the value for SYSTEM_BUTTON.BUTTON_ID
     */
    public void setButtonId(String buttonId) {
        this.buttonId = buttonId == null ? null : buttonId.trim();
    }

    /**
     * 按钮名称
     * @return  the value of SYSTEM_BUTTON.BUTTON_NAME
     */
    public String getButtonName() {
        return buttonName;
    }

    /**
     * 按钮名称
     * @param buttonName the value for SYSTEM_BUTTON.BUTTON_NAME
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }

    /**
     * 按钮代码
     * @return  the value of SYSTEM_BUTTON.BUTTON_CODE
     */
    public String getButtonCode() {
        return buttonCode;
    }

    /**
     * 按钮代码
     * @param buttonCode the value for SYSTEM_BUTTON.BUTTON_CODE
     */
    public void setButtonCode(String buttonCode) {
        this.buttonCode = buttonCode == null ? null : buttonCode.trim();
    }

    /**
     * 按钮地址URL
     * @return  the value of SYSTEM_BUTTON.BUTTON_URL
     */
    public String getButtonUrl() {
        return buttonUrl;
    }

    /**
     * 按钮地址URL
     * @param buttonUrl the value for SYSTEM_BUTTON.BUTTON_URL
     */
    public void setButtonUrl(String buttonUrl) {
        this.buttonUrl = buttonUrl == null ? null : buttonUrl.trim();
    }

    /**
     * 按钮状态
     * @return  the value of SYSTEM_BUTTON.BUTTON_STATUS
     */
    public String getButtonStatus() {
        return buttonStatus;
    }

    /**
     * 按钮状态
     * @param buttonStatus the value for SYSTEM_BUTTON.BUTTON_STATUS
     */
    public void setButtonStatus(String buttonStatus) {
        this.buttonStatus = buttonStatus == null ? null : buttonStatus.trim();
    }

    /**
     * 按钮创建人
     * @return  the value of SYSTEM_BUTTON.USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 按钮创建人
     * @param userId the value for SYSTEM_BUTTON.USER_ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 按钮图标
     * @return  the value of SYSTEM_BUTTON.BUTTON_ICO
     */
    public String getButtonIco() {
        return buttonIco;
    }

    /**
     * 按钮图标
     * @param buttonIco the value for SYSTEM_BUTTON.BUTTON_ICO
     */
    public void setButtonIco(String buttonIco) {
        this.buttonIco = buttonIco == null ? null : buttonIco.trim();
    }

    /**
     * 菜单编号
     * @return  the value of SYSTEM_BUTTON.MENU_ID
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 菜单编号
     * @param menuId the value for SYSTEM_BUTTON.MENU_ID
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * 按钮顺序
     * @return  the value of SYSTEM_BUTTON.BUTTON_ORDER
     */
    public BigDecimal getButtonOrder() {
        return buttonOrder;
    }

    /**
     * 按钮顺序
     * @param buttonOrder the value for SYSTEM_BUTTON.BUTTON_ORDER
     */
    public void setButtonOrder(BigDecimal buttonOrder) {
        this.buttonOrder = buttonOrder;
    }


    /**
     * 按钮节点
     * @return  the value of SYSTEM_BUTTON.BUTTON_FATHER
     */
    public String getButtonFather() {
        return buttonFather;
    }

    /**
     * 按钮节点
     * @param buttonFather the value for SYSTEM_BUTTON.BUTTON_FATHER
     */
    public void setButtonFather(String buttonFather) {
        this.buttonFather = buttonFather == null ? null : buttonFather.trim();
    }

	@Override
	public String toString() {
		return "SystemButtonDTO [buttonId=" + buttonId + ", buttonName="
				+ buttonName + ", buttonCode=" + buttonCode + ", buttonUrl="
				+ buttonUrl + ", buttonStatus=" + buttonStatus + ", userId="
				+ userId + ", buttonIco=" + buttonIco + ", menuId=" + menuId
				+ ", buttonOrder=" + buttonOrder + ", buttonFather="
				+ buttonFather + "]";
	}
}