package logical.loops.patterns;
/**
 * 
 * @author Sadakar.Pochampalli
 * 
 * https://www.scientecheasy.com/2021/05/nested-for-loop-in-java.html/
 *
 */
public class PatternOfNumbers {
	public static void main(String args[]) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
