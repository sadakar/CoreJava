package test;

public class SumOfNumberInArray {

	public static void main(String args[]) {
		int arr[] = {10,30,2,44};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
