package folder_pack;

import java.util.Scanner;

public class Character_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s =new String();
String s1 = new String();
Scanner sc =new Scanner(System.in);

s=sc.next();
for(int i=0;i<s.length();i++) {
	if(Character.isUpperCase(s.charAt(i))) {
		char ch=(char) (s.charAt(i)+32);
		s1=s1+ch;
	}else {
		char ch=(char) (s.charAt(i)-32);
		s1=s1+ch;
	}
}
System.out.println(s1);
	}

}
