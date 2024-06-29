package _enum;

/**
 * 
 * @author Sadakar.Pochampalli
 * 
 *         an enum (short for "enumeration") is a special data type that
 *         represents a fixed set of constants. Enums are used to define a
 *         collection of related constants with a meaningful name. Enum
 *         constants are implicitly public, static, and final, making them
 *         constants in the true sense.
 *
 */
public class EnumOrEnumeration {

	public enum Day {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}

	public static void main(String args[]) {

		// Display an enum value
		System.out.println("Display a single value");
		Day today = Day.Sunday;
		System.out.println(today);

		// Iterate through enum
		System.out.println("\nDisplay enum values");
		for (Day d : Day.values()) {
			System.out.println(d);
		}
	}
}
