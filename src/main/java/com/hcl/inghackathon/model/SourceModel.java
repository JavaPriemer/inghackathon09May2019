package com.hcl.inghackathon.model;

import java.util.Date;

public class SourceModel {

	private Long partyId;
	private Date transactionDate;
	private Long productCode;
	private Long activityCode;
	private String transactionStatus;
	private String processingStatus;

	public SourceModel() {
	}

	public SourceModel(Long partyId, Date transactionDate, Long productCode, Long activityCode,
			String transactionStatus, String processingStatus) {
		super();
		this.partyId = partyId;
		this.transactionDate = transactionDate;
		this.productCode = productCode;
		this.activityCode = activityCode;
		this.transactionStatus = transactionStatus;
		this.processingStatus = processingStatus;
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public Long getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(Long activityCode) {
		this.activityCode = activityCode;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}

	@Override
	public String toString() {
		return "SourceModel [partyId=" + partyId + ", transactionDate=" + transactionDate + ", productCode="
				+ productCode + ", activityCode=" + activityCode + ", transactionStatus=" + transactionStatus
				+ ", processingStatus=" + processingStatus + "]";
	}

}