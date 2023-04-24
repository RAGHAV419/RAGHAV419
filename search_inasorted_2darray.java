import java.util.*;
public class search_inasorted_2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int x=sc.nextInt();
 System.out.println(search(arr,x));
		}
public static int search(int arr[][],int x) {
	int i=0;
	int j=arr[0].length-1;
	while(i<arr.length&&j>=0) {
		if(arr[i][j]==x) {
			return 1;
		}
		else if(arr[i][j]>x) {
			j--;
		}else {
			i++;
		}
		
	}return 0;

	}

}
