/** Prints ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double s = Math.sqrt(3) / 2;
		// first triangle
		StdDraw.line(0, 0, 0.5 ,s);
		StdDraw.line(0.5, s, 1, 0);
		StdDraw.line(1, 0, 0 ,0);

				//  n  X1 X2  X3  Y1 Y2 Y3
		sierpinski (n, 0, 1, 0.5 ,0, 0, s);
	}
	
	public static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		// end of drawing rounds
		if (n == 0) {
			return;
		}

		// second triangle
		// left -> middle
		StdDraw.line((x1 + x3) / 2, (y1 + y3) / 2, (x2 + x3) / 2, (y2 + y3) / 2);
		// middle -> right 
		StdDraw.line((x2 + x3) / 2, (y2 + y3) / 2, (x1 + x2) / 2, (y1 + y2) / 2);
		// right -> left
		StdDraw.line((x1 + x2) / 2, (y1 + y2) / 2, (x1 + x3) / 2, (y1 + y3) / 2);

		sierpinski(n - 1, x1, (x1 + x2) / 2, (x1 + x3) / 2, y1, (y1 + y2) / 2, (y1 + y3) / 2);
		sierpinski(n - 1, (x1 + x2) / 2, x2, (x3 + x2) / 2, (y1 + y2) / 2, y2, (y3 + y2) / 2);
		sierpinski(n - 1, (x1 + x3) / 2, (x3 + x2) / 2, x3, (y1 + y3) / 2, (y3 + y2) / 2, y3);
	}
}
