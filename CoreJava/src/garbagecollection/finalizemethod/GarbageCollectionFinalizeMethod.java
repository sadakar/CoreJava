package garbagecollection.finalizemethod;

/**
 * https://www.geeksforgeeks.org/garbage-collection-java/
 * 
 * @author Sadakar.Pochampalli
 *
 */
public class GarbageCollectionFinalizeMethod {

	public static void main(String args[]) {
		String str = new String("Sadakar"); // A heap memory is allocated for the string
		str = null;// before destroying heap memory making string as null
		System.gc();// Calling garbage collecor

	}
	public void finalize() {
		System.out.println("Calling finalize method before cleaning up memory usign Garbage Collector");
	}
}
