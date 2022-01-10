
/**
 *  Gets three command-line arguments (int values). If the values are strictly
 *  ascending or strictly descending, prints true. Otherwise prints false.
 */
public class Ordered {
	public static void main (String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int third = Integer.parseInt(args[2]);

		Boolean isAscending = third > second && second > first;
		Boolean isDescending = third < second && second < first;

		if (isAscending == true || isDescending == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
