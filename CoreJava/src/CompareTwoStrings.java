import java.util.*;
public class CompareTwoStrings {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1 = sc.next();
		String str2 = sc.next();
		if(str1.compareTo(str2)==0) {
			System.out.println("Same strings");
		}else {
			System.out.println("Different strings");
		}
	}
}
