package com.example.collections;

import java.util.HashSet;
import java.util.*;
//in a group A, B , C drink tea and C,A , D  , E  drink coffee
//list persons who only drink tea.
//list persons who drink both tea and coffee
//find the total number of drinkers.
public class SetMaster {
	public static void opsMaster() {
		Set<String> s1=new HashSet<String>();
        s1.add("A");s1.add("B");s1.add("C");
        
        Set<String> s2=new HashSet<String>();
        s2.add("C");s2.add("A");s2.add("D");s2.add("E");
        
        
        //s1.retainAll(s2);
        //s1.removeAll(s2);
        s1.addAll(s2);
        System.out.println(s1);
        
	}
	
	public static void main(String[] args) {
		
		
		/*
		 * Set<Integer> set1=new HashSet<Integer>(); set1.add(1); set1.add(2);
		 * set1.add(3); set1.add(1);
		 * 
		 * System.out.println("the size of the set is "+set1.size());
		 * 
		 * for(int x:set1) System.out.println(x);
		 * 
		 * System.out.
		 * println("second way of printing collections is by the use of iterators");
		 * 
		 * Iterator<Integer> i1=set1.iterator(); while(i1.hasNext())
		 * System.out.println(i1.next());
		 */
         opsMaster();
         
         
	}
}
