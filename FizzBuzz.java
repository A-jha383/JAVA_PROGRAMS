package folder_pack;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		if(a%3==0) {
			if(a%5==0) {
		System.out.println("FIZZ-BUZZ");
			}else {
				System.out.println("FIZZ");
			}
		}else if(a%5==0) {
			System.out.println("BUZZ");
		}else {
			System.out.println(a);
		}
	}

}
