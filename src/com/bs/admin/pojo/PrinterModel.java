package com.bs.admin.pojo;

import java.io.Serializable;

/**
 * 
* <p>Title: Printer</p>  
* <p>Description: 印刷工厂</p>  
* @author 胡杰  
* <p> @date 2018年11月27日</p>
 */
public class PrinterModel implements Serializable {

	private static final long serialVersionUID = 2029603283557423033L;
	private Integer printerId;
	private String printerName;
	private Integer printId;
	private String printSize;
	private String printDate;
	private Integer printQuantity;
	private Integer printBatch;
	
	public PrinterModel() {
		
	}

	public PrinterModel(Integer printerId, String printerName, Integer printId, String printSize, String printDate,
			Integer printQuantity, Integer printBatch) {
		this.printerId = printerId;
		this.printerName = printerName;
		this.printId = printId;
		this.printSize = printSize;
		this.printDate = printDate;
		this.printQuantity = printQuantity;
		this.printBatch = printBatch;
	}

	public PrinterModel(String printerName, Integer printId) {
		this.printerName = printerName;
		this.printId = printId;
	}

	@Override
	public String toString() {
		return "Printer [printerId=" + printerId + ", printerName=" + printerName + ", printId=" + printId
				+ ", printSize=" + printSize + ", printDate=" + printDate + ", printQuantity=" + printQuantity
				+ ", printBatch=" + printBatch + "]";
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
