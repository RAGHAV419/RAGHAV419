package leetcode;

public class S_H_I_F_T_dnumberstolast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		int d=3;
		//logic --first reverse 12345 to 54321 then divide it into two parts 543 and 21 and reverse 543 to 345 and 21 to 12 and answer will become 34512 
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-1-d);
		reverse(arr,arr.length-d,arr.length-1);
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}


		  
				}
			public static void reverse(int arr[],int i,int j) {
				while(i<j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
				}
				

	}

}
