package com.example.collections;
import java.util.*;

public class MapDemo {
   public static void main(String [] args) {
	   Map<String, Integer> m1 = new HashMap<String, Integer>();
	   
	   m1.put("Nikhil", 43);
	   m1.put("Amit", 21);
	   m1.put("Neha", 21);
	   m1.put("Abhishek", 22);
	     
//	   System.out.println("the age of abhishek is "+m1.get("Abhishek"));
//	   System.out.println("the age of neha is "+m1.get("Neha"));
	   
	   for(String s:m1.keySet()) {
		   System.out.println("the age of "+ s +" is " +m1.get(s));
	   }
	   System.out.println("\nPrinting the contents od map using entry set");
	   for(Map.Entry<String,Integer>ent:m1.entrySet()){
		   System.out.println(ent.getKey()+ " ==> "+ent.getValue());
	   }
	   
   }
}
