package folder_pack;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		double result =sqrt(a);
		System.out.println(result);
	}
	

	public static double sqrt(int n){
		double temp;
		double root =n/2;
		do {
			temp =root;
			root = (temp+(n/temp))/2;
			
		}while((temp-root)!=0);
		
		
		return root;
		
		
	}
}