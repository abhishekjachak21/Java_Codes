package com.example.abs;
//abstract class are declared with the keyword abstract.

// a class having one or more abstract methods must be declared abstract.

//we cannot create objects of abstract class.
//class extending from an abstract class must provide the definition of all the abstract methods 
//otherwise it must also be declared abstract




abstract class Shape {
	String color;
 
	Shape(String color) {
		this.color = color;
	}
	
	abstract double calcArea() ;
	abstract double calcPerimeter() ;
 
	abstract void draw();
}
 
class Square extends Shape{
	int length;
	
	Square(String color , int length){
		super(color);
		this.length=length;
	}
	double calcArea() {
		return length*length;
	}
	double calcPerimeter() {
		return 4*length;
	}
	
	void draw() {
		System.out.println("drawing the square");
	}
}
 
 
 
class Circle extends Shape {
    int radius;
	
	Circle(String color , int radius){
		super(color);
		this.radius=radius;
	}
	double calcArea() {
		return Math.PI*radius*radius;
	}
	double calcPerimeter() {
		return 2*Math.PI*radius;
	}
	
	void draw() {
		System.out.println("drawing the circle");
	}
}

public class AbstractMaster {
	public static void main(String[] args) {

	}
}

