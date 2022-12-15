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
	public int deletByPosition(int pos) {
		int d=-999;
		int i;
		SLlistNode deletable , iter;
		if(head==null) {
			System.out.println("stack is underflow");
			return d;
		}
		if(pos==1) {
			d=head.getData();
			deletable = head;
			head=head.getNext();
			deletable=null;
			return d;
		}
		
		iter=head;
		for(i=1;i<pos-1 && iter.getNext()!=null;i++) 
			iter=iter.getNext();
		if(i==pos-1) {
			d=iter.getData();
			deletable=iter.getNext();
			iter.setNext(iter.getNext().getNext());
			deletable=null;
			return d;
		}
		return d;
	}
	
	public String toStr() {
		String str = new String();
		SLlistNode iter ;
		for(iter=head;iter != null;iter=iter.getNext()) 
			str=str+" -> "+iter.getData();
		
		return str;
	}
	
	public int countNode() {
		int count;
		SLlistNode iter;
		
		for(count=0,iter=head;iter!=null;count++,iter=iter.getNext());
				return count;
	}
	
	public SLlistNode middleNodeRef() {
		int count= countNode();
		SLlistNode iter=head;
		
		for(int i=1;i<=count/2;i++,iter=iter.getNext());
		
		return iter;
	}
	
	public int middleNodeData() {
		int count= countNode();
		SLlistNode iter=head;
		
		for(int i=1;i<=count/2;i++,iter=iter.getNext());
		
		return iter.getData();
	}
	
	public String displayAlterNode() {
		SLlistNode iter = head;
		int d;
		String str = new String();
		
		while(iter!=null && iter.getNext()!= null) {
			d=iter.getData();
			if(iter.getNext()==null)
				break;
			
			iter=iter.getNext().getNext();
			
			str= str+" "+d;
		}
		return str;
	}
	
	public String deleteAlterNode() {
		StringBuilder str = new StringBuilder();
		String st;
		int d =-999;
		SLlistNode deleteable,iter=head;
		
		while(iter!=null) {
			deleteable = iter.getNext();
			if(deleteable!=null) {
				iter.setNext(deleteable.getNext());
			
			d = deleteable.getData();
			str.append(d+" ");
		}
			iter=iter.getNext();
			deleteable=null;
		}
		
		st = str.toString();
		return st;
	}
	
	public void reverseLinklist() {
		SLlistNode prev,curr,next;
		prev =null;
		curr=head;
		 while(curr!=null) {
			 next=curr.getNext();
			 curr.setNext(prev);
			 prev=curr;
			 curr=next;
		 }
		 head=prev;
	}
}
