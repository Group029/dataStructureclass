package recursion;

public class RecursionPrintOneToTen {

	public static void printOneToTen(int n) {
		if(n>10) {
			return;
		}
		else {
			System.out.print(n+" ");
			printOneToTen(n+1);
			return; 
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOneToTen(1);
	}

}
