package com.bs.admin.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.EmployeeDao;
import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.Job;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.QueryBoxData;
import com.bs.admin.service.EmployeeService;
import com.bs.admin.service.JobService;
import com.bs.admin.util.DateUtil;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao ed;
	@Autowired
	private JobService js;
	
	@Override
	public Employee getEmpByEmpId(Long EmpId) {
		return ed.retrieveEmpByEmpId(EmpId);
	}

	@Override
	public Integer addEmp(String empName,String empDept, String empHireDate,String empStatus, String jobName, String bankAccount) {
		Integer status = 1;
		switch (empStatus) {
		case "在职":
			status = 1;
			break;
		case "休假":
			status = 2;
			break;
		case "离职":
			status = 3;
			break;
		default:
			break;
		}
		Job job = js.findJobByJobName(jobName);
		empHireDate = DateUtil.changeDateString(empHireDate);
		Employee emp = new Employee(null, empName, empDept, empHireDate, null, status, job, bankAccount);
		return ed.createEmp(emp);
	}

	@Override
	public Integer removeEmp(Long empId) {
		return ed.deleteEmp(empId);
	}

	@Override
	public Integer changeEmp(Long empId, String empName, String empDept, String empHireDate, String status, String jobName, String bankAccount) {
		Integer empStatus = 1;
		String QuitDate = null;
		switch (status) {
		case "在职":
			empStatus = 1;
			break;
		case "休假":
			empStatus = 2;
			break;
		case "离职":
			empStatus = 3;
			QuitDate = DateUtil.getCurrentTimeString();
			System.out.println("员工"+empName+"于"+QuitDate+"离职");
			break;
		default:
			break;
		}
		Job job = js.findJobByJobName(jobName);
		empHireDate = DateUtil.changeDateString(empHireDate);
		Employee emp = new Employee(empId, empName, empDept, empHireDate, QuitDate, empStatus, job, bankAccount);
		return ed.updateEmp(emp);
	}

	@Override
	public List<Employee> getAllEmp() {
		return ed.retrieveAllEmp();
	}

	@Override
	public PageData<Employee> getPageData(String name, String value, String date1, String date2, String empStatus, Integer pageNum, Integer pageSize) {
		Integer start = (pageNum-1)*pageSize;
		if(date1==null || date1.equals("")){
			date1 = "1970-01-01";
		}
		if(date2==null || date2.equals("")){
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Calendar calendar = Calendar.getInstance();
			date2 = df.format(calendar.getTime());
			
		}
		Integer status = null;
		switch (empStatus) {
		case "在职":
			status = 1;
			break;
		case "休假":
			status = 2;
			break;
		case "离职":
			status = 3;
			break;
		default:
			status = null;
			break;
		}
		List<Employee> rows = ed.retrieveEmpByFields(name, value, date1, date2, status, start, pageSize);
		
		Integer total = ed.retrieveTotalCount(name, value, date1, date2, status);
		return new PageData<Employee>(rows, total);
	}
	
	

	@Override
	public List<QueryBoxData> retrieveDeptAll() {

		List<String> str = ed.retrieveDeptAll();

		Integer i=1;
		ArrayList<QueryBoxData> list = new  ArrayList<QueryBoxData>();
		
		QueryBoxData data =null;
		list.add(new QueryBoxData(0,"全部",true));
		for( String item:str){
			data = new QueryBoxData(i++, item, false);
			list.add(data);
		}
		
		return  list;
	}


}
