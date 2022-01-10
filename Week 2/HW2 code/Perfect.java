/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
    (30 points) A number is said to be perfect if it equals the sum of all its divisors. For example, the
	divisors of 6 are 1, 2, and 3, and 6 = 1 + 2 + 3. Therefore 6 is a perfect number. Write a program
	( perfect.java ) that takes an integer command-line argument value, say N, and checks if the
	number is perfect. Here are some examples of the program's execution:

	Test your program on, at least, the following numbers: 6, 24, 28, 496, 5002, 8128. Hint: four of
	these numbers are perfect. You can find a list of perfect numbers in the Internet, and use your
	program to verify that some of them are indeed perfect.

	Implementation tips: We suggest the following strategy. When you get a number, say 24, start
	by building the string " 24 is a perfect number since 24 = 1 ". Next, enter a loop that looks for
	all the divisors of 24. This loop can be identical to what you did in the Divisors program. When
	you find a divisor, append " + " and this divisor to the end of the string. At the end of the loop,
	you will know if 24 is indeed a perfect number. If so, print the string that you've constructed all
	along. If 24 is not a perfect number, ignore the string that you've constructed and print instead
	" 24 is not a perfect number ".
 */
public class Perfect {
	public static void main (String[] args) {
		int numToInspect = Integer.parseInt(args[0]);
		int divisor = 1;
		int divisorsSum = 0;
		String divisorsSumCalculation = "";

		while (numToInspect > divisor) {
			if (numToInspect % divisor == 0) {
				divisorsSum = divisorsSum + divisor;
				
				String stringedDivisor = "" + divisor;

				if (divisorsSumCalculation == "") {
					divisorsSumCalculation = divisorsSumCalculation + stringedDivisor;
				} else {
					divisorsSumCalculation = divisorsSumCalculation + " + " + stringedDivisor;
				}
			}

			divisor++;
		}

		String message = "";

		if (numToInspect == divisorsSum) {
			message = numToInspect + " is a perfect number since " + numToInspect + " = " + divisorsSumCalculation;
		} else {
			message = numToInspect + " is not a perfect number";
		}

		System.out.println(message);
	}
}
