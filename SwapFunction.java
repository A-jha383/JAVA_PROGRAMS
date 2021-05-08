package folder_pack;

import java.util.Scanner;

public class SwapFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int a = sc.nextInt();
int b =sc.nextInt();
a = a+b;
b = a-b;
a = a-b;
System.out.println(a + " " + b );
	}

}
