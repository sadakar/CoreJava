package _crfinalprep2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_EvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(10,5,4,89,32,90,20));
		
		Predicate<Integer> isEvenNumber = n-> n%2==0;
		
		List<Integer> evenNumbers = numbers.stream().filter(isEvenNumber).collect(Collectors.toList());
		System.out.println("Even Numbers:");
		System.out.println(evenNumbers);

		// Sorting ascending order 
		Collections.sort(evenNumbers);
		System.out.println("Ascending order or natural ordering");
		System.out.println(evenNumbers);
		
		// Sorting descending order
		Collections.sort(evenNumbers, Collections.reverseOrder());
		System.out.println("Decending order");
		System.out.println(evenNumbers);
	}
}
