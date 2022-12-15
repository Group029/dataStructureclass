package cricularlinklist;

public class DblyNode {
	private int data;
	private DblyNode next,prev;
	public DblyNode() {
			data = 0;
			prev=next=null;
	}
	public DblyNode(int d) {
		this.data = d;
		prev=next=null;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int d) {
		this.data=d;
	}
	
	public DblyNode getNext() {
		return next;
	}
	
	public void setNext(DblyNode next) {
		this.next =next;
	}
	
	public DblyNode getPrev() {
		return prev;
	}
	
	public void setPrev(DblyNode prev) {
		this.prev = prev;
	}
}
