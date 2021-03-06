import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);

		double numberOfExperiments = Double.parseDouble(args[0]);
		int tryNum = 1;
		int sumOfAllKids = 0;
		int parentsWith2kids = 0;
		int parentsWith3kids = 0;
		int parentsWith4orMorekids = 0;

		while (tryNum <= numberOfExperiments) {
			double numOfGirls = 0;
			double numOfBoys = 0;

			while (numOfGirls == 0 || numOfBoys == 0 || numOfBoys < 1 || numOfGirls < 1) {
				double theRandom = generator.nextDouble();
				String boyOrGirl = theRandom > 0.5 ? "b" : "g";

				if (boyOrGirl == "b") {
					numOfBoys++;
				} else {
					numOfGirls++;
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

		String message6 = "The most common number of children is " + mostCommon + ".";
		System.out.println(message6); 
	}
}
