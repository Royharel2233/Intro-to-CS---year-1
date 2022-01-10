/*
 *  Generates three random integers in the range [a,b), 
 *  and prints the minimal value that was generated.
 *  Expects to get a, b as command-line arguments of type int.
 */
public class Gen3 {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);

		int randomInt1 = (int)Math.floor(Math.random() * (max-min)+min);
		String message = randomInt1 + "";
		System.out.println(message);

		int randomInt2 = (int)Math.floor(Math.random() * (max-min)+min);
		String message1 = randomInt2 + "";
		System.out.println(message1);

		int randomInt3 = (int)Math.floor(Math.random() * (max-min)+min);
		String message2 = randomInt3 + "";
		System.out.println(message2);

		int theMin = Math.min(Math.min(randomInt1, randomInt2), randomInt3);
		String message3 = "The minimal generated number was " + theMin;
		System.out.println(message3);
	}
}