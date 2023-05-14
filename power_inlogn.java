package SyLlAbUs;

public class power_inlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int n=6;
		System.out.println(logn(a,n));
		//we have to find a to the power n in o(log n)

	}
	public static int logn(int a,int n) {
		if(n==0) {
			return 1;
		}
		int ans=logn(a,n/2);
		ans=ans*ans;
		if(n%2!=0) {
			ans=ans*a;
		}
		return ans;
		
	}

}
