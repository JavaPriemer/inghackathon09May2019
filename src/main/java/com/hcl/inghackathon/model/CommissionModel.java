package com.hcl.inghackathon.model;

import java.util.Date;

public class CommissionModel {

	private Long partyId;
	private Long productCode;
	private Long activityId;
	private Date startDate;
	private Date endDate;
	private Double commission;

	public CommissionModel() {
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
		return "CommissionModel [partyId=" + partyId + ", productCode=" + productCode + ", activityId=" + activityId
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", commission=" + commission + "]";
	}

}