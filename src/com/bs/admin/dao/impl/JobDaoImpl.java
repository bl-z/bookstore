package com.bs.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.JobDao;
import com.bs.admin.mapper.JobMapper;
import com.bs.admin.pojo.Job;

@Repository
public class JobDaoImpl implements JobDao{
	@Autowired
	private JobMapper jm;

	@Override
	public Integer createJob(Job job) {
		return jm.createJob(job);
	}

	@Override
	public Job getJobByJobId(Long jobId) {
		return jm.getJobByJobId(jobId);
	}

	@Override
	public Integer deleteJob(Long jobId) {
		return jm.deleteJob(jobId);
	}

	@Override
	public Integer UpdateJob(Job job) {
		return jm.UpdateJob(job);
	}

	@Override
	public String getJobNameByJobId(Long jobId) {
		return jm.getJobByJobId(jobId).getJobName();
	}

	@Override
	public List<String> getAllJobName() {
		List<Job> allJob = jm.getAllJobName();
		List<String> allJobName = new ArrayList<>();
		for(Job job : allJob){
			allJobName.add(job.getJobName());
		}
		return allJobName;
	}

	@Override
	public Job getJobByJobName(String jobName) {
		return jm.getJobByJobName(jobName);
	}

	@Override
	public List<Job> getJobByFields(String jobName, Long jobId, Integer jobLevel, Integer pay1, Integer pay2) {
		return jm.getJobByFields(jobName,jobId,jobLevel,pay1,pay2);
	}

}
