package linklist;

public class SLinkedList {
	
	private SLlistNode head;
		
	public SLinkedList() {
		head = null; 
	}
	
	public void insertLast(int d) {
		SLlistNode newNode = new SLlistNode(d);
		if(head == null) {
			head = newNode;
			return;
		}
		else {
			SLlistNode iter = head;
			while(iter.getNext()!=null) {
				iter=iter.getNext();
			}
			iter.setNext(newNode);
		}
	}
	
	public void insertFirst(int d) {
		SLlistNode newNode = new SLlistNode(d);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insertByPosition(int d, int pos) {
		SLlistNode iter;
		SLlistNode newNode = new SLlistNode(d);
		if((head==null)||(head==null)) {
			head = newNode;
			return;
		}
		iter = head;
		for(int i = 1;(i<=pos-1) && (iter.getNext()!=null);i++)
			iter=iter.getNext();
	
		newNode.setNext(iter.getNext());
		iter.setNext(newNode);
		return;
	}
	
	public void insertBefore(int d, int key) {
		SLlistNode iter = head;
		SLlistNode newNode = new SLlistNode(d);
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(iter.getData()==key) {
			newNode.setNext(head);
			head=newNode;
			return;
		}
		while(iter.getNext()!=null && iter.getNext().getData()!=key) 
			iter = iter.getNext();
		
		
		newNode.setNext(iter.getNext());
		iter.setNext(newNode);
		return;
	}
	
	public void insertAfter(int d, int key) {
		SLlistNode newNode = new SLlistNode();
		SLlistNode iter = head;
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(iter.getData()==key) {
			newNode.setNext(iter.getNext());
			iter.setNext(newNode);
			return;
		}
		while(iter.getNext()!=null && iter.getNext().getData()!=key) 
				iter=iter.getNext();
		
		newNode.setNext(iter.getNext().getNext());
		iter.setNext(newNode);
		return;
	}
	
	public int deleteFirst() {
		SLlistNode deletable = head;
		int d=-999;
		if(head==null) {
			return d;
		}
		d=head.getData();
		head=head.getNext();
		deletable=null;
		return d;
	}
	
	public int deleteLast() {
		int d=-999;
		SLlistNode deletable, iter;
		 if(head.getNext()==null) {
			 d=head.getData();
			 head = null;
			 return d;
		 }
		 iter=head;
		 while(iter.getNext().getNext()!=null) 
			 iter=iter.getNext();
		 
		 deletable= iter.getNext();
		 d=iter.getData();
		 iter.setNext(null);
		 
		 return d;
	}
	
	
}
