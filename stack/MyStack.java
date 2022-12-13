package stack;

public class MyStack {
	private Student arr[];
	private int size;
	private int top = -1 ; 
	
	public MyStack() {
		size = 10;
		arr = new Student[size];
	}

	public MyStack(int size) {
		this.size = size;
		arr = new Student[size];
	}
	
	public void  push(Student student) {
		if(top==size-1) {
			System.out.println("Stack overflow");
			return;
		}
		else {
			top = top +1 ;
			arr[top]=student;
			return;
		}
	}
	
	public Student pop() {
		int x = -999;
		Student d =null;
		if(top != -1) {
		d = arr[top];
		top -=1;
		}
		return d;
	}
	public Student peek() {
		int x =-999;
		Student d = null;
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
