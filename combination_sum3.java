package leetcode;

public class combination_sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//we have to print all the possible combinations of numbers from 1 to 9 which adds to 7 and there is a condition that at one go only 3 numbers can be added
		//to get the our required target sum(7) we can also take user input
	int n=7;
	int k=3;
	int idx=0;
	String ans="";
	sum(n,k,idx,ans);
	}
	public static void sum(int n,int k,int idx,String ans) {
		if(k==0&&n==0) {
			 System.out.println(ans);
				return;
		}
		for(int i=idx+1;i<9;i++) {
			
			sum(n-i,k-1,i,ans+i+" ");
		}

	}

}
