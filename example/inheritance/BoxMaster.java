package com.example.inheritance;

class Person {
    int id;
    String name;
    int age;

    Person(int id) {
        this(id, "undefined");
        System.out.println("In person class 1 arg constructor");
    }

    Person(int id, String name) {
        this(id, name, 0);
        System.out.println("In person class 2 arg constructor");
    }

    Person(int id, String name, int age) {
        System.out.println("In person class 3 arg constructor");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

class Box {
    int length;
    int breadth;
    int height;

    public Box() {
        this(0, 0, 0);
    }

    public Box(int length) {
        this(length, length, length);
        System.out.println("In the Box 3 arg constructor");
    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return this.length * this.breadth * this.height;
    }
}

class BoxWeight extends Box {
    int weight;

    public BoxWeight() {
        super(); // Call default Box constructor
    }

    public BoxWeight(int length, int breadth, int height, int weight) {
        super(length, breadth, height);
        System.out.println("In the BoxWeight 4 arg constructor");
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getDensity() {
        return this.weight / (double) this.getVolume(); // Cast to double for accurate density
    }

    @Override
    public String toString() {
        return "BoxWeight [weight=" + weight + ", length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }
}

class BoxWeightColor extends BoxWeight {
    String color;

    public BoxWeightColor() {
        super(); // Call default BoxWeight constructor
    }

    public BoxWeightColor(int length, int breadth, int height, int weight, String color) {
        super(length, breadth, height, weight);
        System.out.println("In the BoxWeightColor 5 arg constructor");
        this.color = color;
    }

    @Override
    public String toString() {
        return "BoxWeightColor [color=" + color + ", weight=" + weight + ", length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }
}

public class BoxMaster {
    public static void main(String[] args) {
        BoxWeightColor b1 = new BoxWeightColor(10, 20, 30, 12000, "Red");
        System.out.println("The volume of the box is " + b1.getVolume());
        System.out.println("The density of the box is " + b1.getDensity());
        System.out.println(b1);
    }
}
