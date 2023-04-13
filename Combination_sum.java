package leetcode;
import java.util.*;
                                                                        // P e R m U t A t I o N
class Combination_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,6,7};
		List <Integer> ll=new ArrayList <>();
		List<List<Integer>>ans=new ArrayList <>();
		//printCombination(candidates,target,ll,0,ans);
		printCombination(arr,7,ll,ans);
		System.out.println(ans);
		//return ans;
		
	
	}
		public static void printCombination(int[] coin,int amount, List<Integer>ll,List<List<Integer>>ans) {
		
		if(amount==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
	for(int i=0;i<coin.length;i++) {
		if(amount>=coin[i]) {
			ll.add(coin[i]);
			printCombination(coin,amount-coin[i],ll,ans);
			ll.remove(ll.size()-1);
				
		}
		
	}

		

	}

}
