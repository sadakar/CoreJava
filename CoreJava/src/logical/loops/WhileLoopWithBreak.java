package logical.loops;

/**
 * 
 * @author Sadakar.Pochampalli
 *  Usage of break statement in While loop
 */
import java.util.*;

public class WhileLoopWithBreak {

	public static void main(String[] args) {
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            if (number < 0.0) {
                break;
            }
            sum = sum+number;
        }
        System.out.println("Sum = " + sum);
    }
}
