package leetcode;

public class countnofopalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q="nitin";
		System.out.println(sub(q));
		
		//in nitin every alphabet is a palindrome and 'iti' is also a palindrome and nitin is also a palindrome so in total 7 palindrome exists
	}
	public static int sub(String q) {
		int count=0;
		for(int i=0;i<q.length();i++) {
			for(int j=i+1;j<=q.length();j++) {
				String to=q.substring(i, j);
				if(check(to)==true) {
					count++;
				}
			}
		}
		return count;
	}
	public static boolean check(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}

}
