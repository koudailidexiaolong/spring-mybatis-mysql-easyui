package com.julongtech.system.dao;

import java.util.List;

import com.julongtech.system.dao.entity.SystemUserRoleMappedInfo;
import com.julongtech.system.service.dto.SystemUserRoleMappedDTO;

/**
 * 用户角色映射关系
 * @author julong
 * @date 2017-1-6 下午05:13:25
 */
public interface SystemUserRoleMappedDao {

	/**
	 * 查询对象集合信息的方法
	 * @param systemUserRoleMappedDTO 参数对象
	 * @return List<? extends Object>
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:16:32
	 */
	public abstract List<SystemUserRoleMappedDTO> selectBySelective(SystemUserRoleMappedDTO systemUserRoleMappedDTO) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param sqlId mybatis 中的sqlId
	 * @param object 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:06
	 */
	public abstract int insertSelective(SystemUserRoleMappedInfo systemUserRoleMappedInfo) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param sqlId mybatis 中的sqlId
	 * @param object 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertObject(SystemUserRoleMappedInfo systemUserRoleMappedInfo) throws Exception;
	
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
	 * @param userId 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:10
	 */
	public abstract int deleteByUserId(String userId) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemUserRoleMappedInfot 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKeySelective(SystemUserRoleMappedInfo systemUserRoleMappedInfo) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemUserRoleMappedInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKey(SystemUserRoleMappedInfo systemUserRoleMappedInfo) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemUserRoleMappedInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByRole(SystemUserRoleMappedInfo systemUserRoleMappedInfo) throws Exception;
	
	/**
	 * 查询单个对象的方法
	 * @param sqlId mybatis 中的sqlId
	 * @param object 参数对象
	 * @return T
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:14
	 */
	public abstract SystemUserRoleMappedDTO selectByPrimaryKey(int mappedId) throws Exception;
	
}
