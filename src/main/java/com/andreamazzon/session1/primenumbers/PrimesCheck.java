package com.andreamazzon.session1.primenumbers;

/**
 * This class is used to check if a number is prime, by a simple for method with
 * an if statement
 *
 * @author: Andrea Mazzon
 */
public class PrimesCheck {

	boolean checkIfPrime(int numberToBeChecked) {
		for (int possibleDivisor = 2; possibleDivisor <= Math.sqrt(numberToBeChecked); possibleDivisor ++) {
			if (numberToBeChecked % possibleDivisor == 0) {
				return false;
			}
		}
		return true;
	}
}
