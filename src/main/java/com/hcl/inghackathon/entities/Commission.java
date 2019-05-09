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
	@Column(name = "party_id")
	private Long partyId;

	@Column(name = "product_code")
	private Long productCode;

	@Column(name = "activity_id")
	private Long activityId;
	private Double commission;

	public Commission() {
	}

	public Commission(Long partyId, Long productCode, Long activityId, Double commission) {
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
		return "Commission [partyId=" + partyId + ", productCode=" + productCode + ", activityId=" + activityId
				+ ", commission=" + commission + "]";
	}
	
}