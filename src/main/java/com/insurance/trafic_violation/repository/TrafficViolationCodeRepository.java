package com.insurance.trafic_violation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.trafic_violation.model.TrafficViolationCode;

@Repository
public interface TrafficViolationCodeRepository extends JpaRepository<TrafficViolationCode, Integer> {

	public TrafficViolationCode findTrafficViolationCodeById(Integer id);

	public List<TrafficViolationCode> findByTrafficViolationCode(String trafficViolationCode);

	public List<TrafficViolationCode> findByTrafficViolationCodeAndTrafficViolationPoint(String trafficViolationCode,
			String trafficViolationPoint);

}
