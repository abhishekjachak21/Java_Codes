package com.example.collections;
 
import java.util.*;
 
class Student{
	int sid;
	String sname;
	int age;
	int marks;
	
	public Student() {}
 
	public Student(int sid, String sname, int age, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
	}
 
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", marks=" + marks + "]";
	}
}
 
class StudentNameComparator implements Comparator<Student>{
    @Override
	public int compare(Student o1, Student o2) {
		return o1.sname.compareTo(o2.sname);
	}
}
 
class StudentAgeComparator implements Comparator<Student>{
    @Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}
}
 
 
class StudentMarksComparator implements Comparator<Student>{
    @Override
	public int compare(Student o1, Student o2) {
		return o1.marks-o2.marks;
	}
}
 
public class ComparatorMaster {
	
	public static void main(String[] args) {

		ArrayList<Student> studentsList = new ArrayList<>();

		studentsList.add(new Student(1, "John", 20, 85));
        studentsList.add(new Student(2, "Alice", 22, 90));
        studentsList.add(new Student(3, "Bob", 19, 98));
        studentsList.add(new Student(4, "Eve", 21, 88));
        studentsList.add(new Student(5, "Charlie", 23, 92));
        
        Collections.sort(studentsList, new StudentMarksComparator());
        
        for (Student student : studentsList) {
            System.out.println(student);
        }
	}
 
}