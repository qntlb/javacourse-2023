package com.andreamazzon.session2.divisions;

/**
 * Very simple example of static methods: here you can note that the static
 * method does not depend on non static fields of the class (the class actually
 * has only one field, which is non static).
 *
 * @author Andrea Mazzon
 */
public class Calculator {

	double dividend;// field of the class. It is not static

	// remember the use of this!
	Calculator(double dividend) {
		this.dividend = dividend;
	}

	/*
	 * static method: it is not tied to the specific value of the non static fields
	 * of the class, and so to the state of the objects of the class
	 */
	static double computeRatio(double a, double b) {
		return a / b;
	}

	/*
	 * This is method cannot be static: it has access to the (non static) fields of
	 * the class, it depends on the state of every object of the class
	 */
	double divideBy(double divisor) {
		return dividend / divisor; // field of the class!
	}
}
