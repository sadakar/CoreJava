package _inheritance;

/*
 * If the reference variable of Parent class refers to the object of Child class, 
 * it is known as up-casting.
 */
// super class
class UpCasting_ParentClassReferenceVariable_SubClassObject {  

}

// sub class
class CWhatIsUpCastingSubClass extends UpCasting_ParentClassReferenceVariable_SubClassObject { // sub class extending super class

	UpCasting_ParentClassReferenceVariable_SubClassObject p = new CWhatIsUpCastingSubClass();
	
	//p is the reference variable of super/parent class
	//new CWhatIsUpCastingSubClass() is the object created for sub/child class
}
