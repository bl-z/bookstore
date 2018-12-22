package com.bs.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Attendance;
import com.bs.admin.pojo.Job;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.Salary;
import com.bs.admin.service.AttendanceService;
import com.bs.admin.service.MyInfoService;
import com.bs.admin.service.SalaryService;
import com.bs.admin.util.DateUtil;
import com.bs.admin.util.PropertyGridData;
@Service
public class MyInfoServiceImpl implements MyInfoService{
@Autowired
private SalaryService ss;
@Autowired 
AttendanceService as;
	@Override
	public PageData<PropertyGridData> getPageData(Admin admin) {
		List<PropertyGridData> rows = new ArrayList<>();
		String date = DateUtil.getCurrentTimeString();
		Salary salary = ss.getSalaryByEmpIdAndDate(admin.getEmp().getEmpId().intValue(), date);
		Job job = admin.getEmp().getJob();
		Attendance attendance = as.findAttendanceByEmpIdAndDate(admin.getEmp().getEmpId(), date);
		rows.add(new PropertyGridData("姓名", admin.getEmp().getEmpName(), "基本信息", ""));
		rows.add(new PropertyGridData("部门", admin.getEmp().getEmpDept(), "基本信息", ""));
		rows.add(new PropertyGridData("职位", admin.getEmp().getJob().getJobName(), "基本信息", ""));
		rows.add(new PropertyGridData("登录账号", admin.getAdminAccount(), "基本信息", ""));
		if(attendance != null){
			rows.add(new PropertyGridData("上月出勤天数",attendance.getWorkDay()+"", "考勤信息", ""));
			rows.add(new PropertyGridData("上月请假天数",attendance.getLeaveDay()+"", "考勤信息", ""));
			rows.add(new PropertyGridData("上月迟到天数",attendance.getLateDay()+"", "考勤信息", ""));
			rows.add(new PropertyGridData("上月早退天数",attendance.getEarlyDay()+"", "考勤信息", ""));
			rows.add(new PropertyGridData("操作者",attendance.getOperator().getEmp().getEmpName(), "考勤信息", ""));
		}
		if(salary != null){
			rows.add(new PropertyGridData("底薪",job.getJobBasicPay()+"", "工资信息", ""));
			rows.add(new PropertyGridData("津贴",job.getJobAllowance()+"", "工资信息", ""));
			rows.add(new PropertyGridData("奖罚",salary.getOther()+"", "工资信息", ""));
			rows.add(new PropertyGridData("合计",job.getJobBasicPay()+job.getJobAllowance()+salary.getOther()+"", "工资信息", ""));
			rows.add(new PropertyGridData("操作者",salary.getOperator().getEmp().getEmpName()+"", "工资信息", ""));
		}
		
		return new PageData<>(rows, rows.size());
	}

}
