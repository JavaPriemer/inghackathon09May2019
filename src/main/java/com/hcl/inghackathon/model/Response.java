package com.hcl.inghackathon.model;

public class Response {

	private Long partyId;
	private Long productCode;
	private Long activityCode;
	private String transactionStatus;

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
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

	@Override
	public String toString() {
		return "Response [partyId=" + partyId + ", productCode=" + productCode + ", activityCode=" + activityCode
				+ ", transactionStatus=" + transactionStatus + "]";
	}

}