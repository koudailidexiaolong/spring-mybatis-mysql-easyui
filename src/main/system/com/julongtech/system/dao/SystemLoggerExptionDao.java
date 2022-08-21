package com.julongtech.system.dao;

import com.julongtech.system.dao.entity.SystemLoggerExptionInfo;

/**
 * 系统日子异常处理类
 * @author julong
 * @date 2017-10-16 下午4:37:26
 */
public interface SystemLoggerExptionDao {
	

	/**
	 * 新增对象的方法
	 * @param systemLoggerExptionInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:06
	 */
	public abstract int insert(SystemLoggerExptionInfo systemLoggerExptionInfo) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemLoggerExptionInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertSelective(SystemLoggerExptionInfo systemLoggerExptionInfo) throws Exception;
	
	/**
	 * 删除对象的方法
	 * @param loggerExptionId 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:10
	 */
	public abstract int deleteByPrimaryKey(String loggerExptionId) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemLoggerExptionInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKeySelective(SystemLoggerExptionInfo systemLoggerExptionInfo) throws Exception;
	
	
	/**
	 * 更新对象的方法
	 * @param systemLoggerExptionInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKeyWithBLOBs(SystemLoggerExptionInfo systemLoggerExptionInfo) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemLoggerExptionInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKey(SystemLoggerExptionInfo systemLoggerExptionInfo) throws Exception;
	
	/**
	 * 查询单个对象的方法
	 * @param loggerExptionId 参数对象
	 * @return T
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:14
	 */
	public abstract SystemLoggerExptionInfo selectByPrimaryKey(String loggerExptionId) throws Exception;
	

}
