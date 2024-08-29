package _crfinalprep2;

import java.util.function.Function;

public class StaticMethodReference_FunctionInterface_parseInt {

	public static void main(String[] args) {

		// Parse String to integer
		/**
		 * Function<T, R>: Represents a function that accepts one argument and produces
		 * a result.
		 * 
		 * Method: R apply(T t)
		 */
		Function<String, Integer> parseStringToInteger = Integer::parseInt; // parseInt is a static method 
		Integer number = parseStringToInteger.apply("123");
		System.out.println(number);
	}
}
