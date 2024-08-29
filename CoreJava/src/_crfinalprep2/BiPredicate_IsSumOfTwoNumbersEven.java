package _crfinalprep2;

import java.util.function.BiPredicate;

public class BiPredicate_IsSumOfTwoNumbersEven {

	public static void main(String[] args) {
		
		// BiPredicate to check if the sum of two numbers is even
		BiPredicate<Integer, Integer> isSumEven = (a,b) -> ((a+b) %2 == 0);
		
		System.out.println(isSumEven.test(10, 20));
		System.out.println(isSumEven.test(11, 20));
	}
}
