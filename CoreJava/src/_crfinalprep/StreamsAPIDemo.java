package _crfinalprep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsAPIDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Hasini", "Sadakar", "Rohit", "Sachin", "Nitya","Amani","Anirudh");
		
		
		/**
		 *  Predicate and filter() demo
		 */
		
		// filtering with Predicate 
		Predicate<String> nameStartsWithA = name -> name.startsWith("A");
		
		// filter(Predicate)
		List<String> namesStartWithALetter = names.stream().filter(nameStartsWithA).collect(Collectors.toList());
		System.out.println(namesStartWithALetter);
		
		/**
		 * Function and map() demo -- Convert to upper case
		 */
		
		// Convert all the names to UpperCase using Function 
		Function<String, String> upperCaseNames = n -> n.toUpperCase() ;
		List<String> upperCaseNamesList = names.stream().map(upperCaseNames).collect(Collectors.toList());
		System.out.println(upperCaseNamesList);
		
		/**
		 * Function and map() demo  -- Convert String to its length
		 * 
		 */
		Function<String , Integer> stringLengthFunction = n -> n.length();
		List<Integer> lengthOfStrings = names.stream().map(stringLengthFunction).collect(Collectors.toList());
		System.out.println(lengthOfStrings);
		
		
		
		/**
		 *  sorted() demo
		 */
		 System.out.println(names.stream().sorted().collect(Collectors.toList()));
		 
		 /**
		  * forEach() demo
		  */
		 System.out.println();
		 names.stream().forEach( name -> System.out.println(names+ " "));
		 System.out.println();
		 
		 /**
		  *  count() demo
		  */
		 long count = names.stream().count();
		 System.out.println(count);
		 
		 /**
		  *  collect() demo
		  */
		 String joining = names.stream().collect(Collectors.joining(", "));
		 System.out.println(joining);
		 
		 /** min() demo -- find the name with minimum length
		  * 
		  */
		 String shortName = names.stream().min((s1,s2) -> Integer.compare(s1.length(), s2.length())).orElse("No names");
		 System.out.println(shortName);
		 
		 /** min() demo -- find the name with minimum length
		  * 
		  */
		 String longName = names.stream().max((s1,s2) -> Integer.compare(s1.length(), s2.length())).orElse("No names");
		 System.out.println(longName);
		 
	}
}
