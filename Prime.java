package folder_pack;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		int flag = 0;
		int i;
		if(a==2) {
			System.out.println("PRIME NUMBER");
		}else {
			for(i=2;i<Math.sqrt(a);i++) {
				if(a%i==0) {
					flag =1;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println("NOT A PRIME NUMBER");}
			else {
				System.out.println("PRIME NUMBER");}
		}
	}

}
