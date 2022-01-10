import java.lang.Math;
/*
 *  Computes the future value of a given sum of money, invested over a given
 *  number of periods, at a given interest rate.
 *  Expects to get these values as three command-line arguments (int, int, double).
 */
public class FVCalc {
	public static void main(String[] args) {
		// Scanner reader = new Scanner(System.in);
		int currentAmount = Integer.parseInt(args[0]);
		double predictedInterest = Double.parseDouble(args[1]);
		int yearsToInvest = Integer.parseInt(args[2]);

		double amountWithProfits = currentAmount * Math.pow(1 + (predictedInterest / 100), yearsToInvest);

		String message = "After " + yearsToInvest + " years, " + "$" + currentAmount +
			" saved at " + predictedInterest + "% will yield " + "$" + amountWithProfits;
		System.out.println(message);
	}
}