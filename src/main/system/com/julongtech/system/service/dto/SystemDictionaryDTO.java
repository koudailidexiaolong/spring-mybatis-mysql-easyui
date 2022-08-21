package com.julongtech.system.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 数据字典信息类
 * @author julong 
 * @date Mon Oct 16 15:08:21 CST 2017
 */
public class SystemDictionaryDTO  implements Serializable{
    /**
	 * @author julong
	 * @date 2017-10-16 下午3:55:05
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 数据字典编号
     */
    private Integer dictionaryId;

    /** 
     * 组织机构编号
     */
    private String orgId;
    
    /** 
     * 节点类型
     */
    private String dictionaryType;

    /** 
     * 节点编码
     */
    private String dictionaryCode;

    /** 
     * 节点名称
     */
    private String dictionaryName;

    /** 
     * 节点描述
     */
    private String dictionaryDesc;

    /** 
     * 父级节点
     */
    private String dictionaryParentCode;

    /** 
     * 创建时间
     */
    private Timestamp dictionaryCreateTime;

    /** 
     * 创建人
     */
    private String dictionaryCreateUserId;
    /** 
     * 创建人
     */
    private String dictionaryCreateUserName;

    /** 
     * 修改时间
     */
    private Timestamp dictionaryUpdateTime;

    /** 
     * 修改人
     */
    private String dictionaryUpdateUserId;
    /** 
     * 修改人
     */
    private String dictionaryUpdateUserName;
    /** 
     * 字典状态：0-正常1-禁用
     */
    private String dictionaryStatus;

    /** 
     * 顺序 默认从1开始
     */
    private BigDecimal dictionaryOrder;

	/**
     * 数据字典编号
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_ID
     */
    public Integer getDictionaryId() {
        return dictionaryId;
    }

    /**
     * 数据字典编号
     * @param dictionaryId the value for SYSTEM_DICTIONARY.DICTIONARY_ID
     */
    public void setDictionaryId(Integer dictionaryId) {
        this.dictionaryId = dictionaryId;
    }


    /**
     * 组织机构编号
     * @return  the value of SYSTEM_DICTIONARY.ORG_ID
     */
    public String getOrgId() {
		return orgId;
	}
    /**
     * 组织机构编号
     * @param dictionaryId the value for SYSTEM_DICTIONARY.ORG_ID
     */
	public void setOrgId(String orgId) {
		this.orgId = orgId == null ? null : orgId.trim();
	}
	
    /**
     * 节点类型
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_TYPE
     */
    public String getDictionaryType() {
        return dictionaryType;
    }

    /**
     * 节点类型
     * @param dictionaryType the value for SYSTEM_DICTIONARY.DICTIONARY_TYPE
     */
    public void setDictionaryType(String dictionaryType) {
        this.dictionaryType = dictionaryType == null ? null : dictionaryType.trim();
    }

    /**
     * 节点编码
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_CODE
     */
    public String getDictionaryCode() {
        return dictionaryCode;
    }

    /**
     * 节点编码
     * @param dictionaryCode the value for SYSTEM_DICTIONARY.DICTIONARY_CODE
     */
    public void setDictionaryCode(String dictionaryCode) {
        this.dictionaryCode = dictionaryCode == null ? null : dictionaryCode.trim();
    }

    /**
     * 节点名称
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_NAME
     */
    public String getDictionaryName() {
        return dictionaryName;
    }

    /**
     * 节点名称
     * @param dictionaryName the value for SYSTEM_DICTIONARY.DICTIONARY_NAME
     */
    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName == null ? null : dictionaryName.trim();
    }

    /**
     * 节点描述
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_DESC
     */
    public String getDictionaryDesc() {
        return dictionaryDesc;
    }

    /**
     * 节点描述
     * @param dictionaryDesc the value for SYSTEM_DICTIONARY.DICTIONARY_DESC
     */
    public void setDictionaryDesc(String dictionaryDesc) {
        this.dictionaryDesc = dictionaryDesc == null ? null : dictionaryDesc.trim();
    }

    /**
     * 父级节点
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_PARENT_CODE
     */
    public String getDictionaryParentCode() {
        return dictionaryParentCode;
    }

    /**
     * 父级节点
     * @param dictionaryParentCode the value for SYSTEM_DICTIONARY.DICTIONARY_PARENT_CODE
     */
    public void setDictionaryParentCode(String dictionaryParentCode) {
        this.dictionaryParentCode = dictionaryParentCode == null ? null : dictionaryParentCode.trim();
    }

    /**
     * 创建时间
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_CREATE_TIME
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
    public Timestamp getDictionaryCreateTime() {
        return dictionaryCreateTime;
    }

    /**
     * 创建时间
     * @param dictionaryCreateTime the value for SYSTEM_DICTIONARY.DICTIONARY_CREATE_TIME
     */
    public void setDictionaryCreateTime(Timestamp dictionaryCreateTime) {
        this.dictionaryCreateTime = dictionaryCreateTime;
    }

    /**
     * 创建人
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_CREATE_USER_ID
     */
    public String getDictionaryCreateUserId() {
        return dictionaryCreateUserId;
    }

    /**
     * 创建人
     * @param dictionaryCreateUserId the value for SYSTEM_DICTIONARY.DICTIONARY_CREATE_USER_ID
     */
    public void setDictionaryCreateUserId(String dictionaryCreateUserId) {
        this.dictionaryCreateUserId = dictionaryCreateUserId == null ? null : dictionaryCreateUserId.trim();
    }

    /**
     * 修改时间
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_UPDATE_TIME
     */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
    public Timestamp getDictionaryUpdateTime() {
        return dictionaryUpdateTime;
    }

    /**
     * 修改时间
     * @param dictionaryUpdateTime the value for SYSTEM_DICTIONARY.DICTIONARY_UPDATE_TIME
     */
    public void setDictionaryUpdateTime(Timestamp dictionaryUpdateTime) {
        this.dictionaryUpdateTime = dictionaryUpdateTime;
    }

    /**
     * 修改人
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_UPDATE_USER_ID
     */
    public String getDictionaryUpdateUserId() {
        return dictionaryUpdateUserId;
    }

    /**
     * 修改人
     * @param dictionaryUpdateUserId the value for SYSTEM_DICTIONARY.DICTIONARY_UPDATE_USER_ID
     */
    public void setDictionaryUpdateUserId(String dictionaryUpdateUserId) {
        this.dictionaryUpdateUserId = dictionaryUpdateUserId == null ? null : dictionaryUpdateUserId.trim();
    }

    /**
     * 字典状态：0-正常1-禁用
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_STATUS
     */
    public String getDictionaryStatus() {
        return dictionaryStatus;
    }

    /**
     * 字典状态：0-正常1-禁用
     * @param dictionaryStatus the value for SYSTEM_DICTIONARY.DICTIONARY_STATUS
     */
    public void setDictionaryStatus(String dictionaryStatus) {
        this.dictionaryStatus = dictionaryStatus == null ? null : dictionaryStatus.trim();
    }

    /**
     * 顺序 默认从1开始
     * @return  the value of SYSTEM_DICTIONARY.DICTIONARY_ORDER
     */
    public BigDecimal getDictionaryOrder() {
        return dictionaryOrder;
    }

    /**
     * 顺序 默认从1开始
     * @param dictionaryOrder the value for SYSTEM_DICTIONARY.DICTIONARY_ORDER
     */
    public void setDictionaryOrder(BigDecimal dictionaryOrder) {
        this.dictionaryOrder = dictionaryOrder;
    }

	public String getDictionaryCreateUserName() {
		return dictionaryCreateUserName;
	}

	public void setDictionaryCreateUserName(String dictionaryCreateUserName) {
		this.dictionaryCreateUserName = dictionaryCreateUserName;
	}

	public String getDictionaryUpdateUserName() {
		return dictionaryUpdateUserName;
	}

	public void setDictionaryUpdateUserName(String dictionaryUpdateUserName) {
		this.dictionaryUpdateUserName = dictionaryUpdateUserName;
	}

	@Override
	public String toString() {
		return "SystemDictionaryDTO [dictionaryId=" + dictionaryId + ", orgId="
				+ orgId + ", dictionaryType=" + dictionaryType
				+ ", dictionaryCode=" + dictionaryCode + ", dictionaryName="
				+ dictionaryName + ", dictionaryDesc=" + dictionaryDesc
				+ ", dictionaryParentCode=" + dictionaryParentCode
				+ ", dictionaryCreateTime=" + dictionaryCreateTime
				+ ", dictionaryCreateUserId=" + dictionaryCreateUserId
				+ ", dictionaryCreateUserName=" + dictionaryCreateUserName
				+ ", dictionaryUpdateTime=" + dictionaryUpdateTime
				+ ", dictionaryUpdateUserId=" + dictionaryUpdateUserId
				+ ", dictionaryUpdateUserName=" + dictionaryUpdateUserName
				+ ", dictionaryStatus=" + dictionaryStatus
				+ ", dictionaryOrder=" + dictionaryOrder + "]";
	}

}