package com.bs.admin.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Supplier;

public interface SupplierDao {
	Integer insertSupplier(Supplier supplier);

	Integer deleteSupplierById(Integer supplierId);

	Integer updateSupplierById(Supplier supplier);

	List<Supplier> dynamicSelect(Supplier supplier,String startDate,String endDate);

	Integer selectCooperateCountById(Integer supplierId);

	Supplier selectBySupplierId(Integer supplierId);

	List<Supplier> selectSupplierAll();

}
