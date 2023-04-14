package com.andreamazzon.session2.power;

/**
 * This class gives an example of method overloading: computePower has two
 * arguments, the base and the exponent. If the exponent is an int no problem,
 * we just print the result. If the exponent is a double, we can get problems if
 * the base is negative. If we just use Math.pow, we get NaN. Then we want to
 * warn the user if this is the case. So we distinguish the two types of
 * implementation (the one when the exponent is int and the one when the
 * exponent is double) by Overloading.
 *
 * @author Andrea Mazzon
 */
public class Power {

	double result; // only definition, not initialization

	
	/**
	 * It computes and prints base to the power of exponent, when exponent is
	 * integer, so there are no problems if base is negative.
	 *
	 * @param base
	 * @param exponent
	 */
	void computePower(double base, int exponent) {
		//your code here
		result = Math.pow(base, exponent);// note: Java method
		System.out.println("Computing " + base + " to the power of " + exponent + ". The result is " + result);
	}

	/**
	 * It computes and prints base to the power of exponent, when exponent is
	 * double, so there can be problems if base is negative.
	 *
	 * @param base
	 * @param exponent
	 */
	void computePower(double base, double exponent) {
		// we distinguish the two cases
		if (base >= 0 || exponent == Math.floor(exponent)) {
			result = Math.pow(base, exponent);
			System.out.println("Computing " + base + " to the power of " + exponent + ". The result is " + result);
		} else {
			// we warn the user!
			System.out.println("Computing " + base + " to the power of " + exponent
					+ ". You get a complex number: is that what you want?");
		}
	}

	
}