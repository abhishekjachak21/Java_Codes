package com.example.exception;
import java.util.Scanner ;

public class ExceptionMaster {
   public static void main(String [] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Please enter 1st no: ");
	   int a = Integer.parseInt(sc.nextLine());
	   System.out.print("Please enter 2nd no: ");
	   int b = Integer.parseInt(sc.nextLine());
	   int arr[] = {1,2,3};
	   
	   try {
		   System.out.print(arr[3]);
	   } catch(ArrayIndexOutOfBoundsException e) {
		   System.out.print(e.getMessage());
	   }
	   
	  try { 
	   System.out.print(a+" is divided by "+b +" = "+a/b);
	  } catch(ArithmeticException e) {
		  System.out.print(e.getMessage());
		  System.out.print("\n Please divide by other than this number");
		  System.out.print("Please enter 2nd no: ");
		   int c = Integer.parseInt(sc.nextLine());
		   System.out.print(a+" is divided by "+c +" = "+a/c);
	  }
	   System.out.print("\nprogram completed");
   }
}
