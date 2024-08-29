package _crfinalprep2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate<T>: Represents a boolean-valued function of one argument.
 * 
 * Method: boolean test(T t)
 */
public class Predicate_NamesStartsWithA {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sadakar", "Hasini", "Amar", "Robert", "Antony");

		Predicate<String> isNameStartsWithA = n -> n.startsWith("A");

		List<String> namesStartsWithAList = names.stream().filter(isNameStartsWithA).collect(Collectors.toList());
		System.out.println(namesStartsWithAList);

	}
}
