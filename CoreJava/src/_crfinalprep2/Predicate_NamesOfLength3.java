package _crfinalprep2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate<T>: Represents a boolean-valued function of one argument.
 * 
 * Method: boolean test(T t)
 * 
 *  with filter
 */
public class Predicate_NamesOfLength3 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Boo","Hasini","Amy","Robert","Antony");
		
		Predicate<String> isLengthThree = ( n )-> { return n.length() == 3 ;};
		
		List<String> namesOfLengthThree= names.stream().filter(isLengthThree).collect(Collectors.toList());
		System.out.println(namesOfLengthThree);
		
	}
}
