package _crfinalprep2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fucnction_ConvertStringsToLength_length_function {

	/**
	 * Function<T, R>: Represents a function that accepts one argument and produces
	 * a result.
	 * 
	 * Method: R apply(T t)
	 * 
	 * Used with map() function in streams
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sadakar","Gopal","Hasini", "Amarapali");
		
		
		// Function and map
		Function<String, Integer> lengthFunction = name -> name.length(); // length() is String function and returns integer
		
		List<Integer> convertNamesToLength = names.stream().map(lengthFunction).collect(Collectors.toList());
		
		System.out.println(convertNamesToLength);
		
		// ascending order of list
		System.out.println("ascending order");
		Collections.sort(convertNamesToLength);
		System.out.println(convertNamesToLength);
		
		// descending order of list
		System.out.println("descending order");
		Collections.sort(convertNamesToLength, Collections.reverseOrder());
		System.out.println(convertNamesToLength);
		
	}
}
