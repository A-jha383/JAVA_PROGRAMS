package folder_pack;

import java.util.Scanner;

public class Anst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
			if(anst(i)){
			System.out.println(i + " is Anstrome number");}}
	}
public static boolean anst(int a) {
	int num =a;
	int sum=0;
	int rem;
	while(a!=0) {
		rem = a%10;
		sum = sum+ (rem*rem*rem);
		a=a/10;
	}
	if(num==sum) {
		return true;}
	return false;
}
}
