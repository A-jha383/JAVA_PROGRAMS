package folder_pack;

import java.util.Scanner;

public class Patt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int nst=1;
		int csp=n;
		int row =1;
		while(row<=n) {
			int ct=1;
			while(ct<csp) {
				System.out.print("   ");
				ct++;
			}
			ct=1;
			while(ct<=nst) {
				System.out.print(" * ");
				ct++;
			}
			nst++;
			csp--;
			row++;
			System.out.println();
		}
		nst-=2;
		csp+=2;
		while(row>0) {
			int ct=1;
			while(ct<csp) {
				System.out.print("   ");
				ct++;
			}
			ct=1;
			while(ct<=nst) {
				System.out.print(" * ");
				ct++;
			}
			nst--;
			csp++;
			row--;
			System.out.println();
		}
		
	}

}
