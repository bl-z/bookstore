package com.bs.admin.mapper;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Purchase;

/**  

* <p>Title: PurchaseMapper</p>  

* <p>Description: CUD+4R</p>  

* @author 王顺坤  

* <p> @date 2018年12月2日</p>   

*/ 
public interface PurchaseMapper {

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
	Integer deletePurchaseById(@Param("purchaseId") Integer purchaseId);
	
/**  
	
	 * <p>Title: updatePurchaseStatusToStock</p>  
	
	 * <p>Description： 判断数据库中采购项的是否和库存值相同，相同则修改状态为4（已入库状态）</p>  
	
	 * @param purchaseId
	 * @return  
	 * <p> @date 2018年12月14日  </p> 
	 */
	
	Integer updatePurchaseStatusToStock(@Param("purchaseId")Integer purchaseId);
	
	
	/**  
	
	 * <p>Title: updatePurchaseStatusToStockBatch</p>  
	
	 * <p>Description: 批量更新库存状态</p>  
	
	 * @param purchaseId
	 * @return  
	 * <p> @date 2018年12月14日  </p> 
	 */
	Integer updatePurchaseStatusToStockBatch(@Param("list")List<Integer> purchaseId);
	
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
	
	 * <p>Title: selectPurchaseStatus3</p>  
	
	 * <p>Description: 查询状态为待入库的订单</p>  
	
	 * @return  
	 * <p> @date 2018年12月19日  </p> 
	 */
	List<Integer> selectPurchaseStatus3();
	/**  
	
	 * <p>Title: dynamicSelect</p>  
	
	 * <p>Description: </p>  
	
	 * @param purchase
	 * @param startDate
	 * @param endDate
	 * @return  
	 * <p> @date 2018年11月29日  </p> 
	 */
	List<Purchase> dynamicSelect(  @Param("purchase")Purchase purchase,  @Param("startDate") String startDate,@Param("endDate") String endDate);

	/**  
	
	 * <p>Title: selectPurchaseById</p>  
	
	 * <p>Description: 通过id 查找purchase</p>  
	
	 * @param purchaseId
	 * @return  
	 * <p> @date 2018年12月2日  </p> 
	 */
	Purchase selectPurchaseById(@Param("purchaseId") Integer purchaseId);
	List<Purchase> selectPurchaseBuget();
	/**  
	
	 * <p>Title: selectPurchasePay</p>  
	
	 * <p>Description: 获取指定id采购单的总价格</p>  
	
	 * @param purchasePay
	 * @return  
	 * <p> @date 2018年12月3日  </p> 
	 */
	Double selectPurchasePay (@Param("purchaseId") Integer purchaseId);
	
	
}
