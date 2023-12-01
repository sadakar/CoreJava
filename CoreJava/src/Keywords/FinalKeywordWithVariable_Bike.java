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
public class FinalKeywordWithVariable_Bike {

	// speed limit of bike with 90 kmph -- instance variable
	final int speedlimit = 90;

	// in run() method trying to change the value of speedlimit which can not be
	// done and results in compile time error.
	void run() {
		
		// enable below line so you would see compilation error
		//speedlimit = 400;
		System.out.println("speedlimit="+speedlimit);
	}

	public static void main(String args[]) {
		FinalKeywordWithVariable_Bike b = new FinalKeywordWithVariable_Bike();
		b.run();
	}
}
