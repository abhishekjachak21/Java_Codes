package com.example.lambdas;

import java.util.*;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.function.Predicate;

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

    public static void getEmployeesByDesignation(List<Employee> employees, String designation) {
        Predicate<Employee> p1 = (e) -> e.designation.equalsIgnoreCase(designation);
        
        employees.forEach(e -> {
            if (p1.test(e)) {
                System.out.println(e);
            }
        });
    }

    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();

        // Adding Employee objects to the LinkedList
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

        // Sort employees by salary using lambda expression
        Collections.sort(employeeList, (o1, o2) -> o1.salary - o2.salary);

        // Print sorted employees
        System.out.println("Employees sorted by salary:");
        employeeList.forEach(System.out::println);

        // Example usage: Get employees by designation
        System.out.println("\nEmployees with designation 'Developer':");
        getEmployeesByDesignation(employeeList, "Developer");

        // Example usage: Calculate annual salary using a lambda expression
        Function<Employee, Integer> annualSalary = (e) -> e.salary * 12;
        employeeList.forEach(e -> 
            System.out.println("Annual Salary of " + e.employeeName + ": " + annualSalary.apply(e))
        );
    }
}
