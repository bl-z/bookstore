package com.bs.admin.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Purchase;

public interface PurchaseDao {
/**  
	
	 * <p>Title: insertPurchase</p>  
	
	 * <p>Description: 添加一个采购信息</p>  
	
	 * @param purchase
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Integer insertPurchase(Purchase purchase);

	/**  
	
	 * <p>Title: deletePurchaseById</p>  
	
	 * <p>Description: 通过id 删除采购信息</p>  
	
	 * @param purchaseId
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Integer deletePurchaseById(Integer purchaseId);

	/**  
	
	 * <p>Title: updatePurchase</p>  
	
	 * <p>Description: 更新一个采购信息</p>  
	
	 * @param purchase
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Integer updatePurchase(Purchase purchase);

	/**  
	
	 * <p>Title: selectPurchaseBatch</p>  
	
	 * <p>Description: 选择出所有的批次 </p>  
	
	 * @return  
	 * <p> @date 2018年11月29日  </p> 
	 */
	List<String> selectPurchaseBatch();

	/**  
	
	 * <p>Title: dynamicSelect</p>  
	
	 * <p>Description: </p>  
	
	 * @param purchase
	 * @param startDate
	 * @param endDate
	 * @return  
	 * <p> @date 2018年11月29日  </p> 
	 */
				
	List<Purchase> dynamicSelect(  Purchase purchase,   String startDate, String endDate);
	/**  
	
	 * <p>Title: selectPurchaseBuget</p>  
	
	 * <p>Description: 查询所有计划中的采购的支出</p>  
	
	 * @return  
	 * <p> @date 2018年12月20日  </p> 
	 */
	List<Purchase>selectPurchaseBuget();

	/**  
	
	 * <p>Title: selectPurchaseById</p>  
	
	 * <p>Description: 通过id 查找purchase</p>  
	
	 * @param purchaseId
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Purchase selectPurchaseById(Integer purchaseId);
	
	/**  
	
	 * <p>Title: selectPurchasePay</p>  
	
	 * <p>Description: 获取指定id采购单的总价格</p>  
	
	 * @param purchasePay
	 * @return  
	 * <p> @date 2018年12月3日  </p> 
	 */
	Double selectPurchasePay ( Integer purchaseId);
}

