/* 
 * DWITE programming contest solutions
 * October 2004 - Problem 5: "Super Long Sums"
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */

import java.math.BigInteger;


public final class dwite200410p5 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200410p5().run("DATA5", "OUT5");
	}
	
	
	protected void runOnce() {
		String x = io.readLine();
		String y = io.readLine();
		io.println(new BigInteger(x).add(new BigInteger(y)).toString());
	}
	
	
	// Honest method
	@SuppressWarnings("unused")
	private static String add(String x, String y) {  // x and y each must have at least 1 digit
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for (int i = 0; i < x.length() || i < y.length(); i++) {
			int sum = carry;
			if (i < x.length()) sum += x.charAt(x.length() - 1 - i) - '0';  // Reversed indexing
			if (i < y.length()) sum += y.charAt(y.length() - 1 - i) - '0';  // Reversed indexing
			sb.append(sum % 10);
			carry = sum / 10;
		}
		if (carry > 0)
			sb.append(carry);
		return sb.reverse().toString();
	}
	
}
