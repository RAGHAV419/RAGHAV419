package leetcode;
import java.util.*;
public class Cb_ratchasingitscheese {

		   static boolean f=false;
		    public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int l=sc.nextInt();
				int s=sc.nextInt();
				char m[][]=new 	char[l][s];
				for(int i=0;i<m.length;i++) {
					String a=sc.next();
					for(int j=0;j<a.length();j++) {
						m[i][j]=a.charAt(j);
					}
				}
				  int n[][]=new int[l][s];
				  path(m,0,0,n);
				  if(f==false) {
					  System.out.println("NO PATH FOUND");
				  }
				  
				}
		        public static void display(int n[][]) {
				for(int i=0;i<n.length;i++) {
					for(int j=0;j<n[0].length;j++) {
						System.out.print(n[i][j]+" ");
					}
					System.out.println();
				}
			}
		      
				public static void path(char m[][], int cr,int cc,int n [][]) {
					if(cr==m.length-1&&cc==m[0].length-1) {
						if(m[cr][cc]=='O') {
							f=true;
							n[cr][cc]=1;
							display(n);
							n[cr][cc]=0;
						}
						
						return ;
					}
					if(cc<0||cc>=m[0].length||cr<0||cr>=m.length||m[cr][cc]=='X') {
						return;
					}
					int r[]= {0,-1,0,1};
					int c[]= {1,0,-1,0};
					m[cr][cc]='X';
					n[cr][cc]=1;
					for(int i=0;i<c.length;i++) {
						path(m,cr+r[i],cc+c[i],n);
					}
					m[cr][cc]='O';
					n[cr][cc]=0;

			}
	

}

	


