package folder_pack;

import java.util.Scanner;

public class Patt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int nst=1;
		int row =1;
		while(row<=n) {
			int ct =0;
			while(ct<nst) {
				System.out.print((n-ct)+" ");
				ct++;
			}
			nst++;
			row++;
			System.out.println();
		}
	}

}
