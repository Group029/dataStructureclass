package stackusinglinklist;

public class StackWithLinkList {
	private SListNodeChar top;
	
	
	public StackWithLinkList() {
		top = null;
	}


	public void push(char d) {
		SListNodeChar newNode = new SListNodeChar(d);
		
		if(top==null) {
			top=newNode;
			return;
		}
		newNode.setNext(top);
		top=newNode;
		return;
	}
	
	public char pop() {
		SListNodeChar deleteable;
		char d='@';
		if(top==null) {
			System.out.println("Empty stack");
			return d;
		}
		deleteable = top;
		top=top.getNext();
		d=top.getData();
		deleteable=null;
		return d;
	}
	
	public char peek() {
		char d='@';
		if(top==null) {
			System.out.println("Empty stack");
			return d;
		}
		d=top.getData();
		return d;
	}
	
	public boolean isEmpty() {
		if(top == null)
			return true;
		else
			return false;
	}
	
	public String displayAllChar() {
		SListNodeChar iter=top;
		StringBuilder sc = new StringBuilder();
		String str;
		if(top==null) {
			System.out.println("Stack underFlow");
		}
		while(iter!=null) {
			sc.append(" "+iter.getData());
			iter=iter.getNext();
		}
		
		str = sc.toString();
		return str;
	}
}