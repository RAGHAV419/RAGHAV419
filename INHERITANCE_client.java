package SyLlAbUs;

public class INHERITANCE_client {

	                                                //////////INHERITANCE IN JAVA\\\\\\\\\\
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INHERITANCE_parent obj=new INHERITANCE_child();
		System.out.println(obj.d);
	//System.out.println(obj.d2);--this will give error because on compile time only lhs will be accessed so only p data members will be accessed
		System.out.println(((INHERITANCE_child)(obj)).d2);
   //Now we have type casted the obj with c so that we can access its data members too
		obj.fun();
  //fun method is present in both the parent and child classes so here overriding will take place which says when two functions with same name
 //exist in both parent and super class the the function in child class will be priortised over parent class function
		
	//	INHERITANCE_child objj=new INHERITANCE_parent();--this is also not allowed in java you can refer to the notes for reason
		INHERITANCE_child object=new INHERITANCE_child();
		System.out.println(object.d);
		System.out.println(object.d1);
		System.out.println(object.d2);
		System.out.println(((INHERITANCE_parent)(object)).d);//this will print the value of d from parent class
		object.fun();
		object.fun1();
		object.fun2();
	((INHERITANCE_parent)(object)).fun();// this is to access the fun function of parent
	
		
	}

}
