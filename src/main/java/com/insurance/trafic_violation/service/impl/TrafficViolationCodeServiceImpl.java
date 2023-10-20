package com.insurance.trafic_violation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.trafic_violation.model.TrafficViolationCode;
import com.insurance.trafic_violation.repository.TrafficViolationCodeRepository;
import com.insurance.trafic_violation.service.TrafficViolationCodeService;

@Service
public class TrafficViolationCodeServiceImpl implements TrafficViolationCodeService {
	@Autowired
	private TrafficViolationCodeRepository trafficViolationCodeRepository;
	
	@Override
	public TrafficViolationCode addTraficViolationCodeDetails(TrafficViolationCode trafficViolationCode) {
		TrafficViolationCode newtrafficViolationCode = trafficViolationCodeRepository.save(trafficViolationCode);
		return newtrafficViolationCode;
	}

	@Override
	public TrafficViolationCode updateTraficViolationCodeDetails(TrafficViolationCode trafficViolationCode) {
		TrafficViolationCode newtrafficViolationCode = trafficViolationCodeRepository.save(trafficViolationCode);
		return newtrafficViolationCode;
	}

	@Override
	public TrafficViolationCode fetchTraficViolationCodeDetails(Integer id) {
		TrafficViolationCode trafficViolationCode = trafficViolationCodeRepository.findTrafficViolationCodeById(id);
		return trafficViolationCode;
	}

	@Override
	public List<TrafficViolationCode> fetchAllTraficViolationCodeDetails() {
		List<TrafficViolationCode> trafficViolationCodeList = trafficViolationCodeRepository.findAll();
		return trafficViolationCodeList;
	}

	@Override
	public void deleteTrafficViolationCodeDetails(Integer id) {
		trafficViolationCodeRepository.deleteById(id);
		
	}

	@Override
	public List<TrafficViolationCode> findByTrafficViolationCode(String trafficViolationCode) {
		List<TrafficViolationCode> trafficViolationCodeList = trafficViolationCodeRepository.findByTrafficViolationCode(trafficViolationCode);
		return trafficViolationCodeList;
	}

	@Override
	public List<TrafficViolationCode> findByTrafficViolationCodeAndTrafficViolationPoint(String TrafficViolationCode,String TrafficViolationPoint) {
		List<TrafficViolationCode> trafficViolationCodeList = trafficViolationCodeRepository.findByTrafficViolationCodeAndTrafficViolationPoint(TrafficViolationCode,TrafficViolationPoint);
		return trafficViolationCodeList;
	}

}
