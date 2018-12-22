package com.bs.admin.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.PageData;

public interface AdminService {
	/**
	 * 
	
	 * <p>Title: findAdminByAdminId</p>  
	
	 * <p>Description: </p>  
		通过账户id查询账户
	 * @param adminId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
//	Admin findAdminByAdminId(Long adminId); 
	/**
	 * 
	
	 * <p>Title: addAdmin</p>  
	
	 * <p>Description: </p>  
		添加账户
	 * @param admin
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
//	Integer addAdmin(Admin admin);
	/**
	 * 
	
	 * <p>Title: dropAdmin</p>  
	
	 * <p>Description: </p>  
		删除账户
	 * @param adminId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer dropAdmin(Long adminId);
	
	
	/**
	 * 
	
	 * <p>Title: checkAdmin</p>  
	
	 * <p>Description: </p>  
		验证管理员密码
	 * @param adminAccount	登录帐号
	 * @param psw	密码
	 * @return  
	 * <p> @date 2018年11月23日  </p>
	 */
	Boolean checkAdmin(String adminAccount,String psw,HttpServletRequest req);
	/**
	 * 
	
	 * <p>Title: getJobId</p>  
	
	 * <p>Description: </p>  
		通过登录帐号获取职位id
	 * @param adminAccount
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
//	Long getJobId(String adminAccount);
	/**
	 * 
	
	 * <p>Title: getAdminByAdminAccount</p>  
	
	 * <p>Description: </p>  
		通过登陆账号获取账户信息
	 * @param adminAccount
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Admin getAdminByAdminAccount(String adminAccount);
	/**
	 * 
	
	 * <p>Title: getPageData</p>  
	
	 * <p>Description: </p>  
		分页查询，获取pagedata
	 * @param name		查询字段
	 * @param value		查询关键字
	 * @param pageNum	当前页数
	 * @param pageSize	页面容量
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	PageData<Admin> getPageData(String name, String value, Integer pageNum, Integer pageSize);
	/**
	 * 
	
	 * <p>Title: addAdmin</p>  
	
	 * <p>Description: </p>  
		添加账户
	 * @param empId			员工id
	 * @param adminAccount	登录帐号
	 * @param adminPsw		登录密码
	 * @param permission	权限
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer addAdmin(Long empId, String adminAccount, String adminPsw, Integer[] permission);
	/**
	 * 
	
	 * <p>Title: changeAdmin</p>  
	
	 * <p>Description: </p>  
		修改账户
	 * @param adminId		账户id
	 * @param empId			员工id
	 * @param adminAccount	登录帐号
	 * @param adminPsw		登录密码
	 * @param permission	权限
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer changeAdmin(Integer adminId, Long empId, String adminAccount, String adminPsw, Integer[] permission);
	
	/**
	 * 查看是否有重复的登录帐号
	 * @param adminAccount
	 * @param adminId
	 * @return
	 */
	Admin getOtherAdminByAccountAndAdminId(String adminAccount, Long adminId);
	
}
