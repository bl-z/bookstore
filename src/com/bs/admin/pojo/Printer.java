package com.bs.admin.pojo;

import java.io.Serializable;

/**
 * 
* <p>Title: Printer</p>  
* <p>Description: 印刷工厂</p>  
* @author 胡杰  
* <p> @date 2018年11月27日</p>
 */
public class Printer implements Serializable {

	private static final long serialVersionUID = 2029603283557423033L;
	private Integer printerId;
	private String printerName;
	private Integer printId;
	private PrintInfo printInfo;   // 创建一对一的关系
	
	public Printer() {
		
	}

	public Printer(String printerName, Integer printId) {
		this.printerName = printerName;
		this.printId = printId;
	}

	public Printer(Integer printerId, String printerName, Integer printId, PrintInfo printInfo) {
		this.printerId = printerId;
		this.printerName = printerName;
		this.printId = printId;
		this.printInfo = printInfo;
	}

	public Integer getPrinterId() {
		return printerId;
	}

	public void setPrinterId(Integer printerId) {
		this.printerId = printerId;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public Integer getPrintId() {
		return printId;
	}

	public void setPrintId(Integer printId) {
		this.printId = printId;
	}

	public PrintInfo getPrintInfo() {
		return printInfo;
	}

	public void setPrintInfo(PrintInfo printInfo) {
		this.printInfo = printInfo;
	}
	
	
}
