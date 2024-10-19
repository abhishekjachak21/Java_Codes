package com.example.beans;
import java.util.*;
import java.util.Scanner;


public class Customer {
    
	String firstname, lastName, address;
	
	
	public Customer(String firstname, String lastName, String address) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
