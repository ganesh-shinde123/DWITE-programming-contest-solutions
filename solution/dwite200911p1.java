/* 
 * DWITE programming contest solutions
 * November 2009 - Problem 1: "Angles"
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite200911p1 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200911p1().run("DATA1.txt", "OUT1.txt");
	}
	
	
	protected void runOnce() {
		io.tokenizeLine();
		int x1 = io.readIntToken();
		int y1 = io.readIntToken();
		int x2 = io.readIntToken();
		int y2 = io.readIntToken();
		double angle1 = Math.atan2(y1, x1);
		double angle2 = Math.atan2(y2, x2);
		double diff = angle1 - angle2;
		if (diff < 0)
			diff += Math.PI * 2;
		io.printf("%.1f%n", Math.toDegrees(diff));
	}
	
}
