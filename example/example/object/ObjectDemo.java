package com.example.object;
//Object class is the parent of every class in Java.
//equals method of the object class by default compares the references
class Master {
	int x;
    int y;
	Master(int x , int y) {
		this.x = x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Master [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Master m=(Master)obj;
		if(this.x==m.x && this.y==m.y)
			return true;
		else
			return false;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
         Master m1 = new Master(10,20);
         Master m2 = new Master(10,20);
         System.out.println(m1);
         System.out.println(m2);
         
         if(m1.equals(m2))
        	 System.out.println("objects are equal");
         else
        	 System.out.println("Objects are unequal");
	}
}
