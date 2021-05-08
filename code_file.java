package folder_pack;

import java.util.Scanner;

public class code_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("VALUE OF N");
		int n = sc.nextInt();
		if(prime(n)) {
			System.out.println("not prime");
		}

	}
	public static boolean prime(int a) {
		int flag =0;
		for(int i=2;i<a;i++){
			if(a%i==0) {
				flag=1;
			}
		}
		if(flag==1)
		return true;
		
		return false;
	}

}
