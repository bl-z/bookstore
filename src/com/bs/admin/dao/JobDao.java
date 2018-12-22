package com.bs.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bs.admin.pojo.Job;

@Repository
public interface JobDao {
	/**
	 * 
	
	 * <p>Title: createJob</p>  
	
	 * <p>Description: </p>  
		添加职位
	 * @param job
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer createJob(Job job);
	
	/**
	 * 
	
	 * <p>Title: getJobByJobId</p>  
	
	 * <p>Description: </p>  
		通过职位id查询职位
	 * @param jobId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Job getJobByJobId(Long jobId);
	/**
	 * 
	
	 * <p>Title: deleteJob</p>  
	
	 * <p>Description: </p>  
		删除职位信息
	 * @param jobId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer deleteJob(Long jobId);
	/**
	 * 
	
	 * <p>Title: UpdateJob</p>  
	
	 * <p>Description: </p>  
		修改职位信息
	 * @param job
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer UpdateJob(Job job);
	/**
	 * 
	
	 * <p>Title: getJobNameByJobId</p>  
	
	 * <p>Description: </p>  
		通过职位id获取职位名称
	 * @param jobId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	String getJobNameByJobId(Long jobId);
	/**
	 * 
	
	 * <p>Title: getAllJobName</p>  
	
	 * <p>Description: </p>  
		获取所有职位名称
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<String> getAllJobName();
	/**
	 * 
	
	 * <p>Title: getJobByJobName</p>  
	
	 * <p>Description: </p>  
		根据职位名称获取职位
	 * @param jobName
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Job getJobByJobName(String jobName);
	/**
	 * 
	
	 * <p>Title: getJobByFields</p>  
	
	 * <p>Description: </p>  
		多条件查询职位
	 * @param jobName	职位名称	
	 * @param jobId		职位编号
	 * @param jobLevel	职位级别
	 * @param pay1		职位底薪1
	 * @param pay2		职位底薪2
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Job> getJobByFields(String jobName, Long jobId, Integer jobLevel,Integer pay1, Integer pay2);
}
