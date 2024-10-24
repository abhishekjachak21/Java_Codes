package com.example.poly;
//in the sum class the add method is overloaded.
//overloaded means same method name and different argument list. 
//call to overloaded method is resolved at compile time
class Sum{
	int add(int a , int b) {
		return a+b;
	}
	
	String add(String a , String b) {
		return a+b;
	}
}
public class SumMaster {
  public static void main(String[] args) {
	   Sum s1 = new Sum();
	   System.out.println(s1.add(2, 3));
	   System.out.println(s1.add("2", "3")); 
	   //System.out.println(s1.add("2", 3)); 


}
}
