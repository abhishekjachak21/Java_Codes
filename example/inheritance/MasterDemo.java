package com.example.inheritance;

class A{
	int x;
	
	void f1() {
	System.out.println("In the f1 method of the A class");
	}
}


class B extends A{
	int y;
	 void m1() {
		 System.out.println("printing super class x"+super.x);
		 System.out.println("in the m1 method of B class");
		 super.f1();
	 }
}


public class MasterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.x = 10;
		b1.y = 20;
		System.out.println(b1.x);
		System.out.println(b1.y);

		b1.m1();
	}

}
