package folder_pack;

import java.util.Scanner;

class bulb{
	boolean isOn;
	public void turnOn(){
		isOn=true;
	}
}


public class ClassFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

int d = (b*b-4*a*c);
if(d<0) {
	System.out.println("no real roots exists");
}else {
	System.out.println(((-b+Math.sqrt(d))/2*a) + " and "+((-b-Math.sqrt(d))/2*a));
}
}}
