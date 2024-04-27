package keywords;

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
// class with final keyword

// enable below code of FinalKeywordWithClassBike class and disable the code of FinalKeywordWithClassBike class

//final class Bike {
class Bike { // Super class -- Bike 
}

class FinalKeyword_Class_Honda extends Bike { // Sub class -- Honda
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		FinalKeyword_Class_Honda honda = new FinalKeyword_Class_Honda();
		honda.run();
	}
}
