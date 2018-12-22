package com.bs.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bs.admin.pojo.QueryBoxData;
import com.bs.admin.service.StoreHouseService;
@Controller
@RequestMapping("storeHouse")
public class StoreHouseController {
	@Autowired
	private StoreHouseService shs;
	

	@RequestMapping(value = "getComBox", produces = "text/html;charset=UTF-8")
	public @ResponseBody String getComBox() {
		List<QueryBoxData> comBox = shs.getComBox();
		System.out.println(comBox.get(0));
		return JSON.toJSONString(shs.getComBox());
	}

}
