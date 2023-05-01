import java.util.Scanner;

public class lexicographic_sorting {
	//delete number of columns to sort lexographical and print the number of ways or deletion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char lex[][]= {{122,121,120},
		               {119,118,117},
		               {116,115,114}};
		System.out.println(relax(lex));
		for(int i=0;i<lex.length;i++) {
			for(int j=0;j<lex[0].length;j++) {
				System.out.print(lex[i][j]+" ");
			}
			System.out.println();
		}
	}public static int relax(char lex[][]) {
		int count =0;
		for(int i=0;i<lex.length;i++) {
			for(int j=0;j<lex[0].length-1;j++) {
				if(lex[i][j]>lex[i][j+1]) {
					count++;
					break;
				}
			}
		}
		return count;
		
	}

}
