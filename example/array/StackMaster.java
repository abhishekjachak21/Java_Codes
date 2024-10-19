package com.example.array;

class Stack{
	char arr[];
	int top;
	
	public Stack() {
		this.arr = new char[10];
		this.top = -1;
	}
	
	char pop() {
		if(top==-1) {
			System.out.println("undersflow");
			return '$';
		}
		return this.arr[this.top--];
	}
	
	void push(char ch) {
		if(top==arr.length) {
			System.out.println("overflow");
		}
		this.arr[++this.top]=ch;
	}
}

public class StackMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		s1.push('A'); s1.push('B');s1.push('C'); s1.push('D');
	    s1.pop();
	    s1.pop();
	    
	    System.out.println("Popped "+s1.pop());
	    System.out.println("Popped "+s1.pop());
	}

}
