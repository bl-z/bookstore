package com.bs.admin.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.AdminDao;
import com.bs.admin.dao.EmployeeDao;
import com.bs.admin.dao.impl.AdminDaoImpl;
import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.Permission;
import com.bs.admin.service.AdminService;
import com.bs.admin.service.EmployeeService;
import com.bs.admin.service.PermissionService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao ad;
	@Autowired
	private EmployeeService es;
	@Autowired 
	private PermissionService ps;

//	@Override
//	public Admin findAdminByAdminId(Long adminId) {
//		return ad.retrieveAdminByAdminId(adminId);
//	}

//	@Override
//	public Integer addAdmin(Admin admin) {
//		return ad.createAdmin(admin);
//	}

	@Override
	public Integer dropAdmin(Long adminId) {
		ps.resetAdminPermission(adminId, null);
		return ad.deleteAdmin(adminId);
	}


	@Override
	public Boolean checkAdmin(String adminAccount, String psw, HttpServletRequest req) {
		Admin admin = getAdminByAdminAccount(adminAccount);
		if (admin != null && admin.getAdminPassWord().equals(psw)) {
			// 获取登录的管理员对象，存入session中
			req.getSession().setAttribute("admin", admin);
			return true;
		} else {
			return false;
		}
	}

//	@Override
//	public Long getJobId(String adminAccount) {
//		Admin admin = ad.retrieveAdminByAdminAccount(adminAccount).get(0);
//		Long jobId = admin.getEmp().getJob().getJobId();
//		return jobId;
//	}

	@Override
	public PageData<Admin> getPageData(String name, String value, Integer pageNum, Integer pageSize) {
		Integer start = (pageNum-1)*pageSize;
		Long adminId = null;
		String adminAccount = null;
		Long empId = null;
		
		switch (name) {
		case "adminId":
			adminId = value==""?null:Long.valueOf(value);
			break;
		case "adminAccount":
			adminAccount = value;
			break;
		case "empId":
			empId = value==""?null:Long.valueOf(value);
			break;
		default:
			break;
		}
		List<Admin> rows = ad.retrieveAdminByFields(adminId, adminAccount, empId, start, pageSize);
		Integer total = ad.retrieveAdminCountByFields(adminId, adminAccount, empId);
		return new PageData<Admin>(rows, total);
	}

	@Override
	public Integer addAdmin(Long empId, String adminAccount, String adminPsw, Integer[] permission) {
		Employee emp = es.getEmpByEmpId(empId);
		if(emp == null){
			System.out.println("员工不存在");
			// 如果员工不存在，返回0，将错误在前端提示
			return -1;
		}else if(null!=getAdminByAdminAccount(adminAccount)){
			System.out.println("登录帐号重复");
			return -2;
		}else{
//			List<Permission> permissionList = new ArrayList<Permission>();
			
			Admin admin = new Admin(null, adminAccount, adminPsw, emp, null,null);
			// 添加admin到数据库
			Integer createAdmin = ad.createAdmin(admin);
			// 添加permission给数据库
			Admin admin2 = ad.retrieveAdminByAdminAccount(adminAccount).get(0);
			ps.resetAdminPermission(admin2.getAdminId(), Arrays.asList(permission));
			return createAdmin;
		}
		
	}

	@Override
	public Integer changeAdmin(Integer adminId, Long empId, String adminAccount, String adminPsw,Integer[] permission) {
		Employee emp = es.getEmpByEmpId(empId);
		Long adminId1 = Long.valueOf(adminId);
		if(emp == null){
			System.out.println("员工不存在");
			// 如果员工不存在，返回0，将错误在前端提示
			return -1;
		}
		
		if(null!=getOtherAdminByAccountAndAdminId(adminAccount, adminId1)){
			System.out.println("登录帐号重复");
			return -2;
		}
		
		Admin admin = new Admin(adminId1, adminAccount, adminPsw, emp, null,null);
		Integer updateAdmin = ad.updateAdmin(admin);
		if(permission != null)ps.resetAdminPermission(adminId1, Arrays.asList(permission));
		return updateAdmin;
	}

	@Override
	public Admin getAdminByAdminAccount(String adminAccount) {
		List<Admin> admins = ad.retrieveAdminByAdminAccount(adminAccount);
		System.out.println(admins);
		Admin admin = admins.size()>0?admins.get(0):null;
		//给admin的权限属性赋值
		if (admin!=null)admin.setPermissions(ps.getAdminPermission(admin.getAdminId()));
		return admin;
	}

	@Override
	public Admin getOtherAdminByAccountAndAdminId(String adminAccount, Long adminId) {
		return ad.retrieveOtherAdmin(adminId, adminAccount);
	}

	
	
	

}
