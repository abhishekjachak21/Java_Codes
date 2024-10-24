package com.example.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {
   public static void main(String[] args) {
		LinkedList<Employee> employeeList = new LinkedList<>();

		// Adding 10 Employee objects to the LinkedList
		employeeList.add(new Employee(1, "John Doe", 50000, "john.doe@gmail.com", "Developer"));
		employeeList.add(new Employee(2, "Jane Smith", 52000, "jane.smith@gmail.com", "Manager"));
		employeeList.add(new Employee(3, "Alice Johnson", 45000, "alice.johnson@example.com", "Tester"));
		employeeList.add(new Employee(4, "Bob Williams", 55000, "bob.williams@example.com", "Developer"));
		employeeList.add(new Employee(5, "Charlie Brown", 70000, "charlie.brown@example.com", "Director"));
		employeeList.add(new Employee(6, "Eve Davis", 48000, "eve.davis@rediff.com", "Tester"));
		employeeList.add(new Employee(7, "Frank Miller", 62000, "frank.miller@example.com", "Team Lead"));
		employeeList.add(new Employee(8, "Grace Lee", 53000, "grace.lee@rediff.com", "HR"));
		employeeList.add(new Employee(9, "Hank Green", 59000, "hank.green@capgemini.com", "Product Manager"));
		employeeList.add(new Employee(10, "Ivy Wilson", 46000, "ivy.wilson@example.com", "Support"));
		
		
		/*
		 * Map<String , String> m1 =employeeList .stream()
		 * .collect(Collectors.toMap((e)->e.designation, (e)->e.employeeName , (o ,
		 * n)->o));
		 */
		
		Map<String , List<Employee>> desigList=employeeList
		.stream()
		.collect(Collectors.groupingBy((e)->e.designation));
		
		//for(String s :desigList.keySet()) {
			//System.out.println(s);
			//for(Employee e:desigList.get(s))
				//System.out.println(e);
			//System.out.println("=====================================");
		//}
		
		//group employees by email domain
		//Map<String, List<Employee>> emailGroup = employeeList.stream().collect(Collectors.groupingBy(e -> e.email.substring(e.email.indexOf('@')+1)));
		//System.out.println(emailGroup);
		
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.designation, Collectors.summingInt((e)->e.salary))));
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.designation,Collectors.counting())));
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.designation,Collectors.maxBy((x,y)->x.salary-y.salary))));
		
}
}
