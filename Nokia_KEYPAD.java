import java.util.*;
public class Nokia_KEYPAD {
static String[]key= {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
static int count=0; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ques=sc.next();
		String ans="";
		keypad(ques,ans);
		System.out.println();
		System.out.println(count);

	}
	public static void keypad(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		char ch=ques.charAt(0);
		String pressstring=key[ch-48];//ch=1 but as a character because we have passed it in a string and the asci value
		for(int i=0;i<pressstring.length();i++) {// of 1 as a character =49 so 49-48 will become 1 only
			keypad(ques.substring(1),ans+pressstring.charAt(i));
		}
				
	}

}
