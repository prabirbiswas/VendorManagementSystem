package com.vendormanagement.IService;

import com.vendormanagement.entity.Vendor;

public interface IVendorService {

	public String addVendor(Vendor vendor);
	public Boolean isVendorAlreadyRegistered(String name);
	public String KPIAnalysis();
}
