package com.bs.admin.pojo;

/**
 * 
* <p>Title: Express</p>  
* <p>Description: 快递</p>  
* @author 胡杰  
* <p> @date 2018年12月6日</p>
 */
public class Express {

	private Integer expressId;
	private String expressName;
	private String expressNum;
	private Double expressCost;
	private String expressStatus;
	
	public Express(Integer expressId, String expressName, String expressNum, Double expressCost, String expressStatus) {
		this.expressId = expressId;
		this.expressName = expressName;
		this.expressNum = expressNum;
		this.expressCost = expressCost;
		this.expressStatus = expressStatus;
	}

	public Express() {
	}

	@Override
	public String toString() {
		return "Express [expressId=" + expressId + ", expressName=" + expressName + ", expressNum=" + expressNum
				+ ", expressCost=" + expressCost + ", expressStatus=" + expressStatus + "]";
	}

	public Integer getExpressId() {
		return expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getExpressNum() {
		return expressNum;
	}

	public void setExpressNum(String expressNum) {
		this.expressNum = expressNum;
	}

	public Double getExpressCost() {
		return expressCost;
	}

	public void setExpressCost(Double expressCost) {
		this.expressCost = expressCost;
	}

	public String getExpressStatus() {
		return expressStatus;
	}

	public void setExpressStatus(String expressStatus) {
		this.expressStatus = expressStatus;
	}
	
}
