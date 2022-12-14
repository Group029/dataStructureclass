package linklistwithqueue;

public class SListNodeChar {
	private char data;
	private SListNodeChar next;
	
	public SListNodeChar() {
		data=0;
		next=null;
	}
	
	public SListNodeChar(char data) {
		this.data=data;
		next = null;
	}
	
	public void setData(char d) {
		this.data=d;
	}
	
	public char getData() {
		return data;
	}
	
	public void setNext(SListNodeChar next) {
		this.next = next;
	}
	
	public SListNodeChar getNext() {
		return next;
	}
}
