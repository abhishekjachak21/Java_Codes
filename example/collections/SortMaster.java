package com.example.collections;
 
import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
 
 
class Employee   implements Comparable<Employee> {
	int employeeId;
	String employeeName;
	int salary;
	String email;
	String designation;
 
	public Employee() {
	}
 
	public Employee(int employeeId, String employeeName, int salary, String email, String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
		this.designation = designation;
	}
	
	
 
	@Override
	public int hashCode() {
		return Objects.hash(designation, email, employeeId, employeeName, salary);
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
		return Objects.equals(designation, other.designation) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& salary == other.salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", email=" + email + ", designation=" + designation + "]";
	}
 
	@Override
	public int compareTo(Employee o) {
		if(this.employeeName.equals(o.employeeName)) return this.salary - o.salary;
		else return this.employeeName.compareTo(o.employeeName);
	}
}
 
public class SortMaster {
  	public static void main(String[] args) {
//        List<Employee>  employees = new ArrayList<Employee>();
        Set<Employee>  employees = new HashSet<Employee>();

  		employees.add(new Employee(1, "nikhil",20000, "nikhil@gmail.com", "trainer"));
        employees.add(new Employee(2, "jatin",21000, "jatin@gmail.com", "trainer"));
        employees.add(new Employee(3, "komal",30000, "nishtha@gmail.com", "developer"));
        employees.add(new Employee(4, "rohit",23000, "rohit@gmail.com", "tester"));
        employees.add(new Employee(3, "komal",30000, "nishtha@gmail.com", "developer"));
        employees.add(new Employee(5, "komal",25000, "sunita@gmail.com", "developer"));
        employees.add(new Employee(6, "komal",22000, "komal@gmail.com", "trainer"));
        
//        Collections.sort(employees);
//        for(Employee e:employees)
//        	System.out.println(e);
    	System.out.println(employees.size());

        
	}
}