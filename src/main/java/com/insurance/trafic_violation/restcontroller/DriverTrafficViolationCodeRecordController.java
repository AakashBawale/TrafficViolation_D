package com.insurance.trafic_violation.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.trafic_violation.model.DriverTrafficViolationCodeRecord;
import com.insurance.trafic_violation.service.DriverTrafficViolationCodeRecordService;

@RestController
public class DriverTrafficViolationCodeRecordController {
	@Autowired
	private DriverTrafficViolationCodeRecordService driverTrafficViolationCodeRecordService;

	@PostMapping("/driverTrafficViolationCodeRecord")
	public ResponseEntity<DriverTrafficViolationCodeRecord> addDriverTrafficViolationCodeRecordDetails(
			@RequestBody DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecords = driverTrafficViolationCodeRecordService
				.addDriverTrafficViolationCodeRecordDetails(driverTrafficViolationCodeRecord);
		return ResponseEntity.status(HttpStatus.CREATED).body(driverTrafficViolationCodeRecords);
	}

	@PutMapping("/driverTrafficViolationCodeRecord")
	public ResponseEntity<DriverTrafficViolationCodeRecord> UpdateDriverTrafficViolationCodeRecord(
			@RequestBody DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecords = driverTrafficViolationCodeRecordService
				.addDriverTrafficViolationCodeRecordDetails(driverTrafficViolationCodeRecord);
		return ResponseEntity.status(HttpStatus.CREATED).body(driverTrafficViolationCodeRecords);
	}

	@GetMapping("/driverTrafficViolationCodeRecord/{id}")
	public ResponseEntity<DriverTrafficViolationCodeRecord> fetchDriverTrafficViolationCodeRecordDetails(
			@PathVariable("id") Integer id) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord = driverTrafficViolationCodeRecordService
				.fetchDriverTrafficViolationCodeRecordCodeDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body(driverTrafficViolationCodeRecord);
	}

	@GetMapping("/driverTrafficViolationCodeRecord")
	public ResponseEntity<List<DriverTrafficViolationCodeRecord>> FetchAllDriverTrafficViolationCodeRecordDetails() {
		List<DriverTrafficViolationCodeRecord> driverTrafficViolationCodeRecordList = driverTrafficViolationCodeRecordService
				.fetchAllDriverTrafficViolationCodeRecordDetails();
		return ResponseEntity.status(HttpStatus.OK).body(driverTrafficViolationCodeRecordList);
	}

	@DeleteMapping("/driverTrafficViolationCodeRecord")
	public ResponseEntity<String> deleteDriverTrafficViolationCodeRecordDetails(@PathVariable("id") Integer id) {
		driverTrafficViolationCodeRecordService.deleteDriverTrafficViolationCodeRecordDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body("Record deleted successfully");
	}

	@GetMapping("/findBytrafficViolationCode")
	public ResponseEntity<List<DriverTrafficViolationCodeRecord>> findByTrafficViolationCode(
			@RequestParam("trafficViolationCode") String trafficViolationCode) {
		List<DriverTrafficViolationCodeRecord> trafficViolationCodeList = driverTrafficViolationCodeRecordService
				.findByTrafficViolationCode(trafficViolationCode);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodeList);

	}

	@GetMapping("/findByTrafficViolationCodeAndStatus")
	public ResponseEntity<List<DriverTrafficViolationCodeRecord>> findByTrafficViolationCodeAndStatus(
			@RequestParam("trafficViolationCode") String trafficViolationCode, @RequestParam("status") String status) {
		List<DriverTrafficViolationCodeRecord> trafficViolationCodeList = driverTrafficViolationCodeRecordService
				.findByTrafficViolationCodeAndStatust(trafficViolationCode, status);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodeList);
	}
}
