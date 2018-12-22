package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.Permission;

public interface AdminMapper {
	/**
	 * 
	
	 * <p>Title: createAdmin</p>  
	
	 * <p>Description: </p>  
		新增管理账户
	 * @param admin
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Integer createAdmin(Admin admin);
	/**
	 * 
	
	 * <p>Title: getAdminByAdminId</p>  
	
	 * <p>Description: </p>  
		通过id查询管理账户
	 * @param adminId
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Admin getAdminByAdminId(Long adminId);
	/**
	 * 
	
	 * <p>Title: deleteAdmin</p>  
	
	 * <p>Description: </p>  
		删除管理账户
	 * @param adminId
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Integer deleteAdmin(Long adminId);
	/**
	 * 
	
	 * <p>Title: UpdateAdmin</p>  
	
	 * <p>Description: </p>  
		修改管理员信息
	 * @param admin
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Integer UpdateAdmin(Admin admin);
	/**
	 * 
	
	 * <p>Title: getAdminByAdminAccount</p>  
	
	 * <p>Description: </p>  
		通过登录帐号查找管理账户
	 * @param adminAccount
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	List<Admin> getAdminByAdminAccount(String adminAccount);
	/**
	 * 
	
	 * <p>Title: getAllAdmin</p>  
	
	 * <p>Description: </p>  
		获取所有管理账户
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
//	List<Admin> getAllAdmin();
	
	/**
	 * 
	
	 * <p>Title: getEmpByAdminId</p>  
	
	 * <p>Description: </p>  
		获取管理账户对应的员工
	 * @param adminId
	 * @return  
	 * <p> @date 2018年11月26日  </p>
	 */
	//Employee getEmpByAdminId(Long adminId);
	
//	@SelectProvider(method="search",type=AdminProvider.class)
	/**
	 * 
	
	 * <p>Title: getAdminByFields</p>  
	
	 * <p>Description: </p>  
		多条件查询账户信息
	 * @param adminId
	 * @param adminAccount
	 * @param empId
	 * @param start
	 * @param count
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Admin> getAdminByFields(@Param("adminId")Long adminId, @Param("adminAccount")String adminAccount, @Param("empId")Long empId, @Param("start")Integer start, @Param("count")Integer count);
	
//	@SelectProvider(method="search",type=AdminProvider.class)
	/**
	 * 
	
	 * <p>Title: getAdminCount</p>  
	
	 * <p>Description: </p>  
		获取满足条件的数据条数
	 * @param adminId
	 * @param adminAccount
	 * @param empId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer getAdminCount(@Param("adminId")Long adminId, @Param("adminAccount")String adminAccount, @Param("empId")Long empId);
	/**
	 * 
	 * @param adminId
	 * @param adminAccount
	 * @return
	 */
	Admin getOtherAdmin(@Param("adminId")Long adminId, @Param("adminAccount")String adminAccount);
	

	
	
}
