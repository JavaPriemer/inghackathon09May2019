package com.hcl.inghackathon.entities;

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
	@Column(name = "provider_id")
	private Long providerId;

	@Column(name = "product_code")
	private Long productCode;

	@Column(name = "activity_id")
	private Long activityId;
	private Double commission;

	public Commission() {
	}

	public Commission(Long providerId, Long productCode, Long activityId, Double commission) {
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

	public Long getActivity() {
		return activityId;
	}

	public void setActivity(Long activityId) {
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
		return "TableFour [providerId=" + providerId + ", productCode=" + productCode + ", activityId=" + activityId
				+ ", commission=" + commission + "]";
	}

}