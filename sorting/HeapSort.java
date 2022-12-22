package sorting;

public class HeapSort {
	
	public static void heapfiy(int arr[], int n, int i) {
		int t , largest = i;
		int left = 2*i+1; 
		int right = 2*i+2;
		
		if(left < n && arr[left]>arr[largest]) 
			largest = left;
		
		if(right < n && arr[right] > arr[largest])
			largest = right;
		
		if(i!=largest) {
			t=arr[i];
			arr[i]=arr[largest];
			arr[largest]=t;
			heapfiy(arr, n, largest);
		}
	}
	
	public static void heapSort(int arr[]) {
		int n=arr.length;
		for(int i =n/2-1; i>=0 ;i--) {
			heapfiy(arr, n, i);
		}
		for(int i = n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapfiy(arr, i, 0);
		}
	}
	
	
	public static void display(int arr[]) {
		for(int s: arr) {
			System.out.print(s+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {95,92,25,14,36,75,10};
		
		heapSort(arr);
		display(arr);
	}

}
