package com.bs.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.CouponDao;
import com.bs.admin.mapper.CouponMapper;
import com.bs.admin.pojo.Coupon;

@Repository
public class CouponDaoImpl implements CouponDao {
	@Autowired
	private CouponMapper cm;

	@Override
	public List<String> getAllCouponName() {
		// 获取所有的优惠券的对象
		List<Coupon> coupons = cm.getAllCouponName();
		// 创建优惠券名的集合
		List<String> names = new ArrayList<String>();
		// 遍历添加
		for (Coupon coupon : coupons) {
			names.add(coupon.getCouponName());
		}
		return names;
	}
	
	@Override
	public List<String> getAllCouponStatus() {
		List<Coupon> CouponStatus = cm.getAllCouponStatus();
		List<String> status = new ArrayList<String>();
		for (Coupon coupon : CouponStatus) {
			status.add(coupon.getCouponStatus());
		}	
		return status;
	}

	@Override
	public List<Coupon> getAllCoupon(Integer start, Integer end, String couponName, String couponStart, String couponEnd, String couponStatus) {
		return cm.getAllCoupon(start, end, couponName, couponStart, couponEnd, couponStatus);
	}

	@Override
	public Integer getCouponTotal(String couponName, String couponStart, String couponEnd, String couponStatus) {
		return cm.getCouponTotal(couponName, couponStart, couponEnd, couponStatus);
	}
	
	@Override
	public Integer addCoupon(Coupon coupon) {
		return cm.insertCoupon(coupon);
	}

	@Override
	public Coupon getCouponIdByCoupon(Coupon coupon) {
		return cm.getCouponIdByCoupon(coupon);
	}

	@Override
	public Integer updateCouponByCoupon(Coupon coupon) {
		return cm.updateCouponByCoupon(coupon);
	}

	@Override
	public Integer delCoupon(Integer couponId) {
		return cm.delCoupon(couponId);
	}
}
