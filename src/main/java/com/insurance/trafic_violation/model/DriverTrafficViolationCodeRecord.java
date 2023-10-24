package com.insurance.trafic_violation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driverTrafficViolationCodeRecord")
public class DriverTrafficViolationCodeRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer driverId;
	private String trafficViolationCode;
	private Boolean status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public String getTrafficViolationCode() {
		return trafficViolationCode;
	}

	public void setTrafficViolationCode(String trafficViolationCode) {
		this.trafficViolationCode = trafficViolationCode;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Driver_Traffic_Violation_Code_Record [id=" + id + ", driverId=" + driverId + ", trafficViolationCode="
				+ trafficViolationCode + ", Status=" + status + "]";
	}

}
