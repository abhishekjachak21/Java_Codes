package com.example.exception;

import java.util.Scanner;

public class ExceptionMaster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter  first number");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("please enter second number");
		int b = Integer.parseInt(sc.nextLine());
		int arr[]= {1,2,3};
		
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(a + " divided by " + b + " = " + a / b);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			System.out.println("the value of b cannot be zero");
			
		}
		System.out.println("program completed");
	}
}
