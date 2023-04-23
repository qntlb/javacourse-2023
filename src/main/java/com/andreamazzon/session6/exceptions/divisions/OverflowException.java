package com.andreamazzon.session6.exceptions.divisions;

//Exception is a class, when you write an Exception you extend it
/**
 * Exception writing an exception message: called when an overflow is encountered
 *
 * @author Andrea Mazzon
 *
 */
public class OverflowException extends Exception { // not an important warning
	

	public void printExceptionMessage() {// method you want to call when you catch the exception
		System.out.print("I catched an overflow exception");
	}
}
