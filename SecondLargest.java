package folder_pack;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		int max,sec_max;
		max =Integer.MIN_VALUE;
		sec_max=Integer.MIN_VALUE;
		for(int i=0;i<10;i++) {
			arr[i]= sc.nextInt();
			if(arr[i]>max) {
				sec_max=max;
				max=arr[i];
			}else if(arr[i]>sec_max)
		}
		System.out.println(sec_max);

	}

}
