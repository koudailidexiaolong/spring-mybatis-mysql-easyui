package com.julongtech.system.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julongtech.system.action.vo.SystemLoggerExptionVO;
import com.julongtech.system.dao.SystemLoggerExptionDao;
import com.julongtech.system.dao.entity.SystemLoggerExptionInfo;
import com.julongtech.system.service.SystemLoggerExptionService;
import com.julongtech.system.service.dto.SystemLoggerDTO;
import com.julongtech.system.session.UserSession;
/**
 * 系统异常日志处理模块
 * @author julong
 * @date 2017-10-18 上午11:09:00
 */
@Service
public class SystemLoggerExptionServiceImpl implements SystemLoggerExptionService {

	private static final Logger logger = LoggerFactory.getLogger(SystemLoggerExptionServiceImpl.class);
	
	@Autowired
	private SystemLoggerExptionDao systemLoggerExptionDaoImpl;
	
	@Override
	public int saveSystemLoggerExption(SystemLoggerExptionVO systemLoggerExptionVO, UserSession userSession)throws Exception {
		// TODO Auto-generated method stub
		logger.debug("【系统异常日志模块】-新增异常日志输入参数systemLoggerExptionVO：{}",systemLoggerExptionVO);
		int result = -1;
		SystemLoggerExptionInfo systemLoggerExptionInfo = new SystemLoggerExptionInfo();
		systemLoggerExptionInfo.setLoggerExptionId(systemLoggerExptionVO.getLoggerExptionId());
		systemLoggerExptionInfo.setLoggerExptionIp(systemLoggerExptionVO.getLoggerExptionIp());
		systemLoggerExptionInfo.setLoggerExptionMethod(systemLoggerExptionVO.getLoggerExptionMethod());
		systemLoggerExptionInfo.setLoggerExptionModule(systemLoggerExptionVO.getLoggerExptionModule());
		systemLoggerExptionInfo.setLoggerExptionContext(systemLoggerExptionVO.getLoggerExptionContext());
		systemLoggerExptionInfo.setLoggerExptionDescription(systemLoggerExptionVO.getLoggerExptionDescription());
		systemLoggerExptionInfo.setLoggerExptionTime(systemLoggerExptionVO.getLoggerExptionTime());
		systemLoggerExptionInfo.setLoggerExptionType(systemLoggerExptionVO.getLoggerExptionType());
		systemLoggerExptionInfo.setOrgId(systemLoggerExptionVO.getOrgId());
		systemLoggerExptionInfo.setUserId(systemLoggerExptionVO.getUserId());
		systemLoggerExptionInfo.setUserName(systemLoggerExptionVO.getUserName());
		systemLoggerExptionInfo.setLoggerResponseTime(systemLoggerExptionVO.getLoggerResponseTime());
		logger.debug("【系统异常日志模块】-新增异常日志输入参数systemLoggerExptionInfo：{}",systemLoggerExptionInfo);
		result = this.systemLoggerExptionDaoImpl.insertSelective(systemLoggerExptionInfo);
		return result;
	}

	@Override
	public List<SystemLoggerDTO> getSystemLoggerExptionListByPage(SystemLoggerExptionVO systemLoggerExptionVO,UserSession userSession)throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteSystemLoggerExption(List<SystemLoggerExptionVO> systemLoggerExptionVO,UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
