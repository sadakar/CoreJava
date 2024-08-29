package logical.arrays;

public class MergingIntegerArrays {

	public static void main(String args[]) {

		// arrays
		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60 };

		// lengths of arrays
		int aLen = a.length;
		int bLen = b.length;

		// length for result array
		int cLen = aLen + bLen;

		// new array for result of merge
		int c[] = new int[cLen];

		// store a array values in c
		for (int i = 0; i < aLen; i++) {
			c[i] = a[i];
		}

		// a array length is added with index i so it adds b array to result array
		for (int i = 0; i < bLen; i++) {
			c[aLen + i] = b[i];
		}

		// print c array
		for (int num : c) {
			System.out.print(num + " ");
		}
	}
}
