package com.bs.admin.pojo;


/**  

* <p>Title: PurchaseItem</p>  

* <p>Description: </p>  

* @author 王顺坤  

* <p> @date 2018年12月3日</p>   

*/ 
public class PurchaseItem {
private Long PurchaseItemId;
/** purchase
 * 这个采购清单里面的采购信息
 * 
 * */ 
private Purchase purchase;
/** book
 *  采购清单的数目
 * */ 
private Book book;
/** purchaseNum
 * 
 * 采购数量
 * 
 * */ 
private Integer purchaseNum;
/** purchasePrice
 * 
 * 采购价格
 * */ 
private 	Double purchasePrice;



public PurchaseItem() {
}


public PurchaseItem(Long purchaseItemId, Purchase purchase, Book book, Integer purchaseNum, Double purchasePrice) {
	PurchaseItemId = purchaseItemId;
	this.purchase = purchase;
	this.book = book;
	this.purchaseNum = purchaseNum;
	this.purchasePrice = purchasePrice;
}
public PurchaseItem(Purchase purchase, Book book, Integer purchaseNum, Double purchasePrice) {
	this.purchase = purchase;
	this.book = book;
	this.purchaseNum = purchaseNum;
	this.purchasePrice = purchasePrice;
}







public Long getPurchaseItemId() {
	return PurchaseItemId;
}


public void setPurchaseItemId(Long purchaseItemId) {
	PurchaseItemId = purchaseItemId;
}


public Purchase getPurchase() {
	return purchase;
}


public void setPurchase(Purchase purchase) {
	this.purchase = purchase;
}


public Book getBook() {
	return book;
}


public void setBook(Book book) {
	this.book = book;
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


public void setPurchasePrice(Double purchasePrice) {
	this.purchasePrice = purchasePrice;
}


@Override
public String toString() {
	return "PurchaseItem [PurchaseItemtId=" + PurchaseItemId + ", purchase=" + purchase + ", book=" + book
			+ ", purchaseNum=" + purchaseNum + ", purchasePrice=" + purchasePrice + "]";
}





}
