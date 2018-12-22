package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Stock;
import com.bs.admin.pojo.StockPojo;
import com.bs.admin.pojo.StoreHouse;

public interface StockMapper {
	
	/**  
	
	 * <p>Title: selectBookStock</p>  
	
	 * <p>Description:查询指定Id的书的库存信息 </p>  
	
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月12日  </p> 
	 */
	List<Stock> selectBookStock(@Param("bookId") Integer bookId,@Param("min") Integer min,@Param("max") Integer max);
	/**  
	
	 * <p>Title: selectBookStockNum</p>  
	
	 * <p>Description: </p>  
	
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月12日  </p> 
	 */
	Integer selectBookStockNum(@Param("bookId") Integer bookId);
	
	
	
	/**  
	
	 * <p>Title: selectStockNumRange</p>  
	
	 * <p>Description: 查询一定数量的库存</p>  
	
	 * @param min
	 * @param max
	 * @return  
	 * <p> @date 2018年12月13日  </p> 
	 */
	List<Stock>selectStockNumRange(@Param("min") Integer min,@Param("max") Integer max);
	

	/**  
	
	 * <p>Title: dynamicSelect</p>  
	
	 * <p>Description: </p>  
	
	 * @param purchaseBatch
	 * @param bookName
	 * @param startTime
	 * @param endTime
	 * @param storeHouse
	 * @return  
	 * <p> @date 2018年12月13日  </p> 
	 */
	List<Stock> dynamicSelect(@Param("purchaseBatch") String purchaseBatch,@Param("bookName") String bookName,@Param("startTime") String  startTime,@Param("endTime") String  endTime ,@Param("storeHouseId") Integer storeHouseId ,@Param("min") Integer min,@Param("max") Integer max);

	
	
	List<Stock> selectVStock(@Param("bookName") String bookName,@Param("min") Integer min,@Param("max") Integer max);
	
	
}
