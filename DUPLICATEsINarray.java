 
public class DUPLICATEsINarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,5,2,1};
		int count1=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&arr[i]!=0) {
					count1++;
					if(count==0) {
						count1++;
						System.out.print(arr[i]+" ");
						System.out.println("index number is="+i+" ");
					}
					System.out.print(arr[j]+" ");
					System.out.println("index number is="+j+" ");
					arr[j]=0;
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("["+"total count of duplicate numbers is="+count1+"]");
		

	}

}
