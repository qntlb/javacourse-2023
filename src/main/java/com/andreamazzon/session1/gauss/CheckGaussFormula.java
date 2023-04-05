package com.andreamazzon.session1.gauss;

/**
 * In this class we check if the sum of the first n natural numbers computed by the class SumOfIntegers
 * is equal to the Gauss Formula.
 *
 * @author Andrea Mazzon
 */
public class CheckGaussFormula {

	public static void main (String[] args) {

		SumOfIntegers sumOfIntegers = new SumOfIntegers();//new object of type SumOfIntegers

		int lastNumber = 31;
		
		int directSum = sumOfIntegers.sumUpToNumber(lastNumber);//call of the method
		
		int gaussSum = sumOfIntegers.sumUpToNumberWithGauss(lastNumber);

		System.out.println("The sum of the first " + lastNumber + " numbers is " + directSum);
		
		System.out.println();
		System.out.println("The sum of the first " + lastNumber + " numbers with Gauss formula is " + gaussSum);
	}
}
