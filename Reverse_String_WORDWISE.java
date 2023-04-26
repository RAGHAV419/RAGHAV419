package leetcode;

public class Reverse_String_WORDWISE {
	public static void main(String[] args) {
	    String input="im the king";
		
	    System.out.println(word(input));
		      
	 }
		 public static String word(String input) {
			
			 int end=input.length();
			 
			 int i=input.length()-1;
			 
			 String output="";
			 
			 while(i>=0) {
				 
				 if(input.charAt(i)==' ') {
					
					 output=output+input.substring(i+1,end)+" ";
					 
					 end=i;
				  
				 }
				 
				 i--;
			  
			 }
			 
			 output=output+input.substring(i+1,end);
			 
			 
			 return output;
		  }
		
		 
}
