
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.

	(Basic version of the next program, no points) Some couples have a strong sense of balance:
	They keep having children until they have at least one boy and at least one girl. Write a program
	( OneOfEach.java ) that simulates this behavior. Assume there is an equal probability (0.5) of
	having either a boy or a girl in each birth. Here are some examples of the program's execution:

	The logic of this program is similar to that of the Perefect program. Think
	about how you want to terminate the loop – there are several ways to do it.
	Play with (execute) the program about 20-30 times, and get a feeling about the statistical results
	of this family building strategy. Note that each run simulates how a family a formed.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int numOfGirls = 0;
		int numOfBoys = 0;
		String bOrGstring = "";
		while (numOfGirls == 0 || numOfBoys == 0 || numOfBoys < 1 || numOfGirls < 1) {
			String boyOrGirl = Math.random() > 0.5 ? "b" : "g";
			if (boyOrGirl == "b") {
				numOfBoys++;
			} else {
				numOfGirls++;
			}

			if (bOrGstring == "") {
				bOrGstring += boyOrGirl;
			} else {
				bOrGstring = bOrGstring + " " + boyOrGirl;
			}
		}

		int numOfKids = numOfGirls + numOfBoys;
		String message = "You made it... and you now have " + numOfKids + " children.";

		System.out.println(bOrGstring);
		System.out.println(message);
	}
}
