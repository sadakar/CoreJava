package test.arrays;

public class ReverseAnArray {

	public static void main(String args[]) {
		int a[] = {10,5,6,1,90};
		for(int i=a.length-1;i>=0;--i) {
			System.out.print(a[i]+" ");
		}
	}
}
