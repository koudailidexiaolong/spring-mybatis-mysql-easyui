package com.julongtech.system.action.vo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 系统异常日志界面交互类
 * @author julong 
 * @date Mon Oct 16 15:08:21 CST 2017
 */
public class SystemLoggerExptionVO  implements Serializable{
    /**
	 * @author julong
	 * @date 2017-10-16 下午3:55:08
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 日志编号:类型+年+月+日+时+分+秒+毫秒+6位序列
     */
    private String loggerExptionId;

    /** 
     * 日志类型
     */
    private String loggerExptionType;

    /** 
     * 日志创建时间
     */
    private Timestamp loggerExptionTime;

    /** 
     * 组织机构
     */
    private String orgId;

    /** 
     * 用户编号
     */
    private String userId;

    /** 
     * 用户姓名
     */
    private String userName;

    /** 
     * 日志IP
     */
    private String loggerExptionIp;

    /** 
     * 日志调用模块
     */
    private String loggerExptionModule;

    /** 
     * 日志调用模块方法
     */
    private String loggerExptionMethod;

    /** 
     * 日志描述
     */
    private String loggerExptionDesc;

    /** 
     * 日志异常信息
     */
    private String loggerExptionContext;

    /**
     * 日志编号:类型+年+月+日+时+分+秒+毫秒+6位序列
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_ID
     */
    public String getLoggerExptionId() {
        return loggerExptionId;
    }

    /**
     * 日志编号:类型+年+月+日+时+分+秒+毫秒+6位序列
     * @param loggerExptionId the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_ID
     */
    public void setLoggerExptionId(String loggerExptionId) {
        this.loggerExptionId = loggerExptionId == null ? null : loggerExptionId.trim();
    }

    /**
     * 日志类型
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_TYPE
     */
    public String getLoggerExptionType() {
        return loggerExptionType;
    }

    /**
     * 日志类型
     * @param loggerExptionType the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_TYPE
     */
    public void setLoggerExptionType(String loggerExptionType) {
        this.loggerExptionType = loggerExptionType == null ? null : loggerExptionType.trim();
    }

    /**
     * 日志创建时间
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_TIME
     */
    public Timestamp getLoggerExptionTime() {
        return loggerExptionTime;
    }

    /**
     * 日志创建时间
     * @param loggerExptionTime the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_TIME
     */
    public void setLoggerExptionTime(Timestamp loggerExptionTime) {
        this.loggerExptionTime = loggerExptionTime;
    }

    /**
     * 组织机构
     * @return  the value of SYSTEM_LOGGER_EXPTION.ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 组织机构
     * @param orgId the value for SYSTEM_LOGGER_EXPTION.ORG_ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 用户编号
     * @return  the value of SYSTEM_LOGGER_EXPTION.USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户编号
     * @param userId the value for SYSTEM_LOGGER_EXPTION.USER_ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 用户姓名
     * @return  the value of SYSTEM_LOGGER_EXPTION.USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     * @param userName the value for SYSTEM_LOGGER_EXPTION.USER_NAME
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 日志IP
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_IP
     */
    public String getLoggerExptionIp() {
        return loggerExptionIp;
    }

    /**
     * 日志IP
     * @param loggerExptionIp the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_IP
     */
    public void setLoggerExptionIp(String loggerExptionIp) {
        this.loggerExptionIp = loggerExptionIp == null ? null : loggerExptionIp.trim();
    }

    /**
     * 日志调用模块
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_MODULE
     */
    public String getLoggerExptionModule() {
        return loggerExptionModule;
    }

    /**
     * 日志调用模块
     * @param loggerExptionModule the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_MODULE
     */
    public void setLoggerExptionModule(String loggerExptionModule) {
        this.loggerExptionModule = loggerExptionModule == null ? null : loggerExptionModule.trim();
    }

    /**
     * 日志调用模块方法
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_METHOD
     */
    public String getLoggerExptionMethod() {
        return loggerExptionMethod;
    }

    /**
     * 日志调用模块方法
     * @param loggerExptionMethod the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_METHOD
     */
    public void setLoggerExptionMethod(String loggerExptionMethod) {
        this.loggerExptionMethod = loggerExptionMethod == null ? null : loggerExptionMethod.trim();
    }

    /**
     * 日志描述
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_DESC
     */
    public String getLoggerExptionDesc() {
        return loggerExptionDesc;
    }

    /**
     * 日志描述
     * @param loggerExptionDesc the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_DESC
     */
    public void setLoggerExptionDesc(String loggerExptionDesc) {
        this.loggerExptionDesc = loggerExptionDesc == null ? null : loggerExptionDesc.trim();
    }

    /**
     * 日志异常信息
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_CONTEXT
     */
    public String getLoggerExptionContext() {
        return loggerExptionContext;
    }

    /**
     * 日志异常信息
     * @param loggerExptionContext the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_CONTEXT
     */
    public void setLoggerExptionContext(String loggerExptionContext) {
        this.loggerExptionContext = loggerExptionContext == null ? null : loggerExptionContext.trim();
    }

	@Override
	public String toString() {
		return "SystemLoggerExptionDTO [loggerExptionId=" + loggerExptionId
				+ ", loggerExptionType=" + loggerExptionType
				+ ", loggerExptionTime=" + loggerExptionTime + ", orgId="
				+ orgId + ", userId=" + userId + ", userName=" + userName
				+ ", loggerExptionIp=" + loggerExptionIp
				+ ", loggerExptionModule=" + loggerExptionModule
				+ ", loggerExptionMethod=" + loggerExptionMethod
				+ ", loggerExptionDesc=" + loggerExptionDesc
				+ ", loggerExptionContext=" + loggerExptionContext + "]";
	}

    
}