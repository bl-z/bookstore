package com.bs.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.JobDao;
import com.bs.admin.pojo.Job;
import com.bs.admin.pojo.PageData;
import com.bs.admin.service.JobService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class JobServiceImpl implements JobService{

	@Autowired
	private JobDao jd;

	@Override
	public Job findJobByJobId(Long jobId) {
		return jd.getJobByJobId(jobId);
	}

	@Override
	public Integer removeJob(Long jobId) {
		return jd.deleteJob(jobId);
	}

	@Override
	public Integer changeJob(Job job) {
		return jd.UpdateJob(job);
	}

	@Override
	public String findJobNameByJobId(Long jobId) {
		return jd.getJobNameByJobId(jobId);
	}

	@Override
	public List<String> findAllJobName() {
		List<String> list = jd.getAllJobName();
		return list;
	}

	@Override
	public Job findJobByJobName(String jobName) {
		return jd.getJobByJobName(jobName);
	}

	@Override
	public PageData<Job> getPageData(String name, String value, Integer pay1, Integer pay2, Integer pageNum, Integer pageSize) {
		String jobName = null;
		Long jobId = null;
		Integer jobLevel = null;
		switch (name) {
		case "jobName":
			jobName = value;
			break;
		case "jobId":
			jobId = value==""?null:Long.valueOf(value);
			break;
		case "jobLevel":
			jobLevel = value==""?null:Integer.valueOf(value);
			break;
		default:
			break;
		}
		PageHelper.startPage(pageNum, pageSize);
		List<Job> rows = jd.getJobByFields(jobName,jobId,jobLevel,pay1,pay2);
		Long total = new PageInfo<Job>(rows).getTotal();
		int total1 = total.intValue();
		
		return new PageData<Job>(rows,total1);
	}

	@Override
	public Integer addJob(String jobName, Integer jobLevel, Integer jobAllowance, Integer jobBasicPay) {
		return jd.createJob(new Job(null, jobName, jobLevel, jobAllowance, jobBasicPay));
	}


}
