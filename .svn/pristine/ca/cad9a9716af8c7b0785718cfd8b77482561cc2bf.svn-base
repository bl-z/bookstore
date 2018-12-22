package com.bs.admin.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <p>
 * Title: Supplier
 * </p>
 * 
 * <p>
 * Description: 供应商信息表
 * </p>
 * 
 * @author 王顺坤
 * 
 *         <p>
 * 		@date 2018年11月21日
 *         </p>
 * 
 */

public class Supplier implements Serializable {
	/** supplierId 供应商的id */
	private Integer supplierId;
	/** supplierName 供应商的名称 */
	private String supplierName;
	/** supplerPhone 供应商电话 */
	private String supplierPhone;
	/** supplierAddress 供应商地址 */
	private String supplierAddress;
	/** supplierContact 供应商联系人 */
	private String supplierContact;
	/** supplierContactPhone 供应商联系电话 */
	private String supplierContactPhone;
	/** 开始合作的日期*/ 
	private String cooperateDate;
	/** 合作状态
	 * 未合作：0
	 * 合作中：1
	 * 合作过：2
	 * */ 
	private Integer cooperateStatus;
	
	private List<Purchase> cooperateHistory;

	public Supplier() {
	}
	
	

	public Supplier(String supplierName, String supplierPhone, String supplierAddress, String supplierContact,
			String supplierContactPhone, String cooperateDate, Integer cooperateStatus) {
		super();
		this.supplierName = supplierName;
		this.supplierPhone = supplierPhone;
		this.supplierAddress = supplierAddress;
		this.supplierContact = supplierContact;
		this.supplierContactPhone = supplierContactPhone;
		this.cooperateDate = cooperateDate;
		this.cooperateStatus = cooperateStatus;
	}




	public Supplier(Integer supplierId, String supplierName, String supplierPhone, String supplierAddress,
			String supplierContact, String supplierContactPhone, String cooperateDate) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierPhone = supplierPhone;
		this.supplierAddress = supplierAddress;
		this.supplierContact = supplierContact;
		this.supplierContactPhone = supplierContactPhone;
		this.cooperateDate = cooperateDate;
	}



	public Supplier(Integer supplierId, String supplierName, String supplierPhone, String supplierAddress,
			String supplierContact, String supplierContactPhone, String cooperateDate, Integer cooperateStatus) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierPhone = supplierPhone;
		this.supplierAddress = supplierAddress;
		this.supplierContact = supplierContact;
		this.supplierContactPhone = supplierContactPhone;
		this.cooperateDate = cooperateDate;
		this.cooperateStatus = cooperateStatus;
	}



	public Supplier(Integer supplierId, String supplierName, String supplierPhone, String supplierAddress,
			String supplierContact, String supplierContactPhone, String cooperateDate, Integer cooperateStatus,
			List<Purchase> cooperateHistory) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierPhone = supplierPhone;
		this.supplierAddress = supplierAddress;
		this.supplierContact = supplierContact;
		this.supplierContactPhone = supplierContactPhone;
		this.cooperateDate = cooperateDate;
		this.cooperateStatus = cooperateStatus;
		this.cooperateHistory = cooperateHistory;
	}



	public void setCooperateStatus(Integer cooperateStatus) {
		this.cooperateStatus = cooperateStatus;
	}



	public List<Purchase> getCooperateHistory() {
		return cooperateHistory;
	}

	public void setCooperateHistory(ArrayList<Purchase> cooperateHistory) {
		this.cooperateHistory = cooperateHistory;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getCooperateDate() {
		return cooperateDate;
	}

	public void setCooperateDate(String cooperateDate) {
		this.cooperateDate = cooperateDate;
	}

	public Integer getCooperateStatus() {
		return cooperateStatus;
	}

	public void setCooperateStatus(int i) {
		this.cooperateStatus = i;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getSupplierContact() {
		return supplierContact;
	}

	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}

	public String getSupplierContactPhone() {
		return supplierContactPhone;
	}

	public void setSupplierContactPhone(String supplierContactPhone) {
		this.supplierContactPhone = supplierContactPhone;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierPhone="
				+ supplierPhone + ", supplierAddress=" + supplierAddress + ", supplierContact=" + supplierContact
				+ ", supplierContactPhone=" + supplierContactPhone + ", cooperateDate=" + cooperateDate
				+ ", cooperateStatus=" + cooperateStatus + "]";
	}

}
