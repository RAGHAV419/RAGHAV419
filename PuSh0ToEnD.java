
public class PuSh0ToEnD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,0,7,1,0,2,0};
		int temp=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}

	}

}
