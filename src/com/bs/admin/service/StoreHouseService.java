package com.bs.admin.service;


import java.util.List;

import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.QueryBoxData;
import com.bs.admin.pojo.StoreHouse;

public interface StoreHouseService {
	PageData<StoreHouse >dynamicGet(Integer storeHouseId,String storeHouseName,String storeHouseAddress);
	List<QueryBoxData> getComBox();
}
