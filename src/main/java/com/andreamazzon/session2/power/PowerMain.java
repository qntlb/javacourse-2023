package com.andreamazzon.session2.power;

/**
 * This class is used by an user in order to get the result of an
 * exponentiation. If the base is a negative number and the exponent a double,
 * the user will be warned that the result is a complex number.
 *
 * @author Andrea Mazzon
 */
public class PowerMain {

	public static void main(String[] args) {
		Power powerCalculator = new Power();
		double base = - 3.2; // negative number!
		int intExponent = 2;
		double doubleExponent = 2.5;
		powerCalculator.computePower(base, intExponent);// everything fine: the arguments are double, int
		// the arguments are now double, double: the result can be a complex number
		powerCalculator.computePower(base, doubleExponent);
	}
}
