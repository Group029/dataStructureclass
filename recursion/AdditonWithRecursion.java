package recursion;

public class AdditonWithRecursion {
		
		public static int addAllBetween(int a, int b) {
			if(b>a) {
				return b + addAllBetween(a, b-1);
			}
			else {
				return b;
			}
		}
	public static int add(int a, int b) {
			if(b==0) {
				return a;
			}
			else {
			
				return add(a+1, b-1); 
			}
		}
	public static int multi(int a, int b) {
		if(b==1) {
			return a;
		}
		
		else {
			
			return a+  multi(a,b-1);
		}
	}
		
	public static void print(int n) {
		if(n<0)
			return;
		
		for(int i=0;i<n;i++)
			System.out.print(" * ");
		System.out.println();
		print(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=addAllBetween(10,20);
		System.out.println("result "+result);
		System.out.println("------------------------------------------");
		System.out.println("addition of no."+add(35, 45));
		System.out.println("------------------------------------------");
		System.out.println("Product of no."+multi(104,55));
		
		
		print(5);
	}

}
