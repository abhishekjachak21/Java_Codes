package com.example.abs;
interface Operation{
	int calculate(int a , int b);
}
public class OpsMaster {
   public static void main(String[] args) {
	   Operation addition = new Operation() {
		@Override
		public int calculate(int a, int b) {return a+b;}
	   };
	   
	   Operation substraction = new Operation() {
			@Override
			public int calculate(int a, int b) {return a-b;}
	   };
	   
	   Operation multiplication = new Operation() {
			@Override
			public int calculate(int a, int b) {return a*b;}
	   };
	   
	   System.out.println(addition.calculate(2, 3));
	   System.out.println(substraction.calculate(2, 3));
	   System.out.println(multiplication.calculate(2, 3));
	    
}
}
