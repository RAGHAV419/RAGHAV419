import java.util.*;
public class Maze_Path {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cr=0;
		int cc=0;
		int er=2;
		int ec=2;
		String ans="";
		ways(cr , cc ,er,ec, ans);
		System.out.println();
		System.out.println(count);

	}public static void ways(int cr,int cc,int er,int ec,String ans) {
		
		if(cr==er&&cc==ec) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(cr==er) {
			ways(cr , cc+1 ,er,ec, ans+'H');
			return;
		}
		if(cc==ec) {
			ways(cr+1 , cc ,er,ec, ans+'V');
			return;
		}
		ways(cr+1 , cc ,er,ec, ans+'V');
		ways(cr , cc+1 ,er,ec, ans+'H');
		
	}

}
