package com.bs.admin.pojo;
/**
 * 

* <p>Title: JobData</p>  

* <p>Description: </p>  
	用于动态获取数据库中的职位名，并填入前端下拉菜单框
* @author zhengjian  

* <p> @date 2018年11月28日</p>
 */
public class JobData {
	private String id;
	private String text;
	private boolean selected;
	@Override
	public String toString() {
		return "JobData [id=" + id + ", text=" + text + ", selected=" + selected + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public JobData(String id, String text, boolean selected) {
		super();
		this.id = id;
		this.text = text;
		this.selected = selected;
	}
	public JobData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
