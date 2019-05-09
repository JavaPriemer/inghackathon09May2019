package com.hcl.inghackathon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private Long transactionId;

	@Column(name = "party_id")
	private Long partyId;

	@Column(name = "transaction_count")
	private Long transactionCount;

	@Column(name = "amount_to_be_paid")
	private Double amountToBePaid;

	@Column(name = "approval_status")
	private String approvalStatus;
	
	public Transaction() {
	}

	public Transaction(Long transactionId, Long partyId, Long transactionCount, Double amountToBePaid,
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

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
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
		return "Transaction [transactionId=" + transactionId + ", partyId=" + partyId + ", transactionCount="
				+ transactionCount + ", amountToBePaid=" + amountToBePaid + ", approvalStatus=" + approvalStatus + "]";
	}
	
}