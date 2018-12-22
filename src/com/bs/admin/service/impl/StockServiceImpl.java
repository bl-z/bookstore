package com.bs.admin.service.impl;


import java.util.List;

import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.StockDao;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.Stock;
import com.bs.admin.service.StockService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class StockServiceImpl  implements StockService{
@Autowired
private StockDao sd;
	@Override
	
	
	
	
	public PageData<Stock> getStockByBookId(Integer bookId, Integer min, Integer max, String order,Integer currentPage, Integer pageSize) {
		
		
		if(bookId==null){
			return null;
		}
		if(min!=null&&max!=null){
			if(min>max){
				int i= max;
					max=min;
					min=i;
			}
		}
		
		PageHelper.startPage(currentPage, pageSize);
		if(order!=null&&order!=""){
			PageHelper.orderBy("stock_num "+order);
		}
		List<Stock> rows = sd.selectBookStock(bookId, min, max);
		Long total = new PageInfo<>(rows).getTotal();
		
		return new PageData<>(rows, total.intValue());
	}

	@Override
	public Integer getStockNumByBookId(Integer bookId) {
		if(bookId==0){
			return 0;
		}
		return sd.selectBookStockNum(bookId);
	}

	@Override
	public PageData<Stock> getStockNumRange(Integer min, Integer max, Integer currentPage, Integer pageSize) {
		
		if(min>max){
			int i= max;
				max=min;
				min=i;
		}
		PageHelper.startPage(currentPage, pageSize);
		List<Stock> rows = sd.selectStockNumRange(min, max);
		Long total = new PageInfo<>(rows).getTotal();
		
		return new PageData<>(rows,total.intValue());
	}

	@Override
	public PageData<Stock> dynamicGet(String purchaseBatch, String bookName, String startTime, String endTime,
			Integer storeHouseId, Integer min, Integer max, Integer currentPage, Integer pageSize) {
		
		if(min>max){
			int i= max;
				max=min;
				min=i;
		}
		
		PageHelper.startPage(currentPage, pageSize);
		List<Stock> rows = sd.dynamicSelect(purchaseBatch, bookName, startTime, endTime, storeHouseId, min, max);
		Long total = new PageInfo<>(rows).getTotal();
		return  new PageData<>(rows,total.intValue());
	}

	@Override
	public PageData<Stock> getVStock(String bookName,Integer min,Integer max, String order,Integer currentPage,Integer pageSize) {
		

		PageHelper.startPage(currentPage, pageSize);
		if(order!=null&&order!=""){
			PageHelper.orderBy("stock_num "+order);
		}
		List<Stock> rows = sd.selectVStock(bookName,min,max);
		Long total = new PageInfo<>(rows).getTotal();
		return new PageData<>(rows,total.intValue());
	}

	

}
