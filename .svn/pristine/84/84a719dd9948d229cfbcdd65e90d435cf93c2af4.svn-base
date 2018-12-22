package com.bs.admin.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
* <p>Title: Order</p>  
* <p>Description: 订单</p>  
* @author 胡杰  
* <p> @date 2018年12月6日</p>
 */
public class Order implements Serializable {
	
	private static final long serialVersionUID = 8962619282941600904L;
	/**
	 * 订单号
	 */
	private String orderId;
	/**
	 * 快递表主键
	 */
	private Express express;
	/**
	 * 地址表主键
	 */
	private ReceiveAddress receiveAddress;
	/**
	 * 用户
	 */
	private User user;
	/**
	 * 订单生成时间
	 */
	private String orderTime; 
	/**
	 * 订单状态
	 */
	private String orderStatus;
	/**
	 * 总价
	 */
	private Double totalPrice;
	/**
	 * 书和订单，多对多
	 */
	private List<Book> books = new ArrayList<Book>();
	
	private Integer bookNum;
	
	public Order(String orderId, Express express, ReceiveAddress receiveAddress, User user,
			String orderTime, String orderStatus, Double totalPrice, List<Book> books, Integer bookNum) {
		this.orderId = orderId;
		this.express = express;
		this.receiveAddress = receiveAddress;
		this.user = user;
		this.orderTime = orderTime;
		this.orderStatus = orderStatus;
		this.totalPrice = totalPrice;
		this.books = books;
		this.bookNum = bookNum;
	}
	public Order() {
		
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", express=" + express + ", receiveAddress=" + receiveAddress + ", user="
				+ user + ", orderTime=" + orderTime + ", orderStatus=" + orderStatus
				+ ", totalPrice=" + totalPrice + ", books=" + books + ", bookNum=" + bookNum + "]";
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Express getExpress() {
		return express;
	}
	public void setExpress(Express express) {
		this.express = express;
	}
	public ReceiveAddress getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(ReceiveAddress receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Integer getBookNum() {
		return bookNum;
	}
	public void setBookNum(Integer bookNum) {
		this.bookNum = bookNum;
	}
	
}
