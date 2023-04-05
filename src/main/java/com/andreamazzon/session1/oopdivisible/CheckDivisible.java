package com.andreamazzon.session1.oopdivisible;

/**
 * This class is used to check if an integer is divisible by another integer, by
 * a classic if/else loop
 *
 * @author Andrea Mazzon
 */
public class CheckDivisible {

	int dividend = 10;
	int divisor = 2;

	void check() {
		if (dividend % divisor == 0) {
			System.out.println(dividend + " is divisible by " + divisor);
		} else {
			System.out.println(dividend + " is not divisible by " + divisor);
		}
	}
	
}
