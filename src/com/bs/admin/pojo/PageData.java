package com.bs.admin.pojo;

import java.util.ArrayList;
import java.util.List;
/**
 * 

* <p>Title: PageData</p>  

* <p>Description: </p>  
	某种对象分页列表当前页的数据。
	rows  : 存放对象的集合
	total : 满足条件的总记录条数
* @author zhengjian  

* <p> @date 2018年11月26日</p>
 */
public class PageData<T> {
	/**
	 * 存放对象
	 */
	private List<T> rows = new ArrayList<T>();
	/**
	 * 满足条件的总记录条数
	 */
	private Integer total;
	
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "PageData [rows=" + rows + ", total=" + total + "]";
	}
	public PageData(List<T> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public PageData() {
		super();
		// TODO Auto-generated constructor stub
	}
}
