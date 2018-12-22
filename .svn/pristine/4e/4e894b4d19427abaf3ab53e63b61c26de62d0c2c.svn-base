package com.bs.admin.pojo;

import java.io.Serializable;

/**
 * 

* <p>Title: Attendance</p>  

* <p>Description: </p>  
	考勤实体类
* @author zhengjian  

* <p> @date 2018年12月5日</p>
 */
public class Attendance implements Serializable{
	
	/** serialVersionUID*/ 
	private static final long serialVersionUID = -5475045619049039960L;
	/**
	 * 编号
	 */
	private Long attendanceId;
	/**
	 * 对应员工
	 */
	private Employee emp;
	/**
	 * 出勤天数
	 */
	private Integer workDay;
	/**
	 * 请假天数
	 */
	private Integer leaveDay;
	/**
	 * 迟到天数
	 */
	private Integer lateDay;
	/**
	 * 早退天数
	 */
	private Integer earlyDay;
	/**
	 * 操作日期
	 */
	private String attDate;
	/**
	 * 操作者（后台管理员）
	 */
	private Admin operator;
	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", emp=" + emp + ", workDay=" + workDay + ", leaveDay="
				+ leaveDay + ", lateDay=" + lateDay + ", earlyDay=" + earlyDay + ", attDate=" + attDate + ", operator="
				+ operator + "]";
	}
	public Long getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Integer getWorkDay() {
		return workDay;
	}
	public void setWorkDay(Integer workDay) {
		this.workDay = workDay;
	}
	public Integer getLeaveDay() {
		return leaveDay;
	}
	public void setLeaveDay(Integer leaveDay) {
		this.leaveDay = leaveDay;
	}
	public Integer getLateDay() {
		return lateDay;
	}
	public void setLateDay(Integer lateDay) {
		this.lateDay = lateDay;
	}
	public Integer getEarlyDay() {
		return earlyDay;
	}
	public void setEarlyDay(Integer earlyDay) {
		this.earlyDay = earlyDay;
	}
	public String getAttDate() {
		return attDate;
	}
	public void setAttDate(String attDate) {
		this.attDate = attDate;
	}
	public Admin getOperator() {
		return operator;
	}
	public void setOperator(Admin operator) {
		this.operator = operator;
	}
	public Attendance(Long attendanceId, Employee emp, Integer workDay, Integer leaveDay, Integer lateDay,
			Integer earlyDay, String attDate, Admin operator) {
		super();
		this.attendanceId = attendanceId;
		this.emp = emp;
		this.workDay = workDay;
		this.leaveDay = leaveDay;
		this.lateDay = lateDay;
		this.earlyDay = earlyDay;
		this.attDate = attDate;
		this.operator = operator;
	}
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
