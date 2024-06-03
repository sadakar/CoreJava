package test;

public class ReverseArray {

	public static void main(String args[]) {
		int arr[] = {10,4,5,10,55};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
