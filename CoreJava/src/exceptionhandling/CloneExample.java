package exceptionhandling;

/**
 * Example 4: Cloneable Interface and Cloning
 * 
 * Cloning in Java is done using the clone() method from the Object class, which
 * creates a copy of the object. To use clone(), a class must implement the
 * Cloneable interface.
 */
class Person implements Cloneable {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Overriding the clone() method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}

}

public class CloneExample {
	public static void main(String[] args) {
		try {
			Person p1 = new Person("John", 30);
			Person p2 = (Person) p1.clone();

			System.out.println("Original: " + p1);
			System.out.println("Clone: " + p2);

			p2.name = "Sadakar";
			p2.age = 36;
			System.out.println("After modifying clone:");
			System.out.println("Original: " + p1);
			System.out.println("Clone: " + p2);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
