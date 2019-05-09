package com.hcl.inghackathon.model;

public class CommissionModel {

	private Long providerId;
	private Long productCode;
	private Long activityId;
	private Double commission;
	
	public CommissionModel() {
	}

	public CommissionModel(Long providerId, Long productCode, Long activityId, Double commission) {
		super();
		this.providerId = providerId;
		this.productCode = productCode;
		this.activityId = activityId;
		this.commission = commission;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
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
		return "CommissionModel [providerId=" + providerId + ", productCode=" + productCode + ", activityId="
				+ activityId + ", commission=" + commission + "]";
	}

}