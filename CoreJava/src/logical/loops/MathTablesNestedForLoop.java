package logical.loops;
import java.util.*;
public class MathTablesNestedForLoop {

	public static void main(String args[]) {
		
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
}
