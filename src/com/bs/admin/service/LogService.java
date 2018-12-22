package com.bs.admin.service;

import com.bs.admin.pojo.Admin;
import com.bs.admin.pojo.Log;
import com.bs.admin.pojo.PageData;

/**  

* <p>Title: LogService</p>  

* <p>Description: 日志的service 层</p>  

* @author 王顺坤  

* <p> @date 2018年12月9日</p>   

*/ 
public interface LogService {

	/**  
	
	 * <p>Title: postLog</p>  
	
	 * <p>Description: 创建日志</p>  
	
	 * @param log
	 * @return  
	 * <p> @date 2018年12月10日  </p> 
	 */
	Integer postLog(Log log);
	/**  
	
	 * <p>Title: delLog</p>  
	
	 * <p>Description: 根据时间删除非日志操作的日志 </p>  
	
	 * @param startTime
	 * @param endtime
	 * @return  
	 * <p> @date 2018年12月10日  </p> 
	 */
	Integer delLog(String startTime,String endTime);
	/**  
	
	 * <p>Title: dynamicGet</p>  
	
	 * <p>Description:动态获取日志 </p>  
	
	 * @param admin
	 * @param operateType
	 * @param operate
	 * @param requestIp
	 * @param dept
	 * @param startTime
	 * @param endTime
	 * @return  
	 * <p> @date 2018年12月10日  </p> 
	 */
	PageData<Log> dynamicGet(Admin admin,String operateType,String operate,String requestIp,String dept,String startTime,String endTime,Integer currentPage,Integer pageSize);

	
}
