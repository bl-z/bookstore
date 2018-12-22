package com.bs.admin.pojo;

public class WindowInfo {

	private String bookName;
	private Double bookSalesPrice;
	private Integer bookNum;
	
	public WindowInfo(String bookName, Double bookSalesPrice, Integer bookNum) {
		this.bookName = bookName;
		this.bookSalesPrice = bookSalesPrice;
		this.bookNum = bookNum;
	}

	public WindowInfo() {
	}

	@Override
	public String toString() {
		return "WindowInfo [bookName=" + bookName + ", bookSalesPrice=" + bookSalesPrice + ", bookNum=" + bookNum + "]";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookSalesPrice() {
		return bookSalesPrice;
	}

	public void setBookSalesPrice(Double bookSalesPrice) {
		this.bookSalesPrice = bookSalesPrice;
	}

	public Integer getBookNum() {
		return bookNum;
	}

	public void setBookNum(Integer bookNum) {
		this.bookNum = bookNum;
	}
	
	
}
