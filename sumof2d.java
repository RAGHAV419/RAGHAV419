package Practice;
import java.util.*;
public class sumof2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int d=0;d<t;d++) {
			int n=sc.nextInt();
			int arr[][]=new int [n][n];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			sum(arr);
			}
		
    }
	public static void sum(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
		
	}

}

