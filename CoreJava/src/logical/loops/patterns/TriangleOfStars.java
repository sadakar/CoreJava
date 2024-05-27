package logical.loops.patterns;

import java.util.*;

/**
 * https://www.scientecheasy.com/2021/05/nested-for-loop-in-java.html/
 * 
 * Displaying a right triangle pattern of numbers
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class TriangleOfStars {

	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
