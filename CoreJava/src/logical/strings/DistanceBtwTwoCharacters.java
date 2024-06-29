package logical.strings;
import java.util.*;
/**
 * https://www.glassdoor.co.in/Interview/find-out-distance-between-two-characters-in-a-string-QTN_2908941.htm
 * 
 * https://www.codeproject.com/Questions/1137024/How-to-find-the-distance-between-two-letters-Java
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class DistanceBtwTwoCharacters {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string next line:");
		String str =sc.nextLine();
		System.out.println("String is: "+str);
		char ch1 = str.charAt(1);
		char ch2 = str.charAt(9);
		int distance = str.indexOf(ch2)-str.indexOf(ch1);
		System.out.println(distance);
		

	}
}
