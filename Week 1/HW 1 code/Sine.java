/*
 *  Prints a few values of the Sine function
 */
public class Sine {
	public static void main (String[] args) {
		double QUARTER = 0.25;

		String message = "sine(0)      =" + Math.sin(0);
		System.out.println(message);

		String message1 = "sine(1/4 PI) =" + Math.sin(QUARTER * Math.PI);
		System.out.println(message1);

		String message2 = "sine(2/4 PI) =" + Math.sin(2 * QUARTER * Math.PI);
		System.out.println(message2);

		String message3 = "sine(3/4 PI) =" + Math.sin(3 * QUARTER * Math.PI);
		System.out.println(message3);

		String message4 = "sine(4/4 PI) =" + Math.sin(4 * QUARTER * Math.PI);
		System.out.println(message4);

		String message5 = "sine(5/4 PI) =" + Math.sin(5 * QUARTER * Math.PI);
		System.out.println(message5);

		String message6 = "sine(6/4 PI) =" + Math.sin(6 * QUARTER * Math.PI);
		System.out.println(message6);

		String message7 = "sine(7/4 PI) =" + Math.sin(7 * QUARTER * Math.PI);
		System.out.println(message7);

		String message8 = "sine(8/4 PI) =" + Math.sin(8 * QUARTER * Math.PI);
		System.out.println(message8);
	}
}