/*
 *  Expresses a given quantity of cents as a number of quarter coins and cent coins.
 *  Expects to get the cents quantity as a command-line argument of type int.
 */
public class Coins {
	public static void main(String[] args) {
		int QUARTER = 25;

		int fullAmount = Integer.parseInt(args[0]);
		int leftOverCents = fullAmount % QUARTER;

		String message = "Use " + fullAmount / QUARTER + " quarters and " + leftOverCents + " cents";
		System.out.println(message);
	}
}