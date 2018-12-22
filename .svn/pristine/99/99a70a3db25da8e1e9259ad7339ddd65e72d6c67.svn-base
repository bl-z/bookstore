package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.AttendanceDao;
import com.bs.admin.mapper.AttendanceMapper;
import com.bs.admin.pojo.Attendance;
@Repository
public class AttendanceDaoImpl implements AttendanceDao{
@Autowired
private AttendanceMapper am;
	@Override
	public List<Attendance> retrieveAllAttendance() {
		return am.getAllAttendance();
	}
	@Override
	public List<Attendance> retrieveAttendanceByEmpIdAndDate(Long empId, String attDate) {
		return am.getAttendanceByEmpIdAndDate(empId, attDate);
	}
	@Override
	public Integer csvInsert(String src) {
		return am.csvInsert(src);
	}

}
