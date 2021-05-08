package folder_pack;

import java.util.Scanner;

public class patt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int nst=n;
		int csp=1;
		int row =1;
		while(row<=n) {
			int ct =1;
			while(ct<csp) {
			System.out.print(" ");
			ct++;
			}
			while(ct<=nst) {
				System.out.print(ct+ " ");
				ct++;
			}
			csp++;
			row++;
			System.out.println();
		}
	}

}
