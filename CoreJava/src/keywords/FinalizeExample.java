package keywords;

/**
 * finalize() method : Prior to the garbage collection of an object the finalize
 * method is called so that the clean up activity is implemented.
 * 
 * @author Sadakar.Pochampalli
 *
 */

class MyClass {
    // Override the finalize() method for cleanup
    @SuppressWarnings("deprecation")
	@Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup or resource release code
            System.out.println("Finalizing MyClass object");
        } finally {
            // Call the finalize() method of the superclass
            super.finalize();
        }
    }
}
class FinalizeExample {
    public static void main(String[] args) {
        // Creating an object
        MyClass myObject = new MyClass();

        // Setting the reference to null, making the object eligible for garbage collection
        myObject = null;

        // Requesting garbage collection (Note: Explicitly calling System.gc() is generally discouraged)
        System.gc();
    }
}
