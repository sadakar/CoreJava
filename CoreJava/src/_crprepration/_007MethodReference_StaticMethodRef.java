package _crprepration;

import java.util.function.Function;

public class _007MethodReference_StaticMethodRef {

	public static void main(String args[]) {
		
		Function<String, Integer> parseInt = Integer::parseInt;
		Integer number = parseInt.apply("123");
		System.out.println(number);
	}
}
