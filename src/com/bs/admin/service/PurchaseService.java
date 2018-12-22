package com.bs.admin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.Purchase;
import com.bs.admin.pojo.QueryBoxData;

public interface PurchaseService {

	/**  
	
	 * <p>Title: postPurchase</p>  
	
	 * <p>Description: 插入一条新的数据</p>  
	
	 * @param purchaseBatch
	 * @param purchaseDate
	 * @param employee
	 * @param supplier
	 * @param purchaseStatus
	 * @param purchaseLog
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Integer postPurchase(String purchaseBatch, String purchaseDate, Integer employee, Integer supplier,
			String purchaseStatus, String purchaseLog);

	/**  
	
	 * <p>Title: putPurchase</p>  
	
	 * <p>Description: 修改指定id值的采购信息</p>  
	
	 * @param purchaseId   指定的采购id
	 * @param purchaseBatch
	 * @param purchaseDate
	 * @param employee
	 * @param supplier
	 * @param purchaseStatus
	 * @param purchaseLog
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Integer putPurchase(Integer purchaseId,String purchaseBatch, String purchaseDate, Integer employee, Integer supplier,
			String purchaseStatus, String purchaseLog);

	/**  
	
	 * <p>Title: delPurchaseById</p>  
	
	 * <p>Description: 通过id 值删除采购信息 </p>  
	
	 * @param purchaseId
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Integer delPurchaseById( Integer purchaseId);

	/**  
	
	 * <p>Title: getPurchaseById</p>  
	
	 * <p>Description: 通过id 值查询采购数据</p>  
	
	 * @param id
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Purchase getPurchaseById(Integer purchaseId);

	/**  
	
	 * <p>Title: dynamicGet</p>  
	
	 * <p>Description: </p>  
	
	 * @param purchaseBatch 模糊匹配的采购单批次
	 * @param startDate 查询条件的起始日期
	 * @param endDate 查询条件的结束日期
	 * @param employee 员工的id
	 * @param supplier 供应商的id
	 * @param purchaseStatus 采购单状态的字符串形式
	 * @param currentPage 目前的页数
	 * @param pageSize 每页的容量
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	PageData<Purchase> dynamicGet(String purchaseBatch, String startDate, String endDate, Integer employee,
			Integer supplier,
			String purchaseStatus,  Integer currentPage, Integer pageSize);

	/**  
	
	 * <p>Title: getPurchaseBatch</p>  
	
	 * <p>Description:获取所有的批次，去重后返回 </p>  
	
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	List<QueryBoxData> getPurchaseBatch();
	
	
	/**  
	
	 * <p>Title: selectPurchasePay</p>  
	
	 * <p>Description: 获取指定id采购单的总价格</p>  
	
	 * @param purchaseId
	 * @return  
	 * <p> @date 2018年12月3日  </p> 
	 */
	Double getPurchasePay (Integer purchaseId);
}
