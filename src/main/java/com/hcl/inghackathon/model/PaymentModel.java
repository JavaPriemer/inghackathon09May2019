package com.hcl.inghackathon.model;

public class PaymentModel {

	private Long paymentId;
	private Long partyId;
	private String paymentStatus;
	private String bankAccount;
	private Integer amountPaid;

	public PaymentModel() {
	}

	public PaymentModel(Long paymentId, Long partyId, String paymentStatus, String bankAccount, Integer amountPaid) {
		super();
		this.paymentId = paymentId;
		this.partyId = partyId;
		this.paymentStatus = paymentStatus;
		this.bankAccount = bankAccount;
		this.amountPaid = amountPaid;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Integer getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Integer amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Override
	public String toString() {
		return "PaymentModel [paymentId=" + paymentId + ", partyId=" + partyId + ", paymentStatus=" + paymentStatus
				+ ", bankAccount=" + bankAccount + ", amountPaid=" + amountPaid + "]";
	}

}