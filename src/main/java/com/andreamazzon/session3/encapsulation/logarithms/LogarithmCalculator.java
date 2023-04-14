package com.andreamazzon.session3.encapsulation.logarithms;

import com.andreamazzon.session3.useful.Print;

/**
 * This class illustrates an use of encapsulation, i.e., wrapping data and
 * methods within classes in combination with access control.
 * In particular, its task is the computation of the logarithm of a given number.
 * We want this number to be positive, because the logarithm of a negative number
 * is not defined. This is achieved by making the field hosting the value be
 * private, so that it is possible to set it only by a public setter.
 * Setters and getters are in general public (or sometimes package access) methods that
 * allow to set and get the value of a private field. Here for example we want
 * our double value to be positive, so it is set only if it is positive.
 *
 * @author Andrea Mazzon
 *
 */
public class LogarithmCalculator {
	
	private double number; // it can not be accessed directly: we want it to be positive

	// getter
	public double getNumber() {
		return number;
	}

	//setter
	public void setNumber(double number) {
		if (number > 0) {// controls if the value is positive!
			this.number = number; // note the use of this
		} else {
			Print.printn("This has to be a positive number! It will be set to be the absolute value of the given number."
					+ " If you want to give another number, use the setter again.");
			this.number = - number; 
		}
	}

	// method that computes the logarithm
	public double computeLogarithm() {
		return Math.log(number);
	}

}
