package com.example.abs;
//all the methods in an interface are by default public and abstract.
// a class can extend from multiple interfaces but not extend multiple classes.
//all the variables inside an interface are static and final like global constants
//interface is like a contract.
//interfaces can never be instantiated.

interface Vehicle{
	void speedUp(int speed);
	void slowDown(int speed);
    void changeGear(int gear);
}
interface i1{
   int i=10;	
   void f1();
}

interface i2{
	   void f2();
}

class A implements i1 , i2{

	@Override
	public void f1() {
	    System.out.println("In f1 method of A class");
	}

	@Override
	public void f2() {
		System.out.println("In f2 method of A class");
	}
	
	public void f3() {
		System.out.println("In f3 method of A class");
	}
	
}

public class InterfaceMaster {
  public static void main(String[] args) {
	i1 a1 = new A();
	a1.f1();
	//i1.i=20;
	System.out.println(i1.i);
	//a1.f2();
	//a1.f3();
	
	Vehicle v1=new Vehicle() {
		
		@Override
		public void speedUp(int speed) {
		   System.out.println("speeding up by "+speed);
			
		}
		
		@Override
		public void slowDown(int speed) {
			System.out.println("slowing down by "+speed);
			
		}
		
		@Override
		public void changeGear(int gear) {
			System.out.println("changing the gear to "+gear);
			
		}
	};
	
	v1.speedUp(10);
	v1.slowDown(20);
	v1.changeGear(3);
}
}
