package org.sadakar.corejava.inheritance;

/*
 * If the reference variable of Parent class refers to the object of Child class, 
 * it is known as upcasting.
 */
class CWhatIsUpCastingParentClass {  // super class 

}

class CWhatIsUpCastingSubClass extends CWhatIsUpCastingParentClass { // sub class extending super class

	CWhatIsUpCastingParentClass p = new CWhatIsUpCastingSubClass();
	
	//p is the reference variable of super/parent class
	//new CWhatIsUpCastingSubClass() is the ojbect created for sub/child class
}
