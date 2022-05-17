// main method outside the class
//We can have multiple classes in different Java files or single Java file.
package org.sadakar.corejava.objectandclass;

class Student2 {

	int id;// instance variable
	String name; // instance variable
}

class SudentMainMethodOutsideClass {

	public static void main(String args[]) {
		Student2 s = new Student2();
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
