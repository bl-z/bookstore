package com.bs.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.admin.pojo.Permission;

@Service
public interface PermissionService {
	Integer resetAdminPermission(Long adminId, List<Integer> permissionIdList);
	
	List<Permission> getAllPermission();
	
	List<Permission> getAdminPermission(Long adminId);
}
