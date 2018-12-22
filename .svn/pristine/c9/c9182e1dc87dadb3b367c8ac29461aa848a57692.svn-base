package com.bs.admin.pojo;

import java.io.Serializable;
import java.util.Map;

/**  

* <p>Title: Log</p>  

* <p>Description: 后台管理日志 </p>  


* @author 王顺坤  
* <p> @date 2018年12月8日</p>   

*/ 
public class Log implements Serializable{
	
private Long logId; 

/**
 * 操作账号id
 * 
 * */ 
private Admin operator;


/** 操作类型
 * 1，登陆
 * 2，增加
 * 3，删除
 * 4.修改
 * 0.日志操作（删除）
 * -1.错误
 * */ 
private Integer operateType;
/** operate
 * 具体操作的方法：
 * 
 * 
 * */ 
private String operate;
/** detail
 * 操作细节
 * 传入参数
 * */ 
private String detail;
/** 
 * 传入参数的请求
 * 
 * */ 
private String requestIp;



/** logTime
 * 日志时间  
 * 
 * */ 
private	String logTime;



/** dept
 * 部门数据
 * */ 
private String dept;






public Log(Admin operator, Integer operateType, String operate, String detail, String requestIp, String dept) {
	super();
	this.operator = operator;
	this.operateType = operateType;
	this.operate = operate;
	this.detail = detail;
	this.requestIp = requestIp;
	this.dept = dept;
}



public Log() {
}



public Long getLogId() {
	return logId;
}



public void setLogId(Long logId) {
	this.logId = logId;
}



public Admin getOperator() {
	return operator;
}



public void setOperator(Admin operator) {
	this.operator = operator;
}



public Integer getOperateType() {
	return operateType;
}



public void setOperateType(Integer operateType) {
	this.operateType = operateType;
}



public String getOperate() {
	return operate;
}



public void setOperate(String operate) {
	this.operate = operate;
}



public String getDetail() {
	return detail;
}



public void setDetail(String detail) {
	this.detail = detail;
}



public String getRequestIp() {
	return requestIp;
}



public void setRequestIp(String requestIp) {
	this.requestIp = requestIp;
}



public String getLogTime() {
	return logTime;
}



public void setLogTime(String logTime) {
	this.logTime = logTime;
}



public String getDept() {
	return dept;
}



public void setDept(String dept) {
	this.dept = dept;
}



@Override
public String toString() {
	return "Log [logId=" + logId + ", operator=" + operator + ", operateType=" + operateType + ", operate=" + operate
			+ ", detail=" + detail + ", requestIp=" + requestIp + ", logTime=" + logTime + ", dept=" + dept + "]";
}






}
	

