package com.example.exception;
class InvalidAgeException extends Exception{
	
	String message;
	public InvalidAgeException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}

class InvalidNameException extends Exception{
	
	String message;
	public InvalidNameException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
class Employee{
	int eid;
	String ename;
	int age;
	public Employee(int eid, String ename, int age) throws InvalidAgeException , InvalidNameException {
		super();
		this.eid = eid;
		if(!doesNameContainsAllAlphabets(ename))
			throw new InvalidNameException("The name is invalid");
		else
			this.ename = ename;
		if(age<18)
			throw new InvalidAgeException("employee age cannot be less than 18");
		else
		    this.age = age;
	}
	
	public static boolean doesNameContainsAllAlphabets(String name) {
		boolean flag=true;
		for(char ch:name.toCharArray()) {
			int a=(int)ch;
			if(!((a>=65 && a<=90) ||(a>=97 && a<=122))) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + "]";
	}
	
	
}
public class UserDefinedExceptions {
	public static void main(String[] args) {
		Employee e1=null;
		try {
			e1 = new Employee(1,"amit", 11);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}catch(InvalidNameException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(e1);
		
		
		
		
	}

}
