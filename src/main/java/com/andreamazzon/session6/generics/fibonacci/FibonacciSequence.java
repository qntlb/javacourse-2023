package com.andreamazzon.session6.generics.fibonacci;

import com.andreamazzon.session6.generics.genericinterfaces.GenericNext;

/**
 * This class implements the generic interface GenericPointer, for type Long: for objects of this class,
 * the next() method returns a Long.
 * If called iteratively, this method helps returning the first numbers of a Fibonacci sequence.
 *
 * @author Andrea Mazzon
 *
 */
public class FibonacciSequence implements GenericNext<Long> {//I give the type of the type returned in next()
	
	private Long firstFibonacciNumber = 1L;//2
	private Long secondFibonacciNumber = 1L;//3
	
	private int count = 1;

	private Long fibonacciSum;
	
	/**
	 * It returns the Fibonacci number F_k, k=count where count is a field of the
	 * class, and set count = count + 1.
	 */
	@Override
	public Long next() {
		if (count < 3) {
			count ++;
			return 1L;
		}
		
		fibonacciSum = firstFibonacciNumber + secondFibonacciNumber;//2+3=5
		firstFibonacciNumber = secondFibonacciNumber;//3
		secondFibonacciNumber = fibonacciSum;//5
		return fibonacciSum;
	}
	


}
