package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * This class will be extended by MorePowerfulWarrior.
 * Note that, in the derived class, the method damage(Warrior warrior) will
 * be overridden (because more damages and caused) and also overloaded.
 * All the other methods will be just inherited.
 *
 * @author Andrea Mazzon
 *
 */

public class Warrior {
	
	/*
	 * This is the value of health points, when reaches zero the warrior dies. Here
	 * we give the initial value, but of course it might change over time.
	 */
	private double healthPoints = 1000;

	/*
	 * It is protected because will be used also by the derived class. Final and static
	 * because it is the same for all objects of type Warrior and it must not change
	 * during the game. Note that it could also be package access in this specific
	 * example, but this is done to stress the fact that it's protected because we
	 * want it to be accessed from a class which extends this class.
	 */
	protected final static int impactOnWarriors = 10;


	public Warrior() {
		System.out.println("New warrior created");// constructor
	}

	/*
	 * It is protected because it can also been accessed from MorePowerfulWarrior.
	 * Note that it could also be package access in this specific example, but this
	 * is done to stress the fact that it's protected because we want it to be
	 * accessed from a class which extends this class.
	 */
	protected void removeHealthPoints(double howManyPointsRemoved) {
		healthPoints -= howManyPointsRemoved;
	}

	/**
	 * Causes damages to an enemy.
	 *
	 * @param warrior, the enemy
	 */
	public void damage(Warrior warrior) {
		warrior.removeHealthPoints(impactOnWarriors);
		//or also
		//warrior.healthPoints -= impactOnWarriors;
	}

	/**
	 * Moves the warrior
	 *
	 * @param x first coordinate
	 * @param y second coordinate
	 */
	public void move(double x, double y) {
		System.out.println("Warrior moving towards " + x + "," + y);
	}

	/**
	 * It checks if a warrior has no life points left, i.e., if he is dead
	 */
	public void checkIfDead() {
		if (healthPoints <= 0) {
			System.out.println("Dead");
		}
	}

	/**
	 * It returns the health points of the warrior
	 *
	 * @return the health points of the warrior
	 */
	public double getHealthPoints() {
		return healthPoints;
	}

}
