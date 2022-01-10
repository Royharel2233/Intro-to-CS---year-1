/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.

	(Almost final version, no points) Now write a program ( OneOfEachStats1.java ) that takes an
	integer command-line argument, say T. In each of T independent experiments, simulate a couple
	having children until they have at least one boy and one girl. Use the results of the T experiments
	to compute the average number of children that couples who follow this strategy end up having.
	In addition, compute how many couples had 2, 3, and 4 or more children. Finally, compute the
	most common number (also known in statistics as mode) of children in a family (if there is a tie,
	print only the first most common number of children). As before, assume that the probability of
	having a boy or a girl in each trial is 1/2. Here are some examples of the program's execution
	(your program will most likely generate other results, because of the randomness):

	Use a for loop for running the T simulations. In each iteration, execute the
	same logic as that of the OneOfEach program (copy-paste the code of OneOfEach into the code of
	OneOfEachStats ). Although it’s not required, we suggest keeping (at least some of) the print
	statements of OneOfEach , for debugging purposes. When you think that the OneOfEachStats
	program behaves well, you can eliminate, or comment out, these print statements.

	As T increases, we expect the average number of children per family to
	converge to a stable average. Run the program with T = 3, 10, 100, 100000 and 1000000, to
	watch how the average converges to a stable value.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		double numberOfExperiments = Double.parseDouble(args[0]);
		int tryNum = 1;
		int sumOfAllKids = 0;
		int parentsWith2kids = 0;
		int parentsWith3kids = 0;
		int parentsWith4orMorekids = 0;

		while (tryNum <= numberOfExperiments) {
			double numOfGirls = 0;
			double numOfBoys = 0;
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

			double numOfKids = numOfGirls + numOfBoys;

			if (numOfKids == 2) {
				parentsWith2kids++;
			} else if (numOfKids == 3) {
				parentsWith3kids++;
			} else if (numOfKids >= 4) {
				parentsWith4orMorekids++;
			}

			sumOfAllKids += numOfKids;
			tryNum++;
		}

		double average = sumOfAllKids / numberOfExperiments;
		String message2 = "Average: " + average + " children to get at least one of each gender.";
		System.out.println(message2);

		String message3 = "Number of families with 2 children: " + parentsWith2kids;
		System.out.println(message3);

		String message4 = "Number of families with 3 children: " + parentsWith3kids;
		System.out.println(message4);

		String message5 = "Number of families with 4 or more children: " + parentsWith4orMorekids;
		System.out.println(message5);

		String mostCommon = "";

		if (parentsWith2kids >= parentsWith3kids) {
			if (parentsWith2kids >= parentsWith4orMorekids) {
				mostCommon = "2";
			} else {
				mostCommon = "4 or more";
			}
		} else {
			if (parentsWith3kids >= parentsWith4orMorekids) {
				mostCommon = "3";
			} else {
				mostCommon = "4 or more";
			}
		}

		String message6 = "The most common number of children is " + mostCommon;
		System.out.println(message6);
	}
}
