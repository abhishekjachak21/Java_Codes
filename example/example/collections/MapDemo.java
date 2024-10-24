package com.example.collections;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("nikhil", 43);
		m1.put("amit", 21);
		m1.put("insia", 21);
		m1.put("akshay", 22);
		m1.put("nikhil", 22);
		// System.out.println("the age of akshay is "+m1.get("akshay"));
		// System.out.println("the age of insia is "+m1.get("insia"));
		// System.out.println("the age of nikhil is "+m1.get("nikhil"));
		// System.out.println(m1.size());

		for (String s : m1.keySet()) {
			System.out.println(s + " has age " + m1.get(s));
        }
		
		System.out.println("printing the contents of the map using entry set");
		
		for (Map.Entry<String, Integer> ent : m1.entrySet()) {
            System.out.println(ent.getKey()+"==>"+ent.getValue());
		}

	}
}
