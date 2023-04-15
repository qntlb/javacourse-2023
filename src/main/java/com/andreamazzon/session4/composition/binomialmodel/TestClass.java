package com.andreamazzon.session4.composition.binomialmodel;

/**
 * This class tests the features of the class BinomialModelSimulator, which is an example of the use of
 * composition and delegation.
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {

	public static void main(String[] args) {
		double initialValue = 100;
		double increaseIfUp = 2;
		double decreaseIfDown = 0.5;
		double interestRate = 0.05;

		int seed = 11;
		int lastTime = 10;
		int numberOfSimulations = 10000;
		int simulationIndex = 100;

		BinomialModelSimulator tester = new BinomialModelSimulator(initialValue, increaseIfUp, decreaseIfDown, interestRate, seed,
				lastTime, numberOfSimulations);

		System.out.println("Path for simulation number " + simulationIndex + ":");
		tester.printPath(simulationIndex);

		System.out.println();
		
		double finalAverage = tester.getAverageAtGivenTime(lastTime);

		System.out.println("Average of the process at time " + lastTime + ": " + finalAverage);

		System.out.println();
		
		double discountFactor = Math.pow(1+interestRate, -lastTime);
		double discountedAverage = discountFactor * finalAverage;
		System.out.println("Average of the discounted process at time " + lastTime + ": " + discountedAverage);
	}
}
