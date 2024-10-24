package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 5, 1, 3, 6, 2, 8);
		// find the sum of squares of all the odd numbers in the list
		//System.out.println(nums.stream().filter((x) -> x % 2 != 0).map((x) -> x * x).reduce(0, (x, y) -> x + y));

		// get the concatenated list of all the palindromes in caps
		List<String> names = Arrays.asList("aba", "aabb", "abba", "a", "abcde", "xyzaaazyx", "xzzzxy");

		//System.out.println(names.stream().filter((s) -> s.equals(new StringBuilder(s).reverse().toString()))
			//	.map((s) -> s.toUpperCase()).reduce("", (x, y) -> x + y + "-"));
		
		
		  List<String> names1=names
		   .stream()
		   .filter(x->x.length()==4)
		   .collect(Collectors.toList());
		  
		  System.out.println(names1);
		
		
		

	}
}
