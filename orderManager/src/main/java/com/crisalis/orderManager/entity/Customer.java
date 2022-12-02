package com.crisalis.ordermanager.entity;

public abstract class Customer {
	private int id;
	private String address;
	private String phone;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(int id, String address, String phone, String email) {
		super();
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

}
