package com.entity;

import java.time.LocalDate;

public class Company extends Customer {

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public LocalDate getStartOfActivities() {
		return startOfActivities;
	}

	public void setStartOfActivities(LocalDate startOfActivities) {
		this.startOfActivities = startOfActivities;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	private String businessName;
	private LocalDate startOfActivities;
	private String cuit;

	public Company(int id, String address, String phone, String email, String businessName, LocalDate startOfActivities,
			String cuit) {
		super(id, address, phone, email);
		this.businessName = businessName;
		this.startOfActivities = startOfActivities;
		this.cuit = cuit;
	}

}
