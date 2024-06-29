package test;

public class MaxMinInArray {

	public static void main(String args[]) {
		int array[] = {1,2,0,4,33,5};
		int max = array[0];
		int min=array[0];
		
		for(int num : array) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println(max);
		
		for(int num : array) {
			if(num<min) {
				min=num;
			}
		}
		System.out.println(min);
	}
}
