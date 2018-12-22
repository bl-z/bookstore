package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Job;

public interface JobMapper {
	/**
	 * 
	
	 * <p>Title: createJob</p>  
	
	 * <p>Description: </p>  
		插入新职位
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
	
	 * <p>Title: getAllJobName</p>  
	
	 * <p>Description: </p>  
		获取所有职位名称
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Job> getAllJobName();
	/**
	 * 
	
	 * <p>Title: getJobByJobName</p>  
	
	 * <p>Description: </p>  
		通过职位名称获取职位信息
	 * @param jobName
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Job getJobByJobName(String jobName);
	/**
	 * 
	
	 * <p>Title: getJobByFields</p>  
	
	 * <p>Description: </p>  
		多条件查询职位信息
	 * @param jobName
	 * @param jobId
	 * @param jobLevel
	 * @param pay1
	 * @param pay2
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Job> getJobByFields(@Param("jobName")String jobName, @Param("jobId")Long jobId, @Param("jobLevel")Integer jobLevel, @Param("pay1")Integer pay1, @Param("pay2")Integer pay2);
}
