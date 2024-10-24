package com.example.inheritance;

class A {
	A(int x){
		super();
		System.out.println("In A class constructor");
	}
	A(){}
}

class B extends A {
	B(){
		
		System.out.println("In B class constructor");
	}
}

class C extends B{
	C(){
		
		System.out.println("In C class constructor");
	}
}

public class MasterDemo {
	public static void main(String[] args) {
         C c1 = new C();
	}
}
