package com.example.object;

import java.util.*;
//if 2 objects are equals they will have the same hashcode
//if 2 objects havethe same hashcode they mau or may not be equals.
class Address {
	String street;
	String city;
	String pincode;
 
	public Address(String street, String city, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
 
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
 
	@Override
	public boolean equals(Object o) {
		Address address = (Address) o;
		if (this.street.equals(address.street) && this.city.equals(address.city)
				&& this.pincode.equals(address.pincode))
			return true;
		else
			return false;
	}
	
	public int hashCode() {
		return this.street.length();
	}
 
}
 
class Employee {
	int eid;
	String ename;
	int salary;
	String email;
	Address address;
 
	Employee() {
	}
 
	public Employee(int eid, String ename, int salary, String email, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}
 
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]";
	}
 
	@Override
	public boolean equals(Object o) {
		Employee employee = (Employee) o;
		if (this.eid == employee.eid && this.ename.equals(employee.ename) && this.salary == employee.salary
				&& this.email.equals(employee.email) && this.address.equals(employee.address))
			return true;
		else
			return false;
	}
}
 
public class EmployeeMaster {
	public static void main(String[] args) {
		Address a1 = new Address("bawakuan", "Indore", "452001");
		Employee e1 = new Employee(1, "khushi", 200000, "khushi@gmail.com", a1);
		Address a2 = new Address("bhawarkuan", "Indore", "452001");
		Employee e2 = new Employee(1, "khushi", 200000, "khushi@gmail.com", a2);
		if (e1.equals(e2))
			System.out.println("employees are equal");
		else
			System.out.println("employees are unequal");
	}
}