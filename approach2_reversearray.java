package SyLlAbUs;

public class approach2_reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int k=3;
		reverse(arr,arr.length,k);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void reverse(int arr[],int n,int k) {
		for(int i=0; i<n; i=i+k){
			int leftSide=i;
            int side = Math.min(i+k-1, n-1);
            while(leftSide<side){
            	int temp=arr[leftSide];
            	arr[leftSide]=arr[side];
            	arr[side]=temp;
            	leftSide++;
            	side--;
            	}
        }

	}

}
