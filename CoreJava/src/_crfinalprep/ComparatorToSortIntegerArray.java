package _crfinalprep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorToSortIntegerArray {

	public static void main(String[] args) {
		Comparator<Integer> sortingLambda = (Integer obj1, Integer obj2) -> obj1.compareTo(obj2);
		
		Integer array1[] = {5,3,8,9,2};
		Arrays.sort(array1, sortingLambda);
		System.out.println(Arrays.toString(array1));
		
		Arrays.sort(array1, Collections.reverseOrder());
		System.out.println(Arrays.toString(array1));
	}
}
