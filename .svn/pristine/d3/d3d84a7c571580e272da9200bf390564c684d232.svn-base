package com.bs.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bs.admin.pojo.Employee;
@Repository
/**
 * 

* <p>Title: EmployeeDao</p>  

* <p>Description: </p>  
	员工dao层
* @author zhengjian  

* <p> @date 2018年12月10日</p>
 */
public interface EmployeeDao {
	/**
	 * 
	
	 * <p>Title: retrieveEmpByEmpId</p>  
	
	 * <p>Description: </p>  
		通过编号查询员工
	 * @param EmpId	员工id
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Employee retrieveEmpByEmpId(Long EmpId); 
	/**
	 * 
	
	 * <p>Title: createEmp</p>  
	
	 * <p>Description: </p>  
		新增员工
	 * @param emp
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer createEmp(Employee emp);
	/**
	 * 
	
	 * <p>Title: deleteEmp</p>  
	
	 * <p>Description: </p>  
		从数据库删除员工信息
	 * @param empId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer deleteEmp(Long empId);
	
	/**
	 * 
	
	 * <p>Title: updateEmp</p>  
	
	 * <p>Description: </p>  
		修改员工
	 * @param emp
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updateEmp(Employee emp);
	/**
	 * 
	
	 * <p>Title: retrieveAllEmp</p>  
	
	 * <p>Description: </p>  
		获取所有员工
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Employee> retrieveAllEmp();
	
	/**
	 * 
	
	 * <p>Title: retrieveTotalCount</p>  
	
	 * <p>Description: </p>  
		获取满足条件的记录的条数
	 * @return  
	 * <p> @date 2018年11月28日  </p>
	 */
	Integer retrieveTotalCount(String name, String value, String date1, String date2, Integer status);
/**
 * 

 * <p>Title: retrieveEmpByFields</p>  

 * <p>Description: </p>  
	多条件查询员工
 * @param name	查询字段
 * @param value	查询关键字
 * @param date1	入职日期1
 * @param date2	入职日期2
 * @param empStatus	员工状态
 * @param start	开始位置
 * @param pageSize	查询条数
 * @return  
 * <p> @date 2018年12月10日  </p>
 */
	List<Employee> retrieveEmpByFields(String name, String value, String date1, String date2, Integer empStatus,
			Integer start, Integer pageSize);
	/**
	 * 
	
	 * <p>Title: retrieveEmpByDept</p>  
	
	 * <p>Description: </p>  
		根据员工部门查询员工
	 * @param dept
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Employee> retrieveEmpByDept(String dept);
	
	/**
	 * 
	
	 * <p>Title: retrieveDeptAll</p>  
	
	 * <p>Description: </p>  
	查询所有部门
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List <String> retrieveDeptAll();
}
