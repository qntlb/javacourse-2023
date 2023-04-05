package com.andreamazzon.session1.randomvariable;

import java.util.Random;

/**
 * This class uses a do..while loop and a random number generator in order to
 * count the number of launches after which a tail is obtained.
 *
 * @author: Andrea Mazzon
 */
public class WhileRandom {

	public static void main(String[] args) {
		int numberOfFlips = 0; // initialized to zero

		// create a reference to a new object of type Random: Java class
		Random randomNumberGenerator = new Random(); // current time as a seed for the random number generator
		/*
		 * the seed is an initialization value for the random number generator: the
		 * generator will always produce the same sequence for a particular seed value
		 */
		do {
			numberOfFlips++; // first you flip!
		} while (randomNumberGenerator.nextInt(2) == 1); // 0 is tail, 1 is head
		
		
		// nextInt(n) produces a random natural number (0 included) smaller than n
		System.out.println("I got a tail after " + numberOfFlips + " launches");
	}
}
