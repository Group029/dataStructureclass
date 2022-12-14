package stack;

import linklist.SLlistNode;

public class StackChar {
	private char arr [];
	private int size;
	private int top =-1;
	
	public StackChar() {
		size = 10;
		arr = new char[size];
	}

	public StackChar(int size) {
		this.size = size;
		arr = new char[size];
	}
	
	public void push(char key) {
		if(top==size-1) {
			System.out.println("stack overflow");
			return;
		}
		else {
			top +=1;
			arr[top]=key;
			return;
		}
	}
	
	public char pop() {
		char d='@';
		if(top!=-1) {
			d=arr[top];
			top-=1;
		}
		return d;
	}
	
	public char peek() {
		char d ='@';
		if(top!=-1) {
			d=arr[top];
		}
		return d;
	}
}
