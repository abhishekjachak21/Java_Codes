package com.example.beans;

public class Address {
	
	private String street;
	private String city;
	private int pincode;
	

	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
