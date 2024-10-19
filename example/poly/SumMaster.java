package com.example.poly;

class Sum{
	int add(int a, int b) {
		return a+b;
	}
	String add(String a, String b) {
		return a+b;
	}
}
 
public class SumMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1 = new Sum();
		System.out.println(s1.add(2, 3));
		System.out.println(s1.add("2", "3"));

	}

}
