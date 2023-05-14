package SyLlAbUs;

public class PRIMEseiveALGO {
	public static void main(String[]args) {
		int n=17;
		boolean arr[]=new boolean[n+1];
		prime(n,arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
			
		}
	}
	public static void prime(int n,boolean arr[]) {
		arr[0]=true;
		arr[1]=true;
		for(int i=2;i<=n;i++) {
			if(arr[i]==false) {
				for(int mul=2;i*mul<=n;mul++) {
					arr[i*mul]=true;
				}
			}
		}
	}

}
