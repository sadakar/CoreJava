package _crpreparation_java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_EvenNumbersList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// Predicate to check if a number is even
		Predicate<Integer> isEven = n -> n%2 == 0;
		
		// Filter the list using the Predicate
		List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
		
		// Print the filtered list
		System.out.println("Even Numbers: "+ evenNumbers);
	}
}
