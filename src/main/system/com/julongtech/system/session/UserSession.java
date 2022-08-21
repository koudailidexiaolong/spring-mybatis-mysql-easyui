package com.julongtech.system.session;

import com.julongtech.system.service.dto.SystemOrgDTO;
import com.julongtech.system.service.dto.SystemUserDTO;


/**
 * 用户session类
 * @author julong
 * @date 2017-10-17 下午7:29:05
 */
public class UserSession {

	/**
	 * 当前访问的用户
	 * @author julong
	 * @date 2017-10-28 上午11:47:30
	 */
	private SystemUserDTO systemUser;
	/**
	 * 当前用户的组织机构
	 * @author julong
	 * @date 2017-10-28 上午11:47:40
	 */
	private SystemOrgDTO systemOrg;
		
	
	
	
	public SystemUserDTO getSystemUser() {
		return systemUser;
	}
	
	public void setSystemUser(SystemUserDTO systemUser) {
		this.systemUser = systemUser;
	}
	
	public SystemOrgDTO getSystemOrg() {
		return systemOrg;
	}
	
	public void setSystemOrg(SystemOrgDTO systemOrg) {
		this.systemOrg = systemOrg;
	}

	public UserSession() {
		super();
	}

	public UserSession(SystemUserDTO systemUser, SystemOrgDTO systemOrg) {
		super();
		this.systemUser = systemUser;
		this.systemOrg = systemOrg;
	}
	
	
	@Override
	public String toString() {
		return "UserSession [systemUser=" + systemUser + ", systemOrg=" + systemOrg + "]";
	}

	
	
	
	
}
