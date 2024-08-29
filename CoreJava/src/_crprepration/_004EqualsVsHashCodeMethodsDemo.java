package _crprepration;
/**
 *  Both equals() and hasCode() are methods of Object class
 */
public class _004EqualsVsHashCodeMethodsDemo {

	public static void main(String args[]) {
		String name1 = "Sadakar";
		String name2 ="Sadakar";
		
		if(name1.equals(name2)) {
			System.out.println("name1 and name2 are equal varialbes");
			System.out.println("Hash values are:"+name1.hashCode()+" and "+name2.hashCode());
		}
		
		String name3="Hasini";
		String name4 ="Ram";
		if(!name3.equals(name4)) {
			System.out.println("name3 and name4 are not equal varialbes");
			System.out.println("Hash values are:"+name3.hashCode()+" and "+name4.hashCode());

		}
	}
	
}
