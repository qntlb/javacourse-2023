package com.andreamazzon.session5.multipleinterfaceimplementation.animals;

/**
 * A class which implements the CanSwim interface, and therefore in particular
 * the swim() method
 *
 * @author Andrea Mazzon
 *
 */
public class Fish implements AnimalThatSwims {

	@Override
	public void swim() {// methods defined in the interface have to be public!
		System.out.println("A fish swims");
	}

	@Override
	public void eat() {// methods defined in the interface have to be public!
		System.out.println("A fish eats");
	}
}
