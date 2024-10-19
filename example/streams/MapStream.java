package com.example.streams;
import java.util.*;
import java.util.stream.Collectors;

class User{
	
	
}

public class MapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
        LinkedList<Employee> employeeList = new LinkedList<>();

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
        
        
//        Map<String, String> m1 = employeeList.stream()
//        		.collect(Collectors.toMap(e->e.designation, e->e.employeeName, (o,n) -> o));
        
        
        //for designations
        Map<String, List<Employee>> desigList = employeeList
        		.stream()
        		.collect(Collectors.groupingBy(e -> e.designation));
        
        for(String s: desigList.keySet()) {
        	System.out.println(s);
        	for(Employee e:desigList.get(s))
        		System.out.println(e);
        	System.out.println("=====================");
        	
        }
         
//for domains
        Map<String, List<Employee>> domainList = employeeList
        		.stream()
        		.collect(Collectors.groupingBy((e)->e.email.substring(e.email.indexOf('@')+1)));
        
        for(String s: domainList.keySet()) {
        	System.out.println("DOMAINS "+s);
        	for(Employee e:domainList.get(s))
        		System.out.println(e);
        	System.out.println("=====================");	
        }
        
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.designation, Collectors.summingInt((e)->e.salary))));
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.designation,Collectors.counting())));
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.designation,Collectors.maxBy((x,y)->x.salary-y.salary))));
        
	}

}
