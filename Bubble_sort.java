
public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		 sort(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		}
	       public static void sort(int []arr){
			for(int j=1;j<arr.length;j++) {
				for(int i=0;i<arr.length-j;i++) {
					if(arr[i]>arr[i+1]) {
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
			}

	}

}
