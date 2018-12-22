package com.bs.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bs.admin.pojo.Admin;
/**
 * 

* <p>Title: AdminDao</p>  
	管理账户dao层
* <p>Description: </p>  

* @author zhengjian  

* <p> @date 2018年12月10日</p>
 */
@Repository
public interface AdminDao {
/**
 * 

 * <p>Title: retrieveAdminByAdminId</p>  

 * <p>Description: </p>  
	通过管理账户id获取管理账户信息
 * @param adminId
 * @return  
 * <p> @date 2018年12月10日  </p>
 */
//	Admin retrieveAdminByAdminId(Long adminId); 
	/**
	 * 
	
	 * <p>Title: createAdmin</p>  
	
	 * <p>Description: </p>  
		新增管理账户
	 * @param admin
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer createAdmin(Admin admin);
	/**
	 * 
	
	 * <p>Title: deleteAdmin</p>  
	
	 * <p>Description: </p>  
		删除账户
	 * @param adminId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer deleteAdmin(Long adminId);
	/**
	 * 
	
	 * <p>Title: updateAdmin</p>  
	
	 * <p>Description: </p>  
		修改管理账户信息
	 * @param admin
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updateAdmin(Admin admin);
	/**
	 * 
	
	 * <p>Title: retrieveAdminByAdminAccount</p>  
	
	 * <p>Description: </p>  
	通过登录帐号获取管理账户信息
	 * @param adminAccount
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Admin> retrieveAdminByAdminAccount(String adminAccount);
	/**
	 * 
	
	 * <p>Title: retrieveAdminByFields</p>  
	
	 * <p>Description: </p>  
		多条件查询管理账户信息
	 * @param adminId		帐户id
	 * @param adminAccount	登录帐号
	 * @param empId			员工id
	 * @param start			开始位置
	 * @param count			查询条数
	 * @return  			账户集合
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Admin> retrieveAdminByFields(Long adminId, String adminAccount, Long empId, Integer start, Integer count);
	/**
	 * 
	
	 * <p>Title: retrieveAdminCountByFields</p>  
	
	 * <p>Description: </p>  
		查询符合条件的数据条数
	 * @param adminId		管理账户id
	 * @param adminAccount	登录帐号
	 * @param empId			员工id
	 * @return  			条数
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer retrieveAdminCountByFields(Long adminId, String adminAccount, Long empId);
	
	/**
	 * 查询是否与其他管理员的登录帐号重复。如果有重复，返回管理员对象
	 * @param adminId
	 * @param adminAccount
	 * @return
	 */
	Admin retrieveOtherAdmin(Long adminId, String adminAccount);
	

}
