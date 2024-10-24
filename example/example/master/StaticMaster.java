package com.example.master;
class Employee{
	int eid;
	String ename;
	int eage;
	static String company;
	static int a;
	Employee(){}
	
	Employee(int eid , String ename , int eage , String com){
		this.eid=eid;
		this.ename=ename;
		this.eage=eage;
		company=com;
		
	}
	
	public static void  master() {
		int x;
		Employee emaster = new Employee();
		System.out.println(emaster.ename);
	}
	

}
public class StaticMaster {
     public static void main(String[] args) {
		  Employee e1 = new Employee(1 , "nikhil" , 43, "capgemini");
		  Employee e2 = new Employee(2 , "amit" , 21 , "google");
		  
		  
		  
		  System.out.println(e1.company);
		  System.out.println(e2.company);
	}
}
