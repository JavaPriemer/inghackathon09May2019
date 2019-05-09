package com.hcl.inghackathon.model;

public class CommissionModel {

	private Long partyId;
	private Long productCode;
	private Long activityId;
	private Double commission;

	public CommissionModel() {
	}

	public CommissionModel(Long partyId, Long productCode, Long activityId, Double commission) {
		super();
		this.partyId = partyId;
		this.productCode = productCode;
		this.activityId = activityId;
		this.commission = commission;
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

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return "CommissionModel [partyId=" + partyId + ", productCode=" + productCode + ", activityId=" + activityId
				+ ", commission=" + commission + "]";
	}

}