package org.sadakar.corejava.inheritance;

/*
 * Inheritance in Java is a mechanism in which 
 * one object acquires all the properties and behaviors of a parent object
 * 
 * Why do we use Inheritance ? 
 * Method Overriding - run time polymorphism
 * 
*/
// super class
class Employee{
	float salary=40000; // instance variable
}
// sub class extends super class 
class AInheritanceBasicExampleProgrammer extends Employee {
	
	int bonus=10000; // instance variable
	
	public static void main(String args[]) {
		
		AInheritanceBasicExampleProgrammer p = new AInheritanceBasicExampleProgrammer();
		
		System.out.println("Programmer salary is "+p.salary);
		System.out.println("Programmer bonus is "+p.bonus);
	}
}
