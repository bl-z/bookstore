package com.bs.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bs.admin.pojo.Permission;
@Repository
public interface PermissionDao {
	/**
	 * 通过id查询权限信息
	 * @param permissionId
	 * @return
	 */
	Permission retrievePermissionById(Long permissionId);
	/**
	 * 将管理员的所有权限清空
	 * @param adminId
	 * @return
	 */
	Integer deleteAdminPermission(Long adminId);
	/**
	 * 设置管理员权限
	 * @param adminId
	 * @param permissionIdList
	 * @return
	 */
	Integer createAdminPermission(Long adminId,List<Long> permissionIdList);
	/**
	 * 获取所有权限信息
	 * @return
	 */
	List<Permission> retrieveAllPermission();
	/**
	 * 获取管理员的权限信息
	 * @param adminId
	 * @return
	 */
	List<Permission> retreveAdminPermission(Long adminId);
}
