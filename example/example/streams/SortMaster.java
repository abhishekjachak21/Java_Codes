package com.example.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

class Employee {
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

	// toString method returns the string representation of an object.
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", email=" + email + ", designation=" + designation + "]";
	}

}

public class SortMaster {
	
	public static List<Employee> getEmployeesByDesignation(List<Employee> employees  , String designation){
	   return employees.stream().filter((e)->e.designation.equals(designation)).collect(Collectors.toList());
	}
	
	public static List<Employee> getEmployeesUpdatedSalary(List<Employee> employees, int commPerc){
		 return employees
		   .stream()
		   .map((e)->new Employee(e.employeeId, e.employeeName, e.salary*(100+commPerc)/100,e.email, e.designation))
		   .collect(Collectors.toList());
	}
	
	public static Employee getEmployeeWithHighestSalary(List<Employee> employees) {
		return employees.stream().reduce(employees.get(0), (x,y)->{return x.salary>y.salary?x:y;});
	}
	
	public static List<Employee> getEmployeesWithSalaryGreaterThanAllEmployeesAverageSalary(List<Employee> employees){
		 return employees
				  .stream()
				  .filter((e)->e.salary>employees.stream().map((p)->p.salary).reduce(0, (x,y)->x+y)/employees.size())
				  .collect(Collectors.toList());
	}
	
	



	public static void main(String[] args) {

		LinkedList<Employee> employeeList = new LinkedList<>();

		// Adding 10 Employee objects to the LinkedList
		employeeList.add(new Employee(1, "John Doe", 50000, "john.doe@example.com", "Developer"));
		employeeList.add(new Employee(2, "Jane Smith", 52000, "jane.smith@example.com", "Manager"));
		employeeList.add(new Employee(3, "Alice Johnson", 45000, "alice.johnson@example.com", "Tester"));
		employeeList.add(new Employee(4, "Bob Williams", 55000, "bob.williams@example.com", "Developer"));
		employeeList.add(new Employee(5, "Charlie Brown", 70000, "charlie.brown@example.com", "Director"));
		employeeList.add(new Employee(6, "Eve Davis", 48000, "eve.davis@example.com", "Tester"));
		employeeList.add(new Employee(7, "Frank Miller", 62000, "frank.miller@example.com", "Team Lead"));
		employeeList.add(new Employee(8, "Grace Lee", 53000, "grace.lee@example.com", "HR"));
		employeeList.add(new Employee(9, "Hank Green", 59000, "hank.green@example.com", "Product Manager"));
		employeeList.add(new Employee(10, "Ivy Wilson", 46000, "ivy.wilson@example.com", "Support"));
   		
		
		//System.out.println(getEmployeesWithSalaryGreaterThanAllEmployeesAverageSalary(employeeList));
		
		//get the employees with salary greater than 60000(threshold) with only last name in caps and sorted order.
		employeeList
		  .stream()
		  .filter((e)->e.salary>60000)
		  .map((e)->new Employee(e.employeeId , e.employeeName.split(" ")[1].toUpperCase(), e.salary , e.email, e.designation))
		  .sorted((x,y)->y.employeeName.compareTo(x.employeeName))
		  .forEach(System.out::println);
		
		
		//System.out.println(employeeList.stream().collect(Collectors.summingInt((e)->e.salary)));
		
		
		
		

		

	}
}
