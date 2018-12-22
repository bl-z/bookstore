package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import com.bs.admin.pojo.Employee;
import com.bs.admin.provider.EmpProvider;

public interface EmployeeMapper {
	/**
	 * 
	
	 * <p>Title: createEmp</p>  
	
	 * <p>Description: </p>  
		添加员工
	 * @param emp
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Integer createEmp(Employee emp);
	/**
	 * 
	
	 * <p>Title: getEmpByEmpId</p>  
	
	 * <p>Description: </p>  
		通过id查询员工
	 * @param EmpId
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Employee getEmpByEmpId(Long EmpId);
	
	
	/**
	 * 
	
	 * <p>Title: deleteEmp</p>  
	
	 * <p>Description: 从数据库中彻底删除员工</p>  
	
	 * @param EmpId
	 * @return  
	 * <p> @date 2018年11月23日  </p>
	 */
	Integer deleteEmp(Long empId);
	
	/**
	 * 
	
	 * <p>Title: UpdateEmp</p>  
		修改员工信息
	 * <p>Description: </p>  
	
	 * @param emp
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Integer updateEmp(Employee emp);
	
	/**
	 * 
	
	 * <p>Title: getAllEmp</p>  
	
	 * <p>Description: </p>  
		获取所有员工
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	List<Employee> getAllEmp();
	
	/**
	 * 
	
	 * <p>Title: getEmpByJobId</p>  
	
	 * <p>Description: </p>  
		通过职位编号查找员工
	 * @param jobId
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	List<Employee> getEmpByJobId(Long jobId);
	
	/**
	 * 
	
	 * <p>Title: getEmpByFeilds</p>  
	
	 * <p>Description: </p>  
		多条件动态查询
	 * @param property属性名
	 * @param value属性值
	 * @param date1日期1
	 * @param date2日期2
	 * @param empStatus员工状态
	 * @return  查询结果集
	 * <p> @date 2018年11月27日  </p>
	 */
	@SelectProvider(method="search",type=EmpProvider.class)
	List<Employee> getEmpByFeilds(@Param("property") String property, @Param("value")Object value, @Param("date1")String date1, @Param("date2")String date2, @Param("empStatus")Integer empStatus, @Param("start")Integer start, @Param("count")Integer count);
	
	/**
	 * 
	
	 * <p>Title: getEmpCountByFields</p>  
	
	 * <p>Description: </p>  
		获取符合条件的员工总条数
	 * @param name
	 * @param value
	 * @param date1
	 * @param date2
	 * @param status
	 * @return  
	 * <p> @date 2018年11月28日  </p>
	 */
	@SelectProvider(method="search",type=EmpProvider.class)
	Integer getEmpCountByFields(@Param("property") String property, @Param("value")Object value, @Param("date1")String date1, @Param("date2")String date2, @Param("empStatus")Integer empStatus, @Param("start")Integer start, @Param("count")Integer count);
	
	/**
	 * 
	
	 * <p>Title: getEmpByDept</p>  
	
	 * <p>Description: </p>  
		根据部门名称查询员工
	 * @param empDept
	 * @return  
	 * <p> @date 2018年12月6日  </p>
	 */
	List<Employee> getEmpByDept(String empDept);
	
	
	
	/**  
	
	 * <p>Title: getAllDept</p>  
	
	 * <p>Description: 获取所有的部门名称</p>  
	
	 * @return  
	 * <p> @date 2018年12月10日  </p> 
	 */
	List <String >getAllDept();
}
