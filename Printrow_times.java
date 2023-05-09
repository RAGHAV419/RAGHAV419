package leetcode;

public class Printrow_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		int n=arr.length;
		int m=arr[0].length;
			for(int i=0;i<arr.length;i++) {
		     n=arr.length-i;
				while(n!=0) {
					for(int j=0;j<arr.length;j++) {
						System.out.print(arr[i][j]+" ");
					}n--;
					System.out.println();
				}System.out.println("***********");
	}	

	}

}
