package folder_pack;

import java.util.Scanner;

public class Patt2 {

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
					int ct=1;
					while(ct<cst) {
						System.out.print("  ");
						ct++;
					}
					ct =1;
					while(ct<=nst) {
						System.out.print(" * ");
						ct++;
					}
					row++;
					cst--;
					nst++;
					System.out.println();
				}

	}

}
