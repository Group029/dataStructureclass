package sortingalgorthm;

public class SelectionSort {

	public static void display(int arr[]) {
		for(int s : arr) {
			System.out.print(s+" ");
		}
	}
	
	public static void selectionSort(int arr[]) {
		
		int i , j , t, min;
		
	   int n = arr.length-1;
		
		for(i=0;i<n;i++) {
			min =i;
			for(j=i+1;j<=n;j++) {
				
				if(arr[min]>arr[j]) 
					min=j;
			}
			if(i!=min) {
				t=arr[i];
				arr[i]=arr[min];
				arr[min]=t;
			}
			System.out.println("\n Iteration no. :- "+(i+1));
			display(arr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {65,85,28,5,6,75,35,45,60,76};
		
		selectionSort(arr);
		System.out.println("\n----------------------------------------");
		display(arr);
		
		
		
	}

}
