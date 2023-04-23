package com.andreamazzon.session6.exceptions.divisions;

import java.util.ArrayList;

/**
 * This class has a static void Divide method which serves as an example of how exceptions
 * are handled and thrown: you start by dividing a double firstDividend by a double divisor.
 * If divisor is zero, you get an exception. Otherwise, you get the result and divide it by
 * divisor and so on, until you reach a number smaller then minResult or bigger than maxResult.
 * You save all the results in an ArrayList.
 * You get an exception if the absolute value of the result of a division if bigger
 * or equal than Double.MAX_VALUE (overflow) or smaller or equal than 0 (underflow). 
 * Note: with ArrayList you can create an array without fixing its length (you avoid possible exceptions).
 * ArrayList is a generic class.
 *
 * @author Andrea Mazzon
 *
 */
public class Divider {

	/**
	 * It starts by dividing a firstDividend by a divisor. If divisor is zero, it throws an exception.
	 * Otherwise, it gets the result and divides it by divisor and so on, until it reaches a number
	 * smaller then minResult or bigger than maxResult. All the results are saved in an ArrayList,
	 * which is then returned. 
	 * 
	 * @param firstDividend, the first number which gets divided by divisor
	 * @param divisor, the number that divides all the results
	 * @param minResult, the minimum result we want to get 
	 * @param maxResult, the maximum result we want to get 
	 * @throws DivideByZeroException
	 * @throws UnderflowException
	 * @throws OverflowException
	 * @throws ExceptionColleption 
	 */
	public static void divide(double firstDividend, double divisor, double minResult, double maxResult)
			throws DivideByZeroException, UnderflowException, OverflowException {

		
		// You have to specify the exception than can be thrown: this is part of method declaration
		if (divisor == 0) {
			throw new DivideByZeroException();// you create a new object of type DivideByZeroException
		}
		/*
		 * This is a list of Doubles, and as such it does not work with primitive types. ArrayList works
		 * with generics! It is a kind of array, but for example you don't have to give its length in advance
		 */
		ArrayList<Double> dividends = new ArrayList<Double>();
		
		//this is the add method of ArrayList: it inserts an object of the type specified at the end of the array
		dividends.add(firstDividend);
		int indexForTheLastResult = 0;
		Double result = firstDividend;
		while (result > minResult & result < maxResult) {
			// get(i) gets the element of the array in position i (starting from 0!)
			result = (dividends.get(indexForTheLastResult)) / divisor; // you divide the previous number

			if (Math.abs(result) <= 0) { // underFlow!
				throw new UnderflowException();// you create a new object of type UnderFlowException
			}

			if (Math.abs(result) >= Double.MAX_VALUE) {// overFlow!
				throw new OverflowException();// you create a new object of type OverFlowException
			}

			dividends.add(result); // you insert the result in your array, in the last position (i.e., indexForTheLastResult+1)
			System.out.println(result);

			indexForTheLastResult++;
		}
	}
}
