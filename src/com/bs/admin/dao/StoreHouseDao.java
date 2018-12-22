package com.bs.admin.dao;


import java.util.List;

import com.bs.admin.pojo.StoreHouse;

public interface StoreHouseDao {
	List<StoreHouse> dynamicSelect(Integer storeHouseId,String storeHouseName,String storeHouseAddress);
}
