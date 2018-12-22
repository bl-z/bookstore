package com.bs.admin.pojo;

public class CategoryOrStatus {

	private Integer id;
	private String text;
	private Boolean selected;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	public CategoryOrStatus(Integer id, String text, Boolean selected) {
		this.id = id;
		this.text = text;
		this.selected = selected;
	}
	public CategoryOrStatus() {
	}
	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", text=" + text + ", selected=" + selected + "]";
	}
	
	
	
}
