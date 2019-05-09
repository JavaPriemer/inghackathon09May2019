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
	private Long id;

	@Column(name = "party_id")
	private Long partyId;

	@Column(name = "transaction_date")
	private Date transactionDate;

	@Column(name = "product_code")
	private Long productCode;

	@Column(name = "activity_code")
	private Long activityCode;

	@Column(name = "transaction_status")
	private String transactionStatus;

	@Column(name = "processing_status")
	private String processingStatus;

	public Source() {
	}

	public Source(Long partyId, Date transactionDate, Long productCode, Long activityCode, String transactionStatus,
			String processingStatus) {
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
		return "Source [partyId=" + partyId + ", transactionDate=" + transactionDate + ", productCode=" + productCode
				+ ", activityCode=" + activityCode + ", transactionStatus=" + transactionStatus + ", processingStatus="
				+ processingStatus + "]";
	}

}