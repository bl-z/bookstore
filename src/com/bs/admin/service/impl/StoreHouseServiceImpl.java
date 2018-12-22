package com.bs.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.StoreHouseDao;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.QueryBoxData;
import com.bs.admin.pojo.StoreHouse;
import com.bs.admin.service.StoreHouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class StoreHouseServiceImpl  implements StoreHouseService{
@Autowired
private StoreHouseDao shd;


	@Override
	public List<QueryBoxData> getComBox() {
		List<StoreHouse> list = shd.dynamicSelect(null, null, null);
		 List<QueryBoxData>data = new ArrayList<QueryBoxData>();
		int size=list.size();
		for(int i=0;i<size;i++){
			data.add(new QueryBoxData(list.get(i).getStoreHouseId(), list.get(i).getStoreHouseName(), true));
		}
		return data;
	}


	@Override
	public PageData<StoreHouse> dynamicGet(Integer storeHouseId, String storeHouseName, String storeHouseAddress) {
		
		PageHelper.startPage(1, 10);
		 List<StoreHouse> list = shd.dynamicSelect(storeHouseId, storeHouseName, storeHouseAddress);
		PageInfo<StoreHouse> rows = new PageInfo<StoreHouse>(list);
		Long total = rows.getTotal();
		PageData<StoreHouse> data= new PageData<>(list, total.intValue());
		
		return data;
	}

}
