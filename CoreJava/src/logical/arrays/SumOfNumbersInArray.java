package logical.arrays;
import java.util.*;
public class SumOfNumbersInArray {

	public static void main(String args[]) {
		int array[] = {10,25,30,40};
		int sum=0;
		for(int num: array) {
			 sum = sum+num;
		}
		System.out.println("Sum of Array integers="+sum);
	}
}
