package com.example.collections;

import java.util.ArrayList;
import java.util.List;

class Stack {
    private int[] elements;
    private int top;
    private int capacity;

    public Stack(int size) {
        elements = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    public void push(int value) {
        if (top >= capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        elements[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Top element: " + stack.peek());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Top element after pop: " + stack.peek());
            
            // Attempt to pop from an empty stack
            stack.pop();
            stack.pop();
            stack.pop(); // This will throw an exception
        } catch (StackOverflowError e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
