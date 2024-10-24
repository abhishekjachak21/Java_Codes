package com.example.master;

class Height {
	int feet;
	int inches;

	public Height() {
	}

	public Height(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}

	public String getHeight() {
		return "your height is " + this.feet + " feet and " + this.inches + " inches";
	}

	public int convertToInches() {
		return this.feet * 12 + this.inches;
	}

	public Height addHeight(Height h) {
		Height sum = new Height();
		sum.feet = (this.convertToInches() + h.convertToInches()) / 12;
		sum.inches = (this.convertToInches() + h.convertToInches()) % 12;
		return sum;
	}

	public Height getMaxHeight(Height h) {
		return this.convertToInches() > h.convertToInches() ? this : h;
	}
}

public class HeightMaster {
	public static void main(String[] args) {
         Height h1 = new Height(5,4);
         Height h2 = new Height(5,9);
         System.out.println(h1.getHeight());
         System.out.println("height converted to inches  is "+h1.convertToInches());
         System.out.println(h1.addHeight(h2).getHeight());
         System.out.println("the greater height is  "+h1.getMaxHeight(h2).getHeight());
	}
}
