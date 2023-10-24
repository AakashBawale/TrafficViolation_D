package com.insurance.trafic_violation.service;

import java.util.List;

import com.insurance.trafic_violation.model.TrafficViolationCode;

public interface TrafficViolationCodeService {

	public TrafficViolationCode addTraficViolationCodeDetails(TrafficViolationCode trafficViolationCode);

	public TrafficViolationCode updateTraficViolationCodeDetails(TrafficViolationCode trafficViolationCode);

	public TrafficViolationCode fetchTraficViolationCodeDetails(Integer id);

	public List<TrafficViolationCode> fetchAllTraficViolationCodeDetails();

	public void deleteTrafficViolationCodeDetails(Integer id);

	public List<TrafficViolationCode> findByTrafficViolationCode(String trafficViolationCode);

	public List<TrafficViolationCode> findByTrafficViolationCodeAndTrafficViolationPoint(String trafficViolationCode,String trafficViolationPoint);
}
