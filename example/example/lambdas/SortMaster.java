package com.example.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

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

	public static void getEmployeesByDesignation(List<Employee> employees, String designation) {
		Predicate<Employee> p1 = (e) -> e.designation.equals(designation);

		employees.forEach((e) -> {
			if (p1.test(e))
				System.out.println(e);
		});

		Function<Employee, Integer> f1 = (e) -> e.salary * 12;
		System.out.println(f1.apply(employees.get(0)));

		// print the yearly salary of every employee.

		employees.forEach((e) -> {
			System.out.println(e.employeeName + " has  yearly salary " + f1.apply(e));
		});
		
		
	}

	public static void main(String[] args) {

		LinkedList<Employee> employeeList = new LinkedList<>();

		// Adding 10 Employee objects to the LinkedList
		employeeList.add(new Employee(1, "John Doe", 50000, "john.doe@example.com", "Developer"));
		employeeList.add(new Employee(2, "Jane Smith", 60000, "jane.smith@example.com", "Manager"));
		employeeList.add(new Employee(3, "Alice Johnson", 45000, "alice.johnson@example.com", "Tester"));
		employeeList.add(new Employee(4, "Bob Williams", 55000, "bob.williams@example.com", "Developer"));
		employeeList.add(new Employee(5, "Charlie Brown", 70000, "charlie.brown@example.com", "Director"));
		employeeList.add(new Employee(6, "Eve Davis", 48000, "eve.davis@example.com", "Tester"));
		employeeList.add(new Employee(7, "Frank Miller", 62000, "frank.miller@example.com", "Team Lead"));
		employeeList.add(new Employee(8, "Grace Lee", 53000, "grace.lee@example.com", "HR"));
		employeeList.add(new Employee(9, "Hank Green", 59000, "hank.green@example.com", "Product Manager"));
		employeeList.add(new Employee(10, "Ivy Wilson", 46000, "ivy.wilson@example.com", "Support"));

		// Collections.sort(employeeList, (o1 , o2)->o1.salary-o2.salary);
		// for(Employee e:employeeList)
		// System.out.println(e);

		getEmployeesByDesignation(employeeList, "Tester");

	}
}
