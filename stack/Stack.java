package stack;

public class Stack {
	private int arr[];
	private int size;
	private int top = -1 ; 
	
	public Stack() {
		size = 10;
		arr = new int[size];
	}

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	public void  push(int key) {
		if(top==size-1) {
			System.out.println("Stack overflow");
			return;
		}
		else {
			top = top +1 ;
			arr[top]=key;
			return;
		}
	}
	
	public int pop() {
		int x = -999;
		int d =0;
		if(top != -1) {
		d = arr[top];
		top -=1;
		}
		return d;
	}
	
	public int peek() {
		int x =-999;
		int d = 0;
		if(top!=-1) {
		d = arr[top];
		}
		return d;
	}
	
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else {
			return false;}
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String tostring() {
		int i;
		String str = null;
		for(i=top; i>=0;i--) {
			str=str+" "+arr[i];
		}
		return str;
	}
}
