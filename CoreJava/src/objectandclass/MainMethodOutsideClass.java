// main method outside the class
//We can have multiple classes in different Java files or single Java file.
package objectandclass;

class Student2 {

	int id;// instance variable
	String name; // instance variable
}

class MainMethodOutsideClass {

	public static void main(String args[]) {
		Student2 s = new Student2(); // new Student2() is the object and s is the reference variable
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
