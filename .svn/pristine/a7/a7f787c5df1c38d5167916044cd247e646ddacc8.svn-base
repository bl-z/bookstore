package com.bs.admin.dao;

import java.util.List;


import com.bs.admin.pojo.StockPojo;

public interface StockOperateDao {
	
	Integer insertStock(StockPojo StockPojo);
	
	Integer insertStockBatch(List <StockPojo> stockList);

	Integer updateStockNumBatch(List <StockPojo> stockList);

	List<StockPojo> selectBookStockForSale(Integer bookId);
	
	
	List<StockPojo>  selectBookStockForSaleBatch(List<StockPojo> List);
	

}
