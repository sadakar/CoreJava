package logical.strings;

/*
 * https://www.baeldung.com/java-count-chars#:~:text=Let's%20start%20with%20a%20simple,%7D%20assertEquals(2%2C%20count)%3B
 */
public class CountOccurancesOfACharInString {

	public static void main(String args[]) {
	String str ="elephant"; // note that E and e are case sensitive
	char ch = 'e'; // find how many times e is repeated 
	int count = 0 ;
	
	for(int i=0;i<str.length();i++) {  // find the length of the string
		
		if(str.charAt(i)==ch) {
			count++;
		}
	}
	System.out.println("Character e is repeated for : "+count+" times");
}	
}
	
