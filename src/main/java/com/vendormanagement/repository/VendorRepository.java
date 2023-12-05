package com.vendormanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendormanagement.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer>{

	public List<Vendor> findByVendorName(String name);
}
