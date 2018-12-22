package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Permission;

public interface PermissionMapper {
	/**
	 * 插入中间表信息
	 * @param permissionIdList
	 * @param adminId
	 * @return
	 */
	Integer insertAdminPermission(@Param("permissionList")List<Long> permissionIdList, @Param("adminId")Long adminId);
	
	Integer deleteAdminPermission(@Param("adminId")Long adminId);
	
	List<Permission> getAdminPermission(Long adminId);
	
	List<Permission> selectAllPermission();
	
	Permission getPermissionById(Long permissionId);
	
//	Integer UpdateAdminPermission(@Param("permissionId")Long permissionId, @Param("adminId")Long adminId);
}
