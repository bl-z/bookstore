package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.ActivityPageData;

/**
 * 
 * Title: ActivityPageDataMapper
 * 
 * @Description:活动页数据集
 * 
 * @author 赵宝林
 * 
 * @date 2018年11月29日
 * 
 */
public interface ActivityPageDataMapper {

	/**
	 * 查询满足条件的id的个数
	 * 
	 * @return Integer类型的数值
	 */
	Integer getIdCountByBookName(ActivityPageData activityPageData);

	/**  
	 * <p>Title: insertHistoryActivity</p>  
	 * <p>Description: 添加历史活动</p>  
	 * @param activityPageData
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer insertHistoryActivity(ActivityPageData activityPageData);
	
	/**  
	 * <p>Title: getHistoryTotal</p>  
	 * <p>Description: 查询历史活动的个数</p>  
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer getHistoryTotal();

	/**  
	 * <p>Title: getHistoryActivity</p>  
	 * <p>Description: 分页查询历史活动</p>  
	 * @param start
	 * @param end
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	List<ActivityPageData> getHistoryActivity(@Param("start") Integer start,@Param("end") Integer end);

	/**  
	 * <p>Title: delHistoryActivity</p>  
	 * <p>Description: 删除历史活动</p>  
	 * @param activityId
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer delHistoryActivity(@Param("activityId") Integer activityId);
	
	/**  
	 * <p>Title: getAllActivity</p>  
	 * <p>Description: 分页查询活动数据</p>  
	 * @param start
	 * @param end
	 * @param bookName
	 * @param activityName
	 * @param activityStart
	 * @param activityEnd
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	List<ActivityPageData> getAllActivity(
			@Param("start") Integer start,
			@Param("end") Integer end, 
			@Param("bookName") String bookName, 
			@Param("activityName") String activityName, 
			@Param("activityStart") String activityStart, 
			@Param("activityEnd") String activityEnd);

	/**  
	 * <p>Title: getTotal</p>  
	 * <p>Description: 查询活动的条数</p>  
	 * @param bookName
	 * @param activityName
	 * @param activityStart
	 * @param activityEnd
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer getTotal(
			@Param("bookName") String bookName, 
			@Param("activityName") String activityName, 
			@Param("activityStart") String activityStart, 
			@Param("activityEnd") String activityEnd);
	
	/**  
	 * <p>Title: getActivityIdTotal</p>  
	 * <p>Description: 通过id获取活动的id的个数</p>  
	 * @param activityId
	 * @return  个数
	 * <p> @date 2018年12月14日  </p> 
	 */
	Integer getActivityIdTotal(@Param("activityId") Integer activityId);

}
