package logical;

public class String_ReverseAString_UsingStringBuilder {

	String str = "Welcome";
	String revString = new StringBuilder(str).reverse().toString();
	
	public static void main(String args[]) {
		
		String_ReverseAString_UsingStringBuilder  sb = new String_ReverseAString_UsingStringBuilder();
		System.out.println("String:"+sb.str);
		System.out.println("Reversed String:"+sb.revString);
	}
}
