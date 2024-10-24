package com.example.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PredicateMaster {
	public static void main(String[] args) {
		List<Integer> ages = Arrays.asList(21, 24, 43, 31, 46, 20);
		Predicate<Integer> t1 = (x) -> x > 25;
        Consumer<Integer> c1=(x)->System.out.println(x*x);
        
        
		for (int age : ages) {
			if (t1.test(age))
				System.out.println(age);
		}
		
		System.out.println("=================");
		
		for(int age: ages) {
			c1.accept(age);
		}
		
		List<String> names=Arrays.asList("nikhil" , "hrithik" , "aman" , "jayant");
		Function<String, Integer> f1=(x)->x.length();
		
		for(String s:names) {
		   System.out.println(s+" has length "+f1.apply(s));	
		}
		
		Function<String, String> initCaps=(x)->x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase();
		for(String s:names) {
			   System.out.println(initCaps.apply(s));	
		}
		
		
		
	}
}
