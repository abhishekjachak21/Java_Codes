package com.example.object;

import java.util.Objects;

//if 2 objects are equals they will always have the same hashcode.
// if 2 objects have the same hash code they may or may not be equals. 
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

	@Override
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
	public int hashCode() {
		return Objects.hash(address, eid, email, ename, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && eid == other.eid && Objects.equals(email, other.email)
				&& Objects.equals(ename, other.ename) && salary == other.salary;
	}

	
	
	
}

public class EmployeeMaster {
	public static void main(String[] args) {
		Address a1 = new Address("bawakuan", "Indore", "452001");
		Employee e1 = new Employee(1, "khushi", 200000, "khushi@gmail.com", a1);
		
		Address a2 = new Address("Ravet", "pune", "452001");
		Employee e2 = new Employee(2, "neha", 100000, "neha@gmail.com", a2);
		
		Address a3 = new Address("Ravet", "pune", "452001");
		Employee e3 = new Employee(2, "neha", 100000, "neha@gmail.com", a2);
		
		Address a4 = new Address("Ravet", "pune", "452001");
		Employee e4 = new Employee(2, "neha", 100000, "neha@gmail.com", a2);
		
		Address a5 = new Address("Ravet", "pune", "452001");
		Employee e5 = new Employee(2, "neha", 100000, "neha@gmail.com", a2);
		
		Employee employees[]= {e1 , e2 , e3 , e4 , e5};
		if (e1.equals(e2))
			System.out.println("employees are equal");
		else
			System.out.println("employees are unequal");
	}
}
