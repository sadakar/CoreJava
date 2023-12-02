package logical;

public class ReverseAString_UsingStringBuilder {

	String str = "Welcome";
	String revString = new StringBuilder(str).reverse().toString();
	
	public static void main(String args[]) {
		
		ReverseAString_UsingStringBuilder  sb = new ReverseAString_UsingStringBuilder();
		System.out.println("String:"+sb.str);
		System.out.println("Reversed String:"+sb.revString);
	}
}
