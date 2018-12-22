package com.bs.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.admin.pojo.Job;
import com.bs.admin.pojo.PageData;

@Service
public interface JobService {
	/**
	 * 
	
	 * <p>Title: findJobByJobId</p>  
	
	 * <p>Description: </p>  
		通过id查询职位信息
	 * @param jobId
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Job findJobByJobId(Long jobId);
	/**
	 * 
	
	 * <p>Title: removeJob</p>  
	
	 * <p>Description: </p>  
		删除职位信息
	 * @param jobId
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Integer removeJob(Long jobId);
	/**
	 * 
	
	 * <p>Title: changeJob</p>  
	
	 * <p>Description: </p>  
		修改职位信息
	 * @param job
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Integer changeJob(Job job);
	/**
	 * 
	
	 * <p>Title: findJobNameByJobId</p>  
	
	 * <p>Description: </p>  
		通过职位id查询职位名称
	 * @param jobId
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	String findJobNameByJobId(Long jobId);
	/**
	 * 
	
	 * <p>Title: findAllJobName</p>  
	
	 * <p>Description: </p>  
		查询所有职位名称
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	List<String> findAllJobName();
	/**
	 * 
	
	 * <p>Title: findJobByJobName</p>  
	
	 * <p>Description: </p>  
		通过职位名称查询职位信息
	 * @param jobName
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Job findJobByJobName(String jobName);
	/**
	 * 
	
	 * <p>Title: getPageData</p>  
	
	 * <p>Description: </p>  
		获取分页信息
	 * @param name		查询字段
	 * @param value		查询关键字
	 * @param pay1		底薪1
	 * @param pay2		底薪2
	 * @param pageNum	当前页数
	 * @param pageSize	页面容量
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	PageData<Job> getPageData(String name, String value, Integer pay1, Integer pay2, Integer pageNum, Integer pageSize);
	/**
	 * 
	
	 * <p>Title: addJob</p>  
	
	 * <p>Description: </p>  
		添加职位信息
	 * @param jobName		职位名称
	 * @param jobLevel		职位级别
	 * @param jobAllowance	职位津贴
	 * @param jobBasicPay	职位底薪
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	Integer addJob(String jobName, Integer jobLevel, Integer jobAllowance, Integer jobBasicPay);
	
}
