/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) { 
        String stringToCheck = args[0];
        System.out.println(lowerCase(stringToCheck));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String lowerCasedString = "";
        char[] newString = s.toCharArray();
        int numricDiff = 'a' - 'A';

		for (int i = 0; i < newString.length; i++) {
            if (newString[i] >= 'A' && newString[i] <= 'Z') {
                newString[i] += numricDiff;
			    lowerCasedString += newString[i];
            } else {
                lowerCasedString += newString[i];
            }
		}

        return lowerCasedString;
    }
}
