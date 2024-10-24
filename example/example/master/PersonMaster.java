package com.example.master;

//through a reference if we need to access instance members we use dot(.)   operator 
class Student {
	// instance variables.
	int sid;
	String studentName;
	int studentAge;
	String email;
	String mobile;
	int marks;

	// instance method
	void displayStudent() {
		System.out.println("the name is " + studentName + " the age is " + studentAge + " the email is " + email);
	}

	// getGrade
	public char getGrade() {
		if (marks >= 90)
			return 'A';
		else if (marks >= 70)
			return 'B';
		else if (marks >= 50)
			return 'C';
		else
			return 'D';
	}
}

public class PersonMaster {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.sid = 1;
		s1.studentName = "nikhil";
		s1.studentAge = 43;
		s1.email = "nikhilroark@gmail.com";
		s1.mobile = "54457324";
		s1.marks = 79;
		s2.sid = 2;
		s2.studentName = "nitin";
		s2.studentAge = 39;
		s2.email = "nitin@gmail.com";
		s2.mobile = "64873245";
		s2.marks = 85;
		System.out.println("displaying s1 data");
		s1.displayStudent();
		System.out.println("the grade of s1 is " + s1.getGrade());
		System.out.println("displaying s2 data");
		s2.displayStudent();
		System.out.println("the grade of s2 is " + s2.getGrade());
	}
}
