import java.util.*;
public class N_queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		boolean[]board=new boolean[4];
		String ans="";
		int tq=2;
		int tqsf=0;
		print(board,ans,tq,tqsf,0);
	}
	public static void print(boolean[]board,String ans,int tq,int tqsf,int idx) {
		if(tq==tqsf) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				print(board, ans+"b"+i+"q"+tqsf, tq, tqsf+1,i);
				board[i]=false;
				
				
			}
		}
		

	}

}
