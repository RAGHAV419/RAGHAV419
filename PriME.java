package SyLlAbUs;

public class PriME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//so this code takes n into square root of n time to run n to print sqrt of n to check 
		int n=31;
		for(int i=0;i<=n;i++) {
			if(check(i)==true) {
				System.out.println(i);
			}
		}
	  System.out.println(check(46));
	  

	}
	public static boolean check(int n) {
		//TO CHECK IF A GIVEN NUMBER IS PRIME OR NOT IN O(SQRT OF N)
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
