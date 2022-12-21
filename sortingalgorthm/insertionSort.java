package sortingalgorthm;

public class insertionSort {
	
	public static void display(int arr[]) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void insertionSort2(int arr[]) {
		int i, j, k;
		int n = arr.length-1;
		for(i=1;i<=n;i++) {
			k=arr[i];
			for(j=i-1;j>=0 && k<arr[j];j--) 
				arr[j+1]=arr[j];

				arr[j+1]=k;	
			System.out.println("\n Iteration no :- "+(i));
			display(arr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {88,12,2,63,59,66,1 };
		
		insertionSort2(arr);
		System.out.println("\n----------------------------------------");
		display(arr);
	}

}
