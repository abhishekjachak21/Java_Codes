package com.example.collections;



import java.util.*;

class Queue {
	List<Integer> myQueue;
	
	public Queue() {
		myQueue=new ArrayList<Integer>();
	}
	
	public void enqueue(int x) {
		myQueue.add(x);
	}
	
	public int dequeue() {
		if(myQueue.size()==0) {
			System.out.println("queue is full no more elements can be deleted");
		}
		return myQueue.removeFirst();
	}
	
}

public class QueueMaster {
	public static void main(String[] args) {
      Queue q1 = new Queue();
      q1.enqueue(10);
      q1.enqueue(20);
      q1.enqueue(30);
      
      System.out.println(q1.dequeue());
      System.out.println(q1.dequeue());
	}
}
