package com.andreamazzon.session3.encapsulation.lazyinitialization;

import static com.andreamazzon.session3.useful.Print.printn;

import java.util.Arrays;

/**
 * This class contains one main method that calls method of the class
 * LinearCongruentialGenerator: example of lazy initialization.
 *
 * @author Andrea Mazzon
 *
 */

public class PseudoRandomNumbersTesting {
	public static void main(String[] args) {

		long firstSeed = 1897;// the seed is the first entry of the sequence of pseudo random numbers

		int numberOfPseudoRandomNumbers = 5;

		LinearCongruentialGenerator firstGenerator = new LinearCongruentialGenerator(numberOfPseudoRandomNumbers,
				firstSeed);

		long[] sequenceGeneratedByTheFirstObject = firstGenerator.getRandomNumberSequence();

		printn("Simulation of " + numberOfPseudoRandomNumbers + " integers with seed " + firstSeed
				+ " : " + Arrays.toString(sequenceGeneratedByTheFirstObject));

		printn();

		int numberOfPseudoRandomNumbersToGetPrintedNow = 3;
		printn("First " + numberOfPseudoRandomNumbersToGetPrintedNow + " numbers of the random sequence, excluded the seed:");
		/*
		 * maybe the user is not interested to have all the sequence, but only in the
		 * first numbers
		 */
		for (int i = 0; i < numberOfPseudoRandomNumbersToGetPrintedNow; i++) {
			printn(firstGenerator.getNextInteger());
		}

		printn();

		long secondSeed = 8;

		LinearCongruentialGenerator secondGenerator = new LinearCongruentialGenerator(numberOfPseudoRandomNumbers,
				secondSeed);

		long[] sequenceGeneratedByTheSecondObject = secondGenerator.getRandomNumberSequence();

		printn("Simulation of " + numberOfPseudoRandomNumbers + " integers with seed " + secondSeed
				+ " : " + Arrays.toString(sequenceGeneratedByTheSecondObject));
	}
}