package _crprepration;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _010StreamsAPI {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("John", "Paul", "George", "Ringo", "Alice", "Bob");

		// Predicate
		Predicate<String> predicate = name -> name.startsWith("A");

		// .filter() -- Using Predicate filter names starting with A
		List<String> filteredNames = names.stream().filter(predicate).collect(Collectors.toList());
		System.out.println("Filtered names: " + filteredNames);

		// .map() -- Convert names to upper case
		List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercase names:" + upperCaseNames);

		// .sorted() -- Sort names alphabetically
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted names:" + sortedNames);

		// .forEach() -- Print each name
		System.out.println("Names: ");
		names.stream().forEach(name -> System.out.println(name + " "));
		System.out.println();

		// .count -- count the number of names
		long count = names.stream().count();
		System.out.println("Count of names: " + count);

		// .collect(), Collectors, .joining()
		String joinedNames = names.stream().collect(Collectors.joining(", "));
		System.out.println("Joined names:" + joinedNames);

		// Min : Find the name with minium length
		String shortestName = names.stream().min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
				.orElse("No names");
		System.out.println("Shorted name:" + shortestName);

		// Max : Find the name with maximum length
		String longestName = names.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
				.orElse("No names");
		System.out.println("Longest name:" + longestName);

	}
}
