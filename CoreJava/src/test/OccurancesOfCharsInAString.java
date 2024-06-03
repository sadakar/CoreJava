package test;

public class OccurancesOfCharsInAString {

	public static void main(String args[]) {
		String string ="Welcomeeeeee";
		char ch='e';
		int count=0;
		for(int i=0;i<=string.length()-1;i++) {
			if(string.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
	}
}
