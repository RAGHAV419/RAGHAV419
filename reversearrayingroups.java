package SyLlAbUs;

public class reversearrayingroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int i=0;
		int n=arr.length;
		int k=3;
		int m=k;
			while(k<=n) {
				reverse(arr,i,k);
				i=i+m;
				k=k+m;
				}
			
		if(k>n) {
			reverse(arr,i,n);
		}
		for(int c=0;c<arr.length;c++) {
			System.out.print(arr[c]+" ");
		}
		
	}
	public static void reverse(int arr[],int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j-1];
			arr[j-1]=temp;
			i++;
			j--;
		}

	}

}
