package com.example.master;
//constructors are called when the object of the class is created.
//constructors in java have the same name as the class.
//constructors in java can be overloaded ==>the class can have more than one constructor.
//if there are no constructors declared in the class the compiler will provide an implicit default constructor
class Complex {
	// instance variables
	int real;
	int img;
	
	public Complex() {
		System.out.println("inside the complex class default constructor");
		
	}
	
	public Complex(int r) {
		System.out.println("inside the complex class 1-arg constructor");
		this.real=r;
		this.img=r;
	}
	
	public Complex(int real , int img) {
		System.out.println("inside the complex class 2-arg constructor");
		this.real=real;
	    this.img=img;
	}

	public void displayComplex() {
		System.out.println(this.real + "+" + this.img + "i");
	}
	
	public double getMagnitude() {
		return Math.sqrt(this.real*this.real+this.img*this.img);
	}
	//return the sum of 2 complex numbers.
	public Complex addComplex(Complex c) {
		Complex sum=new Complex();
		sum.real=this.real+c.real;
		sum.img=this.img+c.img;
		return sum;
	}
	
	public Complex getComplexNumberWithGreaterMagnitude(Complex c) {
		return this.getMagnitude()>c.getMagnitude()?this:c;
	}

}

public class ComplexMaster {
	public static void main(String[] args) {
		Complex c1 = new Complex(3, 4);
		Complex c2 = new Complex(2, 6);
		Complex c3 = new Complex(5, 2);
		
		
		System.out.println("displaying he data of complex number c1");
		c1.displayComplex();
		
		System.out.println("displaying he data of complex number c2");
		c2.displayComplex();
		
		System.out.println("swapping the complex numbers");
		//write code here
		
		Complex temp=c1;
		c1=c2;
		c2=temp;
		
		System.out.println("displaying he data of complex number c1");
		c1.displayComplex();
		
		System.out.println("displaying he data of complex number c2");
		c2.displayComplex();
		System.out.print("the sum of c1 and c2 is ");
		c1.addComplex(c2).displayComplex();
		
		System.out.println("displaying the complex number with the greatest magnitude");
        c1.getComplexNumberWithGreaterMagnitude(c2).getComplexNumberWithGreaterMagnitude(c3).displayComplex();
  	}
}
