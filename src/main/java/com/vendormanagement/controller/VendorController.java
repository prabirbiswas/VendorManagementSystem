package com.vendormanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendormanagement.entity.Vendor;
import com.vendormanagement.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	private VendorService vendorService;

	@PostMapping("/add")
	public ResponseEntity<String> addVendor(@RequestBody Vendor vendor) {
		String addVendor = vendorService.addVendor(vendor);
		return new ResponseEntity<String>(addVendor, HttpStatus.OK);
	}

	@GetMapping("/kpi")
	public ResponseEntity<String> kpiGenerate() {
		String kpiAnalysis = vendorService.KPIAnalysis();
		return new ResponseEntity<String>(kpiAnalysis, HttpStatus.OK);
	}
}
