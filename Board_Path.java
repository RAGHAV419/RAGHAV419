import java.util.*;
public class Board_Path {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		String ans="";
		boardpath(size1,size2,ans);
		System.out.println();
		System.out.println(boardpathh(size1,size2,ans)); 
		
		}
	public static int boardpathh(int size1,int size2,String ans) {
		return count;
	}

	public static void boardpath(int size1,int size2,String ans) {
		if(size1==0) {
		System.out.print(ans+" ");
		count++;
		return;
		}
		if(size1<0) {
		return;
		}
		for(int i=1;i<=size2;i++) {
		boardpath(size1-i,size2,ans+i);
		}		
	}


}
