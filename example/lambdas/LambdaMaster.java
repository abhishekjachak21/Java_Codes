package com.example.lambdas;


//Functional interface for Master
interface Master {
 void i1();
}

//Functional interface for Calculator
interface Calculator {
 int calculate(int a, int b);
}

public class LambdaMaster {

 public static void main(String[] args) {

     // Lambda for Master interface
     Master m = () -> {
         System.out.println("Hello-bello");
     };
     m.i1();

     // Lambdas for Calculator interface (add, subtract, multiply, divide)
     Calculator add = (a, b) -> a + b;
     Calculator sub = (a, b) -> a - b;
     Calculator multi = (a, b) -> a * b;
     Calculator div = (a, b) -> a / b;

     // Perform calculations and print results
     System.out.println("Addition: " + add.calculate(10, 5));
     System.out.println("Subtraction: " + sub.calculate(10, 5));
     System.out.println("Multiplication: " + multi.calculate(10, 5));
     System.out.println("Division: " + div.calculate(10, 5));
 }
}






//@FunctionalInterface
//interface Master{
//	void i1();
//}
//
//public class LambdaMaster {
//
//	public static void main(String[] args) {
//
//		Master m = new Master() {
//		
//		public void i1() {
//			System.out.println("Hello-bello");
//		}	
//	};
//	m.i1();
// }
//
//}
