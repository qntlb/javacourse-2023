package com.andreamazzon.session1.primenumbers;

/**
 * This class is used to check if a number is prime
 *
 * @author: Andrea Mazzon
 */
public class PrimesTest {

	public static void main(String[] args) {
		
		int numberToBeChecked = 31;

		PrimesCheck checker = new PrimesCheck();

		boolean result = checker.checkIfPrime(numberToBeChecked);

		System.out.println("Is the number " + numberToBeChecked + " prime? " + result);
	}
}
