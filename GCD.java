package folder_pack;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int temp =0;
		int x=a;
		int y=b;
		while(a%b!=0) {
			temp = b;
			b=a%b;
			a=temp;
		}
		int result = lcm(x,y,b);
		System.out.println("GCD and LCM OF "+x+" and "+y +" are "+b+" and "+result );
	}
	
	public static int lcm(int a,int b,int gcd) {
		return (a*b)/gcd;
	}

}
