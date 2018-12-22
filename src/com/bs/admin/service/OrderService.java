package com.bs.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.admin.pojo.CategoryOrStatus;
import com.bs.admin.pojo.Order;
import com.bs.admin.pojo.OrderModel;
import com.bs.admin.pojo.WindowInfo;

@Service
public interface OrderService {

	/**
	 * 
	 * <p>Title: queryOrder</p>  
	 * <p>Description: 查询订单</p>  
	 * @param orderId
	 * @param orderStatus
	 * @param topPrice
	 * @param bottomPrice
	 * @param pageNumber
	 * @param pageSize
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<OrderModel> queryOrder(String orderId, String orderStatus, Double topPrice, Double bottomPrice,
			Integer pageNumber, Integer pageSize);
	
	/**
	 * 
	 * <p>Title: getAchieveOrder</p>  
	 * <p>Description: 查询已完成并且未入账的订单</p>  
	 * @param start  开始行
	 * @param end    结束行
	 * @return  
	 * <p> @date 2018年12月20日  </p>
	 */
	List<OrderModel> getAchieveOrder(Integer start, Integer end);
	
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
	 * <p>Description: 获取查询出来的总条数</p>  
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
	 * <p>Title: daleteOrder</p>  
	 * <p>Description: 删除订单</p>  
	 * @param orderId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer daleteOrder(String orderId);

	/**
	 * 
	 * <p>Title: updateOrder</p>  
	 * <p>Description: 修改订单</p>  
	 * @param orderId
	 * @param orderStatus
	 * @param totalPrice
	 * @param consignee
	 * @param mobile
	 * @param province
	 * @param city
	 * @param county
	 * @param detail
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updateOrder(String orderId, String orderStatus, Double totalPrice, String consignee, String mobile,
			String province, String city, String county, String detail);

	/**
	 * 
	 * <p>Title: updateStatus</p>  
	 * <p>Description: 修改退货的订单状态</p>  
	 * @param afterStatus  修改前的状态
	 * @param orderStatus  修改后的状态
	 * @return  
	 * <p> @date 2018年12月18日  </p>
	 */
	Integer updateStatus(String afterStatus, String orderStatus);
	
	/**
	 * 
	 * <p>Title: updateAchieve</p>  
	 * <p>Description: 修改订单的入账状态</p>  
	 * @param achieve
	 * @param orderId
	 * @return  
	 * <p> @date 2018年12月20日  </p>
	 */
	Integer updateAchieve(Boolean achieve, String orderId);
	
	/**
	 * 
	 * <p>Title: getOrderStatus</p>  
	 * <p>Description: 获取订单类型</p>  
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<CategoryOrStatus> getOrderStatus();
	
	/**
	 * 
	 * <p>Title: getOrderWinInfo</p>  
	 * <p>Description: </p>  
	 * @param orderId
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	List<WindowInfo> getOrderWinInfo(String orderId);
}
