package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Financial;

public interface FinancialMapper {

	/**
	 * 获取支出、收入
	 * 
	 * @return 类型集合
	 */
	List<Financial> getAllFinancialStatus();

	/**
	 * 获取支出、收入的类型
	 * 
	 * @return 类型集合
	 */
	List<Financial> getAllFinancaialTypes();

	/**
	 * 财务信息查询
	 * 
	 * @return 按页返回的集合
	 */
	List<Financial> getAllFinancial(
			@Param("financialStatus") String financialStatus, 
			@Param("financialTypes") String financialTypes, 
			@Param("financialStart") String financialStart,
			@Param("financialEnd") String financialEnd, 
			@Param("start") Integer start, 
			@Param("end") Integer end);

	/**
	 * 查询总条数
	 * 
	 * @return 总条数
	 */
	Integer getFinancialTotal(
			@Param("financialStatus") String financialStatus, 
			@Param("financialTypes") String financialTypes, 
			@Param("financialStart") String financialStart,
			@Param("financialEnd") String financialEnd);

	/**
	 * 查询满足条件的支出信息有无(判断id是否为空)
	 * 
	 * @return coupon
	 */
	Financial getIdByFinancial(Financial financial);

	/**
	 * 财务信息添加
	 *
	 * @return
	 */
	Integer insertFinancial(Financial financial);

	/**
	 * 财务信息删除
	 *
	 * @return
	 */
	Integer delFinancial(Financial financial);

	/**
	 * 财务信息修改
	 * 
	 * @return Integer
	 */
	Integer updateFinancial(Financial financial);
}
