package com.bs.admin.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 

* <p>Title: Job</p>  

* <p>Description: 职位实体类</p>  

* @author zhengjian  

* <p> @date 2018年11月21日</p>
 */
public class Job implements Serializable{
	/** serialVersionUID*/ 
	private static final long serialVersionUID = -6937411158625648398L;

	private Long jobId;
	
	/**
	 * 职位名称格式：部门名称+级别。如：市场营销经理，人力资源实习生
	 */
	private String jobName;
	/**
	 * 职位级别
	 */
	private Integer jobLevel;
//	private List<Employee> emps;
	/**
	 * 职位津贴
	 */
	private Integer jobAllowance;
	/**
	 * 职位基础薪资
	 */
	private Integer jobBasicPay;
	
	

	public Job(Long jobId, String jobName, Integer jobLevel, Integer jobAllowance, Integer jobBasicPay) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.jobLevel = jobLevel;
		this.jobAllowance = jobAllowance;
		this.jobBasicPay = jobBasicPay;
	}



	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobName=" + jobName + ", jobLevel=" + jobLevel + ", jobAllowance="
				+ jobAllowance + ", jobBasicPay=" + jobBasicPay + "]";
	}



	public Long getJobId() {
		return jobId;
	}



	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}



	public String getJobName() {
		return jobName;
	}



	public void setJobName(String jobName) {
		this.jobName = jobName;
	}



	public Integer getJobLevel() {
		return jobLevel;
	}



	public void setJobLevel(Integer jobLevel) {
		this.jobLevel = jobLevel;
	}



	public Integer getJobAllowance() {
		return jobAllowance;
	}



	public void setJobAllowance(Integer jobAllowance) {
		this.jobAllowance = jobAllowance;
	}



	public Integer getJobBasicPay() {
		return jobBasicPay;
	}



	public void setJobBasicPay(Integer jobBasicPay) {
		this.jobBasicPay = jobBasicPay;
	}



	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
