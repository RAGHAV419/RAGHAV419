package SyLlAbUs;

public class STUDENT {
  String name;
  int age;
 public STUDENT() {
	 
 }
 public STUDENT(String name,int age) {
	 this.name=name;
	 this.age=age;
 }
 @Override
 public String toString() {
	 String s=this.name+" "+this.age;
	 return s;
 }
 //* getClass().getName() + '@' + Integer.toHexString(hashCode())
 //here we have to make the tostring method exactly like the by-default tostringmethod because then only it will be overridden 
 //(this is the rule of method overriding return type must be same)
}
                                           ///////////////IMPORTANT T H E O R Y\\\\\\\\\\\\\\\
/*when we printed s not s.name or s.age what the compiler did is ir printed the address of that string because we didn't made it clear that 
 * which part of the class s we want to access but the question arises that how are is the machine getting the address so there is a object class
 *which contains a tostringmethod and by default object class is inherited by every class main,user-defined or any other class so now how does this
 *tostringmethod prints the address what this tostring method do is it takes package name class name @ and then a sequence of alpha numerics
 *like this ""SyLlAbUs.STUDENT@626b2d4a"" here syllabus is package student is class so if we want that even on printing the class name like "s"
 *only we must get the correct values of name and age then we can make our own tostring method which will have the correct values for name and 
 *age and we all know just like by default constructor is overridden by user-defined constructor user-designed tostringmethod will also override 
 *the by default tostring method  */