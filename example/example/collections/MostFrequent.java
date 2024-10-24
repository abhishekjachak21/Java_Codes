package com.example.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequent {
	public static void main(String[] args) {
        String str="i went to the college to play the cricket of the game and i love the cricket game";
        
        List<String> data=Arrays.asList(str.split(" "));
        System.out.println(data);
        
        Map<String , Integer> m1 = new HashMap<String , Integer>();
        
        for(String s:data) {
        	if(m1.containsKey(s)) {
        		m1.put(s, m1.get(s)+1);
        	}else {
        		m1.put(s, 1);
        	}
        }
        
        int max=0;
        String maxKey="";
        
        
        for(Map.Entry<String , Integer> m:m1.entrySet()) {
        	if(max<m.getValue()) {
        		max=m.getValue();
        		maxKey=m.getKey();
        	}
        }
        System.out.println("The most frequent word is "+maxKey);
        
        
	}
}
