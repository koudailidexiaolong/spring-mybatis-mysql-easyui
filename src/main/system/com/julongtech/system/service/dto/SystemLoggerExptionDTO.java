package com.julongtech.system.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 系统异常日志信息类
 * @author julong 
 * @date Mon Oct 16 15:08:21 CST 2017
 */
public class SystemLoggerExptionDTO  implements Serializable{
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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
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
     * @return loggerExptionDesc
     */
    public String getLoggerExptionDesc() {
        return this.loggerExptionDesc;
    }

    /**
     * 日志描述
     * @param loggerExptionDesc
     */
    public void setLoggerExptionDesc(String loggerExptionDesc) {
        this.loggerExptionDesc = loggerExptionDesc;
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

    @java.lang.Override
    public java.lang.String toString() {
        final java.lang.StringBuffer sb = new java.lang.StringBuffer("SystemLoggerExptionDTO{");
        sb.append("loggerExptionId='").append(loggerExptionId).append('\'');
        sb.append(", loggerExptionType='").append(loggerExptionType).append('\'');
        sb.append(", loggerExptionTime=").append(loggerExptionTime);
        sb.append(", orgId='").append(orgId).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", loggerExptionIp='").append(loggerExptionIp).append('\'');
        sb.append(", loggerExptionModule='").append(loggerExptionModule).append('\'');
        sb.append(", loggerExptionMethod='").append(loggerExptionMethod).append('\'');
        sb.append(", loggerExptionDesc='").append(loggerExptionDesc).append('\'');
        sb.append(", loggerExptionContext='").append(loggerExptionContext).append('\'');
        sb.append('}');
        return sb.toString();
    }
}