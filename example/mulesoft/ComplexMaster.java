package com.example.mulesoft;


class Complex{
	//instance variables
	int real; int img;
	
	public Complex() {
		System.out.println("Inside the complex class default constructor");
	}
	
	public Complex(int r) {
		System.out.println("inside the class 1-arg constructor");
		real=r; img=r;
	}
	
	public Complex(int r, int i) {
		System.out.println("inside the class 2-arg constructor");
		real=r; img=i;
	}
	
	public void displayComplex() {
		System.out.println(real+"+"+img+"i");
	}
	
	public double getMagnitude() {
		return Math.sqrt(real*real+img*img);
	}

	
}


public class ComplexMaster {
       
	public static void main(String [] args) {
		Complex c1 = new Complex(3,4);
		Complex c2 = new Complex(2);
		Complex c3 = new Complex();
		
		 c1.displayComplex();
		 c2.displayComplex();
		 c3.displayComplex();
		 
		 System.out.println("Magnitude of c1: " + c1.getMagnitude());
	     System.out.println("Magnitude of c2: " + c2.getMagnitude());
	     System.out.println("Magnitude of c3: " + c3.getMagnitude());


		
	}
	
	
	
}
