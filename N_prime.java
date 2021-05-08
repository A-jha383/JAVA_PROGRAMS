package folder_pack;

import java.util.Scanner;

public class N_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		System.out.println("PRIME NUMBERS ARE :");
		for(int i=1;i<a;i++) {
			if(prime(i))
				System.out.println(i);
		}
	}
public static boolean prime(int a) {
	int i;
	if(a==1) {
		return false;
	}
	if(a==2) {
		return true;
	}else {
		for(i=2;i<Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
}
