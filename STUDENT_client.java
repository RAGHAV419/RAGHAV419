package SyLlAbUs;

public class STUDENT_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STUDENT s=new STUDENT("RAM",456);
		System.out.println(s);
		Object O=new Object();
		/*this will print a address like ""SyLlAbUs.STUDENT@626b2d4a"" but why 
		whenever we print a reference variable like s in this case a to string method runs by default and that too string method is the reason 
		we are getting a address in our output 
		///so if we want to print what we want then we have to override the by default to string method by ourselves\\*/
		
// IMPORTANT--- control + click to open declaration or implementation of any item and control +f to find methods in it
	}

}
