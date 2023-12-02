package _inheritance;

/*
 * Runtime polymorphism or Dynamic Method Dispatch is a process in which 
 * a call to an overridden method is resolved at runtime rather than compile-time.
 */
// Super class -- Bike
class DRunTimePolymorphismParentBike {

	void run() { // overridden method
		System.out.println("Running my bike");
	}
}

// Sub class extends Super class
class InheritanceUsedFor_RunTimePolymorphism extends DRunTimePolymorphismParentBike { // child class extends super class

	void run() { // overridden method
		System.out.println("Running my shine bike at 40 kmph");
	}

	public static void main(String args[]) {
		InheritanceUsedFor_RunTimePolymorphism p = new InheritanceUsedFor_RunTimePolymorphism();// p sub class reference
																								// variable, and new
																								// DRunTimePolymorphismChildShine()
																								// is object of the sub
																								// class

		p.run(); // calling the overridden method and it is resolved at program run time
	}

}
