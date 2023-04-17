package com.andreamazzon.session5.multipleinterfaceimplementation.animals;

/**
 * A class which implements the AnimalThatFlies interface, and therefore in particular
 * the fly() method
 *
 * @author Andrea Mazzon
 *
 */
public class Eagle implements AnimalThatFlies {

	@Override
	public void fly() {// methods defined in the interface have to be public!
		System.out.println("An eagle flies");
	}

	@Override
	public void eat() {// methods defined in the interface have to be public!
		System.out.println("An eagle eats");
	}
}
