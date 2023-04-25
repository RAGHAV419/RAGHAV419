import java.util.Scanner;

public class otonrpimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(1);
		System.out.println(2);
		for(int i=3;i<n;i++) {
			int count=1;
		for(int j=2;j<i;j++) {
			if(i%j!=0) {
			 count++;
			}if(count==i-1) {
				System.out.println(i);
					}
				}
		}


	}

}
