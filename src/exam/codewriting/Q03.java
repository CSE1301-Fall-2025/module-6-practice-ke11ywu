package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q03 {

	public static void boxy ( double xCtr , double yCtr , double halfLength ) {
		//your code here
		if (halfLength < 0.005){
			return;
		}
		StdDraw.setPenColor(0, 0,0);
		StdDraw.square(xCtr, yCtr, halfLength);

		boxy(xCtr - halfLength, yCtr - halfLength, halfLength / 2);
		boxy(xCtr + halfLength, yCtr - halfLength, halfLength / 2);
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image02.png" in the images folder.

		//Your solution must use recursion

		boxy (0.5 , 0.5 , 0.25);
	}

}
