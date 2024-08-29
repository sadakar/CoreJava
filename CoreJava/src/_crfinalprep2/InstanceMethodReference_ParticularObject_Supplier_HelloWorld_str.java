package _crfinalprep2;

import java.util.function.Supplier;

public class InstanceMethodReference_ParticularObject_Supplier_HelloWorld_str {

	/**
	 * Supplier<T>: Represents a supplier of results.
	 * 
	 * Method: T get()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String str ="Hello World";
		Supplier<Integer> lengthOfString = str::length; // length is an instance method of String object
		System.out.println(lengthOfString.get());
	}
}
