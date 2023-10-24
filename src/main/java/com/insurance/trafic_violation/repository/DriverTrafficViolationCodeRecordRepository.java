package com.insurance.trafic_violation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.trafic_violation.model.DriverTrafficViolationCodeRecord;

@Repository
public interface DriverTrafficViolationCodeRecordRepository
		extends JpaRepository<DriverTrafficViolationCodeRecord, Integer> {

	public DriverTrafficViolationCodeRecord findDriverTrafficViolationCodeRecordById(Integer id);

	public List<DriverTrafficViolationCodeRecord> findByTrafficViolationCode(String trafficViolationCode);

	public List<DriverTrafficViolationCodeRecord> findByTrafficViolationCodeAndStatus(String trafficViolationCode,String status);

}
