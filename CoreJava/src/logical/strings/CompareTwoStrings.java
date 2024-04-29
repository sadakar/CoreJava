package logical.strings;
/**
 * 
 * @author Sadakar.Pochampalli
 *
 *
 */
import java.util.*;
public class CompareTwoStrings {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two stings");
		String str1 = sc.next();
		String str2=sc.next();
		//System.out.println("Comparision of Strings");
		
		if(str1.compareTo(str2)==0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}
}
