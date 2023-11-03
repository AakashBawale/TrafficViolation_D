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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class DriverTrafficViolationCodeRecordController {
	@Autowired
	private DriverTrafficViolationCodeRecordService driverTrafficViolationCodeRecordService;

	@PostMapping("/driverTrafficViolationCodeRecord")
	@ApiOperation(value = "Request to add Traffic Violation Code Record")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"), 
			@ApiResponse(code = 400, message = "Invalid Request"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<DriverTrafficViolationCodeRecord> addDriverTrafficViolationCodeRecordDetails(
			@RequestBody DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecords = driverTrafficViolationCodeRecordService
				.addDriverTrafficViolationCodeRecordDetails(driverTrafficViolationCodeRecord);
		return ResponseEntity.status(HttpStatus.CREATED).body(driverTrafficViolationCodeRecords);
	}

	@PutMapping("/driverTrafficViolationCodeRecord")
	@ApiOperation(value = "Request to edit Traffic Violation Code Record")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<DriverTrafficViolationCodeRecord> UpdateDriverTrafficViolationCodeRecord(
			@RequestBody DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecords = driverTrafficViolationCodeRecordService
				.addDriverTrafficViolationCodeRecordDetails(driverTrafficViolationCodeRecord);
		return ResponseEntity.status(HttpStatus.CREATED).body(driverTrafficViolationCodeRecords);
	}

	@GetMapping("/driverTrafficViolationCodeRecord/{id}")
	@ApiOperation(value = "Request to get Traffic Violation Code Record using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<DriverTrafficViolationCodeRecord> fetchDriverTrafficViolationCodeRecordDetails(
			@PathVariable("id") Integer id) {
		DriverTrafficViolationCodeRecord driverTrafficViolationCodeRecord = driverTrafficViolationCodeRecordService
				.fetchDriverTrafficViolationCodeRecordCodeDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body(driverTrafficViolationCodeRecord);
	}

	@GetMapping("/driverTrafficViolationCodeRecord")
	@ApiOperation(value = "Request to get all Traffic Violation Code Record")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<List<DriverTrafficViolationCodeRecord>> FetchAllDriverTrafficViolationCodeRecordDetails() {
		List<DriverTrafficViolationCodeRecord> driverTrafficViolationCodeRecordList = driverTrafficViolationCodeRecordService
				.fetchAllDriverTrafficViolationCodeRecordDetails();
		return ResponseEntity.status(HttpStatus.OK).body(driverTrafficViolationCodeRecordList);
	}

	@DeleteMapping("/driverTrafficViolationCodeRecord")
	@ApiOperation(value = "Request to delete Traffic Violation Code Record using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<String> deleteDriverTrafficViolationCodeRecordDetails(@PathVariable("id") Integer id) {
		driverTrafficViolationCodeRecordService.deleteDriverTrafficViolationCodeRecordDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body("Record deleted successfully");
	}

	@GetMapping("/findBytrafficViolationCode")
	@ApiOperation(value = "Request to get Traffic Violation Code Record using traffic Violation Code")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<List<DriverTrafficViolationCodeRecord>> findByTrafficViolationCode(
			@RequestParam("trafficViolationCode") String trafficViolationCode) {
		List<DriverTrafficViolationCodeRecord> trafficViolationCodeList = driverTrafficViolationCodeRecordService
				.findByTrafficViolationCode(trafficViolationCode);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodeList);

	}

	@GetMapping("/findByTrafficViolationCodeAndStatus")
	@ApiOperation(value = "Request to get Traffic Violation Code Record using traffic Violation Code and status")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<List<DriverTrafficViolationCodeRecord>> findByTrafficViolationCodeAndStatus(
			@RequestParam("trafficViolationCode") String trafficViolationCode, @RequestParam("status") String status) {
		List<DriverTrafficViolationCodeRecord> trafficViolationCodeList = driverTrafficViolationCodeRecordService
				.findByTrafficViolationCodeAndStatust(trafficViolationCode, status);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodeList);
	}
}
