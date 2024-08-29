package _crprepration;

// Define custom checked exception
@SuppressWarnings("serial")
class InvalidAgeException extends Exception { // Extending exception class
	public InvalidAgeException(String message) { // Constructor to pass message
		super(message);
	}
}
// Class that uses custom exception
class Person{
	private String name;
	private int age;
	public Person(String name, int age) throws InvalidAgeException{
		if(age<0 || age > 150) {
			throw new InvalidAgeException("Age must be between 0 and 150");
		}
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("Name:"+name+"Age:"+age);
	}
}
public class _003CustomOrUserDefinedException_PersonAge {

	public static void main(String[] args) {
		try {
			Person person = new Person("Alice", 151); // this should throw an exception
			person.display();
		}catch(InvalidAgeException e) {
			System.out.println("Exception caught:"+e.getMessage());
		}
	}
}
