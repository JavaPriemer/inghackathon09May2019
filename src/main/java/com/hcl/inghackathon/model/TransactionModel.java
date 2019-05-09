package com.hcl.inghackathon.model;

public class TransactionModel {

	private Long transactionId;
	private String partyId;
	private Long transactionCount;
	private Double amountToBePaid;
	private String approvalStatus;

	public TransactionModel() {
	}

	public TransactionModel(Long transactionId, String partyId, Long transactionCount, Double amountToBePaid,
			String approvalStatus) {
		super();
		this.transactionId = transactionId;
		this.partyId = partyId;
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

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public Long getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(Long transactionCount) {
		this.transactionCount = transactionCount;
	}

	public Double getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(Double amountToBePaid) {
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
		return "TransactionModel [transactionId=" + transactionId + ", partyId=" + partyId + ", transactionCount="
				+ transactionCount + ", amountToBePaid=" + amountToBePaid + ", approvalStatus=" + approvalStatus + "]";
	}

}