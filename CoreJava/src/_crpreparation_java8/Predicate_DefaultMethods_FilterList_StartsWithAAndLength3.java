package _crpreparation_java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_DefaultMethods_FilterList_StartsWithAAndLength3 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ali","Bob","Charlie","David");
		
		// Predicate to Check if name starts with 'A'
		Predicate<String> startWithA = name -> name.startsWith("A");
		
		// Predicate to check if a name is of length 3
		Predicate<String> lengthThree = name -> name.length()==3;
		
		// Combine Predicates 
		List<String> result = names.stream().filter(startWithA.and(lengthThree)).collect(Collectors.toList());
		
		System.out.println("Names with A and having length: "+result);
	}
}
