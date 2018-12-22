package com.bs.admin.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.PurchaseDao;
import com.bs.admin.mapper.PurchaseMapper;
import com.bs.admin.pojo.Purchase;

@Repository
public class PurchaseDaoImpl implements PurchaseDao {
	@Autowired
	private PurchaseMapper pm;

	@Override
	public Integer insertPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		return pm.insertPurchase(purchase);
	}

	@Override
	public Integer deletePurchaseById(Integer purchaseId) {
		// TODO Auto-generated method stub
		return pm.deletePurchaseById(purchaseId);
	}

	@Override
	public Integer updatePurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		return pm.updatePurchase(purchase);
	}

	@Override
	public List<String> selectPurchaseBatch() {
		// TODO Auto-generated method stub
		return pm.selectPurchaseBatch();
	}

	@Override
	public List<Purchase> dynamicSelect(Purchase purchase, String startDate, String endDate) {
		// TODO Auto-generated method stub
		return pm.dynamicSelect(purchase, startDate, endDate);
	}

	@Override
	public Purchase selectPurchaseById(Integer purchaseId) {
		// TODO Auto-generated method stub
		return pm.selectPurchaseById(purchaseId);
	}

	@Override
	public Double selectPurchasePay(Integer purchaseId) {
		// TODO Auto-generated method stub
		return pm.selectPurchasePay(purchaseId);
	}

	@Override
	public List<Purchase> selectPurchaseBuget() {
		return pm.selectPurchaseBuget();
	}

}
