package com.andreamazzon.session2.cosine;

/**
 * This class is used to compute the cosine of a given number. This is done in a
 * method which takes a double as argument. In particular, if the number is not
 * "divisible" by Pi, the cosine is computed by the standard Math.Pi method.
 * Otherwise, an overloaded method is called with int argument: the argument in
 * this case is the ratio between the given number and Pi.
 *
 * @author Andrea Mazzon
 */
public class CosineOverload {

	/**
	 * Computes the cosine of a given number
	 *
	 * @param double angle, size of the angle in radians
	 * @return cos(angle)
	 */
	double calculateCosine(double angle) {
		if (angle % Math.PI != 0) { // the size of angle in radians is not a multiple of Pi
			return Math.cos(angle); // standard computation
		} else { // if the size of the angle is actually a multiple of Pi: angle = n * Pi, n integer
			int ratio = (int) (angle / Math.PI);// Downcasted! We know that it is an int because x % Math.PI = 0
			return calculateCosine(ratio);// the overloaded method is called!
			// Question: what does it happen if I did not downcast and made ratio a double?
		}
	}

	/**
	 * Computes cos(angle), when angle (in radians) is a multiple of Pi, i.e., angle=n*Pi
	 *
	 * @param int n = angle/Pi
	 * @return cos(angle)
	 */
	double calculateCosine(int n) {
		System.out.println("I am using the overloaded version");
		// cos(2*n*Pi)=1, cos((2n+1)*Pi)=-1;
		if (n % 2 == 0) {
			return 1;
		} else {
			return -1;
		}
	}

}
