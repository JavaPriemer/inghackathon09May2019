package com.hcl.inghackathon.model;

public class TransactionModel {

	private Long transactionId;
	private String vendor;
	private String provider;
	private Long transactionCount;
	private Integer amountToBePaid;
	private String approvalStatus;

	public TransactionModel() {
	}

	public TransactionModel(Long transactionId, String vendor, String provider, Long transactionCount,
			Integer amountToBePaid, String approvalStatus) {
		super();
		this.transactionId = transactionId;
		this.vendor = vendor;
		this.provider = provider;
		this.transactionCount = transactionCount;
		this.amountToBePaid = amountToBePaid;
		this.approvalStatus = approvalStatus;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Long getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(Long transactionCount) {
		this.transactionCount = transactionCount;
	}

	public Integer getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(Integer amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	@Override
	public String toString() {
		return "TransactionModel [transactionId=" + transactionId + ", vendor=" + vendor + ", provider=" + provider
				+ ", transactionCount=" + transactionCount + ", amountToBePaid=" + amountToBePaid + ", approvalStatus="
				+ approvalStatus + "]";
	}

}