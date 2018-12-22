package com.bs.admin.pojo;

import java.io.Serializable;

/**
 * 
* <p>Title: PrintInfo</p>  
* <p>Description: 印刷信息类</p>  
* @author 胡杰  
* <p> @date 2018年11月23日</p>
 */
public class PrintInfo implements Serializable {

	private static final long serialVersionUID = 670364611543242914L;
	/**
	 printId  自增主键
	*/ 
	private Integer printId;
	/**
	 printSize  印刷开本
	*/ 
	private String printSize;  
	/**
	 printDate  印刷日期
	*/ 
	private String printDate; 
	/**
	 printQuantity  印刷数量
	*/ 
	private Integer printQuantity; 
	/**
	 printBatch   印刷批次
	*/ 
	private Integer printBatch;  
	public PrintInfo(){
		
	}
	public PrintInfo(Integer printId, String printSize, String printDate, Integer printQuantity,
			Integer printBatch) {
		this.printId = printId;
		this.printSize = printSize;
		this.printDate = printDate;
		this.printQuantity = printQuantity;
		this.printBatch = printBatch;
	}
	@Override
	public String toString() {
		return "PrintInfo [printId=" + printId + ", printSize=" + printSize
				+ ", printDate=" + printDate + ", printQuantity=" + printQuantity + ", printBatch=" + printBatch + "]";
	}
	public Integer getPrintId() {
		return printId;
	}
	public void setPrintId(Integer printId) {
		this.printId = printId;
	}
	public String getPrintSize() {
		return printSize;
	}
	public void setPrintSize(String printSize) {
		this.printSize = printSize;
	}
	public String getPrintDate() {
		return printDate;
	}
	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}
	public Integer getPrintQuantity() {
		return printQuantity;
	}
	public void setPrintQuantity(Integer printQuantity) {
		this.printQuantity = printQuantity;
	}
	public Integer getPrintBatch() {
		return printBatch;
	}
	public void setPrintBatch(Integer printBatch) {
		this.printBatch = printBatch;
	}
	
	
}
