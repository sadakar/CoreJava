package _crpreparation_java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsAPI {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Sadakar","hasini","John","Amar");
		
		// Strings starts with A
		Predicate<String> startsWithA = name -> name.startsWith("A");
		
		// Result that starts with A -- filter
		List<String> startsWithAResult = names.stream().filter(startsWithA).collect(Collectors.toList());
		System.out.println("Predicate and filter:"+startsWithAResult);
		
		// map -- to uppercase 
		Function<String, String> namesWithUpperCase = s -> s.toUpperCase();
		List<String> namesWithUpperCaseAResult = names.stream().map(namesWithUpperCase).collect(Collectors.toList());
		System.out.println("Function and map:"+namesWithUpperCaseAResult);
		
		// map -- with out Function interface 
		
		List<String> namesWithUpperCaseAResult2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Method Reference and map: "+namesWithUpperCaseAResult2);
		
		// sorted
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted(): "+sortedNames);
		
		// forEach
		names.stream().forEach(System.out::print);	
		System.out.println();
		names.stream().forEach(name -> System.out.print(name+" "));
		
		// Count 
		long count = names.stream().count();
		System.out.println("Count: "+count);
		
		// collect
		String joinedNames = names.stream().collect(Collectors.joining(","));
		System.out.println("Joined Names: "+joinedNames);
		
		// Find the name with minimum length
		String shortestName = names.stream().min((s1,s2)-> Integer.compare(s1.length(), s2.length())).orElse("No names");
		System.out.println("Shortest Name: "+ shortestName);
		
		// Find the name with maxium length
		String longestName = names.stream().max((s1,s2)-> Integer.compare(s1.length(), s2.length())).orElse("No names");
		System.out.println("Shortest Name: "+ longestName);
	
	}
}
