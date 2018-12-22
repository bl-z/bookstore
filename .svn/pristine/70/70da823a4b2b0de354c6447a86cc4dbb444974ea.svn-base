package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.AdminDao;
import com.bs.admin.mapper.AdminMapper;
import com.bs.admin.pojo.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private AdminMapper am;
	
//	@Override
//	public Admin retrieveAdminByAdminId(Long adminId) {
//		return am.getAdminByAdminId(adminId);
//	}

	@Override
	public Integer createAdmin(Admin admin) {
		return am.createAdmin(admin);
	}

	@Override
	public Integer deleteAdmin(Long adminId) {
		return am.deleteAdmin(adminId);
	}

	@Override
	public Integer updateAdmin(Admin admin) {
		return am.UpdateAdmin(admin);
	}
	@Override
	public List<Admin> retrieveAdminByAdminAccount(String adminAccount) {
		return am.getAdminByAdminAccount(adminAccount);
	}

	@Override
	public List<Admin> retrieveAdminByFields(Long adminId, String adminAccount, Long empId, Integer start, Integer count) {
		return am.getAdminByFields(adminId, adminAccount, empId, start, count);
	}

	@Override
	public Integer retrieveAdminCountByFields(Long adminId, String adminAccount, Long empId) {
		return am.getAdminCount(adminId, adminAccount, empId);
	}

	@Override
	public Admin retrieveOtherAdmin(Long adminId, String adminAccount) {
		return am.getOtherAdmin(adminId, adminAccount);
	}

	
	
	
	

}
