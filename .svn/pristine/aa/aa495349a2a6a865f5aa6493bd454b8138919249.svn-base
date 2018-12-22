package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Activity;

public interface ActivityMapper {
	/**
	 * 查询所有活动名
	 * 
	 * @return 所有活动的集合
	 */
	List<Activity> getActivityNameByActivity();

	/**  
	 * <p>Title: insertActivity</p>  
	 * <p>Description: 添加活动数据</p>  
	 * @param activity
	 * @return  
	 * <p> @date 2018年12月21日  </p> 
	 */
	Integer insertActivity(Activity activity);
	
	/**  
	 * <p>Title: getActivityData</p>  
	 * <p>Description: 获取活动数据</p>  
	 * @return  
	 * <p> @date 2018年12月21日  </p> 
	 */
	List<Activity> getActivityData();

	/**  
	 * <p>Title: getActivityIdByActivity</p>  
	 * <p>Description: 获取活动id,判断数据有无</p>  
	 * @param activity
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Activity getActivityIdByActivity(Activity activity);

	/**  
	 * <p>Title: updateActivityByActivityId</p>  
	 * <p>Description: 通过活动id修改活动</p>  
	 * @param activity
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer updateActivityByActivityId(Activity activity);

	/**  
	 * <p>Title: deleteActivity</p>  
	 * <p>Description: 删除活动</p>  
	 * @param activityId
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer deleteActivity(@Param("activityId") Integer activityId);
	
	/**  
	 * <p>Title: insertActivityBook</p>  
	 * <p>Description: 添加中间表</p>  
	 * @param activityId
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer insertActivityBook(@Param("activityId") Integer activityId, @Param("bookId") Integer bookId);
	
	/**  
	 * <p>Title: delActivityBook</p>  
	 * <p>Description: 删除中间表</p>  
	 * @param activityId
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer delActivityBook(@Param("activityId") Integer activityId, @Param("bookId") Integer bookId);

}
