package _crfinalprep2;

// Custom expcption 
class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
	}
}

class Student {

	String name;
	int age;

	public Student(String name, int age) throws InvalidAgeException {

		if (age < 0 || age > 150) {
			throw new InvalidAgeException("Age is less than 0 or greater thann 150");
		}

		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
}

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {

		try {
			Student s = new Student("Sadakar", 151);
			s.display();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
