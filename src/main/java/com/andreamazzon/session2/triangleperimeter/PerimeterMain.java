package com.andreamazzon.session2.triangleperimeter;

/**
 * In this class we run the computation of the perimeter of a triangle, using
 * method overloading
 *
 * @author Andrea Mazzon
 *
 */
public class PerimeterMain {
	public static void main(String[] args) {

		// here we only have the default constructor
		PerimeterCalculator perimeterCalculator = new PerimeterCalculator();

		double lengthFirstSide = 2;
		double lengthSecondSide = 2.3;
		double lengthThirdSide = 2.7;

		double perimeterScaleneTriangle = perimeterCalculator.computePerimeter(lengthFirstSide, lengthSecondSide,
				lengthThirdSide);
		
		System.out.println("The perimeter of the scalene triangle is " + perimeterScaleneTriangle);

		double lengthSideEquilaterTriangle = lengthFirstSide;

		double perimeterEquilaterTriangle = perimeterCalculator.computePerimeter(lengthSideEquilaterTriangle);
		System.out.println("The perimeter of the equilater triangle is " + perimeterEquilaterTriangle);
	}
}
