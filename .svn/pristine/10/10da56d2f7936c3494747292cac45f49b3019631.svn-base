package com.bs.admin.service;

import java.util.List;


import com.bs.admin.pojo.StockPojo;
import com.bs.admin.util.JsonData;

public interface StockOperateService {
	
	Integer postStock(StockPojo StockPojo);
	
	JsonData postStockBatch(String listStr);
	
	Integer putStockNumBatch(List <StockPojo> stockList);
	
	List<StockPojo> getBookStockForSale(Integer bookId);
	
	List<StockPojo>  getBookStockForSaleBatch(List<StockPojo> List);
}
