/* 
 * DWITE programming contest solutions
 * January 2006 - Problem 1: "Filling The Cone"
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite200601p1 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200601p1().run("DATA11.txt", "OUT11.txt");
	}
	
	
	protected void runOnce() {
		// Read input
		double h = io.readDoubleLine();
		double r = io.readDoubleLine();
		double v = io.readDoubleLine();
		
		// Compute and write output
		double x = Math.pow(3 * v * h * h / (3.1415926 * r * r), 1 / 3.0);  // Height of water
		io.printf("%.2f%n", x);
	}
	
}
