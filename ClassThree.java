package folder_pack;

import java.util.Scanner;

class area{
	int leng;
	int width;
	int a,b,c;
	
	public area(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public area(int leng, int width) {
		this.leng = leng;
		this.width = width;
	}

public float a_tri() {
		int s = (a+b+c)/2;
		int arr =(s*(s-this.a)*(s-this.b)*(s-this.c));
		return Math.sqrt(arr);
}
	public int p_tri() {
		return a+b+c;
}
	
	public int a_ret() {
		return leng*width;
	}
	public int p_ret() {
		return 2*(leng+width); 
	}
}

public class ClassThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		area rec = new area(a,b);
		System.out.println(rec.a_ret());
		System.out.println(rec.p_ret());
		int t1 = sc.nextInt();
		int t2=sc.nextInt();
		int t3=sc.nextInt();
		area tri = new area(t1,t2,t3);
		double ar= rec.a_tri();
		System.out.println(ar);
	System.out.println(rec.p_tri());
	}
}
