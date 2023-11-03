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

import com.insurance.trafic_violation.model.TrafficViolationCode;
import com.insurance.trafic_violation.service.TrafficViolationCodeService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class TrafficViolationCodeController {
	@Autowired
	private TrafficViolationCodeService trafficViolationCodeService;

	@PostMapping("/trafficViolationCode")
	@ApiOperation(value = "Request to add Traffic Violation Code")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "Invalid Request"),
			@ApiResponse(code = 500, message = "Internal Error") })
	public ResponseEntity<TrafficViolationCode> addTraficViolationCodeDetails(
			@RequestBody TrafficViolationCode trafficViolationCode) {
		TrafficViolationCode trafficViolationCodes = trafficViolationCodeService
				.addTraficViolationCodeDetails(trafficViolationCode);
		return ResponseEntity.status(HttpStatus.CREATED).body(trafficViolationCodes);
	}

	@PutMapping("/trafficViolationCode")
	@ApiOperation(value = "Request to edit Traffic Violation Code")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error") })
	public ResponseEntity<TrafficViolationCode> UpdateTrafficViolationCodeDetails(
			@RequestBody TrafficViolationCode trafficViolationCode) {
		TrafficViolationCode trafficViolationCodes = trafficViolationCodeService
				.updateTraficViolationCodeDetails(trafficViolationCode);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodes);
	}

	@GetMapping("/trafficViolationCode/{id}")
	@ApiOperation(value = "Request to get Traffic Violation Code using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error") })
	public ResponseEntity<TrafficViolationCode> fetchTrafficViolationCodeDetails(@PathVariable("id") Integer id) {
		TrafficViolationCode trafficViolationCodes = trafficViolationCodeService.fetchTraficViolationCodeDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodes);
	}

	@GetMapping("/trafficViolationCode")
	@ApiOperation(value = "Request to get all Traffic Violation Code")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"),
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error") })
	public ResponseEntity<List<TrafficViolationCode>> FetchAllTrafficViolationCodeDetails() {
		List<TrafficViolationCode> trafficViolationCodeList = trafficViolationCodeService
				.fetchAllTraficViolationCodeDetails();
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodeList);
	}

	@DeleteMapping("/trafficViolationCode")
	@ApiOperation(value = "Request to delete Traffic Violation Code using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<String> deleteTrafficViolationCodeDetails(@PathVariable("id") Integer id) {
		trafficViolationCodeService.deleteTrafficViolationCodeDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body("Record deleted successfully");
	}

	@GetMapping("/trafficViolationCodeBytrafficViolationCode")
	@ApiOperation(value = "Request to get Traffic Violation Code using traffic Violation Code")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<List<TrafficViolationCode>> findByTrafficViolationCode(
			@RequestParam("trafficViolationCode") String trafficViolationCode) {
		List<TrafficViolationCode> trafficViolationCodeList = trafficViolationCodeService
				.findByTrafficViolationCode(trafficViolationCode);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodeList);

	}

	@GetMapping("/trafficViolationCodeByTrafficViolationCodeAndTrafficViolationPoint")
	@ApiOperation(value = "Request to get Traffic Violation Code using traffic Violation Code and point")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<List<TrafficViolationCode>> findByTrafficViolationCodeAndTrafficViolationPoint(
			@RequestParam("trafficViolationCode") String trafficViolationCode,
			@RequestParam("trafficViolationPoint") String trafficViolationPoint) {
		List<TrafficViolationCode> trafficViolationCodeList = trafficViolationCodeService
				.findByTrafficViolationCodeAndTrafficViolationPoint(trafficViolationCode, trafficViolationPoint);
		return ResponseEntity.status(HttpStatus.OK).body(trafficViolationCodeList);
	}
}
