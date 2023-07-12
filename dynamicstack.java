package SyLlAbUs;

public class dynamicstack extends Stack{

	public void push(int item)throws Exception{
		if(super.isfull()) {
			int arr[]=new int[2*super.data.length];
			for(int i=0;i<super.data.length;i++) {
				arr[i]=super.data[i];
			}
			super.data=arr;
		}
		super.push(item);
		
	}
	

}
