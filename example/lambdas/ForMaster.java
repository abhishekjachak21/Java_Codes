package com.example.lambdas;

import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class ForMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names = Arrays.asList("Nikhil", "Karan", "Om", "Vedant");
		names.forEach((n)->System.out.println(n));

		List<Integer> nums = Arrays.asList(21, 23, 41, 52, 61, 48);
		
		Predicate<Integer> isPrime = (x) -> {
			if(x<=1) return false;
			if(x==2) return true;
			if(x%2 == 0) return false;
			
			for(int i=3;i<= Math.sqrt(x); i+=2) {
				if(x%i==0) return false;
			}
			
			return true;
		};
		
		nums.forEach((x) -> {
			if(isPrime.test(x)) System.out.println(x);
		});
	}

}
