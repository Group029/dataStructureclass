package Queue;

public class CircularQueue {
		private int arr[];
		private int front, rear, size;
		
		public CircularQueue() {
			size = 10;
			arr = new int[size];
			rear = front = -1;
		}

		public CircularQueue(int size) {
			super();
			this.size = size;
			this.arr = new int[size];
			front = rear =-1;
		}
		
		public boolean isFull() {
			if((front==0)&&(rear==size-1)||(front-1==rear)) {
				return true;
			}
			else 
				return false;
		}
		
		public boolean isEmpty() {
			if(front==-1) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public int Dequeue() {
			int d = -999;
			if(!isEmpty()) {
				d=arr[front];
				if(front==rear) {
					front = rear =1;
				}
				else
					front = front +1; 
			}
			return d;
		}
		
		public void enQueue(int val) {
			if(!isFull()) {
				if(front==-1)
				     front=0;
				if(rear == size-1) {
					rear=0;
				}
				else {
					rear = rear + 1;
				}
				arr[rear]=val;
			}
			else
				System.out.println("Queue overFlow");
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
			if(front<=rear) {
				for(i =front; i<=rear;i++) {
					str=str+" "+arr[i];
				}
			}
			else {
				for(i=front ; i<size;i++) {
					str=str+" "+arr[i];
				}
			}
			return str;
		}
}
