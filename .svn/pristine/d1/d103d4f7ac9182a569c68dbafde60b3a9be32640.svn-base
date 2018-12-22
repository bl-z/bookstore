package com.bs.admin.pojo;

public class purchaseInsert {
	private Long PurchaseItemId;
	private Integer purchaseId;
	private Integer bookId;
	private Integer purchaseNum;
	private double purchasePrice;
	
	
	public purchaseInsert() {
	}
	public purchaseInsert(Integer purchaseId, Integer bookId, Integer purchaseNum, double purchasePrice) {
		this.purchaseId = purchaseId;
		this.bookId = bookId;
		this.purchaseNum = purchaseNum;
		this.purchasePrice = purchasePrice;
	}
	public purchaseInsert(Long purchaseItemId, Integer purchaseId, Integer bookId, Integer purchaseNum,
			double purchasePrice) {
		PurchaseItemId = purchaseItemId;
		this.purchaseId = purchaseId;
		this.bookId = bookId;
		this.purchaseNum = purchaseNum;
		this.purchasePrice = purchasePrice;
	}
	public Long getPurchaseItemId() {
		return PurchaseItemId;
	}
	public void setPurchaseItemId(Long purchaseItemId) {
		PurchaseItemId = purchaseItemId;
	}
	public Integer getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(Integer purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	@Override
	public String toString() {
		return "purchaseInsert [PurchaseItemId=" + PurchaseItemId + ", purchaseId=" + purchaseId + ", bookId=" + bookId
				+ ", purchaseNum=" + purchaseNum + ", purchasePrice=" + purchasePrice + "]";
	}
	
	/**  
	
	 * <p>Title: createPurchaseItem</p>  
	
	 * <p>Description: 创建Pi对象的方法</p>  
	
	 * @return  
	 * <p> @date 2018年12月7日  </p> 
	 */
	public PurchaseItem createPurchaseItem(){
		Purchase purchase = new Purchase();
		purchase.setPurchaseId(purchaseId);
		Book book = new  Book(bookId);
		PurchaseItem purchaseItem = new PurchaseItem(purchase, book, purchaseNum, purchasePrice);
		return purchaseItem;
		
	}
	
}
