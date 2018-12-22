package com.bs.admin.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.PageData;
import com.bs.admin.pojo.Salary;
import com.bs.admin.service.SalaryService;
import com.bs.admin.util.DateUtil;
import com.bs.admin.util.JsonData;

/**
 * 

* <p>Title: SalaryController</p>  

* <p>Description: </p>  
	salary薪资控制层
* @author zhengjian  

* <p> @date 2018年12月10日</p>
 */
@Controller
@RequestMapping("salary")
public class SalaryController {
	@Autowired
	private SalaryService ss;
	/**
	 * 
	
	 * <p>Title: toSalaryPage</p>  
	
	 * <p>Description: </p>  
		跳转到salaryPaga.jsp
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@RequestMapping("pagination")
	public String toSalaryPage(){
		return "salaryPage";
	}
	/**
	 * 
	
	 * <p>Title: findAllSalary</p>  
	
	 * <p>Description: </p>  
		获取薪资分页信息
	 * @param pageNum	当前页数
	 * @param pageSize	页面容量
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@RequestMapping(value="page/{pageNum}/{pageSize}", produces="application/json;charset=utf-8")
	public JsonData findAllSalary(@PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
		PageData<Salary> data = ss.getPageData(pageNum, pageSize);
		Boolean state = (null != data);
		return new JsonData("pageData", data, "获取分页数据", state);
	}
	
	
	/**
	 * 
	
	 * <p>Title: add</p>  
	
	 * <p>Description: </p>  
		添加工资记录
	 * @param empId	员工id
	 * @param req	request
	 * @return  
	 * <p> @date 2018年12月6日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="添加工资信息")
	@RequestMapping(value="add",produces="application/json;charset=utf-8")
	public JsonData add(@RequestParam("empId")Integer empId, HttpServletRequest req){
		// 从session中获取操作员
		Integer addSalary = ss.addSalary(empId, (Admin)req.getSession().getAttribute("admin"));
		
		Salary salary = null;
		String msg = "添加工资信息";
		Boolean state = true;
		if(addSalary == -1){
			msg="员工不存在，请在员工信息中查询";
			state = false;
		}else if(addSalary == -2){
			msg="该员工当月工资信息已添加过。如需修改，请删除该记录并重写";
			state = false;
		}else{
			// salary返回给前端，用于局部刷新
			salary = ss.getSalaryByEmpIdAndDate(empId,DateUtil.getCurrentTimeString());
		}
		
		return new JsonData("addSalary", salary, msg, state);
	}
	
	@ResponseBody
	@SystemControllerLog(type=2,description="彻底删除工资记录")
	@RequestMapping(value = "remove", produces="application/json;charset=utf-8")
	public JsonData remove(@RequestParam("primaryId")Integer salaryId){
		Long salaryId1 = Long.valueOf(salaryId);
		return new JsonData("remove", ss.deleteSalary(salaryId1), "彻底删除工资记录", true);
	}


}
