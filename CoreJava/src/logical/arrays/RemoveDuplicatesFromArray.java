package logical.arrays;
import java.util.*;
/**
 * 
 * @author Sadakar.Pochampalli
 * Convert arry to set
 * Print set elements -- Set doesn't allow duplicate values
 */
public class RemoveDuplicatesFromArray {

	public static void main(String args[]) {
		
	        int[] array = {1, 3, 2, 1, 4, 1};
	        
	        System.out.println("Array Elements");
	        for(int num:array) {
	        	System.out.print(num);
	        }
	        
	        System.out.println("\nConvert array to set");
	        // Convert array to a Set to remove duplicates
	        Set<Integer> set = new HashSet<>();
	        for (int num : array) {
	            set.add(num);
	        }

	        System.out.print(set+"\n");

	        // Display set elements
	        System.out.println("Set elements");
	        Iterator itr = set.iterator();
	        while(itr.hasNext()) {
	        	System.out.print(" "+itr.next());
	        }
		
	    }
				
}
