/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 	(Basic version of the next program, no points) The divisors of a number are all the numbers that
 	divide it, including 1 and excluding the number itself. Write a program ( Divisors.java ) that gets
	a command-line argument (an int) and prints all the divisors of that number. Here are some
	examples of the program's execution:
 */
public class Divisors {
	public static void main (String[] args) {
		int numToInspect = Integer.parseInt(args[0]);
		int divisor = 1;
		while (numToInspect > divisor) {
			if (numToInspect % divisor == 0) {
				String message = "" + divisor;
				System.out.println(message);
			}

			divisor++;
		}
		
	}
}
