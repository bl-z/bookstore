package com.bs.admin.dao;

import java.util.List;


import com.bs.admin.pojo.Log;

public interface LogDao {
	Integer insertLog(Log log);
	Integer deleteLogByTime(String startTime ,String endTime);
	List<Log> dynamicSelectLog(Log log,String startTime ,String endTime);
}
