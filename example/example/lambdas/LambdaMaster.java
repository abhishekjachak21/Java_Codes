package com.example.lambdas;
  
  @FunctionalInterface
  interface Master{
	  void i1();
  }
  
  
  @FunctionalInterface
  interface Calculator{
	  int calcualte(int a , int b);
  }


public class LambdaMaster {
	public static void main(String[] args) {
         Master m = ()->{System.out.println("hello-bello");};
		 m.i1();
		 
		 Calculator add=(a,b)->a+b;
		 Calculator mul=(a,b)->a*b;
		 Calculator sub=(a,b)->a-b;
		 Calculator div=(a,b)->a/b;
		 
		 System.out.println(mul.calcualte(2, 3));
		
	 }
}
