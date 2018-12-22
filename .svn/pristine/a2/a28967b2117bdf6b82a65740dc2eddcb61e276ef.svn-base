package com.bs.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Order;

public interface OrderDao {

	/**
	 * 
	 * <p>Title: getOrderByOrderInfo</p>  
	 * <p>Description:  查询订单信息</p>  
	 * @param orderId
	 * @param orderStatus
	 * @param topPrice
	 * @param bottomPrice
	 * @param start    
	 * @param count
	 * @return  
	 * <p> @date 2018年12月7日  </p>
	 */
	List<Order> getOrderByOrderInfo(String orderId, String orderStatus, Double topPrice, Double bottomPrice, Integer start, Integer count);

	/**
	 * 
	 * <p>Title: getAchieveOrder</p>  
	 * <p>Description: 查询已完成并且未入账的订单</p>  
	 * @param start  开始行
	 * @param end    结束行
	 * @return  
	 * <p> @date 2018年12月20日  </p>
	 */
	List<Order> getAchieveOrder(Integer start, Integer end);
	
	/**
	 * 
	 * <p>Title: getAchieveTotal</p>  
	 * <p>Description: 查询已完成并且未入账的订单</p>  
	 * @return  
	 * <p> @date 2018年12月20日  </p>
	 */
	Integer getAchieveTotal();
	
	/**
	 * 
	 * <p>Title: getTotal</p>  
	 * <p>Description: 获取查询出来的总行数</p>  
	 * @param orderId
	 * @param orderStatus
	 * @param topPrice
	 * @param bottomPrice
	 * @param start
	 * @param count
	 * @return  
	 * <p> @date 2018年12月20日  </p>
	 */
	Integer getTotal(String orderId, String orderStatus, Double topPrice, Double bottomPrice);
	
	/**
	 * 
	 * <p>Title: deleteOrder</p>  
	 * <p>Description: 删除订单</p>  
	 * @param orderId
	 * @return  
	 * <p> @date 2018年12月6日  </p>
	 */
	Integer deleteOrder(String orderId);
	
	/**
	 * 
	 * <p>Title: deleteBookOrder</p>  
	 * <p>Description: 删除订单与书的中间表对应的信息</p>  
	 * @param orderId
	 * @return  
	 * <p> @date 2018年12月17日  </p>
	 */
	Integer deleteBookOrder(String orderId);
	
	/**
	 * 
	 * <p>Title: updateOrder</p>  
	 * <p>Description: 修改订单</p>  
	 * @param orderId
	 * @param orderStatus
	 * @param totalPrice
	 * @return  
	 * <p> @date 2018年12月6日  </p>
	 */
	Integer updateOrder(String orderId, String orderStatus, Double totalPrice, String consignee, String mobile, String province, String city, String county, String detail);
	
	/**
	 * 
	 * <p>Title: updateStatus</p>  
	 * <p>Description: 修改退货的订单状态</p>  
	 * @param afterStatus  修改后的状态
	 * @param orderStatus  修改前的状态
	 * @return  
	 * <p> @date 2018年12月18日  </p>
	 */
	Integer updateStatus(String afterStatus, String orderStatus);
	
	/**
	 * 
	 * <p>Title: updataAchieve</p>  
	 * <p>Description: 修改订单的入库状态</p>  
	 * @param achieve
	 * @param orderId
	 * @return  
	 * <p> @date 2018年12月20日  </p>
	 */
	Integer updataAchieve(Boolean achieve, String orderId);
	
	/**
	 * 
	 * <p>Title: getOrderStatus</p>  
	 * <p>Description: 获取订单的全部类型</p>  
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<String> getOrderStatus();
	
	/**
	 * 
	 * <p>Title: getOrderWinInfo</p>  
	 * <p>Description: 获取窗口显示的信息</p>  
	 * @param orderId
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	List<Order> getOrderWinInfo(String orderId);
}
