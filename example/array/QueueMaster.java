package com.example.array;

class Queue {
    private char[] arr;
    private int front;
    private int rear;
    private int capacity;
    
    public Queue(int size) {
        arr = new char[size];
        capacity = size;
        front = 0;
        rear = 0;
    }

    // Enqueue operation
    public void enqueue(char ch) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[rear] = ch;
        rear++;
    }

    // Dequeue operation
    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return '$'; // Consider throwing an exception instead
        }
        char ch = arr[front];
        front++;
        return ch;
    }

    // Peek operation
    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '$'; // Consider throwing an exception instead
        }
        return arr[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == capacity;
    }
}

public class QueueMaster {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue of size 5
        
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');
        queue.enqueue('D');

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue());  
    }
}
