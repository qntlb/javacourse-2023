package com.andreamazzon.session1.primenumbers;

/**
 * This class is used to check if a number is prime, by a simple for method with
 * an if statement
 *
 * @author: Andrea Mazzon
 */
public class PrimesCheck {

	boolean checkIfPrime(int numberToBeChecked) {

		for (int possibleDivisor = 2; possibleDivisor <= Math.sqrt(numberToBeChecked); possibleDivisor++) {
			if (numberToBeChecked % possibleDivisor == 0) {// only if statement, without else
				return false;// Note here another use of return: it ends the loop and the method
			}
		}
		return true;
	}

}
