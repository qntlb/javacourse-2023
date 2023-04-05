package com.andreamazzon.session2.divisions;

/**
 * This class offers a very simple example of the fact that a static method can
 * be called without constructing an object of the class where the method is
 * defined. We have seen that it is not tied to the specific state of the
 * objects of the class where it is defined. We show the difference with a non
 * static method.
 *
 * @author Andrea Mazzon
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {

		double dividend = 5.2;
		double divisor = 2;

		/*
		 * Calling the constructor for our value of dividend we give a value to the
		 * dividend field of our new object, SPECIFICALLY FOR THIS OBJECT
		 */
		Calculator firstCalculator = new Calculator(dividend);

		/*
		 * This method depends on the value of the field dividend, i.e., on the state of
		 * the object calling the method
		 */
		double firstNonStaticResult = firstCalculator.divideBy(divisor);

		System.out.println("The result of the first division, where the dividend is " + dividend + " and the divisor "
				+ divisor + ", is " + firstNonStaticResult);

		double secondDividend = 4.2;

		//new object, new value of the field number, new result returned by the method
		Calculator secondCalculator = new Calculator(secondDividend);

		double secondNonStaticResult = secondCalculator.divideBy(divisor);

		System.out.println("The result of the second division, where the dividend is " + secondDividend
				+ " and the divisor still " + divisor + ", is " + secondNonStaticResult);

		/*
		 * Now static method: these are values passed to the method, which does not depend on the values of non static
		 * fields of the class.
		 */
		double newDividend = 4.5;
		double newDivisor = 1.5;

		// note: to call this static method we don't have to construct a specific object of the class
		double result = Calculator.computeRatio(newDividend, newDivisor);// called just by typing the name of the class

		System.out.println("The ratio of " + newDividend + " and " + newDivisor + " is " + result);
	}
}
