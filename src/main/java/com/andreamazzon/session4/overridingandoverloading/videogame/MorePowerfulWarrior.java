package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * This class extends Warrior. In particular, it overrides and overload the
 * damage method, see the comments. It directly inherits the other method (we want no
 * changes) and the fields impactOnWarriors and healthPoints. Note that
 * healthPoints is private, but this is no problem because it gets not directly
 * accessed, but only through the method removeHealthPoints(double
 * howManyPointsRemoved), which is public.
 *
 * @author Andrea Mazzon
 *
 */
public class MorePowerfulWarrior extends Warrior {

	private final static double strengthening = 10;// it will cause more damages
	private final static double impactOnBuildings = 5;// new field!

	public MorePowerfulWarrior() {
		System.out.println("A more powerful one");// constructor of the derived class. We don't call the super one.
	}

	/**
	 * Causes damages to an enemy. Overridden because it causes more damages than an
	 * object of the base class.
	 *
	 * @param warrior, the enemy
	 */
	/*
	 * note the @Override annotation: if we use it, we get an error if our method is
	 * not overriding a method of the parent class. This is useful to avoid mistakes
	 * (for example we are accidentally changing the name of the method)
	 */
	@Override
	public void damage(Warrior warrior) {
		warrior.removeHealthPoints(impactOnWarriors + strengthening);
	}

	/**
	 * Causes damages to a building. Overloaded because objects of the derived class
	 * can also damage buildings, i.e., they can "implement the method in a
	 * different way".
	 *
	 * @param building, a Building of the enemy
	 */
	public void damage(Building building) {
		building.removeSolidityPoints(impactOnBuildings);
	}
}
