/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 	Use the string functions str.length() and str.charAt( i ) . You can read
	about them by consulting the String class API (search the Internet for “ java 16 string ”). The
	program can be implemented using either a for loop that goes backward, or a while loop that
	goes backward. Implement the program using a for loop. Then write a second implementation
 */
public class Reverse {
	public static void main (String[] args){
		String stringToCheck = args[0].toString();
		String reveredString = "";
		String middleChar = "";

		for (int i = stringToCheck.length() - 1; i >= 0; i--) {
			reveredString = reveredString + stringToCheck.charAt(i);
		}

		if (stringToCheck.length() % 2 == 0) {
			middleChar = middleChar + stringToCheck.charAt((stringToCheck.length() / 2) - 1);
		} else {
			middleChar = middleChar + stringToCheck.charAt((stringToCheck.length() / 2));
		}

		System.out.println(reveredString);
		String message = "The middle character is " + middleChar;
		System.out.println(message);
	}
}
