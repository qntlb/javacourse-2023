package com.andreamazzon.session2.cosine;

/**
 * This class illustrates methods overloading by the computation of the cosine
 * of a given number.
 *
 * @author Andrea Mazzon
 */
public class CosineTest {

	public static void main(String[] args) {
		double angle = 1.2;
		CosineOverload cosineOverload = new CosineOverload();// construction of the object
		// call of the method with argument double
		System.out.println("The cosine of " + angle + " is " + cosineOverload.calculateCosine(angle));

		System.out.println();

		double multipleOfPi = 7 * Math.PI;
		/*
		 * the method with argument double is first called. Anyway, it will call the
		 * overloaded method with int argument (see the implementation)
		 */
		System.out.println("The cosine of " + multipleOfPi + " is " + cosineOverload.calculateCosine(multipleOfPi));
	}
}
