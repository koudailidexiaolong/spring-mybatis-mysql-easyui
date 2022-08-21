package com.julongtech.system.dao;

import java.util.List;

import com.julongtech.system.dao.entity.SystemDictionaryInfo;
import com.julongtech.system.service.dto.SystemDictionaryDTO;
/**
 * 数据字典数据库交互类
 * @author julong
 * @date 2017-10-16 下午4:25:56
 */
public interface SystemDictionaryDao {

	/**
	 * 查询对象集合信息的方法
	 * @param systemDictionaryDTO 参数对象
	 * @return List<? extends Object>
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:16:32
	 */
	public abstract List<SystemDictionaryDTO> selectBySelective(SystemDictionaryDTO systemDictionaryDTO) throws Exception;
	
	/**
	 * 分页查询对象集合信息的方法
	 * @param systemDictionaryDTO 参数对象
	 * @return List<? extends Object>
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:17:24
	 */
	public abstract List<SystemDictionaryDTO> selectByType(SystemDictionaryDTO systemDictionaryDTO) throws Exception;

	/**
	 * 新增对象的方法
	 * @param systemDictionaryInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insert(SystemDictionaryInfo systemDictionaryInfo) throws Exception;
	
	/**
	 * 新增对象的方法
	 * @param systemDictionaryInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertSelective(SystemDictionaryInfo systemDictionaryInfo) throws Exception;
	
	/**
	 * 删除对象的方法
	 * @param dictionaryId 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:10
	 */
	public abstract int deleteByPrimaryKey(int dictionaryId) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemDictionaryInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKeySelective(SystemDictionaryInfo systemDictionaryInfo) throws Exception;
	
	/**
	 * 更新对象的方法
	 * @param systemDictionaryInfo 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:12
	 */
	public abstract int updateByPrimaryKey(SystemDictionaryInfo systemDictionaryInfo) throws Exception;
	
	/**
	 * 查询单个对象的方法
	 * @param dictionaryId 参数对象
	 * @return T
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:14
	 */
	public abstract SystemDictionaryDTO selectByPrimaryKey(int dictionaryId) throws Exception;
	
	/**
	 * 获取某一个数据信息
	 * @param systemDictionaryDTO 参数对象
	 * @return Object
	 * @throws Exception
	 * @author julong
	 * @date 2017-1-6 下午02:43:41
	 */
	public abstract Object uniqueKey(SystemDictionaryDTO systemDictionaryDTO) throws Exception;
}
