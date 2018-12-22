package com.bs.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Log;
import com.bs.admin.pojo.PageData;
import com.bs.admin.service.LogService;
import com.bs.admin.util.JsonData;

@Controller
@RequestMapping("log")
public class LogController {

	@Autowired
	private LogService ls;

	@RequestMapping("logAdmin")
	public String logAdmin() {
		System.out.println("日志管理");
		return "logAdmin";
	}

	@RequestMapping("myLog")
	public String myLog() {
		System.out.println("访问我的操作记录");
		return "myLog";
	}
	@SystemControllerLog(type=3, description="删除一定时间段的日志")
	@RequestMapping(value = "delLogByTime", produces = "application/json;charset=utf-8")
	public @ResponseBody JsonData delLogByTime(@RequestParam("startTime") String startTime,
			@RequestParam("endTime") String endTime) {
		Integer row = ls.delLog(startTime, endTime);
		System.out.println(startTime);
		System.out.println(endTime);

		if(row==0){
			return new JsonData("delLogByTime", row, "没有可选的日志文件,删除失败", true);
		}else{
			return new JsonData("delLogByTime", row, "已删除"+row+"条日志", true);
		}
		
		
	}

	@RequestMapping(value = "dynamicGetLog", produces = "application/json;charset=utf-8")
	public @ResponseBody JsonData dynamicGetLog(@Param("adminId")
	Long adminId, @Param("operateType") String operateType, @Param("operate") String operate,
			@Param("requestIp") String requestIp, @Param("dept") String dept, @Param("startTime") String startTime,
			@Param("endTime") String endTime,
			@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize) {

		
		System.out.println("adminId:"+adminId);
		System.out.println("operateType:"+operateType);
		System.out.println("operate:"+operate);
		System.out.println("dept:"+dept);
		System.out.println("requestIp:"+requestIp);
		System.out.println("startTime:"+startTime);
		System.out.println("endTime:"+endTime);
		System.out.println("pageSize:"+pageSize);
		System.out.println("currentPage:"+currentPage);
		
		Admin admin = new Admin();
		if(adminId!=null){
		admin.setAdminId(adminId);
		}
		PageData<Log> data = ls.dynamicGet(admin, operateType, operate, requestIp, dept, startTime, endTime, currentPage, pageSize);
		System.out.println(data.getTotal());
		return new JsonData("dynamicGetLog", data, "查询到了" + data.getTotal() + "条数据", true);
	}
	@RequestMapping(value = "getMyLog", produces = "application/json;charset=utf-8")
	public @ResponseBody JsonData getMyLog( String operateType, @Param("operate") String operate,
	@Param("requestIp") String requestIp, @Param("startTime") String startTime,
	@Param("endTime") String endTime,
	@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize,HttpServletRequest request) {
		Admin admin =(Admin) request.getSession().getAttribute("admin");
		PageData<Log> data = ls.dynamicGet(admin, operateType, operate, requestIp, "全部", startTime, endTime, currentPage, pageSize);
		return new JsonData("getMyLog", data, "查询到了" + data.getTotal() + "条数据", true);
	}

}
