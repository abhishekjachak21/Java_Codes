package com.example.poly;
//base class reference can point to a derived class object.
//call to overridden method depends upon the type of object.
//call to overridden variable depends upon the type of reference.
//polymorphism -> one interface many forms.


class Shape{
	void draw() {
		System.out.println("drawing the shape");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("drawing the square");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing the Rectangle");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("drawing the circle");
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Shape shapes[] = {new Circle(), new Square(), new Circle(), new Rectangle(), new Square()};
	for(Shape s: shapes) {
		s.draw();
	}
	}

}






//class A{
//int i = 10;
//void f1() {
//	System.out.print("In A class f1 method");
//}
//}
//
//class B extends A{
//int i=20;
//@Override
//void f1() {
//	System.out.println("In B class f1 method");
//}
//}