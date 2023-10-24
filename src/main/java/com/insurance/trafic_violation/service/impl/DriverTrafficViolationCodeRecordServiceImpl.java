package com.insurance.trafic_violation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.trafic_violation.model.DriverTrafficViolationCodeRecord;
import com.insurance.trafic_violation.repository.DriverTrafficViolationCodeRecordRepository;
import com.insurance.trafic_violation.service.DriverTrafficViolationCodeRecordService;

@Service
public class DriverTrafficViolationCodeRecordServiceImpl implements DriverTrafficViolationCodeRecordService {
	@Autowired
	private DriverTrafficViolationCodeRecordRepository driverTrafficViolationCodeRecordRepository;

	@Override
	public DriverTrafficViolationCodeRecord addDriverTrafficViolationCodeRecordDetails(
			DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecords = driverTrafficViolationCodeRecordRepository
				.save(driverTrafficViolationCodeRecord);
		return driverTrafficViolationCodeRecords;
	}

	@Override
	public DriverTrafficViolationCodeRecord updateDriverTrafficViolationCodeRecordDetails(
			DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecords = driverTrafficViolationCodeRecordRepository
				.save(driverTrafficViolationCodeRecord);
		return driverTrafficViolationCodeRecords;
	}

	@Override
	public DriverTrafficViolationCodeRecord fetchDriverTrafficViolationCodeRecordCodeDetails(Integer id) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord = driverTrafficViolationCodeRecordRepository
				.findDriverTrafficViolationCodeRecordById(id);
		return driverTrafficViolationCodeRecord;
	}

	@Override
	public List<DriverTrafficViolationCodeRecord> fetchAllDriverTrafficViolationCodeRecordDetails() {
		List<DriverTrafficViolationCodeRecord> driverTrafficViolationCodeRecordList = driverTrafficViolationCodeRecordRepository
				.findAll();
		return driverTrafficViolationCodeRecordList;
	}

	@Override
	public void deleteDriverTrafficViolationCodeRecordDetails(Integer id) {
		driverTrafficViolationCodeRecordRepository.deleteById(id);

	}

	@Override
	public List<DriverTrafficViolationCodeRecord> findByTrafficViolationCode(String trafficViolationCode) {
		List<DriverTrafficViolationCodeRecord> driverTrafficViolationCodeRecordList = driverTrafficViolationCodeRecordRepository
				.findByTrafficViolationCode(trafficViolationCode);
		return driverTrafficViolationCodeRecordList;
	}

	@Override
	public List<DriverTrafficViolationCodeRecord> findByTrafficViolationCodeAndStatust(String trafficViolationCode,
			String status) {
		List<DriverTrafficViolationCodeRecord> driverTrafficViolationCodeRecordList = driverTrafficViolationCodeRecordRepository
				.findByTrafficViolationCodeAndStatus(trafficViolationCode, status);
		return driverTrafficViolationCodeRecordList;
	}

}
