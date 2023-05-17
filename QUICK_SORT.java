package SyLlAbUs;

public class QUICK_SORT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,5,1,9,3,4};
		quicksort(arr,0,arr.length-1);
				for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}public static void quicksort(int arr[],int low,int high) {
		if(low>=high) {
			return;
		}
		int idx=cp(arr,low,high);
		quicksort(arr,low,idx-1);
		quicksort(arr,idx+1,high);
		
	}
	
	public static int cp(int arr[],int low,int high) {
		int pivot=arr[high];
		int j=low;
		for(int i=low;i<high;i++) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		int temp=arr[j];
		arr[j]=arr[high];
		arr[high]=temp;
		return j;
		
	}
       
}
