package com.hcl.inghackathon.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "source")
public class Source {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "party_id")
	private Long partyId;

	@Column(name = "transaction_date")
	private Date transactionDate;

	@Column(name = "product_code")
	private Long productCode;

	@Column(name = "activity_code")
	private Long activityCode;

	@Column(name = "transaction_status")
	private Integer transactionStatus;
	
	private String provider;

	@Column(name = "actual_status")
	private String actualStatus;
	
	@Column(name = "payment_status")
	private String paymentStatus;

	public Source() {
	}

	public Source(Long partyId, Date transactionDate, Long productCode, Long activityCode, Integer transactionStatus,
			String provider, String actualStatus, String paymentStatus) {
		super();
		this.partyId = partyId;
		this.transactionDate = transactionDate;
		this.productCode = productCode;
		this.activityCode = activityCode;
		this.transactionStatus = transactionStatus;
		this.provider = provider;
		this.actualStatus = actualStatus;
		this.paymentStatus = paymentStatus;
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

	public String getActualStatus() {
		return actualStatus;
	}

	public void setActualStatus(String actualStatus) {
		this.actualStatus = actualStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "Source [partyId=" + partyId + ", transactionDate=" + transactionDate + ", productCode=" + productCode
				+ ", activityCode=" + activityCode + ", transactionStatus=" + transactionStatus + ", provider="
				+ provider + ", actualStatus=" + actualStatus + ", paymentStatus=" + paymentStatus + "]";
	}

}