package com.andreamazzon.session2.triangleperimeter;

/**
 * In this class we see an example of how methods overloading can help us making
 * the life of somebody using our class easier if possible: here we write a method
 * to compute the perimeter of a triangle, so the general formula would of course
 * ask us to sum the length of the three sides. However, we maybe don't want somebody 
 * to give the length of all the three sides if we know they have equal length!
 * On the other hand, it would not make sense to call the method differently if it does
 * the same thing, i.e., compute a perimeter. So, here methods overloading comes into play.
 * Same thing if two sides have same length.
 *
 * @author Andrea Mazzon
 *
 */
public class PerimeterCalculator {

	/*
	 * Most "general" implementation: case where the sides have all different
	 * length, scalene triangle
	 */
	double computePerimeter(double firstSideLength, double secondSideLength, double thirdSideLength) {
		double perimeter = firstSideLength + secondSideLength + thirdSideLength;
		return perimeter;
	}

	/*
	 * isosceles triangle: you see that it would not make sense to call this method
	 * in another way: it does compute a perimeter
	 */
	double computePerimeter(double equalSidesLength, double differentSideLength) {
		double perimeter = equalSidesLength * 2 + differentSideLength;
		return perimeter;
	}

	// equilater triangle
	double computePerimeter(double sidesLength) {
		double perimeter = sidesLength * 3;
		return perimeter;
	}

}
