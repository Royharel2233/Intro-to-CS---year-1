/*
 *  Computes the root of the equation a * x + b = c.
 *  Expects to get a, b, c as three command-line arguments of type double.
 */
public class LinearEq {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double cMinusB = c - b;
		double cMinusBdividedByA = cMinusB / a;

		String firstMessage = a + " * x + " + b + " = " + c;
		System.out.println(firstMessage);

		String secondMessage = "X = " + cMinusBdividedByA;
		System.out.println(secondMessage);
	}
}