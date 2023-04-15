package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * Class representing a building. It can get damaged only by objects of type MorePowerfulWarrior
 *
 * @author Andrea Mazzon
 *
 */
public class Building {

	/*
	 * This is the value of solidity points, when reaches zero the building ceases to exist.
	 * Here we give the initial value, but of course it might change over time.
	 */
	private double solidityPoints = 1000;//initial value of the health points.

	public Building(){
		System.out.println("New building created");
	}
	
	/**
	 * It removes solidity points to a building.
	 */
	public void removeSolidityPoints(double howManyPointsRemoved) {
		solidityPoints -= howManyPointsRemoved;
	}
	
	/**
	 * It checks if the building is destroyed
	 */
	public void checkIfDestroyed () {
		if (solidityPoints <= 0) {
			System.out.println("The building is destroyed");
		}
	}
	
	/**
	 * It returns the solidity points of the building
	 * @return the solidity points of the building
	 */
	public double getSolidityPoints() {
		return solidityPoints;
	}
	
}
