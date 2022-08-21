package com.julongtech.system.action.vo;

import java.io.Serializable;

/**
 * 组织机构表
 * @author julong 
 * @date Fri Nov 24 15:47:06 CST 2017
 */
public class SystemOrgVO implements Serializable{
    /**
	 * @author julong
	 * @date 2017-11-24 下午3:54:45
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 是否有子节点
     */
    private String orgLeaf;
	/** 
     * 组织机构编码
     */
    private String orgId;

    /** 
     * 机构网点电话
     */
    private String orgPhone;

    /** 
     * 组织机构名称全称
     */
    private String orgFullName;

    /** 
     * 组织机构名称简称
     */
    private String orgName;

    /** 
     * 组织机构父级节点编码
     */
    private String orgParentId;

    /** 
     * 组织机构父级节点名称
     */
    private String orgParentName;

    /** 
     * 组织机构地址
     */
    private String orgAddress;

    /** 
     * 组织机构等级
     */
    private String orgLevel;

    /** 
     * 组织机构类型
     */
    private String orgType;

    /** 
     * 组织机构行政区划名称
     */
    private String orgArea;

    /** 
     * 组织机构行政区划编码
     */
    private String orgAreaCode;

    /** 
     * 组织机构状态：0：正常1：禁用
     */
    private String orgStatus;
    /** 
     * 机构备注描述
     */
    private String orgDesc;
    
    
    public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
    /**
     * 组织机构编码
     * @return  the value of SYSTEM_ORG.ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 组织机构编码
     * @param orgId the value for SYSTEM_ORG.ORG_ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 机构网点电话
     * @return  the value of SYSTEM_ORG.ORG_PHONE
     */
    public String getOrgPhone() {
        return orgPhone;
    }

    /**
     * 机构网点电话
     * @param orgPhone the value for SYSTEM_ORG.ORG_PHONE
     */
    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone == null ? null : orgPhone.trim();
    }

    /**
     * 组织机构名称全称
     * @return  the value of SYSTEM_ORG.ORG_FULL_NAME
     */
    public String getOrgFullName() {
        return orgFullName;
    }

    /**
     * 组织机构名称全称
     * @param orgFullName the value for SYSTEM_ORG.ORG_FULL_NAME
     */
    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName == null ? null : orgFullName.trim();
    }

    /**
     * 组织机构名称简称
     * @return  the value of SYSTEM_ORG.ORG_NAME
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 组织机构名称简称
     * @param orgName the value for SYSTEM_ORG.ORG_NAME
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 组织机构父级节点编码
     * @return  the value of SYSTEM_ORG.ORG_PARENT_ID
     */
    public String getOrgParentId() {
        return orgParentId;
    }

    /**
     * 组织机构父级节点编码
     * @param orgParentId the value for SYSTEM_ORG.ORG_PARENT_ID
     */
    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId == null ? null : orgParentId.trim();
    }

    /**
     * 组织机构父级节点名称
     * @return  the value of SYSTEM_ORG.ORG_PARENT_NAME
     */
    public String getOrgParentName() {
        return orgParentName;
    }

    /**
     * 组织机构父级节点名称
     * @param orgParentName the value for SYSTEM_ORG.ORG_PARENT_NAME
     */
    public void setOrgParentName(String orgParentName) {
        this.orgParentName = orgParentName == null ? null : orgParentName.trim();
    }

    /**
     * 组织机构地址
     * @return  the value of SYSTEM_ORG.ORG_ADDRESS
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * 组织机构地址
     * @param orgAddress the value for SYSTEM_ORG.ORG_ADDRESS
     */
    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    /**
     * 组织机构等级
     * @return  the value of SYSTEM_ORG.ORG_LEVEL
     */
    public String getOrgLevel() {
        return orgLevel;
    }

    /**
     * 组织机构等级
     * @param orgLevel the value for SYSTEM_ORG.ORG_LEVEL
     */
    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel == null ? null : orgLevel.trim();
    }

    /**
     * 组织机构类型
     * @return  the value of SYSTEM_ORG.ORG_TYPE
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 组织机构类型
     * @param orgType the value for SYSTEM_ORG.ORG_TYPE
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * 组织机构行政区划名称
     * @return  the value of SYSTEM_ORG.ORG_AREA
     */
    public String getOrgArea() {
        return orgArea;
    }

    /**
     * 组织机构行政区划名称
     * @param orgArea the value for SYSTEM_ORG.ORG_AREA
     */
    public void setOrgArea(String orgArea) {
        this.orgArea = orgArea == null ? null : orgArea.trim();
    }

    /**
     * 组织机构行政区划编码
     * @return  the value of SYSTEM_ORG.ORG_AREA_CODE
     */
    public String getOrgAreaCode() {
        return orgAreaCode;
    }

    /**
     * 组织机构行政区划编码
     * @param orgAreaCode the value for SYSTEM_ORG.ORG_AREA_CODE
     */
    public void setOrgAreaCode(String orgAreaCode) {
        this.orgAreaCode = orgAreaCode == null ? null : orgAreaCode.trim();
    }

    /**
     * 组织机构状态：0：正常1：禁用
     * @return  the value of SYSTEM_ORG.ORG_STATUS
     */
    public String getOrgStatus() {
        return orgStatus;
    }

    /**
     * 组织机构状态：0：正常1：禁用
     * @param orgStatus the value for SYSTEM_ORG.ORG_STATUS
     */
    public void setOrgStatus(String orgStatus) {
        this.orgStatus = orgStatus == null ? null : orgStatus.trim();
    }

	public String getOrgLeaf() {
		return orgLeaf;
	}

	public void setOrgLeaf(String orgLeaf) {
		this.orgLeaf = orgLeaf;
	}

	@Override
	public String toString() {
		return "SystemOrgVO [orgLeaf=" + orgLeaf + ", orgId=" + orgId
				+ ", orgPhone=" + orgPhone + ", orgFullName=" + orgFullName
				+ ", orgName=" + orgName + ", orgParentId=" + orgParentId
				+ ", orgParentName=" + orgParentName + ", orgAddress="
				+ orgAddress + ", orgLevel=" + orgLevel + ", orgType="
				+ orgType + ", orgArea=" + orgArea + ", orgAreaCode="
				+ orgAreaCode + ", orgStatus=" + orgStatus + ", orgDesc="
				+ orgDesc + "]";
	}


}