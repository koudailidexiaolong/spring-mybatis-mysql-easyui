package com.julongtech.system.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.util.DateUtils;
import com.julongtech.system.action.vo.SystemOrgVO;
import com.julongtech.system.dao.SystemOrgDao;
import com.julongtech.system.dao.entity.SystemOrgInfo;
import com.julongtech.system.service.SystemOrgService;
import com.julongtech.system.service.dto.SystemOrgDTO;
import com.julongtech.system.session.UserSession;
import com.julongtech.system.util.DefaultUtil;
/**
 * 组织机构模块
 * @author julong
 * @date 2017-10-18 下午7:48:16
 */
@Service
public class SystemOrgServiceImpl implements SystemOrgService {

	private static final Logger logger = LoggerFactory.getLogger(SystemOrgServiceImpl.class);
	@Autowired
	private SystemOrgDao systemOrgDaoImpl;
	
	
	@Override
	public List<SystemOrgDTO> getSystemOrgList(SystemOrgVO systemOrgVO,UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-查询列表输入参数systemOrgVO：{}",systemOrgVO);
		SystemOrgDTO systemOrgDTO = new SystemOrgDTO();
		systemOrgDTO.setOrgParentId(systemOrgVO.getOrgParentId());
		systemOrgDTO.setOrgLevel(systemOrgVO.getOrgLevel());
		systemOrgDTO.setOrgId(systemOrgVO.getOrgId());
		systemOrgDTO.setOrgStatus(systemOrgVO.getOrgStatus());
		logger.debug("【组织机构模块】-查询列表输入参数systemOrgDTO：{}",systemOrgDTO);
		List<SystemOrgDTO> orgList = this.systemOrgDaoImpl.selectBySelective(systemOrgDTO);
		for (int i = 0; i < orgList.size(); i++) {
			//判断是否为1级
			if("1".equals(orgList.get(i).getOrgLeaf())){
				orgList.get(i).setState("open");
			}
		}
		return orgList;
	}

	@Override
	public List<SystemOrgDTO> getSystemOrgListByPage(SystemOrgVO systemOrgVO,UserSession userSession)
			throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-分页查询列表输入参数systemOrgVO：{}",systemOrgVO);
		SystemOrgDTO systemOrgDTO = new SystemOrgDTO();
		if(StringUtils.isNotEmpty(systemOrgVO.getOrgId())){
			systemOrgDTO.setOrgId("%"+systemOrgVO.getOrgId()+"%");
		}
		if(StringUtils.isNotEmpty(systemOrgVO.getOrgName())){
			systemOrgDTO.setOrgName("%"+systemOrgVO.getOrgName()+"%");
		}
		systemOrgDTO.setOrgParentId(systemOrgVO.getOrgParentId());
		systemOrgDTO.setOrgStatus(systemOrgVO.getOrgStatus());
		systemOrgDTO.setOrgLevel(systemOrgVO.getOrgLevel());
		systemOrgDTO.setOrgType(systemOrgVO.getOrgType());
		logger.debug("【组织机构模块】-分页查询列表输入参数systemOrgDTO：{}",systemOrgDTO);
		List<SystemOrgDTO> list = this.systemOrgDaoImpl.selectBySelective(systemOrgDTO);
		return list;
	}

	@Override
	public SystemOrgDTO getSystemOrg(SystemOrgVO systemOrgVO,UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-查询单个信息输入参数systemOrgVO：{}",systemOrgVO);
		SystemOrgDTO systemOrgDTO = this.systemOrgDaoImpl.selectByPrimaryKey(systemOrgVO.getOrgId());
		return systemOrgDTO;
	}

	@Override
	public int deleteSystemOrg(SystemOrgVO systemOrgVO, UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-删除输入参数systemOrgVO：{}",systemOrgVO);
		int result = -1;
		//查询是否存在子集
		SystemOrgDTO systemOrg = new SystemOrgDTO();
		systemOrg.setOrgParentId(systemOrgVO.getOrgId());
		List<SystemOrgDTO> orgList = this.systemOrgDaoImpl.selectBySelective(systemOrg);
		if(orgList != null && orgList.size() >0){
			result = 2;
			return result;
		}
		String orgId = systemOrgVO.getOrgId();
		result = this.systemOrgDaoImpl.deleteByPrimaryKey(orgId);
		return result;
	}

	@Override
	public int updateSystemOrg(SystemOrgVO systemOrgVO, UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-更新输入参数systemOrgVO：{}",systemOrgVO);
		int result = -1;
		SystemOrgInfo systemOrgInfo = new SystemOrgInfo();
		systemOrgInfo.setOrgLeaf(systemOrgVO.getOrgLeaf());
		systemOrgInfo.setOrgId(systemOrgVO.getOrgId());
		systemOrgInfo.setOrgName(systemOrgVO.getOrgName());
		systemOrgInfo.setOrgFullName(systemOrgVO.getOrgFullName());
		systemOrgInfo.setOrgParentId(systemOrgVO.getOrgParentId());
		systemOrgInfo.setOrgParentName(systemOrgVO.getOrgParentName());
		systemOrgInfo.setOrgLevel(systemOrgVO.getOrgLevel());
		systemOrgInfo.setOrgType(systemOrgVO.getOrgType());
		systemOrgInfo.setOrgUpdateTime(DateUtils.getTimestamp());
		systemOrgInfo.setOrgAddress(systemOrgVO.getOrgAddress());
		systemOrgInfo.setOrgPhone(systemOrgVO.getOrgPhone());
		systemOrgInfo.setOrgStatus(systemOrgVO.getOrgStatus());
		systemOrgInfo.setOrgDesc(systemOrgVO.getOrgDesc());
		logger.debug("【组织机构模块】-更新输入参数systemOrgInfo：{}",systemOrgInfo);
		result = this.systemOrgDaoImpl.updateByPrimaryKeySelective(systemOrgInfo);
		return result;
	}

	@Override
	public int saveSystemOrg(SystemOrgVO systemOrgVO, UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-新增输入参数systemOrgVO：{}",systemOrgVO);
		int result = -1;
		SystemOrgInfo systemOrgInfo = new SystemOrgInfo();
		systemOrgInfo.setOrgLeaf(systemOrgVO.getOrgLeaf());
		systemOrgInfo.setOrgId(systemOrgVO.getOrgId());
		systemOrgInfo.setOrgFullName(systemOrgVO.getOrgFullName());
		systemOrgInfo.setOrgName(systemOrgVO.getOrgName());
		systemOrgInfo.setOrgParentId(systemOrgVO.getOrgParentId());
		systemOrgInfo.setOrgLevel(systemOrgVO.getOrgLevel());
		systemOrgInfo.setOrgStatus(systemOrgVO.getOrgStatus());
		systemOrgInfo.setOrgType(systemOrgVO.getOrgType());
		systemOrgInfo.setOrgCreateTime(DateUtils.getTimestamp());
		systemOrgInfo.setOrgAddress(systemOrgVO.getOrgAddress());
		systemOrgInfo.setOrgPhone(systemOrgVO.getOrgPhone());
		systemOrgInfo.setOrgDesc(systemOrgVO.getOrgDesc());
		logger.debug("【组织机构模块】-新增输入参数systemOrgInfo：{}",systemOrgInfo);
		result = this.systemOrgDaoImpl.insertSelective(systemOrgInfo);
		return result;
	}

	@Override
	public Map<String, Object> importOrgInfoList(List<SystemOrgVO> systemOrgList, UserSession userSession)	throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-导入");
		return null;
	}

	@Override
	public int updateSystemOrgStatus(SystemOrgVO systemOrgVO,UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-更新机构状态输入参数systemOrgVO：{}",systemOrgVO);
		int result = -1;
		SystemOrgInfo systemOrgInfo = new SystemOrgInfo();
		systemOrgInfo.setOrgStatus(systemOrgVO.getOrgStatus());
		systemOrgInfo.setOrgId(systemOrgVO.getOrgId());
		logger.debug("【组织机构模块】-更新机构状态输入参数systemOrgInfo：{}",systemOrgInfo);
		result = this.systemOrgDaoImpl.updateByPrimaryKeySelective(systemOrgInfo);
		return result;
	}
	
	/**
	 * 校验是否存在此机构
	 * @param SystemOrgVO 管理部门信息
	 * @param userSession 用户参数
	 * @return int
	 * @throws Exception
	 * @author julong
	 * @date 2017-1-9 下午07:31:44
	 */
	@Override
	public int validateSystemOrg(SystemOrgVO systemOrgVO,UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【组织机构模块】-校验机构号输入参数systemOrgVO：{}",systemOrgVO);
		SystemOrgDTO systemOrgDTO = new SystemOrgDTO();
		systemOrgDTO.setOrgId(systemOrgVO.getOrgId());
		Object obj = this.systemOrgDaoImpl.selectCount(systemOrgDTO);
		return Integer.valueOf(obj+"");
	}
	
	/**
	 * 分页查询组织机构（管理部门）功能
	 * @param SystemOrgVO 管理部门信息
	 * @param pageInfo 分页参数
	 * @param userSession 用户参数
	 * @return List<SystemOrgDTO>
	 * @throws Exception
	 * @author julong
	 * @date 2017-1-9 下午07:22:26
	 */
	@Override
	public List<SystemOrgDTO> getSystemOrgParentList(SystemOrgVO systemOrgVO,UserSession userSession) throws Exception {
		logger.debug("【组织机构模块】-查询列表输入参数systemOrgVO：{}",systemOrgVO);
		SystemOrgDTO systemOrgDTO = new SystemOrgDTO();
		systemOrgDTO.setOrgLevel(systemOrgVO.getOrgLevel());
		systemOrgDTO.setOrgStatus(DefaultUtil.DEFAULT_STATUS_TRUE);
		logger.debug("【组织机构模块】-查询列表输入参数systemOrgDTO：{}",systemOrgDTO);
		List<SystemOrgDTO> orgList = this.systemOrgDaoImpl.selectByLevel(systemOrgDTO);
		return orgList;
	}
}
