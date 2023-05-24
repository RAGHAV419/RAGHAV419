 package leetcode;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class twodlist_one_to_one_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int indx=0;
		List <Integer> ll=new ArrayList <>();
		List<List<Integer>>ans=new ArrayList <>();
		print(n,k,indx,ll,ans);
		System.out.println(ans);
		}

	public static void print(int n,int k,int indx,List <Integer> ll,List<List<Integer>>ans) {
		if(k==0) {
           ans.add(new ArrayList <>(ll));
			return;
		}
		for(int i=indx+1;i<=n;i++) {
			ll.add(i);
			print(n,k-1,i,ll,ans);
			ll.remove(ll.size()-1);
		}
	}
}


