package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.PermissionDao;
import com.bs.admin.mapper.PermissionMapper;
import com.bs.admin.pojo.Permission;
@Repository
public class PermissionDaoImpl implements PermissionDao{
@Autowired
private PermissionMapper pm;
	@Override
	public Integer deleteAdminPermission(Long adminId) {
		return pm.deleteAdminPermission(adminId);
	}

	@Override
	public Integer createAdminPermission(Long adminId, List<Long> permissionIdList) {
		return pm.insertAdminPermission(permissionIdList, adminId);
	}

	@Override
	public List<Permission> retrieveAllPermission() {
		return pm.selectAllPermission();
	}

	@Override
	public Permission retrievePermissionById(Long permissionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> retreveAdminPermission(Long adminId) {
		return pm.getAdminPermission(adminId);
	}

}
