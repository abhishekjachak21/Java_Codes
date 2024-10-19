package com.example.lambdas;


import java.util.*;
import java.util.function.*;


public class PredicateMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ages = Arrays.asList(21, 24, 45, 32, 46, 20);
		Predicate<Integer> t1 = (x) -> x > 25;
		Consumer<Integer> c1 = (x) -> System.out.println(x*x);
		
		for(int age: ages) {
			if(t1.test(age)) System.out.println(age);
		}
		System.out.println("==========");
		for(int age: ages) {
			 c1.accept(age) ;
		}
		
		List<String>names = Arrays.asList("Nikhil", "Karan", "Om", "Vedant");
		Function<String, Integer> f1 = (x)->x.length();
		
		for(String s:names) System.out.println(s+" has length "+f1.apply(s));


	}

}
