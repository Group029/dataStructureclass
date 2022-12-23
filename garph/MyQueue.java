package garph;

public class MyQueue {
	
	private int arr[];
	private int front, rear, size;
	
	public MyQueue() {
		size = 10;
		arr = new int[size];
		rear = front = -1;
	}
	
	public MyQueue(int size) {
		this.size = size;
		this.arr = new int[size];
		rear = front = -1;
	}
	
	public void insert(int d) {
		if(front==-1) {
			front=0;
		}
		if(rear==size-1) {
			System.out.println("stack overflow");
			return;
		}
		else {
			rear +=1;
			arr[rear]=d;
			return;
		}
		
	}
	public int delete() {
		int d=-999;
		if((front==-1)&&(rear<front)) {
		System.out.println("underflow");
		return d;
		}
		else {
			d= arr[front];
			front++;
			return d;
		}
	}
	
	public boolean isFull() {
		if(rear==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if((front ==-1)||(front==rear+1)){
			return true;
		}
		else {
			return false;
		}
	}
	public int peek() {
		int d=-999;
		if(!isEmpty()) {
			d=arr[front];
		}
		return d;
	}
	public String tostring() {
		int i;
		String str = new String();
			for(i=front ; i<=rear;i++) {
				str=str+" "+arr[i];
			}
		return str;
	}
}
