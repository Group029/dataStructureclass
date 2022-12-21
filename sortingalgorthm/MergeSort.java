package sortingalgorthm;

public class MergeSort {

	public static void mergeVer(int arr[],int tar[],int low1,int high1, int low2, int high2) {
		int i,j,k;
		i = low1;
		j = low2;
		k = low1;
		
		while((i <= high1 )&&(j <= high2)) {
				if(arr[i]<arr[j]) {
					tar[k] = arr[i];
					i++;k++;
				}
				else if(arr[i]>arr[j]) {
					tar[k] = arr[j];
					j++;k++;
				}
				else {
					tar[k] = arr[i];
					k++; 
					tar[k] = arr[j];
					i++;j++;
				
				}
		
		}
		while(i <= high1) {
			tar[k]=arr[i];
			i++;k++;
		
		}
		while(j <= high2) {
			tar[k]=arr[j];
			j++;k++;
		}
	}
	
	public static void copyArray(int arr[],int temp[],int low,int high) {
		int i;
		for(i=low;i<=high;i++) {
			arr[i]=temp[i];
		}
	}
	
	public static  void mergeSort(int arr[], int low, int high) {
		int mid, mid2,temp[] = new int[arr.length];
		if(low<high) {
			mid=(low+high)/2;
			mid2=mid+1;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid2, high);
			
			mergeVer(arr, temp, low, mid, mid+1, high);
			copyArray(arr, temp, low, high);
		} 
	}
	
	public static void display(int arr[] ) {
		for(int s: arr)
			System.out.print(s+" ");
	}
	public static void main(String[] args) {
	int arr[] = {26,54,95,12,32,65,45,87,12};
	int low=0;
	int high=arr.length-1;
	mergeSort(arr, low, high);
	
	display(arr);
	}
}
