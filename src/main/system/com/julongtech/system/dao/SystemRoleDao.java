package com.julongtech.system.dao;

import java.util.List;

import com.julongtech.system.dao.entity.SystemRoleInfo;
import com.julongtech.system.service.dto.SystemRoleDTO;
/**
 * 角色数据库操作类
 * @author julong
 * @date 2016-7-4 上午11:09:22
 */
public interface SystemRoleDao {

	/**
	 * 查询对象集合信息的方法
	 * @param systemRoleDTO 参数对象
	 * @return List<? extends Object>
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:16:32
	 */
	public abstract List<SystemRoleDTO> selectBySelective(SystemRoleDTO systemRoleDTO) throws Exception;

	/**
	 * 新增对象的方法
	 * @param systemRoleInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:06
	 */
	public abstract int saveObject(SystemRoleInfo systemRoleInfo) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemRoleInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insert(SystemRoleInfo systemRoleInfo) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemRoleInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertSelective(SystemRoleInfo systemRoleInfo) throws Exception;
	
	/**
	 * 删除对象的方法
	 * @param roleId 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:10
	 */
	public abstract int deleteByPrimaryKey(int roleId) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param SystemRoleInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKeySelective(SystemRoleInfo systemRoleInfo) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemRoleInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKey(SystemRoleInfo systemRoleInfo) throws Exception;
	
	/**
	 * 查询单个对象的方法
	 * @param roleId 参数对象
	 * @return SystemRoleDTO
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:14
	 */
	public abstract SystemRoleDTO selectByPrimaryKey(int roleId) throws Exception;
	
	/**
	 * 获取某一个数据信息
	 * @param systemRoleInfo 参数对象
	 * @return Object
	 * @throws Exception
	 * @author julong
	 * @date 2017-1-6 下午02:43:41
	 */
	public abstract Object selectCount(SystemRoleDTO systemRoleDTO) throws Exception;
}
