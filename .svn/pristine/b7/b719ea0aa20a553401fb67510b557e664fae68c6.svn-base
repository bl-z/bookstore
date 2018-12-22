package com.bs.admin.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * 管理员可以代表的角色
 * @author Administrator
 *
 */
public class Permission implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2416251981950995383L;
	private Long permissonId;
	private String permissionName;
	private List<Control> controls;
	public Long getPermissonId() {
		return permissonId;
	}
	public void setPermissonId(Long permissonId) {
		this.permissonId = permissonId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Permission(Long permissonId, String permissionName) {
		super();
		this.permissonId = permissonId;
		this.permissionName = permissionName;
	}
	public List<Control> getControls() {
		return controls;
	}
	public void setControls(List<Control> controls) {
		this.controls = controls;
	}
	@Override
	public String toString() {
		return "Permission [permissonId=" + permissonId + ", permissionName=" + permissionName + ", Controls="
				+ controls + "]";
	}
	
}
