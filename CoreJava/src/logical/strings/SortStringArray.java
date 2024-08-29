package logical.strings;
import java.util.*;
/**
 * 
 * https://www.javatpoint.com/how-to-sort-string-array-in-java
 * 
 * Sorting array
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class SortStringArray {

	public static void main(String args[]) {
		String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig", "Mulberry",  "Apple", "Plum",  "Orange", "Custard apple",  "Apricot"};
		
		Arrays.sort(countries);
		System.out.println(Arrays.toString(countries));
		
	}
}
