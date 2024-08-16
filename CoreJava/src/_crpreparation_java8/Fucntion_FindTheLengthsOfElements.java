package _crpreparation_java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fucntion_FindTheLengthsOfElements {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bod", "Charlie");

		// Fucntion to convert a String to its length
		Function<String, Integer> stringLengthFunction = s -> s.length();

		// Apply the function to each element in the list
		List<Integer> nameLengths = names.stream().map(stringLengthFunction).collect(Collectors.toList());

		// Print the result
		System.out.println("Name lengths: " + nameLengths);
	}
}
