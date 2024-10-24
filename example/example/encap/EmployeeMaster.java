package com.example.encap;
//encapsualtion is implemented by having private instances variables which are exposed by public 
//getters and setters
class Employee {
	private int employeeId;
	private String employeeName;
	private int salary;
	private String email;
	private String designation;
	
	
	public int getEmployeeId() {return this.employeeId;}
	public void setEmployeeId(int employeeId) {this.employeeId=employeeId;}
	
	

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		if(!employeeName.equals("pagal"))
		   this.employeeName = employeeName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>0)
		   this.salary = salary;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
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

public class EmployeeMaster {
	public static void main(String[] args) {
         Employee e = new Employee();
         e.setEmployeeName("pagal");
         e.setSalary(-20000);
         System.out.println(e);
         
	}
}
