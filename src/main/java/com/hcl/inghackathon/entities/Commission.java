package com.hcl.inghackathon.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission")
public class Commission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "party_id")
	private Long partyId;

	@Column(name = "product_code")
	private Long productCode;

	@Column(name = "activity_id")
	private Long activityId;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	private Double commission;

	public Commission() {
	}

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

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return "Commission [partyId=" + partyId + ", productCode=" + productCode + ", activityId=" + activityId
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", commission=" + commission + "]";
	}
	
}