package com.hcl.inghackathon.model;

public class PaymentModel {

	private Integer paymentId;

	private String provider;
	private String vendor;
	private Integer amountToBePaid;
	private String status;
	private String bankAccount;

	public PaymentModel() {
	}

	public PaymentModel(Integer paymentId, String provider, String vendor, Integer amountToBePaid, String status,
			String bankAccount) {
		super();
		this.paymentId = paymentId;
		this.provider = provider;
		this.vendor = vendor;
		this.amountToBePaid = amountToBePaid;
		this.status = status;
		this.bankAccount = bankAccount;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(Integer amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "PaymentModel [paymentId=" + paymentId + ", provider=" + provider + ", vendor=" + vendor
				+ ", amountToBePaid=" + amountToBePaid + ", status=" + status + ", bankAccount=" + bankAccount + "]";
	}

}