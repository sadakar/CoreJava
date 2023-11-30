package inheritance;
/*
 * Runtime polymorphism or Dynamic Method Dispatch is a process in which 
 * a call to an overridden method is resolved at runtime rather than compile-time.
 */
class DRunTimePolymorphismParentBike {

	void run() {  // overridden method
		System.out.println("Running my bike");
	}
}
class DRunTimePolymorphismChildShine extends DRunTimePolymorphismParentBike{  // child class extends super class
	
	void run() { // overridden method
		System.out.println("Running my shine bike at 40 kmph");
	}
	
	public static void main(String args[]) {
		DRunTimePolymorphismChildShine p = new DRunTimePolymorphismChildShine();
		//p Parent class reference varaible 
		// new DRunTimePolymorphismChildShine() -- object of the sub class
		p.run(); // calling the overridden method using the parent class reference variable
	}
	

}

