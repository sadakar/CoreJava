package _crfinalprep2;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference_ArbitaryObject_println {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Sadakar","Hasini","Goapl");
		
		names.forEach(System.out::println); // println is an instance method of an List arbitary object
	}
}
