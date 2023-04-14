package com.andreamazzon.session3.encapsulation.logarithms;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * In the main method of this class we see how encapsulation works, preventing the user to obtain
 * unwanted results when computing the logarithm of a number.
 *
 * @author Andrea Mazzon
 *
 */
public class LogarithmClient {

	public static void main(String[] args) {

		LogarithmCalculator logarithmExample = new LogarithmCalculator();
		double inputNumber = -3;
		
		//logarithmExample.number = inputNumber; //private field!
		logarithmExample.setNumber(inputNumber); //use of setter
	
		printn("The logarithm of " + logarithmExample.getNumber() + " is " + logarithmExample.computeLogarithm());
	}
}