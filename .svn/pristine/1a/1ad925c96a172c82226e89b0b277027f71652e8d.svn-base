package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Attendance;

public interface AttendanceMapper {
	/**
	 * 
	
	 * <p>Title: getAllAttendance</p>  
	
	 * <p>Description: </p>  
	获取所有考勤信息
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Attendance> getAllAttendance();
	
	/**
	 * 
	
	 * <p>Title: getAttendanceByEmpIdAndDate</p>  
	
	 * <p>Description: </p>  
	获取员工指定日期的考勤信息
	 * @param empId
	 * @param attDate
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Attendance> getAttendanceByEmpIdAndDate(@Param("empId")Long empId, @Param("attDate")String attDate);
	
	/**
	 * 
	
	 * <p>Title: csvInsert</p>  
	
	 * <p>Description: </p>  
	将csv考勤数据导入到数据表中
	 * @param src
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer csvInsert(@Param("src") String src);
}
