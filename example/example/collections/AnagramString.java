package com.example.collections;

import java.util.*;
import java.util.Scanner;

public class AnagramString {

	public static Map<Character, Integer> getCharacterFrequencyMap(String str) {
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if (m1.keySet().contains(ch)) {
				m1.put(ch, m1.get(ch) + 1);
			} else {
				m1.put(ch, 1);
			}
		}
		return m1;
	}

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("please enter the first string");
          String str1=sc.nextLine();
          System.out.println("please enter the second string");
          String str2=sc.nextLine();
          
          if(getCharacterFrequencyMap(str1).equals(getCharacterFrequencyMap(str2))) {
        	  System.out.println("anagram");
          }else {
              System.out.println("not anangram");
          }
	}
}
