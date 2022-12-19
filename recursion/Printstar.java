package recursion;

public class Printstar {

	public static void fun(int n) {
		if(n<1)
			return;
		System.out.print(" * ");
		fun(n-1);
	}
	
	public static void fun1(int n) {
		if(n<1)
			return;
		System.out.println();
		fun(n);
		fun1(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1(5);
	}

}
