package com.example.mulesoft;

//Object oriented programming in Java

class  Student{

  int sid;
  String studentName;
int studentAge;
String email;
String mobile;
int marks;
   //instance method
 void displayStudent(){
      System.out.println("the name is "+ studentName +" and the age is "+ studentAge+" and the email is "+ email);    
}
   //getGrade()
  public char getGrade(){
       if(marks>=90) return 'A';
       else if(marks>=70 && marks<90) return 'B';
       else if(marks>=50 && marks<70) return 'C';
       else return 'D';
 }


}

public class PersonMaster{
 public static void main(String[] args){
     Student s1 = new Student();
     Student s2 = new Student();

 s1.sid =1; s1.studentName="ABhi"; s1.studentAge=22; s1.email="abhi@gmail.com"; s1.mobile = "9156"; s1.marks=98;

 s2.sid =2; s2.studentName="Rekha"; s2.studentAge=22; s2.email="abhi@gmail.com"; s2.mobile = "9156"; s2.marks=67;
System.out.println("s1 displaying data with grade " + s1.getGrade());
s1.displayStudent();

System.out.println("s2 displaying data with grade "+ s2.getGrade());
s2.displayStudent();
}
}