package _crfinalprep2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fucnction_ConvertStringsToUpperCase_toString_function {

	/**
	 * Function<T, R>: Represents a function that accepts one argument and produces
	 * a result.
	 * 
	 * Method: R apply(T t)
	 * 
	 *  Used with map() function in streams
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sadakar","Gopal","Hasini", "Amarapali");
		
		
		// Function and map
		Function<String, String> convertToUpperCase = name -> name.toUpperCase(); // toUpperCase() is String function and returns upper case letters
		
		List<String> convertNamesToUpperCase = names.stream().map(convertToUpperCase).collect(Collectors.toList());
		
		System.out.println(convertNamesToUpperCase);
		
		// ascending order of list
		System.out.println("ascending order");
		Collections.sort(convertNamesToUpperCase);
		System.out.println(convertNamesToUpperCase);
		
		// descending order of list
		System.out.println("descending order");
		Collections.sort(convertNamesToUpperCase, Collections.reverseOrder());
		System.out.println(convertNamesToUpperCase);
		
	}
}
