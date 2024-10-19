package com.example.object;

class Master {
    int x, y;

    Master(int x, int y) {
        this.x = x;
        this.y = y;
    }

	@Override
	public String toString() {
		return "Master [x=" + x + ", y=" + y + "]";
	}
	
    public boolean equals(Object obj) {
    	Master m = (Master)obj;
    	if(this.x == m.x && this.y == m.y) return true;
    	else return false;
    }
    
}

public class ObjectDemo {
    public static void main(String[] args) {
        Master m1 = new Master(10,16);
        Master m2 = new Master(10,16);
        System.out.println(m1); // Output: Master{x=10}
        System.out.println(m2); // Output: Master{x=10}
        if(m1==m2) System.out.println("Objects are equal");
        else System.out.println("Objects are unequal");
        
        if(m1.equals(m2)) System.out.println("Objects are equal");
        else System.out.println("Objects are unequal");

        
    }
}
;