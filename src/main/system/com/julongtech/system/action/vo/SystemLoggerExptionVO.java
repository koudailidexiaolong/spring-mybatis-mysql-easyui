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
    private String loggerExptionDescription;

    /** 
     * 日志异常信息
     */
    private String loggerExptionContext;


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
	 * 访问响应时间 毫秒
	 */
	private String loggerResponseTime;

    /**
     * 日志编号:类型+年+月+日+时+分+秒+毫秒+6位序列
     * @return loggerExptionId
     */
    public String getLoggerExptionId() {
        return this.loggerExptionId;
    }

    /**
     * 日志编号:类型+年+月+日+时+分+秒+毫秒+6位序列
     * @param loggerExptionId
     */
    public void setLoggerExptionId(String loggerExptionId) {
        this.loggerExptionId = loggerExptionId;
    }

    /**
     * 日志类型
     * @return loggerExptionType
     */
    public String getLoggerExptionType() {
        return this.loggerExptionType;
    }

    /**
     * 日志类型
     * @param loggerExptionType
     */
    public void setLoggerExptionType(String loggerExptionType) {
        this.loggerExptionType = loggerExptionType;
    }

    /**
     * 日志创建时间
     * @return loggerExptionTime
     */
    public Timestamp getLoggerExptionTime() {
        return this.loggerExptionTime;
    }

    /**
     * 日志创建时间
     * @param loggerExptionTime
     */
    public void setLoggerExptionTime(Timestamp loggerExptionTime) {
        this.loggerExptionTime = loggerExptionTime;
    }

    /**
     * 组织机构
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * 组织机构
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 用户编号
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 用户编号
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 用户姓名
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 用户姓名
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 日志IP
     * @return loggerExptionIp
     */
    public String getLoggerExptionIp() {
        return this.loggerExptionIp;
    }

    /**
     * 日志IP
     * @param loggerExptionIp
     */
    public void setLoggerExptionIp(String loggerExptionIp) {
        this.loggerExptionIp = loggerExptionIp;
    }

    /**
     * 日志调用模块
     * @return loggerExptionModule
     */
    public String getLoggerExptionModule() {
        return this.loggerExptionModule;
    }

    /**
     * 日志调用模块
     * @param loggerExptionModule
     */
    public void setLoggerExptionModule(String loggerExptionModule) {
        this.loggerExptionModule = loggerExptionModule;
    }

    /**
     * 日志调用模块方法
     * @return loggerExptionMethod
     */
    public String getLoggerExptionMethod() {
        return this.loggerExptionMethod;
    }

    /**
     * 日志调用模块方法
     * @param loggerExptionMethod
     */
    public void setLoggerExptionMethod(String loggerExptionMethod) {
        this.loggerExptionMethod = loggerExptionMethod;
    }

    /**
     * 日志描述
     * @return loggerExptionDescription
     */
    public String getLoggerExptionDescription() {
        return this.loggerExptionDescription;
    }

    /**
     * 日志描述
     * @param loggerExptionDescription
     */
    public void setLoggerExptionDescription(String loggerExptionDescription) {
        this.loggerExptionDescription = loggerExptionDescription;
    }

    /**
     * 日志异常信息
     * @return loggerExptionContext
     */
    public String getLoggerExptionContext() {
        return this.loggerExptionContext;
    }

    /**
     * 日志异常信息
     * @param loggerExptionContext
     */
    public void setLoggerExptionContext(String loggerExptionContext) {
        this.loggerExptionContext = loggerExptionContext;
    }

	public String getLoggerOperatingSystem() {
		return loggerOperatingSystem;
	}

	public void setLoggerOperatingSystem(String loggerOperatingSystem) {
		this.loggerOperatingSystem = loggerOperatingSystem;
	}

	public String getLoggerBrowserType() {
		return loggerBrowserType;
	}

	public void setLoggerBrowserType(String loggerBrowserType) {
		this.loggerBrowserType = loggerBrowserType;
	}

	public String getLoggerBrowserVersion() {
		return loggerBrowserVersion;
	}

	public void setLoggerBrowserVersion(String loggerBrowserVersion) {
		this.loggerBrowserVersion = loggerBrowserVersion;
	}

	public String getLoggerResponseTime() {
		return loggerResponseTime;
	}

	public void setLoggerResponseTime(String loggerResponseTime) {
		this.loggerResponseTime = loggerResponseTime;
	}

	@Override
	public String toString() {
		return "SystemLoggerExptionVO [loggerExptionId=" + loggerExptionId + ", loggerExptionType=" + loggerExptionType
				+ ", loggerExptionTime=" + loggerExptionTime + ", orgId=" + orgId + ", userId=" + userId + ", userName="
				+ userName + ", loggerExptionIp=" + loggerExptionIp + ", loggerExptionModule=" + loggerExptionModule
				+ ", loggerExptionMethod=" + loggerExptionMethod + ", loggerExptionDescription="
				+ loggerExptionDescription + ", loggerExptionContext=" + loggerExptionContext
				+ ", loggerOperatingSystem=" + loggerOperatingSystem + ", loggerBrowserType=" + loggerBrowserType
				+ ", loggerBrowserVersion=" + loggerBrowserVersion + ", loggerResponseTime=" + loggerResponseTime + "]";
	}

	

  
}