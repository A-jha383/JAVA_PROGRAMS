package folder_pack;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
			if(perfect(i)){
			System.out.println(i + " is Perfect Square");
		}}

	}
public static boolean perfect(int a) {
	for(int i=1;(i*i)<=a;i++) {
		if(a/i==i && a%i==0) {
			return true;
		}
	}
	return false;
}
}
