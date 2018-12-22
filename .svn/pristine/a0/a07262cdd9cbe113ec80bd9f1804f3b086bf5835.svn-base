package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.StockOperateDao;
import com.bs.admin.mapper.StockPoJoMapper;
import com.bs.admin.pojo.StockPojo;
@Repository
public class StockOperateDaoImpl implements StockOperateDao{
@Autowired StockPoJoMapper spm;
	@Override
	public Integer insertStock(StockPojo StockPojo) {
		// TODO Auto-generated method stub
		return spm.insertStock(StockPojo);
	}

	@Override
	public Integer insertStockBatch(List<StockPojo> stockList) {
		// TODO Auto-generated method stub
		return spm.insertStockBatch(stockList);
	}

	@Override
	public Integer updateStockNumBatch(List<StockPojo> stockList) {
		// TODO Auto-generated method stub
		return spm.updateStockNumBatch(stockList);
	}

	@Override
	public List<StockPojo> selectBookStockForSale(Integer bookId) {
		// TODO Auto-generated method stub
		return spm.selectBookStockForSale(bookId);
	}

	@Override
	public List<StockPojo> selectBookStockForSaleBatch(List<StockPojo> List) {
		// TODO Auto-generated method stub
		return spm.selectBookStockForSaleBatch(List);
	}
	

}
