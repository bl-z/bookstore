package com.bs.admin.dao;

import java.util.List;

import com.bs.admin.pojo.Coupon;

public interface CouponDao {
	
	/**
	 * 查询所有的couponName
	 * 
	 * @return name集合
	 */
	List<String> getAllCouponName();
	
	/**
	 * 查询所有的类型
	 * 
	 * @return 类型展示集合
	 */
	List<String> getAllCouponStatus();

	/**
	 * 优惠券查询
	 * 
	 * @return 按页返回的集合
	 */
	List<Coupon> getAllCoupon(Integer start,Integer end, String couponName,String couponStart ,String couponEnd, String couponStatus);
	
	/**
	 * 查询总条数
	 * 
	 * @return 总条数
	 */
	Integer getCouponTotal(String couponName, String couponStart, String couponEnd, String couponStatus);

	/**
	 * 查询满足条件的优惠券有无
	 * 
	 * @return coupon
	 */
	Coupon getCouponIdByCoupon(Coupon coupon);

	/**
	 * 优惠券发放(添加优惠券)
	 * 
	 * @return Integer
	 */
	Integer addCoupon(Coupon coupon);
	
	/**
	 * 优惠券数量修改
	 * 
	 * @return Integer
	 */
	Integer updateCouponByCoupon(Coupon coupon);

	/**
	 * 优惠券取消
	 * 
	 * 会删除用户已领取的
	 */
	Integer delCoupon(Integer couponId);
}
