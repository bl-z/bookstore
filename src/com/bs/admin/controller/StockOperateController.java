package com.bs.admin.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.Admin;
import com.bs.admin.service.StockOperateService;
import com.bs.admin.util.JsonData;

@Controller
@RequestMapping("stockOperate")
public class StockOperateController {
	@Autowired
	private StockOperateService sos;
	private String dir="d://";
	@RequestMapping("index")
	public String index() {
		System.out.println("访问库存页面");
		return "stockManagement";
	}

	@SystemControllerLog(type=2,description="批量入库")
	@RequestMapping(value = "postStockBatch", produces = "application/json;charset=utf-8")
	public @ResponseBody JsonData postStockBatch(@RequestParam("PIList") String PIList
			) {
		return 	sos.postStockBatch(PIList);
	}


	@RequestMapping("upload")
	@SystemControllerLog(type=2,description="上传入库清单")
	public	@ResponseBody JsonData upload(@RequestParam("file")MultipartFile[] files, HttpServletRequest req){
		String msg = null;
		Boolean state = null;
		Admin admin = (Admin)(req.getSession().getAttribute("admin"));
		for(MultipartFile file : files){
			try {
				file.transferTo(new File(dir.concat(file.getOriginalFilename())));
			} catch (IllegalStateException e) {
				msg = "IllegalStateException";
				e.printStackTrace();
			} catch (IOException e) {
				msg = "IOException";
				e.printStackTrace();
			}
		}
		
		
		return new JsonData("上传文件", 1, msg, state);
	}
}
