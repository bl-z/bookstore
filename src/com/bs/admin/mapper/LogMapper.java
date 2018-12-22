package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Log;

public interface LogMapper {

	Integer insertLog(Log log);
	Integer deleteLogByTime(@Param ("startTime")String startTime ,@Param("endTime")String endTime);
	List<Log> dynamicSelectLog(@Param("log")Log log, @Param ("startTime")String startTime ,@Param("endTime")String endTime);
	
	
	
}
