package com.entity;

public class Person extends Customer {

	private String name;
	private String lastName;
	private String dni;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Person(int id, String address, String phone, String email, String name, String lastName, String dni) {
		super(id, address, phone, email);
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
	}

}
