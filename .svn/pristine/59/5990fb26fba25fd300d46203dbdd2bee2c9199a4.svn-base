package com.bs.admin.pojo;

public class Stock {
	private Long stockId;
	/**
	 * purchaselist
	 * 
	 * 记录着库存商品的采购信息，采购价格，采购量等
	 */
	private PurchaseItem purchaseItem;

	/** stockAmount 库存数量数量 
	 * 
	 * */
	private Integer stockNum;
	
	
	/** storeHouse
	 * 
	 * 仓库编号
	 * */ 
	private StoreHouse storeHouse;

	

	/** book
	 * 所存储的书本
	 * */ 
	private Book book;
	

	/** stockTime
	 * 
	 * 入庫時間
	 * 
	 * */ 
	private String stockTime;


	public Stock(Long stockId, PurchaseItem purchaseItem, Integer stockNum, String stockTime) {
		this.stockId = stockId;
		this.purchaseItem = purchaseItem;
		this.stockNum = stockNum;
		this.stockTime = stockTime;
	}


	public Stock(PurchaseItem purchaseItem, Integer stockNum) {
		this.purchaseItem = purchaseItem;
		this.stockNum = stockNum;
	}


	public Stock() {
		
		
	}


	public Stock(Long stockId, PurchaseItem purchaseItem, Integer stockNum, StoreHouse storeHouse, Book book,
			String stockTime) {
		this.stockId = stockId;
		this.purchaseItem = purchaseItem;
		this.stockNum = stockNum;
		this.storeHouse = storeHouse;
		this.book = book;
		this.stockTime = stockTime;
	}


	public Long getStockId() {
		return stockId;
	}


	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}


	public PurchaseItem getPurchaseItem() {
		return purchaseItem;
	}


	public void setPurchaseItem(PurchaseItem purchaseItem) {
		this.purchaseItem = purchaseItem;
	}


	public Integer getStockNum() {
		return stockNum;
	}


	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}


	public StoreHouse getStoreHouse() {
		return storeHouse;
	}


	public void setStoreHouse(StoreHouse storeHouse) {
		this.storeHouse = storeHouse;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public String getStockTime() {
		return stockTime;
	}


	public void setStockTime(String stockTime) {
		this.stockTime = stockTime;
	}


	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", purchaseItem=" + purchaseItem + ", stockNum=" + stockNum
				+ ", storeHouse=" + storeHouse + ", book=" + book + ", stockTime=" + stockTime + "]";
	}






	

	
	
	

}
