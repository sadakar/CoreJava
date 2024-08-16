package _crfinalprep;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemoStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 6, 2, 9, 3, 9);

		// Optional is container object , it is a Class in java.util.package

		// sum
		Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

		// Print the result
		sum.ifPresent(System.out::println);

		// min
		Optional<Integer> minimum = numbers.stream().reduce(Integer::min);

		// Print the result
		minimum.ifPresent(System.out::println);

		// min
		Optional<Integer> maximum = numbers.stream().reduce(Integer::max);

		// Print the result
		maximum.ifPresent(System.out::print);
	}

}
