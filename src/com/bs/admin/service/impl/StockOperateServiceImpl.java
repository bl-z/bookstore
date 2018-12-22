package com.bs.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.bs.admin.dao.StockOperateDao;
import com.bs.admin.pojo.PurchaseItem;
import com.bs.admin.pojo.StockPojo;
import com.bs.admin.service.StockOperateService;
import com.bs.admin.util.JsonData;


@Service
public class StockOperateServiceImpl implements StockOperateService {
@Autowired
private StockOperateDao sod;

@Override
public Integer postStock(StockPojo StockPojo) {

	return sod.insertStock(StockPojo);
}

@Override
public JsonData postStockBatch(String SPlist) {
	List<StockPojo>  spTo= new ArrayList<StockPojo>();
	List<StockPojo> spFrom  =JSON.parseArray(SPlist,StockPojo.class);
	int size = spFrom.size();	
	Integer num=0;
	for(int i=0;i<size;i++){
		StockPojo p = spFrom.get(i);
		
		Integer stockNum = p.getStockNum();
		num+=stockNum;
		spTo.add(new StockPojo(p.getBookId(), p.getPurchaseItemId(),stockNum , 3));
	}
	Integer row = sod.insertStockBatch(spTo);
	
	return new JsonData("入库成功", row, "入库"+num+"册书", true);
}

@Override
public Integer putStockNumBatch(List<StockPojo> stockList) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<StockPojo> getBookStockForSale(Integer bookId) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<StockPojo> getBookStockForSaleBatch(List<StockPojo> List) {
	// TODO Auto-generated method stub
	return null;
}
}
