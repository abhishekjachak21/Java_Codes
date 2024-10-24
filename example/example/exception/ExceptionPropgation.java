package com.example.exception;

class A{
	int x;
}

public class ExceptionPropgation {

	public static void f2(A a1) {
		System.out.println(10/0);
    }

	public static void f1(A a1) {
		f2(a1);
	}

	public static void main(String[] args) {
		try {
			A a1=null;
			f1(a1);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
