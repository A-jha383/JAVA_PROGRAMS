package folder_pack;

import java.util.Scanner;

public class Patt10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int nst=1;
		int csp =n;
		int row =1;
		int val=1;
		while(row<=n) {
			int ct =1;
			while(ct<csp) {
				System.out.print(" ");
				ct++;
			}
			ct=1;
			while(ct<=nst) {
				if(ct==1||ct==nst) {
					System.out.print("1 ");
				}else {
					System.out.print(row+" ");
				}
				ct++;
			}
			row++;
			nst++;
			csp--;
			System.out.println();
		}
		
	}

}
