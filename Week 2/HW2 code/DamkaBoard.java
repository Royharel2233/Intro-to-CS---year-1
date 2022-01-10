/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int boardSize = Integer.parseInt(args[0]);
		String astStrart = "";
		String spaceStart = "";

		for (int i=0; i<boardSize * 2; i++) {
			if (i % 2 == 0) {
				astStrart += "* ";
			} else {
				spaceStart += " *";
			}
		}

		for (int i=0; i<boardSize; i++) {
			System.out.println(i % 2 == 0 ? astStrart : spaceStart);      
		}
	}
}
