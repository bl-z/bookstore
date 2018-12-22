package com.bs.admin.pojo;

public class Financial {

	private String financialId;
	private String financialStatus;
	private String financialTypes;
	private Double financialMoney;
	private String financialDate;
	private String transactionDate;
	private String financialDetails;

	public String getFinancialId() {
		return financialId;
	}

	public void setFinancialId(String financialId) {
		this.financialId = financialId;
	}

	public String getFinancialStatus() {
		return financialStatus;
	}

	public void setFinancialStatus(String financialStatus) {
		this.financialStatus = financialStatus;
	}

	public String getFinancialTypes() {
		return financialTypes;
	}

	public void setFinancialTypes(String financialTypes) {
		this.financialTypes = financialTypes;
	}

	public Double getFinancialMoney() {
		return financialMoney;
	}

	public void setFinancialMoney(Double financialMoney) {
		this.financialMoney = financialMoney;
	}

	public String getFinancialDate() {
		return financialDate;
	}

	public void setFinancialDate(String financialDate) {
		this.financialDate = financialDate;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getFinancialDetails() {
		return financialDetails;
	}

	public void setFinancialDetails(String financialDetails) {
		this.financialDetails = financialDetails;
	}

	@Override
	public String toString() {
		return "Financial [financialId=" + financialId + ", financialStatus=" + financialStatus + ", financialTypes="
				+ financialTypes + ", financialMoney=" + financialMoney + ", financialDate=" + financialDate
				+ ", transactionDate=" + transactionDate + ", financialDetails=" + financialDetails + "]";
	}

	public Financial(String financialId, String financialStatus, String financialTypes, Double financialMoney,
			String financialDate, String transactionDate, String financialDetails) {
		this.financialId = financialId;
		this.financialStatus = financialStatus;
		this.financialTypes = financialTypes;
		this.financialMoney = financialMoney;
		this.financialDate = financialDate;
		this.transactionDate = transactionDate;
		this.financialDetails = financialDetails;
	}

	public Financial(String financialStatus, String financialTypes, Double financialMoney, String financialDate,
			String transactionDate, String financialDetails) {
		this.financialStatus = financialStatus;
		this.financialTypes = financialTypes;
		this.financialMoney = financialMoney;
		this.financialDate = financialDate;
		this.transactionDate = transactionDate;
		this.financialDetails = financialDetails;
	}

	public Financial() {
	}

}
