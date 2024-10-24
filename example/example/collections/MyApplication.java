package com.example.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Point{
	int x;
	int y;
	int z;
	
	Point(int x , int y , int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(x, y, z);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y && z == other.z;
	}


	@Override
	public String toString() {
		return "("+x+","+y+","+z+")";
	}
	
	
}
public class MyApplication {
	public static void main(String[] args) {
       int arr[][]= {
    		   {1,3,5},
    		   {2,7,9},
    		   {1,2,8},
    		   {1,3,5},
    		   {8,6,2},
    		   {2,7,9},
    		   };
       
       Set<Point> points = new HashSet<Point>();
       for(int x[]: arr) {
    	   points.add(new Point(x[0] , x[1], x[2]));
       }
       for(Point p:points)
    	   System.out.println(p);
       
       
	}
}
