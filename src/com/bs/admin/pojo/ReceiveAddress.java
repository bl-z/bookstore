package com.bs.admin.pojo;

/**
 * 
* <p>Title: ReceiveAddress</p>  
* <p>Description: 收货地址</p>  
* @author 胡杰  
* <p> @date 2018年12月6日</p>
 */
public class ReceiveAddress {

	private Integer addressId;
	private Integer userId;
	/**
	 * 收货人
	 */
	private String addressConsignee;
	/**
	 * 移动电话
	 */
	private String addressMobile;
	/**
	 * 省份
	 */
	private String addressProvince;
	/**
	 * 城市
	 */
	private String addressCity;
	/**
	 * 县/区
	 */
	private String addressCounty;
	/**
	 * 具体地址：xx街道x号
	 */
	private String addressDetail;
	/**
	 * 状态
	 */
	private String addressStatus;
	
	public ReceiveAddress(Integer addressId, Integer userId, String addressConsignee, String addressMobile,
			String addressProvince, String addressCity, String addressCounty, String addressDetail,
			String addressStatus) {
		this.addressId = addressId;
		this.userId = userId;
		this.addressConsignee = addressConsignee;
		this.addressMobile = addressMobile;
		this.addressProvince = addressProvince;
		this.addressCity = addressCity;
		this.addressCounty = addressCounty;
		this.addressDetail = addressDetail;
		this.addressStatus = addressStatus;
	}

	public ReceiveAddress() {
	}

	@Override
	public String toString() {
		return "ReceiveAddress [addressId=" + addressId + ", userId=" + userId + ", addressConsignee="
				+ addressConsignee + ", addressMobile=" + addressMobile + ", addressProvince=" + addressProvince
				+ ", addressCity=" + addressCity + ", addressCounty=" + addressCounty + ", addressDetail="
				+ addressDetail + ", addressStatus=" + addressStatus + "]";
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAddressConsignee() {
		return addressConsignee;
	}

	public void setAddressConsignee(String addressConsignee) {
		this.addressConsignee = addressConsignee;
	}

	public String getAddressMobile() {
		return addressMobile;
	}

	public void setAddressMobile(String addressMobile) {
		this.addressMobile = addressMobile;
	}

	public String getAddressProvince() {
		return addressProvince;
	}

	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressCounty() {
		return addressCounty;
	}

	public void setAddressCounty(String addressCounty) {
		this.addressCounty = addressCounty;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getAddressStatus() {
		return addressStatus;
	}

	public void setAddressStatus(String addressStatus) {
		this.addressStatus = addressStatus;
	}
	
	
}
