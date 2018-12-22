package com.bs.admin.pojo;

public class Coupon {

	private Integer couponId;
	private String couponName;
	private Integer couponMoney;
	private Integer couponNum;
	private String couponStart;
	private String couponEnd;
	private Integer couponRemainNum;
	private String couponStatus;

	public Integer getCouponId() {
		return couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getCouponMoney() {
		return couponMoney;
	}

	public void setCouponMoney(Integer couponMoney) {
		this.couponMoney = couponMoney;
	}

	public Integer getCouponNum() {
		return couponNum;
	}

	public void setCouponNum(Integer couponNum) {
		this.couponNum = couponNum;
	}

	public String getCouponStart() {
		return couponStart;
	}

	public void setCouponStart(String couponStart) {
		this.couponStart = couponStart;
	}

	public String getCouponEnd() {
		return couponEnd;
	}

	public void setCouponEnd(String couponEnd) {
		this.couponEnd = couponEnd;
	}

	public Integer getCouponRemainNum() {
		return couponRemainNum;
	}

	public void setCouponRemainNum(Integer couponRemainNum) {
		this.couponRemainNum = couponRemainNum;
	}

	public String getCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponName=" + couponName + ", couponMoney=" + couponMoney
				+ ", couponNum=" + couponNum + ", couponStart=" + couponStart + ", couponEnd=" + couponEnd
				+ ", couponRemainNum=" + couponRemainNum + ", couponStatus=" + couponStatus + "]";
	}

	public Coupon(Integer couponId, Integer couponNum, Integer couponRemainNum) {
		this.couponId = couponId;
		this.couponNum = couponNum;
		this.couponRemainNum = couponRemainNum;
	}

	public Coupon(String couponName, Integer couponMoney, Integer couponNum, String couponStart, String couponEnd,
			Integer couponRemainNum, String couponStatus) {
		this.couponName = couponName;
		this.couponMoney = couponMoney;
		this.couponNum = couponNum;
		this.couponStart = couponStart;
		this.couponEnd = couponEnd;
		this.couponRemainNum = couponRemainNum;
		this.couponStatus = couponStatus;
	}

	public Coupon(Integer couponId, String couponName, Integer couponMoney, Integer couponNum, String couponStart,
			String couponEnd, Integer couponRemainNum, String couponStatus) {
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponMoney = couponMoney;
		this.couponNum = couponNum;
		this.couponStart = couponStart;
		this.couponEnd = couponEnd;
		this.couponRemainNum = couponRemainNum;
		this.couponStatus = couponStatus;
	}

	public Coupon() {

	}

}
