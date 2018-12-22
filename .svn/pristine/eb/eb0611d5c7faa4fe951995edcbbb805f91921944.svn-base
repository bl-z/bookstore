package com.bs.admin.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Title: Activity
 * </p>
 * <p>
 * Description:
 * </p>
 * 用来描述营销活动的实体类
 * 
 * @author zbl
 *         <p>
 * @date 2018年11月21日
 *       </p>
 */
public class Activity {

	private Integer activityId;
	private String activityName;
	private Integer activityDiscount;
	private String activityStart;
	private String activityEnd;
	private Set<Book> books =new HashSet<>();

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Integer getActivityDiscount() {
		return activityDiscount;
	}

	public void setActivityDiscount(Integer activityDiscount) {
		this.activityDiscount = activityDiscount;
	}

	public String getActivityStart() {
		return activityStart;
	}

	public void setActivityStart(String activityStart) {
		this.activityStart = activityStart;
	}

	public String getActivityEnd() {
		return activityEnd;
	}

	public void setActivityEnd(String activityEnd) {
		this.activityEnd = activityEnd;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "[" + activityId + " " + activityName + " " + activityDiscount + " " + activityStart + " " + activityEnd
				+ " " + books + "]";
	}

	public Activity(String activityName, Integer activityDiscount, String activityStart, String activityEnd) {
		this.activityName = activityName;
		this.activityDiscount = activityDiscount;
		this.activityStart = activityStart;
		this.activityEnd = activityEnd;

	}

	public Activity(Integer activityId, String activityName, Integer activityDiscount, String activityStart,
			String activityEnd) {
		this.activityId = activityId;
		this.activityName = activityName;
		this.activityDiscount = activityDiscount;
		this.activityStart = activityStart;
		this.activityEnd = activityEnd;
	}

	public Activity() {

	}

}
