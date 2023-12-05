package com.vendormanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendormanagement.IService.IVendorService;
import com.vendormanagement.entity.Vendor;
import com.vendormanagement.repository.VendorRepository;

@Service
public class VendorService implements IVendorService {

	@Autowired
	private VendorRepository vendorRepository;

	@Override
	public String addVendor(Vendor vendor) {
		if (!isVendorAlreadyRegistered(vendor.getVendorName())) {
			vendorRepository.save(vendor);
			return "Vendor added Successfully";
		}
		return "Vendor is Already exist";
	}

	@Override
	public Boolean isVendorAlreadyRegistered(String name) {
		List<Vendor> vendorList = vendorRepository.findByVendorName(name);

		if (vendorList.isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	public String KPIAnalysis() {
		return "KPI Report is generating!";
	}
}
