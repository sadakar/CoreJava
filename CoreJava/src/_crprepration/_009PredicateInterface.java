package _crprepration;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _009PredicateInterface {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

		// Predicate to Check if a name starts with 'A'
		Predicate<String> startsWithA = name -> name.startsWith("A");

		// Filter names that starts with 'A'
		List<String> filteredNames = names.stream().filter(startsWithA).collect(Collectors.toList());
		// Output filtered list
		System.out.println("Names startign with 'A':" + filteredNames);

		// Using negate to get names that do not starts with 'A'
		List<String> notStartingWithA = names.stream().filter(startsWithA.negate()).collect(Collectors.toList());
		// Output filtered list
		System.out.println("Names not startign with 'A':" + notStartingWithA);
	}
}
