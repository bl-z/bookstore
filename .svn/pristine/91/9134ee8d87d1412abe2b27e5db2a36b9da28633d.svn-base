package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.StockPojo;

public interface StockPoJoMapper {
	Integer insertStock(StockPojo StockPojo);
	/**  
	
	 * <p>Title: insertStockBatch</p>  
	
	 * <p>Description: 批量添加stock  信息</p>  
	
	 * @param stockList
	 * @return  
	 * <p> @date 2018年12月12日  </p> 
	 */
	Integer insertStockBatch(List <StockPojo> stockList);
	/**  
	
	 * <p>Title: updateStockNumBatch</p>  
	
	 * <p>Description: 批量修改stock信息</p>  
	
	 * @param stockList
	 * @return  
	 * <p> @date 2018年12月12日  </p> 
	 */
	Integer updateStockNumBatch(List <StockPojo> stockList);
	/**  
	
	 * <p>Title: selectBookStockForSale</p>  
	
	 * <p>Description: 查询当前需要修改stock dui应的stock_id</p>  
	
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月12日  </p> 
	 */
	List<StockPojo> selectBookStockForSale(@Param("bookId") Integer bookId);
	
	
	List<StockPojo>  selectBookStockForSaleBatch(List<StockPojo> List);
}
