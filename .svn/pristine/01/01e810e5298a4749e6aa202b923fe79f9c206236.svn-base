package com.bs.admin.service;

import java.util.List;

import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.QueryBoxData;

public interface EmployeeService {
	/**
	 * 
	
	 * <p>Title: getEmpByEmpId</p>  
	
	 * <p>Description: </p>  
		通过id获取员工信息
	 * @param EmpId
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Employee getEmpByEmpId(Long EmpId); 
	/**
	 * 
	
	 * <p>Title: addEmp</p>  
	
	 * <p>Description: </p>  
		添加员工信息
	 * @param empName		员工姓名
	 * @param empDept		员工部门
	 * @param empHireDate	入职日期
	 * @param empStatus		员工状态
	 * @param jobName		职位名称
	 * @param banAccount	银行账户
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Integer addEmp(String empName,String empDept, String empHireDate,String empStatus, String jobName, String banAccount);
	/**
	 * 
	
	 * <p>Title: removeEmp</p>  
	
	 * <p>Description: </p>  
		从数据库中彻底删除员工信息
	 * @param empId
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Integer removeEmp(Long empId);
	/**
	 * 
	
	 * <p>Title: changeEmp</p>  
	
	 * <p>Description: </p>  
		修改员工信息
	 * @param empId			员工id
	 * @param empName		员工姓名
	 * @param empDept		部门
	 * @param empHireDate	入职时间
	 * @param status		状态
	 * @param jobName		职位名称
	 * @param bankAccount	银行账户
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Integer changeEmp(Long empId, String empName, String empDept, String empHireDate, String status, String jobName, String bankAccount);
	/**
	 * 
	
	 * <p>Title: getAllEmp</p>  
	
	 * <p>Description: </p>  
		获取所有员工
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	List<Employee> getAllEmp();
	
	/**
	 * 
	
	 * <p>Title: getPageData</p>  
	
	 * <p>Description: </p>  
		根据条件获取页面数据
	 * @param name 字段名
	 * @param value 字段值
	 * @param date1 入职时间早
	 * @param date2 入职时间晚
	 * @param empStatus 员工状态
	 * @return  
	 * <p> @date 2018年11月26日  </p>
	 */
	

	PageData<Employee> getPageData(String name, String value, String date1, String date2, String empStatus,
			Integer pageNum, Integer pageSize);
	
	/**
	 * 
	
	 * <p>Title: retrieveDeptAll</p>  
	
	 * <p>Description: </p>  
		查询所有部门
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	List<QueryBoxData> retrieveDeptAll();
	
}
