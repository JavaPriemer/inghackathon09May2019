package com.hcl.inghackathon.model;

import java.util.Date;

public class SourceModel {

	private Long partyId;
	private Date transactionDate;
	private Long productCode;
	private Long activityCode;
	private Integer transactionStatus;
	private String provider;
	private Integer actualStatus;

	public SourceModel() {
	}

	public SourceModel(Long partyId, Date transactionDate, Long productCode, Long activityCode,
			Integer transactionStatus, String provider, Integer actualStatus) {
		super();
		this.partyId = partyId;
		this.transactionDate = transactionDate;
		this.productCode = productCode;
		this.activityCode = activityCode;
		this.transactionStatus = transactionStatus;
		this.provider = provider;
		this.actualStatus = actualStatus;
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

	public Integer getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(Integer transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Integer getActualStatus() {
		return actualStatus;
	}

	public void setActualStatus(Integer actualStatus) {
		this.actualStatus = actualStatus;
	}

	@Override
	public String toString() {
		return "SourceModel [partyId=" + partyId + ", transactionDate=" + transactionDate + ", productCode="
				+ productCode + ", activityCode=" + activityCode + ", transactionStatus=" + transactionStatus
				+ ", provider=" + provider + ", actualStatus=" + actualStatus + "]";
	}

}