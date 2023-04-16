import java.util.Scanner;
public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ways(n,"T1","T2","T3");
		System.out.println((int)(Math.pow(2, n)-1));
		}
	public static void ways(int n,String S,String H,String D){
		if(n==0) {
			return;
			
		}
		ways(n-1,S,D,H);
		System.out.println("Move "+n+"th disc from "+S+" to "+D);
		ways(n-1,H,S,D);

	}

}
