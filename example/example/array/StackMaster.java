package com.example.array;
interface StackOps{
	int SIZE=10;
	char pop();
	void push(char ch);
}

class Stack implements StackOps{
	char arr[];
	int top;
	
	public Stack() {
		this.arr=new char[StackOps.SIZE];
		this.top=-1;
	}
	
	public char pop() {
		if(top==-1) {
			System.out.println("underflow the stack is empty");
			return '#';
		}
		return this.arr[this.top--];
	}
	
	public void push(char ch) {
		if(top==9) {
			System.out.println("overflow the stack is full");
			return;
		}
		this.arr[++this.top]=ch;
	}
}
public class StackMaster {
  public static void main(String[] args) {
	   Stack s = new Stack();
	   s.push('A');
	   s.push('B');
	   s.push('C');
	   s.push('D');
	   
	   System.out.println(s.pop());
	   System.out.println(s.pop());
}
}
