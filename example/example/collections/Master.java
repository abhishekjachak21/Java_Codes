//list ==> it is a ordered collection of elements that can be duplicate.
//set ==> it is a unordered collection of unique elements.
//map ==> key value pairs.

package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class Master {
	public static void main(String[] args) {
       List<Integer> list1 = new ArrayList<Integer>();
       list1.add(10);
       list1.add(11);
       list1.add(14);
       list1.add(9);
       list1.add(21);
       
       list1.add(2, 42);
       
       System.out.println("element at index 4 is "+list1.get(4));
       list1.remove(2);
       for(Integer x:list1)
    	   System.out.println(x);
       
       
	}
}
