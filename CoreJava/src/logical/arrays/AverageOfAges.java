package logical.arrays;

public class AverageOfAges {

	public static void main(String args[]) {
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		float avg, sum=0;
		
		int length = ages.length;
		
		for(int i : ages) {
			sum = sum + i;
		}
		avg = sum/length;
		System.out.println("Avg age="+avg);
	}
}
