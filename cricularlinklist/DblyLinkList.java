package cricularlinklist;

import java.util.Scanner;

public class DblyLinkList {
	private DblyNode head;
	//---------------------------------------------------------------
	public void insertList(int d) {
		DblyNode iter;
		DblyNode newNode = new DblyNode(d);
		if(head==null) {
			head=newNode;
			return;
		}
		iter=head;
		
		while(iter.getNext()!=null)
			iter=iter.getNext();
		
		newNode.setPrev(iter);
		iter.setNext(newNode);
		return;
	}
	//---------------------------------------------------------------
	public void createList(int n) {
		Scanner sc = new Scanner(System.in);
		if(n<1) {
			System.out.println("insert valid value");
		}
		else {
			for(int i = 1;i<=n;i++) {
				System.out.println("Enter Data :- ");
				int val = sc.nextInt();
				insertList(val);
			}
		}
	}
	//----------------------------------------------------------------
	public void insertBeforeData(int d, int key) {
		DblyNode newNode = new DblyNode(d);
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		if(head.getData()==key) {
			newNode.setNext(head);
			head.setPrev(newNode);
			head=newNode;
			return;
		}
		DblyNode iter = head;
		
		while((iter.getData()!=key)&&(iter!=null)) 
			iter=iter.getNext();
		
		if(iter==null) {
			System.out.println("not found");
			}
		newNode.setPrev(iter.getPrev());
		newNode.setPrev(iter);
		iter.getPrev().setNext(newNode);
		iter.setPrev(newNode);
		
	}
	//----------------------------------------------------------------
	public String displayAll() {
		String str=" ";
		DblyNode iter;
		for(iter=head;iter!=null;iter=iter.getNext())
			str=str+" "+iter.getData();
		
		str=str+"\n";
		return str;
	}
	//----------------------------------------------------------------
	public int deleteFirst() {
		int d=-999;
		DblyNode deletable ;
		if(head==null) {
			System.out.println("Empty list");
			return d;
		}
		deletable = head;
		d=head.getData();
		head.getNext().setPrev(null);
		head=head.getNext();
		deletable=null;
		return d;
	}
	//----------------------------------------------------------------
	public int deleteLast() {
		int d=-999;
		DblyNode deletable;
		if(head.getNext()==null) {
			 d=head.getData();
			 head = null;
			 return d;
		}
		DblyNode iter=head;
		while(iter.getNext().getNext()!=null) 
				 iter=iter.getNext();
		
		deletable= iter.getNext();
		 d=iter.getData();
		 iter.setNext(null);
		
		 return d;
	}
	//---------------------------------------------------------------
	public void deleteByPosition(int pos) {
		int d=-999;
		DblyNode deletable, iter;
		
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		
		if(pos==1) {
			deletable = head;
			head.getNext().setPrev(null);
			head=head.getNext();
			d=head.getData();
			deletable = null;
			return;
		}
		int i ;
		 iter = head;
		
		for(i=1;i<pos && iter.getNext()!= null;i++,iter=iter.getNext());
		
		if(pos==i) {
			iter.getPrev().setNext(iter.getNext());
		if(iter.getNext()!=null)
			iter.getNext().setPrev(iter.getNext());
		}
		return;
	}
	//---------------------------------------------------------------
}
