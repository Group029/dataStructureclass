package sortingalgorthm;

public class BubbleSort {
	
	
	public static void display(int arr[]) {
		for(int s : arr) {
			System.out.print(s+" ");
		}
	}
	
	
	public static void bubbleSort(int arr[]) {
		int i,j,t, flag=0;
		int n=arr.length-1;
		
		for(i=0;i<n;i++) {
			flag=0;
			for(j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					flag=1;
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
			if(flag==0) {
				break;
			}
			System.out.println("\n Iteration No :- "+(i+1));
			display(arr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[] = {60,10,50,120,65,87,45,26};
		bubbleSort(arr);
		System.out.println("\n------------------------------------------");
		display(arr);
	}

}
