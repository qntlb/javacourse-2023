package com.andreamazzon.session1.oopdivisible;

/**
 * This class tests if an integer is divisible by another integer
 *
 * @author Andrea Mazzon
 */
public class MainDivisible {

	public static void main(String[] args) {

		CheckDivisible checker = new CheckDivisible();
	
		checker.dividend = 15;
		checker.divisor = 4;

		checker.check();	
		}
}
