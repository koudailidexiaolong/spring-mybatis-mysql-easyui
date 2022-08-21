package com.julongtech.system.dao;

import java.util.List;

import com.julongtech.system.dao.entity.SystemRoleMenuMappedInfo;
import com.julongtech.system.service.dto.SystemRoleMenuMappedDTO;
/**
 * 角色资源关联操作类
 * @author julong
 * @date 2016-7-4 上午11:09:17
 */
public interface SystemRoleMenuMappedDao {

	/**
	 * 查询对象集合信息的方法
	 * @param systemRoleMenuMappedDTO 参数对象
	 * @return List<? extends Object>
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:16:32
	 */
	public abstract List<SystemRoleMenuMappedDTO> selectBySelective(SystemRoleMenuMappedDTO systemRoleMenuMappedDTO) throws Exception;

	/**
	 * 新增对象的方法
	 * @param systemRoleMenuMappedInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:06
	 */
	public abstract int insert(SystemRoleMenuMappedInfo systemRoleMenuMappedInfo) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemRoleMenuMappedList 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertBatch(List<SystemRoleMenuMappedInfo> systemRoleMenuMappedList) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemRoleMenuMappedInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertSelective(SystemRoleMenuMappedInfo systemRoleMenuMappedInfo) throws Exception;
	
	/**
	 * 删除对象的方法
	 * @param mappedId 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:10
	 */
	public abstract int deleteByPrimaryKey(int mappedId) throws Exception;
	
	/**
	 * 删除对象的方法
	 * @param mappedId 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:10
	 */
	public abstract int deleteByRoleId(int mappedId) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param sqlId mybatis 中的sqlId
	 * @param object 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKeySelective(SystemRoleMenuMappedInfo systemRoleMenuMappedInfo) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param sqlId mybatis 中的sqlId
	 * @param object 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKey(SystemRoleMenuMappedInfo systemRoleMenuMappedInfo) throws Exception;
	
	/**
	 * 查询单个对象的方法
	 * @param sqlId mybatis 中的sqlId
	 * @param object 参数对象
	 * @return T
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:14
	 */
	public abstract SystemRoleMenuMappedDTO selectByPrimaryKey(int roleId) throws Exception;
	
}
