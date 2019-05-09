package com.hcl.inghackathon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private Integer paymentId;
	
	private String provider;

	private String vendor;

	@Column(name = "amount_to_be_paid")
	private Integer amountToBePaid;

	private String status;

	@Column(name = "bank_account")
	private String bankAccount;

	public Payment() {
	}

	public Payment(String provider, String vendor, Integer amountToBePaid, String status, String bankAccount) {
		super();
		this.provider = provider;
		this.vendor = vendor;
		this.amountToBePaid = amountToBePaid;
		this.status = status;
		this.bankAccount = bankAccount;
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
		return "TableThree [provider=" + provider + ", vendor=" + vendor + ", amountToBePaid=" + amountToBePaid
				+ ", status=" + status + ", bankAccount=" + bankAccount + "]";
	}

}