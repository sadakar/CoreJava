package comparator;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	/**
	 * The toString method in Java is used to provide a string representation of an
	 * object. This is particularly useful for debugging and logging, as it allows
	 * you to easily print out the state of an object.
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
