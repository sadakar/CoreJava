package _crprepration;

import java.util.function.Function;

public class _008FunctionalInterface_ApplyMethod {

	public static void main(String args[]) {
		
		// lambda expression to implment Function interface
		Function<String, Integer> strLength = (s) -> s.length();
		
		// Applying the function
		System.out.println(strLength.apply("Hello"));
	}
}

