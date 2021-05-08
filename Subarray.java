package folder_pack;

public class Subarray {

	public static void main(String[] args) {
		int [] arr = {12,15,16,17};
		int n=arr.length;
		// TODO Auto-generated method stub
for(int i =0;i<n;i++) {
	for(int j=i;j<n;j++) {
		System.out.print(arr[j]+" ");
		
	}
	System.out.println();
	
}
	}

}
