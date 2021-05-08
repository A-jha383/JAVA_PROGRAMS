package folder_pack;

public class CharCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1=new int[123];
		int []arr2=new int[123];
		String s1="How are you";
		String s2 = "How are you";
		
		for(int i=0;i<s1.length();i++) {
			char ch =s1.charAt(i);
			arr1[ch]+=1;
		}
		for(int i=0;i<s2.length();i++) {
			char ch =s2.charAt(i);
			arr2[ch]+=1;
		}
		int i=0;
		while(i<123) {
			if(arr1[i]==arr2[i]) {
				i++;
				continue;
			}
			i++;
			break;
		}
		if(i==123) {
			System.out.println("both strings have same char");
		}else {
			System.out.println("they are different");
		}
		
	}

}
