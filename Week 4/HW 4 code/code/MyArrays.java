
import java.util.Arrays;
public class MyArrays {

    // Two arrays, for testing purposes. Used by the testing methods in this class.
    private static final int[] a = { 2, 4, 2, 5};
    private static final int[] b = { 3, 6, 9};
	
	/** 
     * If every element in the array is greater than or equal to the previous element, returns true.
	 * Otherwise, returns false.
     */
	public static boolean isInIncreasingOrder(int[] arr) {
        boolean isInIncreasingOrder = true;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                isInIncreasingOrder = false;
            }
		}
        return isInIncreasingOrder;
    }

    /**
     * Returns an array whose elements consist of all the elements of arr1,
     * followed by all the elements of arr2.
     */
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] both = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, both, arr1.length, arr2.length);
        return both;
    }
	
	/** If the given array contains an element that appears more than once, returns true.
	 *  Otherwise, returns false. */
	public static boolean hasDuplicates(int[] arr) {
    	//// Replace the following statement with your code
        boolean duplicates = false;
        for (int firstCounter = 0; firstCounter < arr.length; firstCounter++) {
            for (int secondCounter = firstCounter + 1; secondCounter < arr.length; secondCounter++) {
                if (secondCounter != firstCounter && arr[secondCounter] == arr[firstCounter]) {
                    duplicates = true;
                }
            }
        }

        return duplicates;
    }

	// Prints the given int array​, and then prints an empty line.
	public static void println(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

    public static void main(String[] args) {
        System.out.print("Array a: "); println(a);
        System.out.print("Array b: "); println(b);
        //// Uncomment the test that you wish to execute
        testIsInIncreasingOrder();
		testConcat();
		testHasDuplicates();
	}

    private static void testIsInIncreasingOrder() {
        System.out.println();
        System.out.println("Array a is " + ((isInIncreasingOrder(a)) ? "" : "not ") + "in order");
		System.out.println("Array b is " + ((isInIncreasingOrder(b)) ? "" : "not ") + "in order");
	}

    private static void testConcat() {
        System.out.println();
        System.out.print("Concatenantion of a and b: "); println(concat(a, b));
	}
    	
    private static void testHasDuplicates() {
        System.out.println();
        System.out.println("Array a has " + ((hasDuplicates(a)) ? "" : "no ") + "duplicates");
		System.out.println("Array b has " + ((hasDuplicates(b)) ? "" : "no ") + "duplicates");
	}
}