package com.bs.admin.util;

/**
 * 属性表格数据类
 * @author asus
 *
 */
public class PropertyGridData {
	private String name;
	private String value;
	private String group;
	private String editor;
	public PropertyGridData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertyGridData(String name, String value, String group, String editor) {
		super();
		this.name = name;
		this.value = value;
		this.group = group;
		this.editor = editor;
	}
	@Override
	public String toString() {
		return "PropertygridData [name=" + name + ", value=" + value + ", group=" + group + ", editor=" + editor + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	
}
