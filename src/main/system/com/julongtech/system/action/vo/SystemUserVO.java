package com.julongtech.system.action.vo;

import java.io.Serializable;

/**
 * 用户界面交互类
 * @author julong 
 * @date Mon Oct 16 15:08:21 CST 2017
 * @database table SYSTEM_USER
 */
public class SystemUserVO  implements Serializable{
    /**
	 * @author julong
	 * @date 2017-10-16 下午3:54:54
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 用户登录名
     */
    private String userId;

    /** 
     * 组织机构编码
     */
    private String orgId;

    /** 
     * 用户登录密码
     */
    private String userPassword;

    /** 
     * 用户姓名
     */
    private String userName;

    /** 
     * 用户年龄：1-999
     */
    private String userAge;

    /** 
     * 用户性别：0：男 1：女2：未知
     */
    private String userSex;

    /** 
     * 用户身份证号码
     */
    private String userIdentity;

    /** 
     * 用户地址
     */
    private String userAddress;

    /** 
     * 用户电话
     */
    private String userPhone;

    /** 
     * 用户邮箱
     */
    private String userMail;

    /** 
     * 用户描述
     */
    private String userDesc;

    /** 
     * 用户图像url
     */
    private String userImage;


    /** 
     * 用户状态：0：正常1：停用
     */
    private String userStatus;

    /** 
     * 用户皮肤
     */
    private String userSkin;

    /** 
     * 用户等级
     */
    private String userLevel;

    /**
     * 开始日期
     * @author julong
     * @date 2017-12-14 下午2:40:49
     */
    private String beginDate;
    
    /**
     * 结束日期
     * @author julong
     * @date 2017-12-14 下午2:40:57
     */
    private String endDate;
    
    /**
     * 用户登录名
     * @return  the value of SYSTEM_USER.USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户登录名
     * @param userId the value for SYSTEM_USER.USER_ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 组织机构编码
     * @return  the value of SYSTEM_USER.ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 组织机构编码
     * @param orgId the value for SYSTEM_USER.ORG_ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 用户登录密码
     * @return  the value of SYSTEM_USER.USER_PASSWORD
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 用户登录密码
     * @param userPassword the value for SYSTEM_USER.USER_PASSWORD
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 用户姓名
     * @return  the value of SYSTEM_USER.USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     * @param userName the value for SYSTEM_USER.USER_NAME
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户年龄：1-999
     * @return  the value of SYSTEM_USER.USER_AGE
     */
    public String getUserAge() {
        return userAge;
    }

    /**
     * 用户年龄：1-999
     * @param userAge the value for SYSTEM_USER.USER_AGE
     */
    public void setUserAge(String userAge) {
        this.userAge = userAge == null ? null : userAge.trim();
    }

    /**
     * 用户性别：0：男 1：女2：未知
     * @return  the value of SYSTEM_USER.USER_SEX
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 用户性别：0：男 1：女2：未知
     * @param userSex the value for SYSTEM_USER.USER_SEX
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * 用户身份证号码
     * @return  the value of SYSTEM_USER.USER_IDENTITY
     */
    public String getUserIdentity() {
        return userIdentity;
    }

    /**
     * 用户身份证号码
     * @param userIdentity the value for SYSTEM_USER.USER_IDENTITY
     */
    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity == null ? null : userIdentity.trim();
    }

    /**
     * 用户地址
     * @return  the value of SYSTEM_USER.USER_ADDRESS
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 用户地址
     * @param userAddress the value for SYSTEM_USER.USER_ADDRESS
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * 用户电话
     * @return  the value of SYSTEM_USER.USER_PHONE
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 用户电话
     * @param userPhone the value for SYSTEM_USER.USER_PHONE
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 用户邮箱
     * @return  the value of SYSTEM_USER.USER_MAIL
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * 用户邮箱
     * @param userMail the value for SYSTEM_USER.USER_MAIL
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    /**
     * 用户描述
     * @return  the value of SYSTEM_USER.USER_DESC
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * 用户描述
     * @param userDesc the value for SYSTEM_USER.USER_DESC
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    /**
     * 用户图像url
     * @return  the value of SYSTEM_USER.USER_IMAGE
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * 用户图像url
     * @param userImage the value for SYSTEM_USER.USER_IMAGE
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }


    /**
     * 用户状态：0：正常1：停用
     * @return  the value of SYSTEM_USER.USER_STATUS
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 用户状态：0：正常1：停用
     * @param userStatus the value for SYSTEM_USER.USER_STATUS
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * 用户皮肤
     * @return  the value of SYSTEM_USER.USER_SKIN
     */
    public String getUserSkin() {
        return userSkin;
    }

    /**
     * 用户皮肤
     * @param userSkin the value for SYSTEM_USER.USER_SKIN
     */
    public void setUserSkin(String userSkin) {
        this.userSkin = userSkin == null ? null : userSkin.trim();
    }

    /**
     * 用户等级
     * @return  the value of SYSTEM_USER.USER_LEVEL
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * 用户等级
     * @param userLevel the value for SYSTEM_USER.USER_LEVEL
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }


	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "SystemUserVO [userId=" + userId + ", orgId=" + orgId
				+ ", userPassword=" + userPassword + ", userName=" + userName
				+ ", userAge=" + userAge + ", userSex=" + userSex
				+ ", userIdentity=" + userIdentity + ", userAddress="
				+ userAddress + ", userPhone=" + userPhone + ", userMail="
				+ userMail + ", userDesc=" + userDesc + ", userImage="
				+ userImage + ", userStatus=" + userStatus + ", userSkin="
				+ userSkin + ", userLevel=" + userLevel + ", beginDate="
				+ beginDate + ", endDate=" + endDate + "]";
	}

}