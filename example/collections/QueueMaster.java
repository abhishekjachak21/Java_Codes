package com.example.collections;
import java.util.*;

class Queue{
	List<Integer> myQueue;

	public Queue() {
		myQueue = new ArrayList<Integer>();
	}
	public void enqueue(int x) {
		myQueue.add(x) ;
	}
	public int dequeue() {
		if(myQueue.size() == 0) {
			System.out.println("Queueu is full");
		}
		return myQueue.removeFirst();
	}
	
}

public class QueueMaster {

	public static void main(String[] args) {
		Queue q1 = new Queue();
		q1.enqueue(21);
		q1.enqueue(36);
		q1.enqueue(90);
		q1.enqueue(26);
		q1.enqueue(19);
		q1.enqueue(90);
		
		System.out.println("first val "+q1.dequeue());
		System.out.println("2nd val "+q1.dequeue());

	}

}
