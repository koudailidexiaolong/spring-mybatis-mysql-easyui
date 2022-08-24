package com.julongtech.system.dao.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 系统异常日志信息类
 * @author julong 
 * @date Mon Oct 16 15:08:21 CST 2017
 * @database table SYSTEM_LOGGER_EXPTION
 */
public class SystemLoggerExptionInfo  implements Serializable{
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
    private String loggerExptionDescription;
	/** 
	 * 访问响应时间 毫秒
	 */
	private String loggerResponseTime;
    
    /** 
	 * 使用的操作系统
	 */
	private String loggerOperatingSystem;

	/** 
	 * 浏览器类型
	 */
	private String loggerBrowserType;

	/** 
	 * 浏览器版本
	 */
	private String loggerBrowserVersion;
    
    /** 
     * 日志异常信息
     */
    private String loggerExptionContext;

    /** 
     * 备用字段1
     */
    private String loggerExptionReserveA;

    /** 
     * 备用字段2
     */
    private String loggerExptionReserveB;

    /** 
     * 备用字段3
     */
    private String loggerExptionReserveC;


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
	 * 访问响应时间 毫秒
	 * @return  the value of SYSTEM_LOGGER.LOGGER_RESPONSE_TIME
	 */
	public String getLoggerResponseTime() {
		return loggerResponseTime;
	}

	/**
	 * 访问响应时间 毫秒
	 * @param loggerResponseTime the value for SYSTEM_LOGGER_EXPTION.LOGGER_RESPONSE_TIME
	 */
	public void setLoggerResponseTime(String loggerResponseTime) {
		this.loggerResponseTime = loggerResponseTime == null ? null : loggerResponseTime.trim();
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
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_Description
     */
    public String getLoggerExptionDescription() {
        return loggerExptionDescription;
    }

    /**
     * 日志描述
     * @param loggerExptionDescription the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_Description
     */
    public void setLoggerExptionDescription(String loggerExptionDescription) {
        this.loggerExptionDescription = loggerExptionDescription == null ? null : loggerExptionDescription.trim();
    }

    /**
	 * 系统版本
	 * @return  the value of SYSTEM_LOGGER.LOGGER_OPERATING_SYSTEM
	 */
	public String getLoggerOperatingSystem() {
		return loggerOperatingSystem;
	}
	/**
	 * 系统版本
	 * @param loggerOperatingSystem the value for SYSTEM_LOGGER.LOGGER_OPERATING_SYSTEM
	 */
	public void setLoggerOperatingSystem(String loggerOperatingSystem) {
		this.loggerOperatingSystem = loggerOperatingSystem == null ? null : loggerOperatingSystem.trim();
	}

	/**
	 * 浏览器类型
	 * @return  the value of SYSTEM_LOGGER.LOGGER_BROWSER_TYPE
	 */
	public String getLoggerBrowserType() {
		return loggerBrowserType;
	}
	/**
	 * 浏览器类型
	 * @param loggerBrowserType the value for SYSTEM_LOGGER.LOGGER_BROWSER_TYPE
	 */
	public void setLoggerBrowserType(String loggerBrowserType) {
		this.loggerBrowserType = loggerBrowserType == null ? null : loggerBrowserType.trim();
	}

	/**
	 * 浏览器版本
	 * @return  the value of SYSTEM_LOGGER.LOGGER_BROWSER_VERSION
	 */
	public String getLoggerBrowserVersion() {
		return loggerBrowserVersion;
	}
	/**
	 * 浏览器版本
	 * @param loggerBrowserVersion the value for SYSTEM_LOGGER.LOGGER_BROWSER_VERSION
	 */
	public void setLoggerBrowserVersion(String loggerBrowserVersion) {
		this.loggerBrowserVersion = loggerBrowserVersion == null ? null : loggerBrowserVersion.trim();
	}
	
    /**
     * 备用字段1
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_RESERVE_A
     */
    public String getLoggerExptionReserveA() {
        return loggerExptionReserveA;
    }

    /**
     * 备用字段1
     * @param loggerExptionReserveA the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_RESERVE_A
     */
    public void setLoggerExptionReserveA(String loggerExptionReserveA) {
        this.loggerExptionReserveA = loggerExptionReserveA == null ? null : loggerExptionReserveA.trim();
    }

    /**
     * 备用字段2
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_RESERVE_B
     */
    public String getLoggerExptionReserveB() {
        return loggerExptionReserveB;
    }

    /**
     * 备用字段2
     * @param loggerExptionReserveB the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_RESERVE_B
     */
    public void setLoggerExptionReserveB(String loggerExptionReserveB) {
        this.loggerExptionReserveB = loggerExptionReserveB == null ? null : loggerExptionReserveB.trim();
    }

    /**
     * 备用字段3
     * @return  the value of SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_RESERVE_C
     */
    public String getLoggerExptionReserveC() {
        return loggerExptionReserveC;
    }

    /**
     * 备用字段3
     * @param loggerExptionReserveC the value for SYSTEM_LOGGER_EXPTION.LOGGER_EXPTION_RESERVE_C
     */
    public void setLoggerExptionReserveC(String loggerExptionReserveC) {
        this.loggerExptionReserveC = loggerExptionReserveC == null ? null : loggerExptionReserveC.trim();
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
		return "SystemLoggerExptionInfo [loggerExptionId=" + loggerExptionId + ", loggerExptionType="
				+ loggerExptionType + ", loggerExptionTime=" + loggerExptionTime + ", orgId=" + orgId + ", userId="
				+ userId + ", userName=" + userName + ", loggerExptionIp=" + loggerExptionIp + ", loggerExptionModule="
				+ loggerExptionModule + ", loggerExptionMethod=" + loggerExptionMethod + ", loggerExptionDescription="
				+ loggerExptionDescription + ", loggerResponseTime=" + loggerResponseTime + ", loggerOperatingSystem="
				+ loggerOperatingSystem + ", loggerBrowserType=" + loggerBrowserType + ", loggerBrowserVersion="
				+ loggerBrowserVersion + ", loggerExptionContext=" + loggerExptionContext + ", loggerExptionReserveA="
				+ loggerExptionReserveA + ", loggerExptionReserveB=" + loggerExptionReserveB
				+ ", loggerExptionReserveC=" + loggerExptionReserveC + "]";
	}

	

	
    
}