package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.EmployeeDao;
import com.bs.admin.mapper.EmployeeMapper;
import com.bs.admin.pojo.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private EmployeeMapper em;

	@Override
	public Employee retrieveEmpByEmpId(Long EmpId) {
		return em.getEmpByEmpId(EmpId);
	}

	@Override
	public Integer createEmp(Employee emp) {
		return em.createEmp(emp);
	}

	@Override
	public Integer deleteEmp(Long empId) {
		return em.deleteEmp(empId);
	}

	@Override
	public Integer updateEmp(Employee emp) {
		return em.updateEmp(emp);
	}

	@Override
	public List<Employee> retrieveAllEmp() {
		return em.getAllEmp();
	}

	@Override
	public List<Employee> retrieveEmpByFields(String name, String value, String date1, String date2, Integer empStatus, Integer start, Integer pageSize) {
		List<Employee> list = em.getEmpByFeilds(name, value, date1, date2, empStatus, start, pageSize);
		return list;
	}

	@Override
	public Integer retrieveTotalCount(String name, String value, String date1, String date2, Integer status) {
		System.out.println("em : "+em);
		return em.getEmpCountByFields(name, value, date1, date2, status, null, null);
	}

	@Override
	public List<Employee> retrieveEmpByDept(String dept) {
		return em.getEmpByDept(dept);
	}

	@Override
	public List<String> retrieveDeptAll() {

		return em.getAllDept();
	}

}
