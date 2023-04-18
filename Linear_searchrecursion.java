	import java.util.*;
public class Linear_searchrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6};
		int i=0;
		int n=sc.nextInt();
		krint(arr,i,n);
	}

		
		

	
	public static void krint(int arr[],int i,int n) {
		if(i==arr.length) {
			System.out.println(false);
			return;
		}
		if(arr[i]==3) {
			System.out.println(true);
			return;
		
		}
		
		krint( arr,i+1,n);
		
		

	}
}
	
	


