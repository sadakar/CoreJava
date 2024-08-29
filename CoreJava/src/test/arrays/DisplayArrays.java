package test.arrays;

import java.util.Arrays;

public class DisplayArrays {

	public static  void main(String args[]) {
		
		int arr[] = {10,4,3,29,5,0};
		for(int i : arr) {
			System.out.println(i);
		}
		
		String str[] = {"hasini","Sadakar","ram"};
		for(String s : str) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));
	}
}
