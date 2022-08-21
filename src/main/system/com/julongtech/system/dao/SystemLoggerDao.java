package com.julongtech.system.dao;

import java.util.List;

import com.julongtech.system.dao.entity.SystemLoggerInfo;
import com.julongtech.system.service.dto.SystemLoggerDTO;
/**
 * 日志业务数据交互类
 * @author julong
 * @date 2017-10-16 下午4:26:03
 */
public interface SystemLoggerDao {
	/**
	 * 查询对象集合信息的方法
	 * @param SystemLoggerDTO 参数对象
	 * @return List<SystemLoggerDTO>
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:16:32
	 */
	public abstract List<SystemLoggerDTO> selectBySelective(SystemLoggerDTO systemLoggerDTO) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemLoggerInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insert(SystemLoggerInfo systemLoggerInfo) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemLoggerInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertSelective(SystemLoggerInfo systemLoggerInfo) throws Exception;
	
	/**
	 * 删除对象的方法
	 * @param loggerId 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:10
	 */
	public abstract int deleteByPrimaryKey(String loggerId) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemLoggerInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKey(SystemLoggerInfo systemLoggerInfo) throws Exception;
	/**
	 * 更新对象的方法
	 * @param systemLoggerInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKeySelective(SystemLoggerInfo systemLoggerInfo) throws Exception;
	
	/**
	 * 查询单个对象的方法
	 * @param loggerId 参数对象
	 * @return SystemLoggerDTO
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:14
	 */
	public abstract SystemLoggerDTO selectByPrimaryKey(String loggerId) throws Exception;

}
