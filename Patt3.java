package folder_pack;

import java.util.Scanner;

public class Patt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc =new Scanner(System.in);
				int n;
				n=sc.nextInt();
				int nst=1;
				int cst=n;
				int row =1;
				while(row<=n) {
					int ct = 1;
					while(ct<cst) {
						System.out.print("   ");
						ct++;
					}
					ct=1;
					if(row%2!=0) {
					while(ct<=nst) {
						System.out.print(" * ");
						ct++;
					}
					cst--;
					}
					System.out.println();
					nst++;
					row++;
				}
				nst-=2;
				cst+=2;
				while(row>=1) {
					int ct = 1;
					while(ct<cst) {
						System.out.print("   ");
						ct++;
					}
					ct=1;
					if(row%2!=0) {
					while(ct<=nst) {
						System.out.print(" * ");
						ct++;
					}
					cst++;
					}
					System.out.println();
					nst--;
					row--;
				}
	}
	

}
