package logical.strings;

/**
 * A string is a palindrome if its value is the same when reversed.
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class CheckAStringIsPolindrome {

	public static void main(String args[]) {
		String str = "aba";
		int i=0;
		int j=str.length()-1;
		char[] revString = new char[j+1];
		while(i<=j) {
			revString[j]=str.charAt(i);
			revString[i]=str.charAt(j);
			i++;
			j--;
		}
		System.out.println(revString);
		String str2 = new String(revString); // making char array as a String
		System.out.println(str2);
		if(str.equals(str2)) {
			System.out.println("Given string is a palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}
		
	}

}
