package com.andreamazzon.session1.testval;

/**
 * In this class we choose three values and test if the first one lies inside
 * the interval defined by the other two. We use the class Comparison
 *
 * @author Andrea Mazzon
 */
public class Testing {

	public static void main(String[] args) {

		Comparison test = new Comparison(); // we construct an object of type Comparison

		double testedNumber = 2.7;
		double leftEnd = 2;
		double rightEnd = 3;

		System.out.println("The result of the test as a boolean is: "
				+ test.isInside(testedNumber, leftEnd, rightEnd)/* method called inside the println */);

		int isInsideAsInt = test.isInsideAsInt(testedNumber, leftEnd, rightEnd);
		
		System.out.println("The result of the test as an integer is: " + isInsideAsInt);
	}
}
