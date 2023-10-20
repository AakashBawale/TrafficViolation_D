package com.insurance.trafic_violation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trafficViolationCode")
public class TrafficViolationCode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String trafficViolationQuestions;
	private String trafficViolationCode;
	private String trafficViolationPoint;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrafficViolationQuestions() {
		return trafficViolationQuestions;
	}

	public void setTrafficViolationQuestions(String trafficViolationQuestions) {
		this.trafficViolationQuestions = trafficViolationQuestions;
	}

	public String getTrafficViolationCode() {
		return trafficViolationCode;
	}

	public void setTrafficViolationCode(String trafficViolationCode) {
		this.trafficViolationCode = trafficViolationCode;
	}

	public String getTrafficViolationPoint() {
		return trafficViolationPoint;
	}

	public void setTrafficViolationPoint(String trafficViolationPoint) {
		this.trafficViolationPoint = trafficViolationPoint;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TrafficViolationCode [id=" + id + ", trafficViolationQuestions=" + trafficViolationQuestions
				+ ", trafficViolationCode=" + trafficViolationCode + ", trafficViolationPoint=" + trafficViolationPoint
				+ ", description=" + description + "]";
	}

}
