package com.bs.admin.dao;

import java.util.List;

import com.bs.admin.pojo.Activity;
import com.bs.admin.pojo.ActivityPageData;
import com.bs.admin.pojo.Book;

public interface ActivityDao {

	/**  
	 * <p>Title: getActivityName</p>  
	 * <p>Description: 获取所有的活动名</p>  
	 * @return  活动名的集合
	 * <p> @date 2018年12月17日  </p> 
	 */
	List<Activity> getActivityName();
	
	/**  
	 * <p>Title: getActivityData</p>  
	 * <p>Description: 获取活动数据</p>  
	 * @return  
	 * <p> @date 2018年12月21日  </p> 
	 */
	List<Activity> getActivityData();

	/**  
	 * <p>Title: addActivity</p>  
	 * <p>Description: 添加活动数据</p>  
	 * @param activity
	 * @return  
	 * <p> @date 2018年12月21日  </p> 
	 */
	Integer addActivity(Activity activity);

	/**
	 * 查询是否存在
	 * 
	 * @return Integer类型的数值
	 */
	Integer getIdCountByBookName(ActivityPageData activityPageData);

	/**
	 * 获取活动ID
	 * 
	 * @return 活动对象
	 */
	Activity getActivityIdByActivity(Activity activity);

	/**
	 * 添加中间表数据
	 * 
	 * @return Integer
	 */
	Integer addActivityBook(Integer activityId, Integer bookId);

	/**
	 * 修改活动
	 * 
	 * @return Integer
	 */
	Integer updateActivity(Activity activity);
	
	/**  
	 * <p>Title: getActivityIdTotal</p>  
	 * <p>Description: 通过id查询中间表id的个数</p>  
	 * @param activityId
	 * @return  个数
	 * <p> @date 2018年12月14日  </p> 
	 */
	Integer getActivityIdTotal(Integer activityId);

	/**  
	 * <p>Title: delActivity</p>  
	 * <p>Description: 删除活动</p>  
	 * @param activityId
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer delActivity(Integer activityId);

	/**  
	 * <p>Title: addHistoryActivity</p>  
	 * <p>Description: 添加历史活动</p>  
	 * @param activityPageData
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer addHistoryActivity(ActivityPageData activityPageData);

	/**  
	 * <p>Title: delActivityBook</p>  
	 * <p>Description: 删除中间表</p>  
	 * @param activityId
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer delActivityBook(Integer activityId, Integer bookId);

	/**  
	 * <p>Title: getHistoryTotal</p>  
	 * <p>Description: 查询历史活动的总数</p>  
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer getHistoryTotal();

	/**  
	 * <p>Title: getHistoryActivity</p>  
	 * <p>Description: 分页查询历史活动的数据</p>  
	 * @param start
	 * @param end
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	List<ActivityPageData> getHistoryActivity(Integer start, Integer end);
	
	/**  
	 * <p>Title: delHistory</p>  
	 * <p>Description: 删除历史活动</p>  
	 * @param activityId
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer delHistoryActivity(Integer activityId);
	
	/**  
	 * <p>Title: getTotal</p>  
	 * <p>Description: 查询活动的总条数</p>  
	 * @param bookName
	 * @param activityName
	 * @param activityStart
	 * @param activityEnd
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	Integer getTotal(String bookName, String activityName, String activityStart, String activityEnd);

	/**  
	 * <p>Title: getAllActivity</p>  
	 * <p>Description: 分页查询活动的数据</p>  
	 * @param start
	 * @param end
	 * @param bookName
	 * @param activityName
	 * @param activityStart
	 * @param activityEnd
	 * @return  
	 * <p> @date 2018年12月17日  </p> 
	 */
	List<ActivityPageData> getAllActivity(Integer start, Integer end, String bookName, String activityName, String activityStart, String activityEnd);

	/**  
	 * <p>Title: getAllTotal</p>  
	 * <p>Description: 获取书的总条数</p>  
	 * @param bookName
	 * @param bookCategory
	 * @param bookStatus
	 * @param bottomPrice
	 * @param topPrice
	 * @return  
	 * <p> @date 2018年12月13日  </p> 
	 */
	Integer getAllTotal(String bookName, String bookCategory, String bookStatus, Double bottomPrice, Double topPrice);
	
	/**  
	 * <p>Title: getAllBook</p>  
	 * <p>Description: 分页查询书的数据</p>  
	 * @param bookName
	 * @param bookCategory
	 * @param bookStatus
	 * @param bottomPrice
	 * @param topPrice
	 * @param start
	 * @param end
	 * @return  
	 * <p> @date 2018年12月13日  </p> 
	 */
	List<Book> getAllBook(String bookName, String bookCategory, String bookStatus, Double bottomPrice, Double topPrice, Integer start, Integer end);
}
