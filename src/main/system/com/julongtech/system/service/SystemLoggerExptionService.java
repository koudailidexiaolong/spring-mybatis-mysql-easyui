package com.julongtech.system.service;

import java.util.List;

import com.julongtech.system.action.vo.SystemLoggerExptionVO;
import com.julongtech.system.service.dto.SystemLoggerDTO;
import com.julongtech.system.session.UserSession;

/**
 * 系统异常日志处理模块
 * @author julong
 * @date 2017-10-18 上午9:43:07
 */
public interface SystemLoggerExptionService {

	/**
	 * 新增系统日志信息的方法
	 * @param systemLoggerExptionVO
	 * @param userSession
	 * @return
	 * @author julong
	 * @date 2017-10-17 下午7:40:18
	 */
	public abstract int saveSystemLoggerExption(SystemLoggerExptionVO systemLoggerExptionVO,UserSession userSession)throws Exception;
	
	/**
	 * 分页查询系统日志信息的方法
	 * @param systemLoggerExptionVO
	 * @param userSession
	 * @return List<SystemLoggerDTO>
	 * @author julong
	 * @date 2017-10-18 上午10:40:16
	 */
	public abstract List<SystemLoggerDTO> getSystemLoggerExptionListByPage(SystemLoggerExptionVO systemLoggerExptionVO,UserSession userSession)throws Exception;
	
	/**
	 * 批量删除日志信息的方法
	 * @param systemLoggerExptionVO
	 * @param userSession
	 * @return int
	 * @author julong
	 * @date 2017-10-18 上午10:40:59
	 */
	public abstract int deleteSystemLoggerExption(List<SystemLoggerExptionVO> systemLoggerExptionVO,UserSession userSession)throws Exception;
}
