package _crprepration;

import java.util.function.Supplier;

public class _007MethodReference_InstanceMethodRef {

	public static void main(String args[]) {
		String str = "Hello World";
		Supplier<Integer> stringLength = str::length;
		System.out.println(stringLength.get());
	}
}
