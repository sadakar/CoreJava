package _crpreparation_java8;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda_ComparatorInterface_SortArray {

	public static void main(String[] args) {
		
		Integer[] array = {5,3,8,1,2};
		
		Comparator<Integer> lambdaComparator = (Integer o1, Integer o2) -> o1.compareTo(o2);
	
		Arrays.sort(array, lambdaComparator);
		System.out.println(Arrays.toString(array));
	}
}
