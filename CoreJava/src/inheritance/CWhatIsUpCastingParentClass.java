package inheritance;

/*
 * If the reference variable of Parent class refers to the object of Child class, 
 * it is known as upcasting.
 */
// super class
class CWhatIsUpCastingParentClass {  

}

// sub class
class CWhatIsUpCastingSubClass extends CWhatIsUpCastingParentClass { // sub class extending super class

	CWhatIsUpCastingParentClass p = new CWhatIsUpCastingSubClass();
	
	//p is the reference variable of super/parent class
	//new CWhatIsUpCastingSubClass() is the object created for sub/child class
}
