package com.example.poly;

//base class reference can point to a derived class object and not vice versa.
//call to overridden method depends upon the type of object(RHS).
//call to overridden variable depends upon the type of reference(LHS).
//one interface  many forms is polymorphism
class Shape {
	void draw() {
		System.out.println("drawing the shape");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("drawing the square");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing the rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing the circle");
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shapes[]= {new Circle() , new Square() , new Circle(), new Rectangle(), new Square()};
		
		for(Shape s:shapes) {
			s.draw();
		}
		
	}
}
