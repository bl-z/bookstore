package com.bs.admin.service;

import java.util.List;

import com.bs.admin.pojo.Financial;
import com.bs.admin.pojo.FinancialDatas;
import com.bs.admin.pojo.Order;
import com.bs.admin.pojo.OrderModel;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.Purchase;
import com.bs.admin.pojo.QueryBoxData;
import com.bs.admin.pojo.Salary;
import com.bs.admin.util.JsonData;

public interface FinancialService {

	/**
	 * 获取财务收入、支出
	 * 
	 * @return 集合
	 */
	List<QueryBoxData> getAllStastus();

	/**
	 * 获取财务类型
	 * 
	 * @return 类型集合
	 */
	List<QueryBoxData> getAllTypes();

	/**
	 * 支出信息添加
	 * 
	 * @return JsonData
	 */
	Integer addFinancial(Financial financial);

	/**
	 * 支出信息删除
	 * 
	 * @return JsonData
	 */
	Integer delFinancial(Financial financial);

	/**
	 * 支出信息修改
	 * 
	 * @return
	 */
	Integer updateFinancial(Financial financial);

	/**
	 * 页面数据集合
	 * 
	 * @return PageData集合
	 */
	PageData<Financial> getAllFinancial(Integer pageNum, Integer pageSize, String financialStatus, String financialTypes, String financialStart, String financialEnd);

	PageData<Salary> getSalaryData(Integer pageNum, Integer pageSize);
	
	JsonData addSalaryExpend(List<FinancialDatas> financialDatas);
	
	PageData<Purchase> getPurchaseData(Integer pageNum, Integer pageSize);
	
	JsonData addPurchaseExpend(List<FinancialDatas> financialDatas);
	
	PageData<OrderModel> getOrderData(Integer pageNum, Integer pageSize);
	
	JsonData addOrderReveNue(List<FinancialDatas> financialDatas);
}
