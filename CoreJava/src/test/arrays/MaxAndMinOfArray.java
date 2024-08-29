package test.arrays;

public class MaxAndMinOfArray {

	public static void main(String args[]) {
		int arr[] = {20, 22, 18, 35, 48, 26, 87, 70};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i : arr) {
			if(i> max) {
				max=i;
			}
			if(i<min) {
				min=i;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
