package com.julongtech.system.dao;

import java.util.List;

import com.julongtech.system.dao.entity.SystemRoleButtonMappedInfo;
import com.julongtech.system.service.dto.SystemRoleButtonMappedDTO;

/**
 * 角色对应的菜单按钮类
 * @author julong
 * @date 2022年8月21日 下午1:26:41
 * @desc 
 */
public interface SystemRoleButtonMappedDao {
	
    /**
     * 根据编号删除角色按钮菜单关系
     * @param mappedId
     * @return
     * @throws Exception
     * @author julong
     * @date 2022年8月21日 下午1:26:21
     * @desc
     */
    public abstract int deleteByPrimaryKey(Integer mappedId) throws Exception;
    
    /**
     * 根据角色删除按钮菜单对应关系
     * @param roleId
     * @return
     * @throws Exception
     * @author julong
     * @date 2022年8月21日 下午1:26:03
     * @desc
     */
    public abstract int deleteByRoleId(Integer roleId) throws Exception;

    /**
     * 新增角色按钮关系
     * @param record
     * @return
     * @throws Exception
     * @author julong
     * @date 2022年8月21日 下午1:31:24
     * @desc
     */
    public abstract int insertSelective(SystemRoleButtonMappedInfo record) throws Exception;

    /**
     * 根据编号查询角色按钮关系
     * @param mappedId
     * @return
     * @throws Exception
     * @author julong
     * @date 2022年8月21日 下午3:19:57
     * @desc
     */
    public abstract SystemRoleButtonMappedDTO selectByPrimaryKey(Integer mappedId) throws Exception;

    /**
     * 根据条件查询角色按钮关系列表
     * @param systemRoleButtonMappedDTO
     * @return
     * @throws Exception
     * @author julong
     * @date 2022年8月21日 下午3:20:11
     * @desc
     */
    public abstract List<SystemRoleButtonMappedDTO> selectBySelective(SystemRoleButtonMappedDTO systemRoleButtonMappedDTO) throws Exception;

    /**
     * 更新角色按钮关系
     * @param record
     * @return
     * @throws Exception
     * @author julong
     * @date 2022年8月21日 下午1:31:44
     * @desc
     */
    public abstract int updateByPrimaryKeySelective(SystemRoleButtonMappedInfo systemRoleButtonMappedInfo) throws Exception;

    /**
	 * 批量新增对象的方法
	 * @param systemRoleButtonMappedList 参数对象
	 * @return -1 失败  0 sql执行0行受影响  大于0成功
	 * @throws Exception
	 * @author julong
	 * @date 2016-7-1 下午01:25:08
	 */
	public abstract int insertBatch(List<SystemRoleButtonMappedInfo> systemRoleButtonMappedList) throws Exception;
	
}