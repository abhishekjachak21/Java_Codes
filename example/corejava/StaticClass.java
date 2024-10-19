package com.example.corejava;



class Employee {
    private int eid;
    private String ename;
    private int eage;
    private static String company;

    // Default constructor
    Employee() {}

    // Parameterized constructor
    Employee(int eid, String ename, int eage) {
        this.eid = eid;
        this.ename = ename;
        this.eage = eage;
    }

    // Static method to set company name
    public static void setCompany(String com) {
        company = com;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + eid + ", Name: " + ename + ", Age: " + eage + ", Company: " + company);
    }
}

public class StaticClass {
    public static void main(String[] args) {
        // Set the company name
        Employee.setCompany("Capgemini");

        // Create Employee objects
        Employee e1 = new Employee(1, "Abhishek", 22);
        Employee e2 = new Employee(2, "Sneha", 21);

        // Display employee details
        e1.displayDetails();
        e2.displayDetails();
    }
}








//class Employee{
//	int eid; String ename; int eage; static String company;
//	
//	Employee(){};
//	
//	Employee(int eid, String ename, int eage, String com){
//		this.eid = eid;
//		this.ename = ename;
//		this.eage = eage;
//		company = com;
//	}
//	
//	public static void master() {
//		int x;
//		Employee emaster = new Employee();
//		System.out.println(emaster.ename);
//	}
//}
//
//
//public class StaticClass {
//   public static void main(String[] args) {
//	   Employee e1=new Employee(1, "Abhishek", 22, "Capgemini");
//	   Employee e2=new Employee(2, "Sneha", 21, "google");
//   }
//}
