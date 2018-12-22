package com.bs.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.Coupon;
import com.bs.admin.service.CouponService;
import com.bs.admin.util.DateUtil;
import com.bs.admin.util.JsonData;

@Controller
@RequestMapping(value = "coupon")
public class CouponController {
	@Autowired
	private CouponService cs;
	
	/**
	 * 转到页面
	 * 
	 * @return 转到优惠券管理页面
	 */
	@RequestMapping("pagination")
	public String toEmpPage() {
		return "CouponManagement";
	}

	/**
	 * 所有的couponName
	 * 
	 * @return 页面JSON数据
	 */
	@RequestMapping(value = "allCouponName", produces = "text/html;charset=UTF-8")
	public @ResponseBody String allCouponName() {
		return JSON.toJSONString(cs.getAllCouponName());
	}
	
	/**
	 * 所有的类型
	 * 
	 * @return 类型数据
	 */
	@RequestMapping(value = "allStatus", produces = "text/html;charset=UTF-8")
	public @ResponseBody String allCouponStatus() {
		return JSON.toJSONString(cs.getAllCouponStatus());
	}

	/**  
	 * <p>Title: allCoupon</p>  
	 * <p>Description: 分页查询优惠券数据</p>  
	 * @param pageNum 
	 * @param pageSize
	 * @param couponName 优惠券名
	 * @param couponStart 优惠开始时间
	 * @param couponEnd 优惠结束时间
	 * @param couponStatus 优惠券类型
	 * @return  
	 * <p> @date 2018年12月18日  </p> 
	 */
	@RequestMapping(value = "allCoupon/{pageNum}/{pageSize}", produces = "text/html;charset=UTF-8")
	public @ResponseBody String allCoupon(
			@PathVariable("pageNum") Integer pageNum,
			@PathVariable("pageSize") Integer pageSize,
			@RequestParam("couponName") String couponName,
			@RequestParam("couponStart") String couponStart, 
			@RequestParam("couponEnd") String couponEnd,
			@RequestParam("couponStatus") String couponStatus) {	
		return JSON.toJSONString(cs.getAllCoupon(pageNum, pageSize, couponName, couponStart, couponEnd, couponStatus));
	}
	
	/**
	 * 添加优惠券
	 * 
	 * @return jsonData
	 */
	@SystemControllerLog(type=2, description="添加优惠券信息")
	@RequestMapping(value = "addCoupon", produces = "application/json;charset=utf-8")
	public @ResponseBody JsonData addCoupon(
			@RequestParam("couponName") String couponName,
			@RequestParam("couponMoney") Integer couponMoney,
			@RequestParam("couponNum") Integer couponNum,
			@RequestParam("couponStart") String couponStart,
			@RequestParam("couponEnd") String couponEnd,
			@RequestParam("couponRemainNum")Integer couponRemainNum,
			@RequestParam("couponStatus") String couponStatus) {
		String datecouponStart = DateUtil.changeDateString(couponStart);
		String datecouponEnd = DateUtil.changeDateString(couponEnd);
		return cs.addCoupon(new Coupon(couponName, couponMoney, couponNum, datecouponStart, datecouponEnd, couponRemainNum,couponStatus));
	}
	
	/**  
	 * <p>Title: updateActivity</p>  
	 * <p>Description: 优惠券批量修改</p>  
	 * @param coupons
	 * @return  
	 * <p> @date 2018年12月18日  </p> 
	 */
	@SystemControllerLog(type=2, description="批量编辑优惠券信息")
	@RequestMapping(value = "updateCoupon", produces="application/json;charset=utf-8")
	public @ResponseBody JsonData updateActivity(
			@RequestBody List<Coupon> coupons) {
		return cs.updataCoupon(coupons);
	}
	
	/**  
	 * <p>Title: delActivity</p>  
	 * <p>Description: 优惠券批量删除</p>  
	 * @param coupons
	 * @return  
	 * <p> @date 2018年12月18日  </p> 
	 */
	@SystemControllerLog(type=2, description="批量删除优惠券信息")
	@RequestMapping(value = "delCoupon", produces="application/json;charset=utf-8")
	public @ResponseBody JsonData delActivity(
			@RequestBody List<Coupon> coupons){
		return cs.delCoupon(coupons);
	}


}
