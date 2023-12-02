package _inheritance;

/**
 * Inheritance in Java is a mechanism in which one object acquires all the
 * properties and behaviors of a parent object
 * 
 * <sub class> extends <super class>
 * 
 * Why do we use Inheritance ? To implement Method Overriding - run time polymorphism
 */
// super class
class Employee {
	float salary = 40000; // instance variable
}

// sub class extends super class 
class InheritanceBasicExample_Programmer extends Employee {

	int bonus = 10000; // instance variable

	public static void main(String args[]) {

		InheritanceBasicExample_Programmer p = new InheritanceBasicExample_Programmer();

		System.out.println("Programmer salary is " + p.salary);
		System.out.println("Programmer bonus is " + p.bonus);
	}
}
