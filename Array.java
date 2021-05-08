package folder_pack;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr= "abcdcba";
boolean temp=true;
for(int i=0;i<arr.length()/2;i++) {
	if(arr.charAt(i)! =arr.charAt(arr.length()-1-i)) {
			temp = false;
			break;}
}
	if(temp) {
		System.out.println("its true");
	}else {
System.out.println("no its not");
}
}}