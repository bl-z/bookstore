package com.bs.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.AttendanceDao;
import com.bs.admin.pojo.Attendance;
import com.bs.admin.pojo.PageData;
import com.bs.admin.service.AttendanceService;
import com.bs.admin.util.CsvUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AttendanceServiceImpl implements AttendanceService{
@Autowired
private AttendanceDao ad;
	@Override
	public PageData<Attendance> findAllAttendance(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Attendance> rows = ad.retrieveAllAttendance();
		Long total = new PageInfo<Attendance>(rows).getTotal();
		return new PageData<Attendance>(rows,total.intValue());
	}
	@Override
	public Attendance findAttendanceByEmpIdAndDate(Long empId, String Date) {
		List<Attendance> list = ad.retrieveAttendanceByEmpIdAndDate(empId, Date);
		if(list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}
	@Override
	public Integer fileInsert(String src, Long adminId) {
		String csvPath = CsvUtil.excel(src, adminId);
		System.out.println("service中的csvPath : "+csvPath);
		return ad.csvInsert(csvPath);
	}
	

}
