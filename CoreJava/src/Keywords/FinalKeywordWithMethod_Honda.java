package Keywords;

/**
 * final : is used to restrict the user
 * 
 * final keyword is applied with variables, methods and classes
 * 
 * variables -- can not change the value of final variable (i.e., constant)
 * 
 * methods -- can not override the final methods
 * 
 * classes -- can not extend the final class
 * 
 * @author Sadakar.Pochampalli
 *
 */
// Super class -- Bike
class Bike2 {

	// run() method is final and it can not be overriden in sub class
	final void run() {
		System.out.println("Bike is Running");
	}
}
// Sub class -- Honda
class FinalKeywordWithMethod_Honda extends Bike2 {

	// enable below code to see compile error
	/*
	 * void run() { System.out.println("Running with 100 kmph"); }
	 */
	public static void main(String[] args) {
		FinalKeywordWithMethod_Honda h = new FinalKeywordWithMethod_Honda();
		h.run();
	}

}
