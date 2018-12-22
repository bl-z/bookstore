package com.bs.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.Employee;
import com.bs.admin.pojo.PageData;
import com.bs.admin.service.EmployeeService;
import com.bs.admin.util.JsonData;

/**
 * 

* <p>Title: EmployeeController</p>  

* <p>Description: </p>  
	员工控制层
* @author zhengjian  

* <p> @date 2018年12月10日</p>
 */
@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	/**
	 * 
	 * 
	 * <p>
	 * Title: toEmpPage
	 * </p>
	 * 
	 * <p>
	 * Description:
	 * </p>
	 * 跳转到被保护的empPage.jsp
	 * 
	 * @return
	 *         <p>
	 * @date 2018年11月29日
	 *       </p>
	 */
	@RequestMapping("pagination")
	public String toEmpPage() {
		return "empPage";
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: findAllEmp
	 * </p>
	 * 
	 * <p>
	 * Description:
	 * </p>
	 * 获取分页数据
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param name
	 * @param value
	 * @param date1
	 * @param date2
	 * @param empStatus
	 * @return
	 *         <p>
	 * @date 2018年11月29日
	 *       </p>
	 */
	@ResponseBody
	@RequestMapping(value = "page/{pageNum}/{pageSize}", produces = "application/json;charset=utf-8")
	public JsonData findAllEmp(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize,
			@RequestParam("name") String name, @RequestParam("value") String value, @RequestParam("date1") String date1,
			@RequestParam("date2") String date2, @RequestParam("empStatus") String empStatus) {
		PageData<Employee> data = es.getPageData(name, value, date1, date2, empStatus, pageNum, pageSize);
		Boolean state = (null != data);
		return new JsonData("pageData", data, "获取分页数据", state);
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: addEmp
	 * </p>
	 * 
	 * <p>
	 * Description:
	 * </p>
	 * 添加员工
	 * 
	 * @param empName
	 * @param empDept
	 * @param empHireDate
	 * @param empStatus
	 * @param jobName
	 * @return
	 *         <p>
	 * @date 2018年11月29日
	 *       </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="添加一个员工")
	@RequestMapping(value = "add", produces = "application/json;charset=utf-8")
	public JsonData addEmp(@RequestParam("empName") String empName,
						   @RequestParam("empDept") String empDept,
						   @RequestParam("empHireDate") String empHireDate,
						   @RequestParam("empStatus") String empStatus,
						   @RequestParam("jobName") String jobName,
						   @RequestParam("bankAccount") String bankAccount) {
		JsonData data = new JsonData("addEmp",
				es.addEmp(empName, empDept, empHireDate, empStatus, jobName, bankAccount), "添加员工", true);
		return data;
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: update
	 * </p>
	 * 
	 * <p>
	 * Description:
	 * </p>
	 * 修改员工
	 * 
	 * @param empId
	 * @param empName
	 * @param empDept
	 * @param empHireDate
	 * @param empStatus
	 * @param jobName
	 * @return
	 *         <p>
	 * @date 2018年11月29日
	 *       </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="修改员工信息")
	@RequestMapping(value = "update", produces = "application/json;charset=utf-8")
	public JsonData update(@RequestParam("primaryId") Integer empId, @RequestParam("empName") String empName,
			@RequestParam("empDept") String empDept, @RequestParam("empHireDate") String empHireDate,
			@RequestParam("empStatus") String empStatus, @RequestParam("jobName") String jobName,
			@RequestParam("bankAccount") String bankAccount) {
		Long empId1 = Long.valueOf(empId);

		Integer update = es.changeEmp(empId1, empName, empDept, empHireDate, empStatus, jobName, bankAccount);
		Boolean state = (update != null);
		JsonData data = new JsonData("addEmp", update, "修改员工", state);
		return data;
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: remove
	 * </p>
	 * 
	 * <p>
	 * Description:
	 * </p>
	 * 删除员工
	 * 
	 * @param empId
	 * @return
	 *         <p>
	 * @date 2018年11月29日
	 *       </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="彻底删除员工")
	@RequestMapping(value = "remove", produces = "application/json;charset=utf-8")
	public JsonData remove(@RequestParam("primaryId") Integer empId) {
		Long empId1 = Long.valueOf(empId);
		return new JsonData("remove", es.removeEmp(empId1), "彻底删除员工", true);
	}
	
	/**
	 * 
	
	 * <p>Title: allEmp</p>  
	
	 * <p>Description: </p>  
		获取所有员工。
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@RequestMapping(value = "allEmp", produces = "application/json;charset=utf-8")
	public PageData<Employee> allEmp() {
		List<Employee> list = es.getAllEmp();
		return new PageData<>(list, list.size());
	}

	
	@RequestMapping(value = "allDept", produces = "text/html;charset=UTF-8")
	public @ResponseBody String getBatch() {
		
		return JSON.toJSONString(es.retrieveDeptAll());
	}

}
