
package folder_pack;


import java.util.Scanner;

public class ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("VALUE OF N");
		int n = sc.nextInt();
		int n1 = n;
		int temp =0;
		while(n!=0) {
		
			int a = n%10;
			temp = temp*10+a;
			n=n/10;
			
		}
		if (n1==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
	}

}
