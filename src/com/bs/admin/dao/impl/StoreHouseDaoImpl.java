package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.StoreHouseDao;
import com.bs.admin.mapper.StoreHouseMapper;
import com.bs.admin.pojo.StoreHouse;
@Repository
public class StoreHouseDaoImpl implements StoreHouseDao {
@Autowired StoreHouseMapper shm;
	@Override
	public List<StoreHouse> dynamicSelect(Integer storeHouseId, String storeHouseName, String storeHouseAddress) {
		
		return shm.dynamicSelect(storeHouseId, storeHouseName, storeHouseAddress);
	}

}
