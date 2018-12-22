package com.bs.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Job;
import com.bs.admin.pojo.JobData;
import com.bs.admin.pojo.PageData;
import com.bs.admin.service.JobService;
import com.bs.admin.util.JsonData;
/**
 * 

* <p>Title: JobController</p>  

* <p>Description: </p>  
	职位控制层
* @author zhengjian  

* <p> @date 2018年12月10日</p>
 */
@Controller
@RequestMapping("job")
public class JobController {
	@Autowired
	private JobService jc;
	/**
	 * 
	
	 * <p>Title: allJobName</p>  
	
	 * <p>Description: </p>  
		获取所有职位信息
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@RequestMapping(value="allJobName", produces="text/html;charset=utf-8")
	@ResponseBody
	public String allJobName(){
		// 获取所有职位名
		List<String> jobNames = jc.findAllJobName();
		//存放职位数据
		List<JobData> data = new ArrayList<>();
		data.add(new JobData(jobNames.get(0), jobNames.get(0), true));
		for(int i = 1; i < jobNames.size(); i++){
			data.add(new JobData(jobNames.get(i), jobNames.get(i), false));
		}
		return JSON.toJSONString(data);
	}
	
	/**
	 * 
	
	 * <p>Title: toJobPage</p>  
	
	 * <p>Description: </p>  
		跳转到jobPage.jsp
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@RequestMapping("pagination")
	public String toJobPage(){
		return "jobPage";
	}
	
	/**
	 * 
	
	 * <p>Title: findAllJob</p>  
	
	 * <p>Description: </p>  
		获取职位分页信息
	 * @param pageNum	当前页数
	 * @param pageSize	页面容量
	 * @param name		查询字段
	 * @param value		查询关键字
	 * @param pay1		底薪1
	 * @param pay2		底薪2
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@RequestMapping(value="page/{pageNum}/{pageSize}", produces="application/json;charset=utf-8")
	public JsonData findAllJob(@PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize, 
			@RequestParam("name")String name, @RequestParam("value")String value, @RequestParam("pay1")Integer pay1,@RequestParam("pay2")Integer pay2){
		
		PageData<Job> data = jc.getPageData(name, value, pay1, pay2, pageNum, pageSize);
		Boolean state = (null != data);
		return new JsonData("pageData", data, "获取分页数据", state);
	}
	
//	
	/**
	 * 
	
	 * <p>Title: addJob</p>  
	
	 * <p>Description: </p>  
		添加职位
	 * @param jobName		职位名
	 * @param jobLevel		职位级别
	 * @param jobAllowance	职位津贴
	 * @param jobBasicPay	职位底薪
	 * @return  			JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="添加职位")
	@RequestMapping(value = "add", produces="application/json;charset=utf-8")
	public JsonData addJob(@RequestParam("jobName")String jobName,@RequestParam("jobLevel")Integer jobLevel,@RequestParam("jobAllowance")Integer jobAllowance,@RequestParam("jobBasicPay")Integer jobBasicPay){
		Integer value = jc.addJob(jobName,jobLevel, jobAllowance, jobBasicPay);
		String msg = "添加职位";
		Boolean state = true;
		JsonData data = new JsonData("addJob",value, msg, state);
		return data;
	}
////	
////	
	/**
	 * 
	
	 * <p>Title: update</p>  
	
	 * <p>Description: </p>  
		修改职位信息
	 * @param jobId			职位id
	 * @param jobName		职位名称
	 * @param jobLevel		职位级别
	 * @param jobAllowance	职位津贴
	 * @param jobBasicPay	职位底薪
	 * @return  			JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="修改职位信息")
	@RequestMapping(value = "update", produces="application/json;charset=utf-8")
	public JsonData update(@RequestParam("primaryId")Integer jobId,@RequestParam("jobName")String jobName,@RequestParam("jobLevel")Integer jobLevel,@RequestParam("jobAllowance")Integer jobAllowance,@RequestParam("jobBasicPay")Integer jobBasicPay){
		
		Long jobId1 = Long.valueOf(jobId);
		
		Integer update = jc.changeJob(new Job(jobId1, jobName, jobLevel, jobAllowance, jobBasicPay));
		Boolean state = (update != null);
		JsonData data = new JsonData("addEmp",update, "修改职位", state);
		return data;
	}
////	
////	
	/**
	 * 
	
	 * <p>Title: remove</p>  
	
	 * <p>Description: </p>  
		删除职位
	 * @param jobId	职位id
	 * @return  	JsonData
	 * <p> @date 2018年12月10日  </p>
	 */
	@ResponseBody
	@SystemControllerLog(type=2,description="删除职位")
	@RequestMapping(value = "remove", produces="application/json;charset=utf-8")
	public JsonData remove(@RequestParam("primaryId")Integer jobId){
		Long jobId1 = Long.valueOf(jobId);
		return new JsonData("remove", jc.removeJob(jobId1), "彻底删除职位", true);
	}
}
