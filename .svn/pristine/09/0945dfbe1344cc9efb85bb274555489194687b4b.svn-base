package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.LogDao;
import com.bs.admin.mapper.LogMapper;
import com.bs.admin.pojo.Log;
@Repository
public class LogDaoImpl implements LogDao{
	@Autowired
	private LogMapper lm;

	@Override
	public Integer insertLog(Log log) {
		return lm.insertLog(log);
	}

	@Override
	public Integer deleteLogByTime(String startTime, String endTime) {
		return lm.deleteLogByTime(startTime, endTime);
	}

	@Override
	public List<Log> dynamicSelectLog(Log log, String startTime, String endTime) {
		System.out.println("dao");
		System.out.println(log);
		System.out.println(startTime);
		System.out.println(endTime);
		return lm.dynamicSelectLog(log, startTime, endTime);
	}

}
