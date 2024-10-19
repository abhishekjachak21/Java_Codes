package com.example.string;

public class StringMaster {
	
	public static String convertToInitials(String str) {
		return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
	} 
	
	public static String convertToInitcap(String str) {
		return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToInitcap("aBhishek"));
		
	}

}
