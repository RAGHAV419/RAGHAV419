package leetcode;

import java.util.Arrays;

public class Combination_sum_4 {
static int count=0;
//permutation is allowed and supply is infinite
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		Arrays.sort(arr);
		int target=4;
		String ans ="";
	    System.out.println(sum(arr, target, ans));
	}

	public static int sum(int arr[],int target,String ans) {
		if(target==0) {
			System.out.println(ans);
			
			return 1;
		} 
		int sum1=0;
			for(int i=0;i<arr.length;i++) {
				if(target>=arr[i]) {
					sum1+=sum(arr, target-arr[i], ans+arr[i]+" ");	
				}
				
			}
			return sum1;
			
			
			

	}

}
