package com.bs.admin.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.Permission;
import com.bs.admin.service.AdminService;
import com.bs.admin.service.EmployeeService;
import com.bs.admin.service.PermissionService;
import com.bs.admin.util.JsonData;

/**
 * 

* <p>Title: AdminController</p>  

* <p>Description: </p>  
	后台管理账户控制层
* @author zhengjian  

* <p> @date 2018年12月10日</p>
 */
@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService as;
	@Autowired
	private PermissionService ps;
	
	
/**
 * 

 * <p>Title: toAdminPage</p>  

 * <p>Description: </p>  
	访问adminPage.jsp
 * @return  
 * <p> @date 2018年12月10日  </p>
 */
	@RequestMapping("pagination")
	public String toAdminPage(){
		return "adminPage";
	}
	
	/**
	 * 
	
	 * <p>Title: findAllAdmin</p>  
	
	 * <p>Description: </p>  
	获取admin分页数据，返回json格式给前端ajax
	 * @param pageNum	当前页码
	 * @param pageSize  页面容量
	 * @param name		查询条件名
	 * @param value		查询条件关键字
	 * @return  		JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@RequestMapping(value="page/{pageNum}/{pageSize}", produces="application/json;charset=utf-8")
	public JsonData findAllAdmin(
			@PathVariable("pageNum")Integer pageNum, 
			@PathVariable("pageSize")Integer pageSize, 
			@RequestParam("name")String name,
			@RequestParam("value")String value){
		
		PageData<Admin> data = as.getPageData(name, value, pageNum, pageSize);
		Boolean state = (null != data);
		return new JsonData("pageData", data, "获取分页数据", state);
	}
	
	/**
	 * 
	
	 * <p>Title: addAdmin</p>  
	
	 * <p>Description: </p>  
		添加账户
	 * @param empId			用户id
	 * @param adminAccount	登录帐号
	 * @param adminPsw		登录密码
	 * @param permission	管理员允许访问的菜单
	 * @return  			JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="添加账户")
	@RequestMapping(value = "add", produces="application/json;charset=utf-8")
	public JsonData addAdmin(@RequestParam("empId")Integer empId,
							 @RequestParam("adminAccount")String adminAccount,
							 @RequestParam("adminPassWord")String adminPsw,
							 @RequestParam("permission")Integer[] permissions){
		Long empId1 = Long.valueOf(empId);
		Integer value = as.addAdmin(empId1,adminAccount, adminPsw, permissions);
		String msg = "添加账户";
		Boolean state = true;
		Admin admin = null;
		if(value == -1){
			msg = "员工不存在。请在员工信息中查询";
			state = false;
		}else if(value == -2){
			msg = "该帐号已被使用，请修改";
			state = false;
		}else{
			// 返回admin对象，用于前端的刷新。
			admin = as.getAdminByAdminAccount(adminAccount);
			msg = "添加账户成功";
		}
		JsonData data = new JsonData("addAdmin",admin, msg, state);
		return data;
	}
	
	/**
	 * 
	
	 * <p>Title: update</p>  
	
	 * <p>Description: </p>  
		修改账户信息
	 * @param adminId		账户id
	 * @param empId			员工id
	 * @param adminAccount	登录帐号
	 * @param adminPsw		登录密码
	 * @param permission	可访问的菜单
	 * @return  			JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="修改账户信息")
	@RequestMapping(value = "update", produces="application/json;charset=utf-8")
	public JsonData update(@RequestParam("primaryId")Integer adminId,
						   @RequestParam("empId")Integer empId,
						   @RequestParam("adminAccount")String adminAccount,
						   @RequestParam("adminPassWord")String adminPsw,
						   @RequestParam("permission")Integer[] permission){
		Long empId1 = Long.valueOf(empId);
		String msg = "修改账户";
		Integer update = as.changeAdmin(adminId, empId1, adminAccount, adminPsw, permission);
		Boolean state = true;
		if(update == -1){
			msg="不存在该员工";
			state = false;
		}else if(update == -2){
			msg="该帐号已被使用";
			state = false;
		}
		
		
		JsonData data = new JsonData("updateAdmin",update, msg, state);
		return data;
	}
	
	/**
	 * 
	
	 * <p>Title: remove</p>  
	
	 * <p>Description: </p>  
		从数据库中删除账户
	 * @param adminId	账户id		
	 * @return  		JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="彻底删除账户")
	@RequestMapping(value = "remove", produces="application/json;charset=utf-8")
	public JsonData remove(@RequestParam("primaryId")Integer adminId){
		Long adminId1 = Long.valueOf(adminId);
		return new JsonData("remove", as.dropAdmin(adminId1), "彻底删除账户", true);
	}
	
	/**
	 * 
	
	 * <p>Title: updateSellf</p>  
	
	 * <p>Description: </p>  
		修改密码
	 * @param newpass	新密码
	 * @param req		request
	 * @return  		JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="修改密码")
	@RequestMapping(value = "updateSelf", produces="application/json;charset=utf-8")
	public JsonData updateSellf(@RequestParam("newpass")String newpass, HttpServletRequest req){
		// 从session中获取admin对象
		Admin admin = (Admin) req.getSession().getAttribute("admin");
		// 将新的密码传给service层
		Integer update = as.changeAdmin(admin.getAdminId().intValue(), admin.getEmp().getEmpId(), admin.getAdminAccount(), newpass, null);
		Boolean state = (update != null);
		JsonData data = new JsonData("addEmp",update, newpass, state);
		return data;
	}
	
	/**
	 * 查询所有权限信息返回集合给前端
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "allPermission", produces="application/json;charset=utf-8")
	public List<Permission> allPermission(){
		return ps.getAllPermission();
	}
	
	/**
	 * 添加账户时，将登录帐号与所有管理员对比，判断是否重复
	 * @param account
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "sameAllAccount", produces="application/json;charset=utf-8")
	public Boolean sameAccount(@RequestParam("account")String account){
		Admin admin = as.getAdminByAdminAccount(account);
		if(null == admin){
			// 登录帐号不重复
			return true;
		}
		// 重复
		return false;
	}
	
	/**
	 * 修改账户时，将登录帐号与其他管理员对比，判断是否重复
	 * @param account
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "sameOtherAccount", produces="application/json;charset=utf-8")
	public Boolean sameAccount(@RequestParam("account")String account, @RequestParam("id")Integer id){
		Admin admin = as.getOtherAdminByAccountAndAdminId(account, Long.valueOf(id));
		if(null == admin){
			// 帐号不重复
			return true;
		}
		// 重复
		return false;
	}
}
