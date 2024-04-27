package logical.strings;

public class ReverseAString_UsingStringBuilderClass {

	String str = "Welcome";
	String revString = new StringBuilder(str).reverse().toString();
	
	public static void main(String args[]) {
		
		ReverseAString_UsingStringBuilderClass  sb = new ReverseAString_UsingStringBuilderClass();
		System.out.println("String:"+sb.str);
		System.out.println("Reversed String:"+sb.revString);
	}
}
