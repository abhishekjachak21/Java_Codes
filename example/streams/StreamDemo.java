package com.example.streams;
import java.util.*;
import java.util.stream.Collectors;


public class StreamDemo {

	public static void main(String[] args) {
			List<Integer> nums = Arrays.asList(2,4,5,1,3,6,2,228);
	//		nums.stream().filter((x)->x%2==0).forEach((x)->{System.out.println(x);});
	
			
			System.out.println(nums.stream()
			.reduce(0, (x,y)-> Math.max(x,y))
			);
		
		//find the sum of squares of all the odd numbers in the list
		System.out.println(nums
				.stream()
				.filter((x)->x%2==0)
				.map((x)->x*x)
				.reduce(0, (x,y)->x+y));
		
		//get the concatenated list of all the palindrome in caps
		
		
		List<String>names=Arrays.asList("aba","aaba","abba","a","xyzaaazyx","asd");
		System.out.println(names
				.stream()
				.filter(n->n.equals(new StringBuilder(n).reverse().toString()))
	            .map(n ->n.toUpperCase())
	            .reduce("",(x,y)->x+y+"-"));
		
//		System.out.print(names.stream().reduce((x)->x.length()));
		
		List<String> names1 = names
				.stream()
                .filter(x->x.length()==4)
                .collect(Collectors.toList());
		System.out.println(names1);
		
		//find the maximum no.
	
	}

}





//.collect(Collectors.joining(", ")); // Concatenate with a separatora