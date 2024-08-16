package _crpreparation_java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_ListFiltering_StartsWithA {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		List<String> result = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println(result);
	}
}
