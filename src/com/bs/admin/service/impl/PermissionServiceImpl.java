package com.bs.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.PermissionDao;
import com.bs.admin.pojo.Permission;
import com.bs.admin.service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService{
	@Autowired
	private PermissionDao pd;
	@Override
	public Integer resetAdminPermission(Long adminId, List<Integer> permissionIdList) {
		// 先将admin的permission清空
		Integer integer2 = pd.deleteAdminPermission(adminId);
		List<Long> list = new ArrayList<Long>();
		if(null != permissionIdList){
			for (Integer integer : permissionIdList) {
				list.add(Long.valueOf(integer));
			}
			// 给admin添加permission信息
			return pd.createAdminPermission(adminId, list);
		}
		return integer2;
		
		
	}
	@Override
	public List<Permission> getAllPermission() {
		return pd.retrieveAllPermission();
	}
	@Override
	public List<Permission> getAdminPermission(Long adminId) {
		return pd.retreveAdminPermission(adminId);
	}

}
