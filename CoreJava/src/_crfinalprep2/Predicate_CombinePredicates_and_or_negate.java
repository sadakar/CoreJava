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
 *  with streams filter()
 */
public class Predicate_CombinePredicates_and_or_negate {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Boo","Hasini","Amy","Robert","Antony");
		
		Predicate<String> isLengthThree = ( n )-> { return n.length() == 3 ;};
		Predicate<String> isNameStartsWithA = n -> n.startsWith("A");
		
		// and()
		System.out.println(" Names starts with A and having length 3:");
		List<String> namesOfLengthThreeAndStartsWithA= names.stream().filter(isLengthThree.and(isNameStartsWithA)).collect(Collectors.toList());
		System.out.println(namesOfLengthThreeAndStartsWithA);
		
		// or()
		System.out.println(" Names starts with A or having length 3:");
		List<String> namesOfLengthThreeOrStartsWithA= names.stream().filter(isLengthThree.or(isNameStartsWithA)).collect(Collectors.toList());
		System.out.println(namesOfLengthThreeOrStartsWithA);
		
		// negate()
		System.out.println(" Names that do not starts with A:");
		List<String> namesOfDoNotStartsWithA= names.stream().filter(isLengthThree.negate()).collect(Collectors.toList());
		System.out.println(namesOfDoNotStartsWithA);
		
	}
}
