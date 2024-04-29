package logical.input.output;
import java.util.*;
/**
 * The Scanner class is used to get user input, and it is found in the java.util package.
 * @author Sadakar.Pochampalli
 *
 * Reference: https://www.qafox.com/java-for-testers-interview-questions-and-answers-part-1/
 */
public class InputsFromScannerClass {

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name in next line");
	String name =sc.nextLine();
	System.out.println("Name="+name);
	System.out.println("Enter age in next line");
	String age=sc.nextLine();
	System.out.println("Age="+age);
	}
}
