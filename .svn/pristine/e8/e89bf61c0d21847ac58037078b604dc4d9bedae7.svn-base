package com.bs.admin.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.SupplierDao;
import com.bs.admin.mapper.SupplierMapper;
import com.bs.admin.pojo.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SupplierMapper sm;

	@Override
	public Integer insertSupplier(Supplier supplier) {
		return sm.insertSupplier(supplier);
	}

	@Override
	public Integer deleteSupplierById(Integer supplierId) {
		return sm.deleteSupplierById(supplierId);
	}

	@Override
	public Integer updateSupplierById(Supplier supplier) {
		return sm.updateSupplierById(supplier);
	}

	@Override
	public List<Supplier> dynamicSelect(Supplier supplier, String startDate, String endDate) {
		System.out.println(supplier);
		return sm.dynamicSelect(supplier, startDate, endDate);
	}

	@Override
	public Supplier selectBySupplierId(Integer supplierId) {
		return sm.selectBySupplierId(supplierId);
	}



	@Override
	public List<Supplier> selectSupplierAll() {

		return sm.selectSupplierAll();
	}

	@Override
	public Integer selectCooperateCountById(Integer supplierId) {
		
		return sm.selectCooperateCountById(supplierId);
	}

}
