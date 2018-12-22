package com.bs.admin.pojo;

import java.io.Serializable;

public class Salary implements Serializable{
	/** serialVersionUID*/ 
	private static final long serialVersionUID = 1769716323437138717L;
	private Long salaryId;
	/**
	 * 对应员工
	 */
	private Employee employee;
	
	/**
	 * 发放日期
	 */
	private String salaryDate;
	
	/**
	 * 其他（出勤。）
	 */
	private Integer other;
	/**
	 * 操作人
	 */
	private Admin operator;
	/**
	 * 确认状态
	 */
	private boolean salaryStatus;
	
	public boolean isSalaryStatus() {
		return salaryStatus;
	}
	public void setSalaryStatus(boolean salaryStatus) {
		this.salaryStatus = salaryStatus;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salary(Long salaryId, Employee employee, String salaryDate, Integer other, Admin operator) {
		super();
		this.salaryId = salaryId;
		this.employee = employee;
		this.salaryDate = salaryDate;
		this.other = other;
		this.operator = operator;
		this.salaryStatus = false;
	}
	public Long getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(Long salaryId) {
		this.salaryId = salaryId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getSalaryDate() {
		return salaryDate;
	}
	public void setSalaryDate(String salaryDate) {
		this.salaryDate = salaryDate;
	}
	public Integer getOther() {
		return other;
	}
	public void setOther(Integer other) {
		this.other = other;
	}
	public Admin getOperator() {
		return operator;
	}
	public void setOperator(Admin operator) {
		this.operator = operator;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", employee=" + employee + ", salaryDate=" + salaryDate + ", other="
				+ other + ", operator=" + operator + ", salaryStatus=" + salaryStatus + "]";
	}
	
	
}
