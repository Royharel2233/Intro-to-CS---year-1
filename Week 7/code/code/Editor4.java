import java.awt.Color;

/**
 * Demonstrates the morphing service of Instush.java with a grayscaled image of the source. 
 * The program recieves two command-line arguments: the name of a PPM file
 * that represents the source image (a string) and the number of morphing steps (an int). 
 * For example:
 * java Editor4 ironman.ppm 300
 */
public class Editor4 {

	public static void main (String[] args) {
		String fileName1 = args[0];
		int numOfSteps = Integer.parseInt(args[1]);
		Color[][] image = Instush.read(fileName1);

		Instush.morph(image, Instush.greyscaled(image), numOfSteps);
	}
}
