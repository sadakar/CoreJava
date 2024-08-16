package _crprepration;

import java.util.function.Supplier;

class Person3 {
	private String name;

	public Person3() {
		this.name = "Unkown";
	}

	public Person3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class _007ConstructorReference {

	public static void main(String[] args) {
		
		// Constructor reference with no arguments
		Supplier<Person3> personSupplier = Person3::new;
		Person3 person3 = personSupplier.get();
		System.out.println(person3.getName());
		
		// Constructor reference with arguments
		Supplier<Person3> personSupplierWithArg = () -> new Person3("Alice");
		Person3 person3WithArg = personSupplierWithArg.get();
		System.out.println(person3WithArg.getName());
	}
	
	
}
