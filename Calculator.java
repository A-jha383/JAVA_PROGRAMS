package folder_pack;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		char sign = sc.next().charAt(0);
		if(sign=='+') {
			System.out.println(a+b);
		}else if(sign=='-') {
			System.out.println(a-b);
		}else if(sign=='*') {
			System.out.println(a*b);
		}else if(sign=='/') {
			System.out.println(a/b);
		}else if(sign=='%') {
			System.out.println(a%b);
		}else {
			System.out.println("Sorry not an operator");
		}
	}

}
