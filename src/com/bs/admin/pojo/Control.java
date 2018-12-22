package com.bs.admin.pojo;

import java.io.Serializable;
/**
 * controller实体
 * @author Administrator
 *
 */
public class Control implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3441314798330029393L;
	/**
	 * id
	 */
	private Integer controlId;
	/**
	 * controller的requestMapping
	 */
	private String controlMapping;
	/**
	 * 对应的permission权限对象
	 */
	private Permission permission;
	@Override
	public String toString() {
		return "Control [controlId=" + controlId + ", controlMapping=" + controlMapping + ", permission=" + permission
				+ "]";
	}
	public Control(Integer controlId, String controlMapping, Permission permission) {
		super();
		this.controlId = controlId;
		this.controlMapping = controlMapping;
		this.permission = permission;
	}
	public Control() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getControlId() {
		return controlId;
	}
	public void setControlId(Integer controlId) {
		this.controlId = controlId;
	}
	public String getControlMapping() {
		return controlMapping;
	}
	public void setControlMapping(String controlMapping) {
		this.controlMapping = controlMapping;
	}
	public Permission getPermission() {
		return permission;
	}
	public void setPermission(Permission permission) {
		this.permission = permission;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
