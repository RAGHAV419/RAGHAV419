package OOPS_Object_Oriented_Programming;

public class Person_clientt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person("nadia",56);
 //when we have a parameterized constructor in the parent class then we just have to simply declare the values in our constructor part of the object 
 // i have explained in the parent class also that a part of object is a constructor only 
	//	p.age=65;
		//p.name="tariq";
 //if i will again initialize the values then the updated values will be printed 

		p.fun();

	}

}
