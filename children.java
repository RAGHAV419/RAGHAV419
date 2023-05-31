package OOPS_Object_Oriented_Programming;

public class children {

	public static void main(String[] args){
		// TODO Auto-generated method stub
   Father f=new Father("reu",76);
		
		f.execute();
		
		f.setAge(-5);
		// an exception will be thrown in case of a negative value but the code will proceed further after an exception will be thrown
	
		f.setName("laika");
		
		System.out.println(f.getAge());
		
		System.out.println(f.getName());
		
		f.execute();

	}

}
