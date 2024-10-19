package com.example.abs;

import java.util.*;

// Abstract class Shape
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calcArea();
    abstract double calcPerimeter();
    abstract void draw();
}

// Square class extending Shape
class Square extends Shape {
    int length;

    Square(String color, int length) {
        super(color);
        this.length = length;
    }

    @Override
    double calcArea() {
        return length * length; // Area of the square
    }

    @Override
    double calcPerimeter() {
        return 4 * length; // Perimeter of the square
    }

    @Override
    void draw() {
        System.out.println("Drawing the square in color: " + color);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return Math.PI * radius * radius; // Area of the circle
    }

    @Override
    double calcPerimeter() {
        return 2 * Math.PI * radius; // Circumference of the circle
    }

    @Override
    void draw() {
        System.out.println("Drawing the circle in color: " + color);
    }
}

// Main class
public class AbstractMaster {
    public static void main(String[] args) {
        // Creating an array of Shape references
        Shape[] shapes = {
            new Square("Red", 4),
            new Circle("Blue", 5)
        };

        // Loop through each shape to draw and calculate area and perimeter
        for (Shape shape : shapes) {
            shape.draw(); // Draw the shape
            System.out.println("Area: " + shape.calcArea()); // Calculate and print area
            System.out.println("Perimeter: " + shape.calcPerimeter()); // Calculate and print perimeter
            System.out.println();
        }
    }
}



















////package com.example.abs;
////
////// Abstract class Shape
////abstract class Shape {
////    String color;
////
////    Shape(String color) {
////        this.color = color;
////    }
////
////    abstract double calcArea();
////    abstract double calcPerimeter();
////    abstract void draw();
////}
////
////// Square class extending Shape
////class Square extends Shape {
////    int length;
////
////    Square(String color, int length) {
////        super(color);
////        this.length = length;
////    }
////
////    @Override
////    double calcArea() {
////        return length * length; // Area of the square
////    }
////
////    @Override
////    double calcPerimeter() {
////        return 4 * length; // Perimeter of the square
////    }
////
////    @Override
////    void draw() {
////        System.out.println("Drawing the square in color: " + color);
////    }
////}
////
////// Circle class extending Shape
////class Circle extends Shape {
////    int radius;
////
////    Circle(String color, int radius) {
////        super(color);
////        this.radius = radius;
////    }
////
////    @Override
////    double calcArea() {
////        return Math.PI * radius * radius; // Area of the circle
////    }
////
////    @Override
////    double calcPerimeter() {
////        return 2 * Math.PI * radius; // Circumference of the circle
////    }
////
////    @Override
////    void draw() {
////        System.out.println("Drawing the circle in color: " + color);
////    }
////}
////
////// Main class
////public class AbstractMaster {
////    public static void main(String[] args) {
////        Shape[] shapes = {
////            new Square("Red", 4),
////            new Circle("Blue", 5)
////            
////        }
////        };
////    }     
//            
//            package com.example.abs;
//            import java.util.*;
//          //abstract class are declared with the keyword abstract.
//           
//           
//           
//          // a class having one or more abstract methods must be declared abstract.
//           
//          //we cannot create objects of abstract class.
//          //class extending from an abstract class must provide the definition of all the abstract methods
//          //otherwise it must also be declared abstract
//           
//          abstract class Shape {
//          	String color;
//           
//          	Shape(String color) {
//          		this.color = color;
//          	}
//          	
//          	abstract double calcArea() ;
//          	abstract double calcPerimeter() ;
//           
//          	abstract void draw();
//          }
//           
//          class Square extends Shape {
//          	int length;
//          	
//          	Square(String color , int length){
//          		super(color);
//          		this.length=length;
//          	}
//          	double calcArea() {
//          		return length*length;
//          	}
//          	double calcPerimeter() {
//          		return 4*length;
//          	}
//          	
//          	void draw() {
//          		System.out.println("drawing the square");
//          	}
//          }
//           
//           
//           
//          class Circle extends Shape {
//              int radius;
//          	
//          	Circle(String color , int radius){
//          		super(color);
//          		this.radius=radius;
//          	}
//          	double calcArea() {
//          		return Math.PI*radius*radius;
//          	}
//          	double calcPerimeter() {
//          		return 2*Math.PI*radius;
//          	}
//          	
//          	void draw() {
//          		System.out.println("drawing the circle");
//          	}
//          }
//           
//          public class AbstractMaster {
//          	public static void main(String[] args) {
//          		
//           
//          	}
//          }
//           
//        };
//
//        for (Shape shape : shapes) {
//            shape.draw(); // Draw the shape
//            System.out.println("Area: " + shape.calcArea()); // Calculate and print area
//            System.out.println("Perimeter: " + shape.calcPerimeter()); // Calculate and print perimeter
//            System.out.println();
//        }
//    }
//}
