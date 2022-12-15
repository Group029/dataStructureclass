package linklistwithqueue;

public class LinkListWithQueue {
	private SListNodeChar front;

	public LinkListWithQueue() {
		front = null;
	}

	public void enqueue(char d) {
		SListNodeChar newNode = new SListNodeChar(d);
		SListNodeChar iter;
		if (front == null) {
				front= newNode;
				return;
		}
		iter = front;
		while(iter.getNext()!=null) {
			iter = iter.getNext();
		}
		iter.setNext(newNode);
		return;
	}
	
	public char dequeue() {
		SListNodeChar deletable;
		
		char d='@';
		if(front ==null) {
			System.out.println("empty queue");
			return d;
		}
		d= front.getData();
		deletable = front;
		front = front.getNext();
		deletable =null;
		return d;
	}
	
	public char peek() {
		char d='@';
		if(front == null) {
			System.out.println("Empty queue");
		return d;
		}
		d=front.getData();
		
		return d;
	}
	public boolean isEmpty() {
		if(front==null) {
			return true;
		}
		else
			return false;
	}
	public String displayAllChar() {
		SListNodeChar iter = front;
		StringBuilder sc = new StringBuilder();
		String str=null;
		if(front==null) {
			System.out.println("Empty queue");
			return str;
		}
		while(iter!=null) {
			sc.append(" "+iter.getData());
			iter=iter.getNext();
		}
		str=sc.toString();
		return str;
	}
}
