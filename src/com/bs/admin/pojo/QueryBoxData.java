package com.bs.admin.pojo;

public class QueryBoxData {

	private Integer id;
	private String text;
	private boolean selected;

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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "QueryBoxData [id=" + id + ", text=" + text + ", selected=" + selected + "]";
	}

	public QueryBoxData(Integer id, String text, boolean selected) {
		this.id = id;
		this.text = text;
		this.selected = selected;
	}

	public QueryBoxData() {

	}

}
