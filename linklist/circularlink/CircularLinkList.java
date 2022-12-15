package linklist.circularlink;

public class CircularLinkList {
	private SLlistNode last;
	
	public CircularLinkList() {
		last=null;
	}
	//---------------------------------------------------------------
	public void insertFirst(int d) {
		SLlistNode newNode = new SLlistNode(d);
		if(last==null) {
			last=newNode;
			last.setNext(last);
			return;
		}
		newNode.setNext(last.getNext());
		last.setNext(newNode);
		return;
	}
	//---------------------------------------------------------------
	public void insertLast(int d) {
		SLlistNode newNode = new SLlistNode(d);
		if(last==null) {
			last = newNode;
			last.setNext(last);
			return;
		}
		newNode.setNext(last.getNext());
		last.setNext(newNode);
		last = newNode;
		return; 
	}
	//---------------------------------------------------------------
	public String dispalyAll() {
		String str;
		StringBuilder sb = new StringBuilder();
		SLlistNode iter = last.getNext();
		if(last==null) {
			str="empty";
			return str;
		}
		do {
			sb.append(" "+iter.getData());
			iter = iter.getNext();
		}while(iter!=last.getNext());
		
		str=sb.toString();
		
		return str;
	}
	//---------------------------------------------------------------
	public void insertByPosition(int d, int p) {
		
		SLlistNode newNode = new SLlistNode(d);
		SLlistNode iter;
		int i;
		if(p==1) {
			if(last==null) {
				last=newNode;
				last.setNext(last);
				return;
			}
			else {
				newNode.setNext(last.getNext());
				last.setNext(newNode);
				return;
			}
		}
		iter=last.getNext();
		
		for(i=1 ; i < p - 1 && iter.getNext() != last.getNext() ; i++, iter=iter.getNext());
			
		if((i == p - 1 ) && (iter.getNext()!= last.getNext()) ) {
				newNode.setNext(iter.getNext());
				iter.setNext(newNode);
				return;
			}
			if((i == p - 1)&&( iter == last )) {
				newNode.setNext(last.getNext());
				last.setNext(newNode);
				last=newNode;
				return;
		}
		}
	//---------------------------------------------------------------
	public int deleteFirst() {
		int d=-999;
		SLlistNode deletable;
		if(last == null) {
			System.out.println("Empty list");
			return d;
		}
		if(last.getNext()==last) {
			deletable = last;
			last.setNext(null);
			d=last.getData();
			deletable=null;
			return d;
		}
		deletable = last.getNext();
		last.setNext(last.getNext().getNext());
		d=deletable.getData();
		deletable = null;
		return d;
	}
	//---------------------------------------------------------------
	public int deleteLast() {
		int d=-999;
		SLlistNode deletable,iter;
		if(last==null) {
			System.out.println("Empty list");
			return d;
		}
		if(last==last.getNext()) {
			deletable = last;
			last.setNext(null);
			d=last.getData();
			deletable=null;
			return d;
		}
		for(iter=last.getNext();iter.getNext()!=last;iter=iter.getNext());
			deletable = last;
			d=last.getData();
			iter.setNext(last.getNext());
			last = iter;
			deletable=null;
			return d;
	}
	//---------------------------------------------------------------
	public boolean deleteByData(int d) {
		SLlistNode deletable,iter;
		if( d==last.getNext().getData() ) {
			deletable = last.getNext();
			last.setNext( deletable.getNext() );
			deletable=null;
			return true;
		}
		for( iter=last.getNext() ; iter.getNext().getData() != d && iter.getNext()!=last.getNext();iter=iter.getNext());
		if((iter.getNext().getData()==d)&&(iter.getNext()==last)) {
			deletable = last;
			iter.setNext(last.getNext());
			last = iter;
			deletable=null;
			return true;
		}
		if(iter.getNext().getData()==d) {
			deletable = iter.getNext();
			iter.setNext(deletable.getNext());
			deletable=null;
			return true;
		}
		return false;		
	}
	
}

