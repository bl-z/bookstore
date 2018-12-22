package com.bs.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bs.admin.pojo.Attendance;
/**
 * 

* <p>Title: AttendanceDao</p>  

* <p>Description: </p>  
	考勤信息dao层
* @author zhengjian  

* <p> @date 2018年12月10日</p>
 */
@Repository
public interface AttendanceDao {
	/**
	 * 
	
	 * <p>Title: retrieveAllAttendance</p>  
	
	 * <p>Description: </p>  
		获取所有考勤信息
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Attendance> retrieveAllAttendance();
	/**
	 * 
	
	 * <p>Title: retrieveAttendanceByEmpIdAndDate</p>  
	
	 * <p>Description: </p>  
		根据员工id和统计日期获取考勤信息
	 * @param empId
	 * @param attDate
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Attendance> retrieveAttendanceByEmpIdAndDate(Long empId, String attDate);
	/**
	 * 
	
	 * <p>Title: csvInsert</p>  
	
	 * <p>Description: </p>  
		从csv导入考勤信息到数据库
	 * @param src	csv文件路径
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer csvInsert(String src);
}
