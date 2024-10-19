package com.example.collections;

import java.util.*;

class Point{
	int x,y,z;
	
	Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
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
	
	
}


public class ArrSetHW {
	
    public static void main(String[] args) {
     
        int[][] points = {
                {1,3, 5},
                {2,7,9},
                {1,2,8},
                {1,3,5},
                {8,6,2},
                {2,7,9}
            };


        Set<Point> distinctPoints = new HashSet<Point>();

        for (int[] point : points) {
            distinctPoints.add(new Point(point[0], point[1], point[2]));
        }

        System.out.println("Distinct points: ");
        for (Point point : distinctPoints) {
            System.out.println(point);
        }

     }
    
}
