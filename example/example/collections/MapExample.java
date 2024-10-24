package com.example.collections;

import java.util.HashMap;
import java.util.*;

public class MapExample {
  public static void main(String[] args) {
	 int arr[]= {1,2,1,2,3,1,2,1,3,4,1,5,4,3,1,2,10,6,7,9};
	 
	 Map<Integer , Integer> m1 = new HashMap<Integer , Integer>();
	 for(int x:arr) {
		 if(m1.keySet().contains(x)) {
			 m1.put(x, m1.get(x)+1);
		 }else {
			 m1.put(x, 1);
		 }
	 }
	 
	 System.out.println(m1);
	 
}
}
