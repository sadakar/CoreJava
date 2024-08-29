package _crprepration;

import java.util.Arrays;
import java.util.List;

public class _007MethodReference_InstanceMethodRef_ArbitaryObj {

	public static void main(String args[]) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		words.forEach(System.out::println);
	}
}
