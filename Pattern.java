package folder_pack;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int nst=1;
		int sst=n;
		int row =1;
		while(row<=n) {
			int ct=1;
			while(ct<sst){
				System.out.print("   ");
				ct++;
			}
			ct=1;
			while(ct<=nst){
				System.out.print(" * ");
				ct++;
			}
			System.out.println();
			row++;
			nst++;
			sst--;
		}
	}

}
