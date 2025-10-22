package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q01 {

	public static void recursiveCarpet ( double xCtr , double yCtr , double halfLength ) {
		if (halfLength < 0.0005) {
			return;  // abandon recursion
		}

		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledSquare(xCtr, yCtr, halfLength);
		
		recursiveCarpet(xCtr - 1.5 * halfLength, yCtr - 1.5 * halfLength, halfLength/4);
		recursiveCarpet(xCtr + 1.5 * halfLength, yCtr - 1.5 * halfLength, halfLength/4);
		recursiveCarpet(xCtr - 1.5 * halfLength, yCtr + 1.5 * halfLength, halfLength/4);
		recursiveCarpet(xCtr + 1.5 * halfLength, yCtr + 1.5 * halfLength, halfLength/4);
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion

		double halfCarpetLength = 0.25;
		recursiveCarpet(0.5, 0.5, halfCarpetLength);
	}

}