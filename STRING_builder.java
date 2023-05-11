package SyLlAbUs;

import java.util.ArrayList;
import java.util.List;

public class STRING_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method 
/*the default capacity of string builder is 16
 size of string builder grows with this formula old size into 2 + 2 (old size*2+2)
 string builder can perform all the operations of a string
 string builder is used because its is faster than string 
 there is no need of copy pasting the value for adding something to the string builder till the size of content is below the default capacity 16
 string builder adds content to the old content only*/
	
StringBuilder sb=new StringBuilder();  //declaration
System.out.println(sb.capacity());
StringBuilder s=new StringBuilder("hello");//another way for declaration
sb.append("hello");// to add something to string builder just like we used add function to add something to array list
System.out.println(sb);
System.out.println(sb.length());// this will simply print the length of content contained in the string builder
sb=sb.reverse();// this will reverse the string builder content
System.out.println(sb);
sb=sb.reverse();
sb.append("helloo");// this will be added to the old content 
System.out.println(sb);
sb.append("hello");
System.out.println(sb);
System.out.println(sb.capacity());// till now the capacity is not more then the by default capacity i.e. 16
sb.append("z");
System.out.println(sb.capacity()); // after going beyond the default capacity it will increase by 16*2+2 as per the standard formula
sb.append("hellohelloohelloo");
System.out.println(sb.capacity());// similarly till the old capacity which is now 34 the capacity will be 34 only
sb.append("z");
System.out.println(sb.capacity());//but going beyond 34 it will become 34*2+2=70	
//important point -- if we are giving content during declaration capacity becomes default capacity  plus content length   
StringBuilder j=new StringBuilder();
System.out.println(j.capacity());//capacity without any content ==16
StringBuilder m=new StringBuilder("hello");
System.out.println(m.length());// length is equal to 5
System.out.println(m.capacity());//capacity with content == 16+length of content
// we can also dynamically decide the capacity of a string builder like this
StringBuilder x=new StringBuilder(4);
System.out.println(x.capacity());
x.append("12345");
/*similar to the previous case in this case also capacity will be decided by old capacity * 2 + 2 so it will become 4*2+2 because we know that now the 
  default capacity is 4 not 16*/
System.out.println(x.capacity());
// every operation performed by a string van also be performed by a string builder examples are below
StringBuilder q=new StringBuilder("har har mahadev");
System.out.println(q.charAt(2));
System.out.println(q.substring(8));
//how to convert a string builder to string
String z=q.toString();//this will convert the string builder into string and the content of builder will be reflected in string  
System.out.println(z);

ArrayList <Integer> ll=new ArrayList<>(90);
System.out.println(ll);




	}

}
