package collections;
import java.util.*;
/**
 *  Count Number of elements that starts character B in ArrayList
 * @author Sadakar.Pochampalli
 *
 */
public class CountElementsStartsWithBInArrayList {

	public static void main(String args[]) {
		List<String> list = new ArrayList<>(Arrays.asList("Banana","Orange","Banana","Grape","Berry","Apple"));
		System.out.println(list);
		
		int count=0;
		char targetChar;
		for(String ele : list) {
			if(ele.startsWith("B")) {
				count++;
			}
		}
		System.out.println("No. Of elements that starts with character B="+count);
	}
}
