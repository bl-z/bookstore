package com.bs.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.PageData;
import com.bs.admin.service.AdminService;
import com.bs.admin.service.EmployeeService;
import com.bs.admin.service.MyInfoService;
import com.bs.admin.util.JsonData;
import com.bs.admin.util.PropertyGridData;

@Controller
@RequestMapping("mypage")
public class MypageController {

	@Autowired
	private MyInfoService mis;

	/**
	 * 
	
	 * <p>Title: toMyPage</p>  
	
	 * <p>Description: </p>  
		跳转到myPage.jsp
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@RequestMapping("toMypage")
	public String toMyPage() {
		return "myPage";
	}

	/**
	 * 
	
	 * <p>Title: info</p>  
	
	 * <p>Description: </p>  
		获取个人信息返回给前端propertyGridData
	 * @param req
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@RequestMapping(value = "info", produces = "application/json;charset=utf-8")
	public PageData<PropertyGridData> info(HttpServletRequest req) {
		Admin admin = (Admin) req.getSession().getAttribute("admin");
		PageData<PropertyGridData> data = mis.getPageData(admin);
		return data;

	}
	
	/**
	 * 跳转到webSocket.jsp
	 * @return
	 */
	@RequestMapping("toWebSocket")
	public String toWebSocket() {
		return "webSocket";
	}
	
	/**
	 * 获取session中存放的在线管理员帐号
	 * @param sesion
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "clients", produces = "application/json;charset=utf-8")
	public JsonData getClients(HttpSession sesion){
		Object attribute = sesion.getAttribute("accounts");
		
		return new JsonData("accounts", attribute, "获取在线管理员帐号", true);
	}
}
