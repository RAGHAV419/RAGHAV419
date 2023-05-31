package OOPS_Object_Oriented_Programming;

// exception is a class which dosen't needed to be imported because just like other classes (for example--string and arrays) exception is also a class
//of java.lang package and any class which belongs to java.lang does not required to be imported

public class Father {
	//this stuff is really important from the point of view of development
	
	private int age;
	private String name;
	
	public void execute() {
		System.out.println(this.name+" "+this.age);
	}
	public Father(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	//this is a second method to handle exception in this method we first try to check if a error exist and if it do exist then we catch it and throw
	//error otherwise we simply write this.age =age which means code will run smoothly as needed
	
	public void setAge(int age)  {
		//NOTE -- this method simply throws error when an exception occur but it wont terminate the code at that point like the previous method
		
		try {
			if(age<0) {
				throw new Exception("nope");//throw keyword here is used to generate exception
			}
		}catch(Exception e) {
			System.out.println(e);//will give exception and will print the message
			e.printStackTrace();//will give the index of exception from the stack
			
		} finally {
			System.out.println("**********");// finally block always runs it dosen't matter if there is an exception or not this block will execute
		}
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
