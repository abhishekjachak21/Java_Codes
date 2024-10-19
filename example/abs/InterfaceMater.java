package com.example.abs;

interface i1 {
    void f1();
}

interface i2 {
    void f2();
}

class Vehicle implements i1, i2 {
    public void f1() {
        System.out.println("In f1 method of Vehicle class");
    }

    public void f2() {
        System.out.println("In f2 method of Vehicle class");
    }

    public void f3() {
        System.out.println("In f3 method of Vehicle class");
    }

    // Adding a slowDown method
    public void slowDown(int speed) {
        System.out.println("Slowing down by " + speed + " units.");
    }
}

public class InterfaceMater {
    public static void main(String[] args) {
        // Create an instance of Vehicle using interface i1
        i1 a1 = new Vehicle();
        a1.f1();  // Calling f1 method
        
        // Create an instance of Vehicle using interface i2
        i2 a2 = new Vehicle();
        a2.f2();  // Calling f2 method

        // Create an instance of Vehicle and call slowDown
        Vehicle v1 = new Vehicle();
        v1.slowDown(10);  // Calling slowDown method
    }
}
