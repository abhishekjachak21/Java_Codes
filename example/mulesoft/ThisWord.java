package com.example.mulesoft;

class Complexx {
    // Instance variables
    int real; 
    int img;

    public Complexx() {
        System.out.println("Inside the complex class default constructor");
    }

    public Complexx(int r) {
        System.out.println("Inside the class 1-arg constructor");
        real = r; 
        img = r;
    }

    public Complexx(int real, int img) {
        System.out.println("Inside the class 2-arg constructor");
        this.real = real; 
        this.img = img;
    }

    public void displayComplex() {
        System.out.println(this.real + "+" + this.img + "i");
    }

    public double getMagnitude() {
        return Math.sqrt(this.real * this.real + this.img * this.img);
    }

    // Method to add two Complex numbers
    public Complexx addComplex(Complexx c) {
        return new Complexx(this.real + c.real, this.img + c.img);
    }
    
    // Method to get the complex number with greater magnitude
    public Complexx getComplexNumberWithGreaterMagnitude(Complexx c) {
        return this.getMagnitude() > c.getMagnitude() ? this : c;
    }
}

public class ThisWord {
    public static void main(String[] args) {
        Complexx c1 = new Complexx(3, 4);
        Complexx c2 = new Complexx(2, 6);
        
        System.out.print("c1: ");
        c1.displayComplex();
        System.out.print("c2: ");
        c2.displayComplex();

        // Add c1 and c2
        Complexx c3 = c1.addComplex(c2);
        System.out.print("c1 + c2: ");
        c3.displayComplex();

        // Display magnitudes
        System.out.println("Magnitude of c1: " + c1.getMagnitude());
        System.out.println("Magnitude of c2: " + c2.getMagnitude());
        System.out.println("Magnitude of c3: " + c3.getMagnitude());

        // Get the complex number with greater magnitude
        Complexx greater = c1.getComplexNumberWithGreaterMagnitude(c2);
        System.out.print("Complex number with greater magnitude: ");
        greater.displayComplex();
    }
}
