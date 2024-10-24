package com.example.string;
public class StringMaster {

	public static String convertToInitcap(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
	
	public static String convertNameToInitials(String str) {
		return str.substring(0,1).toUpperCase()+". "+convertToInitcap(str.substring(str.indexOf(" ")+1));
	}
	
	public static String convertNameToInitials1(String str) {
		return null;
	}
	

	
	

	public static void main(String[] args) {
        System.out.println(convertNameToInitials("nikhil srivastava"));
	}
}
