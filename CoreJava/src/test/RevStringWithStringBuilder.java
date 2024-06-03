package test;

public class RevStringWithStringBuilder {

	public static void main(String args[]) {
		
		String str = "Sadakar";
		String str2 = new StringBuilder(str).reverse().toString();
		System.out.println(str2);
	}
}
