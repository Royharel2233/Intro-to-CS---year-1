/** Reads a command line string and checks if it's a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	public static boolean isPalindrome(String s) {
		int n = s.length();   
        if (n == 0 || n == 1) {
            return true;
		} else {
			if (s.charAt(0) == s.charAt(n - 1)) {
				return isPalindrome(s.substring(1, n - 1));
			}
		}

		return false;
    }
}