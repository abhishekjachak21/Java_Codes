package com.example.streams;

import java.util.*;
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
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.email = email;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
                + ", email=" + email + ", designation=" + designation + "]";
    }
}

public class SortMaster {

    public static List<Employee> getEmployeesByDesignation(List<Employee> employees, String designation) {
        return employees.stream()
                .filter(e -> e.designation.equalsIgnoreCase(designation))
                .collect(Collectors.toList());
    }

    public static List<Employee> getEmployeesByCommission(List<Employee> employees, int commissionPercentage) {
        return employees.stream()
                .map(e -> new Employee(e.employeeId, e.employeeName, e.salary * (100 + commissionPercentage) / 100, e.email, e.designation))
                .collect(Collectors.toList());
    }

    public static Employee getEmployeeWithHighestSalary(List<Employee> employees) {
        return employees
        		.stream()
                .reduce(employees.get(0), (e1, e2) -> e1.salary > e2.salary ? e1 : e2);
    }


    public static List<Employee> getEmployeesWithSalaryGreaterThanAverage(List<Employee> employees) {
    	
    	int totalSalary = employees.stream()
                .map(e -> e.salary)
                .reduce(0, (x, y) -> x + y);
    	
    	double avgSal =  totalSalary / employees.size();

        return employees.stream()
                .filter(e -> e.salary > avgSal)
                .collect(Collectors.toList());
    }
    
    
    //get the employees with salary greater than 60,000with only last name in caps and in sorted order, make function for this
     	
    
    public static List<String> getLastNamesWithSalaryGreaterThan60K(List<Employee> employees){
    	return employees.stream()
    			.filter(e -> e.salary>60000)
    			.map(e->e.employeeName.split(" ")[1].toUpperCase())
    			.sorted()
    			.collect(Collectors.toList());
    }
    
    //sir's method
//    employeeList
//	  .stream()
//	  .filter((e)->e.salary>60000)
//	  .map((e)->new Employee(e.employeeId , e.employeeName.split(" ")[1].toUpperCase(), e.salary , e.email, e.designation))
//	  .sorted((x,y)->y.employeeName.compareTo(x.employeeName))
//	  .forEach(System.out::println);
    

    public static void main(String[] args) {
    	
        List<Employee> employeeList = new ArrayList<>();

        // Adding Employee objects to the ArrayList
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

        // Sort employees by salary
        Collections.sort(employeeList, Comparator.comparingInt(e -> e.salary));

        // Print all employees sorted by salary
        System.out.println("Employees sorted by salary:");
        employeeList.forEach(name -> System.out.println(name));

        // Example usage: Get all employees with designation "Developer"
        List<Employee> developers = getEmployeesByDesignation(employeeList, "Developer");
        System.out.println("\nDevelopers:");
        developers.forEach(name -> System.out.println(name));

        // Example usage: Get employee with highest salary
        Employee highestPaidEmployee = getEmployeeWithHighestSalary(employeeList);
        System.out.println("\nEmployee with the highest salary:");
        System.out.println(highestPaidEmployee);

        // Example usage: Get employees with salary greater than average
        List<Employee> aboveAverageSalaries = getEmployeesWithSalaryGreaterThanAverage(employeeList);
        System.out.println("\nEmployees with salary greater than average:");
        aboveAverageSalaries.forEach(name -> System.out.println(name));
        
     // Example usage: Get last names of employees with salary greater than 60,000
        List<String> lastNamesAbove60K = getLastNamesWithSalaryGreaterThan60K(employeeList);
        System.out.println("\nLast names of employees with salary greater than 60,000:");
        lastNamesAbove60K.forEach(name -> System.out.println(name));
    }
}













//public static List<String> getLastNamesWithSalaryGreaterThan60K(List<Employee> employees) {
//    return employees.stream()
//            .filter(e -> e.salary > 60000) // Filter by salary
//            .map(e -> e.employeeName.split(" ")[1].toUpperCase()) // Extract last name and convert to uppercase
//            .sorted() // Sort the last names
//         