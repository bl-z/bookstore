package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Coupon;

public interface CouponMapper {

	/**
	 * 查询所有的couponName
	 * 
	 * @return name集合
	 */
	List<Coupon> getAllCouponName();
	
	/**
	 * 查询所有的类型
	 * 
	 * @return 类型集合
	 */
	List<Coupon> getAllCouponStatus();
	
	/**
	 * 优惠券查询
	 * 
	 * @return 按页返回的集合
	 */
	List<Coupon> getAllCoupon(
			@Param("start") Integer start, 
			@Param("end") Integer end,
			@Param("couponName") String couponName, 
			@Param("couponStart") String couponStart, 
			@Param("couponEnd") String couponEnd,
			@Param("couponStatus") String couponStatus);

	/**
	 * 查询总条数
	 * 
	 * @return 总条数
	 */
	Integer getCouponTotal(
			@Param("couponName") String couponName, 
			@Param("couponStart") String couponStart, 
			@Param("couponEnd") String couponEnd,
			@Param("couponStatus") String couponStatus);

	/**
	 * 查询满足条件的优惠券有无(判断id是否为空)
	 * 
	 * @return coupon
	 */
	Coupon getCouponIdByCoupon(Coupon coupon);

	/**
	 * 添加优惠券
	 *
	 * @return
	 */
	Integer insertCoupon(Coupon coupon);
	
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
	Integer delCoupon(@Param("couponId") Integer couponId);
}
