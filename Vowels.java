package folder_pack;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String st = sc.next();
		char a= st.toLowerCase().charAt(0);
//		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
//			System.out.println("VOWEL");
//		}else {
//			System.out.println("ITS NOT A VOWEL!!!");
//		}

		switch(a) {
		case 'a':{
			System.out.println("VOWEL");
		}
		case 'e':{
			System.out.println("VOWEL");
		}
		case 'i':{
			System.out.println("VOWEL");
		}
		case 'o':{
			System.out.println("VOWEL");
		}
		case 'u':{
			System.out.println("VOWEL");
		}
		default:{
			System.out.println("ITS NOT A VOWEL!!!");
		}
		}
	}

}
