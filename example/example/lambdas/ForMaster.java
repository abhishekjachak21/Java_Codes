package com.example.lambdas;

import java.util.*;
import java.util.function.Predicate;

public class ForMaster {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("nikhil", "hrithik", "aman", "jayant");
		names.forEach((n) -> System.out.println(n));

		List<Integer> nums = Arrays.asList(21, 23, 41, 52, 61, 48);

		Predicate<Integer> isPrime = (x) -> {
			if (x <= 1)
				return false; // 0 and 1 are not prime
			if (x == 2)
				return true; // 2 is prime
			if (x % 2 == 0)
				return false; // exclude even numbers greater than 2

			for (int i = 3; i <= Math.sqrt(x); i += 2) { // check only odd divisors
				if (x % i == 0) {
					return false; // found a divisor, not prime
				}
			}
			return true; // no divisors found, is prime
		};

		nums.forEach((x) -> {
			if (isPrime.test(x))
				System.out.println(x);
		});
	}
}
