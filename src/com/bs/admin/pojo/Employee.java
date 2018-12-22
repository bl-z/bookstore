package com.bs.admin.pojo;

import java.io.Serializable;

/**
 * 

* <p>Title: Employee</p>  

* <p>Description: 员工实体类</p>  

* @author zhengjian  

* <p> @date 2018年11月21日</p>
 */
public class Employee implements Serializable{
	/** serialVersionUID*/ 
	private static final long serialVersionUID = -5679723854154314035L;
	/**
	 * 员工编号
	 */
	private Long empId;
	/**
	 * 员工姓名
	 */
	private String empName;
	/**
	 * 员工部门
	 */
	private String empDept;
	/**
	 * 入职日期
	 */
	private String empHireDate;
	/**
	 * 离职日期
	 */
	private String empQuitDate;
	/**
	 * 员工状态
	 * 1 在职    2 休假    3 离职
	 */
	private Integer empStatus;
	/**
	 * 对应的职位实体
	 */
	private Job job;
	/**
	 * 银行账户
	 */
	private String bankAccount;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpHireDate() {
		return empHireDate;
	}

	public void setEmpHireDate(String empHireDate) {
		this.empHireDate = empHireDate;
	}

	public String getEmpQuitDate() {
		return empQuitDate;
	}

	public void setEmpQuitDate(String empQuitDate) {
		this.empQuitDate = empQuitDate;
	}

	public Integer getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(Integer empStatus) {
		this.empStatus = empStatus;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empHireDate="
				+ empHireDate + ", empQuitDate=" + empQuitDate + ", empStatus=" + empStatus + ", job=" + job
				+ ", bankAccount=" + bankAccount + "]";
	}

	public Employee(Long empId, String empName, String empDept, String empHireDate, String empQuitDate,
			Integer empStatus, Job job, String bankAccount) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empHireDate = empHireDate;
		this.empQuitDate = empQuitDate;
		this.empStatus = empStatus;
		this.job = job;
		this.bankAccount = bankAccount;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
